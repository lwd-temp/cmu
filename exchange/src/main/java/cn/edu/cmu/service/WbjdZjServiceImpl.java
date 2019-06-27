package cn.edu.cmu.service;
import cn.edu.cmu.controller.FileUpAndDownloadController;
import cn.edu.cmu.dao.*;
import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.util.AccessUtils;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.web.BaseService;
import cn.edu.cmu.vo.WbZjFjUpload;
import cn.edu.cmu.vo.WbglVO;
import com.github.pagehelper.StringUtil;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;


@Service
public class WbjdZjServiceImpl extends BaseService<WbjdZj, WbjdZjParams, WbjdZjMapper> implements WbjdZjService {

    @Autowired
    private WbjdZjSxryMapper wbjdZjSxryMapper;

    @Autowired
    private WbZjLpMapper wbZjLpMapper;

    @Autowired
    private WbjdGjMapper wbjdGjMapper;
    @Autowired
    private WbjdZjMapperExt wbjdZjMapperExt;

    @Autowired
    private WbjdZjFjMapper zjFjDao;


    @Autowired
    UploadMapper uploadDao;


    @Override
    public List list(Object... conditions) throws Exception {
        WbjdSqParams params = new WbjdSqParams();
        WbjdSqParams.Criteria c1 = params.createCriteria();

        c1.andStatusEqualTo("04");//并且通过才查询

        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            WbjdSq jdsq = (WbjdSq) conditions[0];
            if(StringUtils.isNotEmpty(jdsq.getZqlxrxm())){
                c1.andZqlxrxmLike("%"+jdsq.getZqlxrxm()+"%");
            }
            if(StringUtils.isNotEmpty(jdsq.getDbtmc())){
                c1.andDbtmcLike("%"+jdsq.getDbtmc()+"%");
            }
            super.addOrderBy(params,conditions);
        }
        return wbjdZjMapperExt.selectZjByExample(params);
    }


    @Override
    public List list(WbjdZj wbjdZj) throws Exception {
        WbjdZjParams ex = new WbjdZjParams();
        if(wbjdZj != null){
            WbjdZjParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(wbjdZj.getZqlxrxm())){
                c.andZqlxrxmLike("%"+wbjdZj.getZqlxrxm()+"%");
            }
            if(StringUtils.isNotEmpty(wbjdZj.getDbtmc())){
                c.andDbtmcLike("%"+wbjdZj.getDbtmc()+"%");
            }
        }
        return dao.selectByExample(ex);
    }



    @Override
    public boolean saveOrupdate(WbglVO vo, HttpServletRequest request) throws Exception {
        boolean isEdit = false;//是否修改标志
        WbjdZj wbjdZj = new WbjdZj();
        wbjdZj = vo.getWbjdZj();
        String[] cfgbIds = vo.getCfgbIds();
        List<WbjdZjSxry> sxr = vo.getZjsxr();
        List<WbjdLp> lpList = vo.getLp();
        if(StringUtil.isEmpty(wbjdZj.getZjid())){
            String keyId = CmuStringUtil.UUID();
            wbjdZj.setZjid(keyId);
        }else{//如果存在id则说明是修改
            isEdit = true;
        }
        //无论新增，还是修改，需要再成员表中维护主外键关系
        if((!CollectionUtils.isEmpty(sxr)) ){
            for (WbjdZjSxry r : sxr) {
                r.setLfid(wbjdZj.getZjid());//设置外键团组计划id
            }
        }


        if((!CollectionUtils.isEmpty(lpList)) ){
            for (WbjdLp lp : lpList) {
                lp.setLfid(wbjdZj.getZjid());//设置外键团组计划id
            }
        }


        if(isEdit){ //修改
            dao.updateByPrimaryKeySelective(wbjdZj);
            //从表先删后查
            deleteSxr(wbjdZj);
            //删完后添加从表数据
            insertSxr(sxr);

            //礼品从表信息，先删后插
            deleteLp(wbjdZj);

            insertLp(lpList,wbjdZj);

            //国别先删除后插入
            deleteGb(wbjdZj.getZjid());
            //删完后添加从表国别数据
            insertGb(wbjdZj.getZjid(),cfgbIds);

        }else{ //添加
            dao.insertSelective(wbjdZj);
            insertSxr(sxr);
            insertLp(lpList,wbjdZj);//礼品从表
            insertGb(wbjdZj.getZjid(),cfgbIds);
        }




        //上传附件操作
        //先删后插
        WbjdZjFjParams zjFjParam = new WbjdZjFjParams();
        zjFjParam.createCriteria().andZjidEqualTo(wbjdZj.getZjid());
        zjFjDao.deleteByExample(zjFjParam);
        List<WbjdZjFj> zjFjs = transformUploadZjs(vo,request);

        for (WbjdZjFj zjFj : zjFjs) {
            zjFj.setId(CmuStringUtil.UUID());
            zjFj.setZjid(wbjdZj.getZjid());
            zjFjDao.insertSelective(zjFj);
        }

        return true;
    }

    private List<WbjdZjFj> transformUploadZjs(WbglVO vo, HttpServletRequest request) throws IOException {
        List<WbjdZjFj> zjFjs = vo.getZjFjs();

        List<WbZjFjUpload> uploads = vo.getFjUploads();

        for (WbZjFjUpload upload : uploads) {
            MultipartFile file = upload.getFile();
            String zjms = upload.getZjms();


            String fid = uploadZjFjFiles(file,request);

            zjFjs.add(new WbjdZjFj(CmuStringUtil.UUID(), vo.getWbjdZj().getZjid(), fid, zjms, null,null));

        }



        return zjFjs;
    }


    /**
     * 外宾接待上传文件
     * @param f
     * @param request
     * @return
     */
    private String uploadZjFjFiles(MultipartFile f, HttpServletRequest request) throws IOException {

        String oriFileName = f.getOriginalFilename();
        long size = f.getSize();
        HttpSession session = request.getSession();
        String requestIP = AccessUtils.getIpAddress(request);//操作ip

        String userName = (String)session.getAttribute(CmuConstants.SESSION.USER_NAME);

        logger.info(String.format("用户:%s ,ip:%s上传文件,原始文件名:%s,大小:%d", userName, requestIP, oriFileName, size));

        String fileId = CmuStringUtil.UUID();
        String ext = CmuStringUtil.fileExt(oriFileName);//文件扩展名
        String realName = fileId + "." + ext;        //真是的文件名称
        String relativePath = CmuStringUtil.getRelativeDatePath() + realName; //相对完整路径
        String uploadPath = FileUpAndDownloadController.BASE_DIR + relativePath; //完整的上传路径
        File dest = new File(uploadPath);//File类型的上传文件转储对象

        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        //将临时目录文件转储到指定的文件位置
        f.transferTo(dest);

        //生成待保存的 上传信息数据
        Upload upload = new Upload(fileId, relativePath, ext, userName, requestIP, null, null);
        uploadDao.insertSelective(upload);


        return upload.getFileId();
    }

    /**
     * 删除总结的 礼品信息
     * @param wbjdZj
     */
    private void deleteLp(WbjdZj wbjdZj) {
        WbZjLpParams param = new WbZjLpParams();
        param.createCriteria().andZjidEqualTo(wbjdZj.getZjid());
        wbZjLpMapper.deleteByExample(param);
    }


    /**
     * 删除完成后重新添加礼品信息
     * @param lpList
     */
    private void insertLp(List<WbjdLp> lpList,WbjdZj wbjdZj) throws InvocationTargetException, IllegalAccessException {
        for (WbjdLp wbjdLp : lpList) {
            WbZjLp lp = new WbZjLp();
            BeanUtils.copyProperties(lp,wbjdLp);
            lp.setId(CmuStringUtil.UUID());
            lp.setZjid(wbjdZj.getZjid());
            wbZjLpMapper.insertSelective(lp);
        }
    }


    /**
     * 查询礼品信息
     * @param id
     * @return
     */
    @Override
    public List<WbjdLp> queryLiPinList(String id) {
        WbZjLpParams params = new WbZjLpParams();
        params.createCriteria().andZjidEqualTo(id);
//        return wbjdLpMapper.selectByExample(params);
        return wbZjLpMapper.selectByExample(params);
    }

    /**
     * 根据总结id 查询出已上传的 总结附件
     * @param zjid
     * @return
     * @throws Exception
     */
    @Override
    public List<WbjdZjFj> queryWbjdZjFjs(String zjid) throws Exception {

        WbjdZjFjParams params = new WbjdZjFjParams();
        params.createCriteria().andZjidEqualTo(zjid);
        return zjFjDao.selectByExample(params);
    }

    //删除对应的随行成员
    private void deleteSxr(WbjdZj wbjdZj){
        WbjdZjSxryParams params = new WbjdZjSxryParams();
        params.createCriteria().andLfidEqualTo(wbjdZj.getZjid());
        List oldSxrs = wbjdZjSxryMapper.selectByExample(params);
        if(!CollectionUtils.isEmpty(oldSxrs)) {
            for (Object obj : oldSxrs) {
                WbjdZjSxry oldSxr = (WbjdZjSxry)obj;
                wbjdZjSxryMapper.deleteByPrimaryKey(oldSxr.getRyid());
            }
        }
    }
    //添加对应的随行成员
    private void insertSxr(List<WbjdZjSxry> sxr){
        if(!CollectionUtils.isEmpty(sxr)) {
            for (WbjdZjSxry r : sxr) {
                r.setRyid(CmuStringUtil.UUID());
                wbjdZjSxryMapper.insertSelective(r);
            }
        }
    }
    //删除对应的国别
    private void deleteGb(String zjid) {
        WbjdGjParams params = new WbjdGjParams();
        params.createCriteria().andLfidEqualTo(zjid);
        List oldGbs = wbjdGjMapper.selectByExample(params);
        if(!CollectionUtils.isEmpty(oldGbs)) {
            for (Object obj : oldGbs) {
                WbjdGj oldGb = (WbjdGj)obj;
                wbjdGjMapper.deleteByPrimaryKey(oldGb.getGjid());
            }
        }
    }
    //插入新的国别
    private void insertGb(String zjid, String[] cfgbIds) {
        if(!ArrayUtils.isEmpty(cfgbIds)) {
            for (String gbDm : cfgbIds) {
                WbjdGj gb = new WbjdGj(CmuStringUtil.UUID(), gbDm, zjid, null, null);
                wbjdGjMapper.insertSelective(gb);
            }
        }
    }



}
