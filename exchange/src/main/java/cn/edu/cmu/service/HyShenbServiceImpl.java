package cn.edu.cmu.service;

import cn.edu.cmu.dao.HyJhMapper;
import cn.edu.cmu.dao.HyRymdMapper;
import cn.edu.cmu.dao.HySbrymdMapper;
import cn.edu.cmu.dao.HyShenbMapper;
import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.util.DateUtils;
import cn.edu.cmu.framework.util.MaxNumUtils;
import cn.edu.cmu.framework.web.BaseService;
import cn.edu.cmu.vo.HysbVO;
import com.github.pagehelper.StringUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.UUID;


@Service
public class HyShenbServiceImpl extends BaseService<HyShenb, HyShenbParams, HyShenbMapper> implements HyShenbService {


    @Autowired
    private HyJhMapper jhDao;

    @Autowired
    private HyRymdMapper jhRyDao;


    @Autowired
    private HySbrymdMapper sbRyRyDao;

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
        if(StringUtil.isEmpty(hysb.getJhid())){
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
                sbRyRyDao.deleteByExample(params);
            }
            for (HySbrymd sbRy : rys) {
                sbRy.setMdid(CmuStringUtil.UUID());
                sbRy.setSbid(hysb.getSbid());
                sbRyRyDao.insertSelective(sbRy);
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
        return sbRyRyDao.selectByExample(params);
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

        String hybh = DateUtils.getYear() + "909" + MaxNumUtils.getMaxNum("hyjh", (long) Calendar.getInstance().get(Calendar.YEAR), 3);
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
