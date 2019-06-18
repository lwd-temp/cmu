package cn.edu.cmu.service;

import cn.edu.cmu.dao.HyJhMapper;
import cn.edu.cmu.dao.HyRymdMapper;
import cn.edu.cmu.dao.HySbrymdMapper;
import cn.edu.cmu.dao.HyShenbMapper;
import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.cache.DMCache;
import cn.edu.cmu.framework.util.*;
import cn.edu.cmu.framework.web.BaseService;
import cn.edu.cmu.vo.HysbVO;
import com.github.pagehelper.StringUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;


@Service
public class HyShenbServiceImpl extends BaseService<HyShenb, HyShenbParams, HyShenbMapper> implements HyShenbService {


    @Autowired
    private HyJhMapper jhDao;

    @Autowired
    private HyRymdMapper jhRyDao;

    @Autowired
    private HySbrymdMapper sbRyDao;

    /**
     * 申报下载模板
     */
    public static final String DOWNLOAD_TEMP =  WebAppContextUtils.REAL_CONTEXT_PATH +"/download_template/excel/hysb/hy_sb.xls";

    @Override
    public List list(HyShenb HyShenb) {
        HyShenbParams ex = new HyShenbParams();
        if(HyShenb != null){
            HyShenbParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(HyShenb.getZbdw())){
                c.andZbdwLike("%"+HyShenb.getZbdw()+"%");
            }
        }
        return dao.selectByExample(ex);
    }


    @Override
    public List list(Object... conditions) throws Exception {
        HyShenbParams params = new HyShenbParams();
        HyShenbParams.Criteria c1 = params.createCriteria();
        HyShenbParams.Criteria c2= params.or();

        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            HyShenb hysb = (HyShenb) conditions[0];

            if(StringUtils.isNotEmpty(hysb.getStatus())){//如果存在状态，则按照状态查询
                c1.andStatusEqualTo(hysb.getStatus());
                c2.andStatusEqualTo(hysb.getStatus());
            }
            if(StringUtils.isNotEmpty(hysb.getHybh())){
                c1.andHybhLike("%"+hysb.getHybh()+"%");
                c2.andHybhLike("%"+hysb.getHybh()+"%");
            }
            if(StringUtils.isNotEmpty(hysb.getZbdw())){
                c1.andZbdwLike("%"+hysb.getZbdw()+"%");
            }
            if(StringUtils.isNotEmpty(hysb.getCbdw())){

                c2.andCbdwLike("%"+hysb.getCbdw()+"%");
            }
            super.addOrderBy(params,conditions);
        }

        return dao.selectByExample(params);
    }



    /**
     * 如果如表没有主键则新增，否则修改
     * @param hysbVO
     * @return
     * @throws Exception
     */
    @Override
    public boolean save(HysbVO hysbVO) throws Exception {

        HyShenb hysb = hysbVO.getHysb();

        boolean isEdit = false;//是否修改标志
        if(StringUtil.isEmpty(hysb.getSbid())){
            String keyId = CmuStringUtil.UUID();
            hysb.setSbid(keyId);
        }else{//如果存在id则说明是修改
            isEdit = true;
        }

        logger.info("待保存 主表的 hysb:"+hysb);
        int count = 0;
        if(isEdit){
            count = dao.updateByPrimaryKeySelective(hysb);
        }else{
            if(StringUtils.isEmpty(hysb.getJhid())) {
                syncHyJh(hysbVO);//如果没有会议计划id则同步会议计划
            }
            count = dao.insertSelective(hysb);
        }
        logger.info("保存 主表的hyJh 结果 :"+(count>0));

        //从表信息 参会人员名单
        List<HySbrymd> rys = hysbVO.getChrys();
        if(!CollectionUtils.isEmpty(rys)){
            if(isEdit){//如果是修改则删除原来从表数据
                HySbrymdParams  params = new HySbrymdParams();
                params.createCriteria().andSbidEqualTo(hysb.getSbid());
                sbRyDao.deleteByExample(params);
            }
            for (HySbrymd sbRy : rys) {
                sbRy.setMdid(CmuStringUtil.UUID());
                sbRy.setSbid(hysb.getSbid());
                sbRyDao.insertSelective(sbRy);
            }

        }

        return count>0;
    }



    /**
     * 获取会议计划对应的人员名单
     * @param sbid
     * @return
     */
    @Override
    public List rymcList(String sbid){
        HySbrymdParams params = new HySbrymdParams();
        params.createCriteria().andSbidEqualTo(sbid);
        return sbRyDao.selectByExample(params);
    }

    /**
     * 会议申报下载 hymc
     * @param sbid
     * @param response
     */
    @Override
    public void download(String sbid, HttpServletRequest request, HttpServletResponse response) throws IOException {

        HyShenb domain = dao.selectByPrimaryKey(sbid);

        HySbrymdParams params = new HySbrymdParams();
        params.createCriteria().andSbidEqualTo(sbid);
        List<HySbrymd> sbrymds = sbRyDao.selectByExample(params);
        logger.debug("会议申报下载");


        //设置下载信息
        DownLoadUtils.setDownLoadHeaders(request,response,domain.getHymc()+".xls");
        ServletOutputStream os = response.getOutputStream();


        FileInputStream fis=new FileInputStream(DOWNLOAD_TEMP);
        POIFSFileSystem fs = new POIFSFileSystem(fis);//使用POIFSFileSystem包括下避免同时读，写出错
        HSSFWorkbook workbook = new HSSFWorkbook(fs);
        HSSFSheet sheet = workbook.getSheetAt(0);//第一个sheet页


        //设置会议基本信息
        setHyData(sheet,domain);

        //设置会议人员信息
        setHyRyData(sheet,sbrymds);


        logger.info("准备将文件输出到客户端：" + DOWNLOAD_TEMP);
        workbook.write(os);

        logger.info("输出到客户端完成关闭资源" );
        os.flush();
        os.close();
        workbook.close();
    }


    /**
     * 会议申报导出 Excel ，设置参会基本会议
     * @param sheet
     * @param domain
     */
    private void setHyData(HSSFSheet sheet, HyShenb domain) {

        int rowIndex = 0;
        HSSFRow row1 = sheet.getRow(++rowIndex);
        //会议编号
        HSSFCell cell_1_2 = row1.getCell(2);
        cell_1_2.setCellValue(domain.getHybh());
        //已在属地公安部门备案
        HSSFCell cell_1_6 = row1.getCell(6);
        cell_1_6.setCellValue(DMCache.translateCode2Name("T_DM_YN",domain.getSfbb()));


        HSSFRow row2 = sheet.getRow(++rowIndex);
        //会议名称
        HSSFCell cell_2_2 = row2.getCell(2);
        cell_2_2.setCellValue(domain.getHymc());
        //会议名称(英文):
        HSSFCell cell_2_6 = row2.getCell(6);
        cell_2_6.setCellValue(domain.getHymcEn());


        HSSFRow row3 = sheet.getRow(++rowIndex);
        //主办单位
        HSSFCell cell_3_2 = row3.getCell(2);
        cell_3_2.setCellValue(domain.getZbdw());
        //承办单位
        HSSFCell cell_3_6 = row3.getCell(6);
        cell_3_6.setCellValue(domain.getCbdw());

        HSSFRow row4 = sheet.getRow(++rowIndex);
        //举行日期(开始)
        HSSFCell cell_4_2 = row4.getCell(2);
        cell_4_2.setCellValue(domain.getJxrqKs());
        //举行日期(结束)
        HSSFCell cell_4_6 = row4.getCell(6);
        cell_4_6.setCellValue(domain.getJxrqJs());


        HSSFRow row5 = sheet.getRow(++rowIndex);
        //会议类型
        HSSFCell cell_5_2 = row5.getCell(2);
        cell_5_2.setCellValue(DMCache.translateCode2Name("T_DM_HYLX",domain.getHylx()));
        //经费来源
        HSSFCell cell_5_6 = row5.getCell(6);
        cell_5_6.setCellValue(domain.getJfly());


        HSSFRow row6 = sheet.getRow(++rowIndex);
        //负责人姓名:
        HSSFCell cell_6_2 = row6.getCell(2);
        cell_6_2.setCellValue(domain.getFzrxm());
        //负责人电话
        HSSFCell cell_6_6 = row6.getCell(6);
        cell_6_6.setCellValue(domain.getFzrdh());

        HSSFRow row7 = sheet.getRow(++rowIndex);
        //地点
        HSSFCell cell_7_2 = row7.getCell(2);
        cell_7_2.setCellValue(domain.getDd());

        HSSFRow row8 = sheet.getRow(++rowIndex);
        //会议基本信息
        HSSFCell cell_8_2 = row8.getCell(2);
        cell_8_2.setCellValue(domain.getHyjbxx());


        HSSFRow row9 = sheet.getRow(++rowIndex);
        //会议规模
        HSSFCell cell_9_2 = row9.getCell(2);
        cell_9_2.setCellValue(domain.getHygm());

        HSSFRow row10 = sheet.getRow(++rowIndex);
        //会议背景及必要性
        HSSFCell cell_10_2 = row10.getCell(2);
        cell_10_2.setCellValue(domain.getBjjbyx());


    }

    /**
     * 会议申报导出 Excel ，设置参会基本会议
     * @param sheet
     * @param ryList
     */
    private void setHyRyData(HSSFSheet sheet, List<HySbrymd> ryList) {

        int rowIndex = 12;
        if(ryList != null){
            for (HySbrymd hySbrymd : ryList) {
                HSSFRow ryRow = sheet.getRow(++rowIndex);
                HSSFCell cell_1 = ryRow.getCell(1);
                HSSFCell cell_2 = ryRow.getCell(2);
                HSSFCell cell_3 = ryRow.getCell(3);
                HSSFCell cell_4 = ryRow.getCell(4);
                HSSFCell cell_5 = ryRow.getCell(5);
                HSSFCell cell_6 = ryRow.getCell(6);
                HSSFCell cell_7 = ryRow.getCell(7);
                HSSFCell cell_8 = ryRow.getCell(8);

                cell_1.setCellValue(hySbrymd.getXm());
                cell_2.setCellValue(hySbrymd.getGj());
                cell_3.setCellValue(hySbrymd.getDw());
                cell_4.setCellValue(hySbrymd.getZw());
                cell_5.setCellValue(hySbrymd.getXmEn());
                cell_6.setCellValue(hySbrymd.getGjEn());
                cell_7.setCellValue(hySbrymd.getDwEn());
                cell_8.setCellValue(hySbrymd.getZwEn());
            }
        }

    }

    /**
     * 同步会议计划
     * @param hysbVO
     * @throws Exception
     */
    private void syncHyJh(HysbVO hysbVO) throws Exception {

        HyShenb hysb = hysbVO.getHysb();
        List<HySbrymd> rys = hysbVO.getChrys();


        //将申报信息copy到申报计划中
        HyJh hyjh = new HyJh();
        //新增需要生成会议编号
        BeanUtils.copyProperties(hyjh,hysb);

        String hybh = DateUtils.getYear() + "909" + MaxNumUtils.getMaxNum("hyjh",  DateUtils.getYear(), 3);
        hyjh.setHybh(hybh);
        hyjh.setJhid    (CmuStringUtil.UUID());

        jhDao.insertSelective(hyjh);//保存计划主表

        hysb.setHybh(hybh);
        hysb.setJhid(hyjh.getJhid());//维护申报表 和计划表的关系



        //需要同步人员信息表
        if(!CollectionUtils.isEmpty(rys)){
            for (HySbrymd ry : rys) {
                HyRymd jhRyMd = new HyRymd();
                BeanUtils.copyProperties(jhRyMd,ry);//先copyProperties，否则会覆盖原来的属性值
                jhRyMd.setMdid(CmuStringUtil.UUID());//设置从表主键
                jhRyMd.setJhid(hyjh.getJhid());//设置从表外键
                jhRyDao.insertSelective(jhRyMd);
            }
        }

    }

    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        System.out.println(uuid);
    }
}
