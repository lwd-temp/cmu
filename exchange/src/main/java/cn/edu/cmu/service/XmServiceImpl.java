package cn.edu.cmu.service;

import cn.edu.cmu.dao.*;
import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.threadpool.SysThreadPoolRunner;
import cn.edu.cmu.framework.util.*;
import cn.edu.cmu.framework.web.BaseService;
import cn.edu.cmu.vo.XmVo;
import cn.edu.cmu.vo.XmzjbgVO;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class XmServiceImpl extends BaseService<Xm, XmParams, XmMapper> implements XmService {

    @Autowired
    XmMapperExt daoExt;

    @Autowired
    ZyMapper zyDao;

    @Autowired
    XmGjdqMapper gjDao;

    @Autowired
    BksXjjbsjxxMapper bksXjDao;

    @Autowired
    YjsXjjbsjxxMapper yjsXjDao;

    @Autowired
    BjsjxxMapper bjDao;//班级dao

    @Autowired
    UnicUnitMapper unitDao;//院系机构

    @Autowired
    BksZyxxsjxxMapper bksZyDao;//本科生专业

    @Autowired
    YjsZyxxsjxxMapper yjsZyDao;//研究生专业

    @Autowired
    XmXssqjlMapper sqDao;

    @Autowired
    XmXssqjlMapperExt sqExtDao;


    @Autowired
    XmXssbfjMapper xmfjDao; //学生申请项目上传附件

    @Autowired
    IfsWxlogMapper wxlogDao; //学生申请项目上传附件




    @Override
    public List list(Xm Xm) {
        XmParams ex = new XmParams();
        if(Xm != null){
            XmParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(Xm.getXmmc())){
                c.andXmmcLike("%"+Xm.getXmmc()+"%");
            }
        }
        return dao.selectByExample(ex);
    }

    @Override
    public List list(Object... conditions) throws Exception {
        XmParams params = new XmParams();
        XmParams.Criteria c1 = params.createCriteria();
        XmParams.Criteria c2 = params.or();
        if (conditions != null && conditions.length > 0 && conditions[0] != null) {
            Xm xm = (Xm) conditions[0];


            //已发布项目管理 需要查询已发布的项目，允许修改，删除 ready
            if(StringUtils.isNotEmpty(xm.getStatus()) && "ready".equals(xm.getStatus())){
                c1.andStatusNotEqualTo(CmuConstants.XM.STATUS_TEMPORARY_STORAGE);// != '01'
            }

            if (StringUtils.isNotEmpty(xm.getXmmc())) {
                c1.andXmmcLike("%" + xm.getXmmc() + "%");
            }
            if(StringUtils.isNotEmpty(xm.getXmzm())){
                c2.andXmzmLike("%" + xm.getXmzm() + "%");
            }
            super.addOrderBy(params, conditions);
        }

        return dao.selectByExample(params);
    }

    @Override
    public boolean save(XmVo xmVo, HttpSession session) throws Exception {

        boolean success = false;
        boolean isEdit = false;
        Xm xm = xmVo.getXm();
        String[] gbs = xmVo.getGbs();

        if(StringUtils.isEmpty(xm.getXmId())){
            //年度+90+4位流水号
            String xmbh = DateUtils.getYear() + "90" + MaxNumUtils.getMaxNum("xm",  DateUtils.getYear(), 4);
            String operatorCode = (String) session.getAttribute(CmuConstants.SESSION.USER_ID);
            logger.info("保存项目，生成项目编号,操作工号"+operatorCode+",项目编号："+xmbh);
            xm.setXmId(CmuStringUtil.UUID());
            xm.setXmbh(xmbh);
            xm.setOperatorCode(operatorCode);
        }else{
            isEdit = true;
        }

        if(isEdit){
            int count = dao.updateByPrimaryKeySelective(xm);
            success = count>0;
        }else{
            int count = dao.insertSelective(xm);
            success = count>0;
        }

        //处理从表(先删 后插)
        //国家或地区
        XmGjdqParams param = new XmGjdqParams();
        param.createCriteria().andXmidEqualTo(xm.getXmId());
        gjDao.deleteByExample(param);

        if(ArrayUtils.isNotEmpty(gbs)){
            for (String gjdm : gbs) {
                XmGjdq gj = new XmGjdq(CmuStringUtil.UUID(), gjdm, xm.getXmId(), null, null);
                gjDao.insertSelective(gj);
            }
        }

        return success;
    }

    @Override
    public List listMcDistinct() {
        return daoExt.selectXmmcDistinct();
    }

    @Override
    public List listNjDistinct() {
        return daoExt.selectNjxzDistinct();
    }


    @Override
    public List<Map> listZy(){
        return zyDao.selectZyListAll();
    }

    @Override
    public List listSqXm(Xm xm, HttpSession session) throws Exception {
        Map map = new HashMap();
        String userType = (String) session.getAttribute(CmuConstants.SESSION.USER_TYPE);
        if(!CmuConstants.SESSION.USER_TYPE_BKS.equals(userType) && !CmuConstants.SESSION.USER_TYPE_YJS.equals(userType) ){
            throw new Exception("非学生登录..");
        }

        String xh = (String) session.getAttribute(CmuConstants.SESSION.USER_ID);
        String yxsh = (String) session.getAttribute(CmuConstants.SESSION.USER_DEPT);

        map.put("gsyxdm",yxsh);
        map.put("gsxsdm",xh);
        map.put("xm",xm);

        return daoExt.selectSqxm(map);
    }

    /**
     * 初始化学生申报页面
     * @param session
     * @return
     */
    @Override
    public XmXssqjl initSqPage(HttpSession session) {
        XmXssqjl sqjl = new XmXssqjl();

        String xh = (String)session.getAttribute(CmuConstants.SESSION.USER_ID);
        String userType = (String)session.getAttribute(CmuConstants.SESSION.USER_TYPE);


        if(userType.equals(CmuConstants.SESSION.USER_TYPE_BKS)){

            //学生信息
            BksXsjbsjxx bks = (BksXsjbsjxx)session.getAttribute(CmuConstants.SESSION.USER_INFO_BKS);

            //学籍信息
            BksXjjbsjxxParams xjjbsjxxParams = new BksXjjbsjxxParams();
            xjjbsjxxParams.createCriteria().andXhEqualTo(xh);
            List xjList = bksXjDao.selectByExample(xjjbsjxxParams);
            BksXjjbsjxx xjDto = (BksXjjbsjxx) xjList.get(0);

            sqjl.setXh(xh);
            sqjl.setXm(bks.getXm());
            sqjl.setGender(IcdcUtil.translateBksXb(bks.getXbm()));
            //入学年份
            sqjl.setRxn(xjDto.getRxny());
            //年级:
            sqjl.setNj(xjDto.getSznj());

            //院系:
            sqjl.setYxdm(xjDto.getYxsh()); //院系统一转码
            //班级:
            sqjl.setBjh(xjDto.getSzbh());   //院系统一转码
            //专业 :
            sqjl.setZyh(xjDto.getZym());





            BksZyxxsjxxParams zyParam = new BksZyxxsjxxParams();
            BksZyxxsjxxParams.Criteria zyCriteria = zyParam.createCriteria();
            zyCriteria.andZyhEqualTo(sqjl.getZyh());
            zyCriteria.andDwhEqualTo(sqjl.getYxdm());//单位好
            List zyList = bksZyDao.selectByExample(zyParam);
            BksZyxxsjxx bksZy = (BksZyxxsjxx) zyList.get(0);
            sqjl.setZymc(bksZy.getZymc());





            //手机号 没有
            // 邮箱  没有



        }else if(userType.equals(CmuConstants.SESSION.USER_TYPE_YJS)){

            //学生信息
            YjsXsjbsjxx yjs = (YjsXsjbsjxx)session.getAttribute(CmuConstants.SESSION.USER_INFO_YJS);
            //学籍信息
            YjsXjjbsjxxParams xjjbsjxxParams = new YjsXjjbsjxxParams();
            xjjbsjxxParams.createCriteria().andXhEqualTo(xh);
            List xjList = yjsXjDao.selectByExample(xjjbsjxxParams);
            YjsXjjbsjxx xjDto = (YjsXjjbsjxx) xjList.get(0);


            sqjl.setXh(xh);
            sqjl.setXm(yjs.getXm());
            sqjl.setGender(IcdcUtil.translateYjsXb(yjs.getXbm()));
            //入学年份
            sqjl.setRxn(xjDto.getRxny());
            //年级:
            sqjl.setNj(xjDto.getSznj());

            //院系:
            sqjl.setYxdm(xjDto.getYxsh()); //院系统一转码
            //班级:
            sqjl.setBjh(xjDto.getSzbh());   //院系统一转码

            //专业 :
            sqjl.setZyh(xjDto.getZym());


            //手机号 没有
            // 邮箱  没有

            YjsZyxxsjxxParams zyParam = new YjsZyxxsjxxParams();
            YjsZyxxsjxxParams.Criteria zyCriteria = zyParam.createCriteria();
            zyCriteria.andZyhEqualTo(sqjl.getZyh());
            zyCriteria.andDwhEqualTo(sqjl.getYxdm());//单位好
            List zyList = yjsZyDao.selectByExample(zyParam);
            YjsZyxxsjxx yjsZy = (YjsZyxxsjxx) zyList.get(0);
            sqjl.setZymc(yjsZy.getZymc());

        }


        UnicUnitParams unitParams = new UnicUnitParams();
        UnicUnitParams.Criteria unitCriteria = unitParams.createCriteria();
        unitCriteria.andUnitIdEqualTo(sqjl.getYxdm());//院系代码
        List unitList = unitDao.selectByExample(unitParams);
        UnicUnit unit = (UnicUnit) unitList.get(0);
        //院系名称
        sqjl.setYxmc(unit.getName());

        if(StringUtils.isNotEmpty(sqjl.getBjh())){

            BjsjxxParams bjsjxxParams = new BjsjxxParams();
            BjsjxxParams.Criteria bjCriteria = bjsjxxParams.createCriteria();
            bjCriteria.andBhEqualTo(sqjl.getBjh());
            List bjList = bjDao.selectByExample(bjsjxxParams);
            Bjsjxx bj = (Bjsjxx) bjList.get(0);
            //班级名称:
            if(StringUtils.isEmpty(bj.getBj())){//研究生不是单独班级表，
                sqjl.setBjmc(sqjl.getBjh());   //研究生的班级号就是班级名称
            }else{
                sqjl.setBjmc(bj.getBj());
            }
        }


        return sqjl;
    }

    @Override
    public List<Map> initGjdq(String xmid) {
        List<Map> list = daoExt.selectXmGb(xmid);
        for (Map<String,String> map : list) {
            System.out.println(map);
            String code = map.get("code");
            String name = map.get("name");
            map.put(code,name);
            map.remove("code");
            map.remove("name");
        }

        return list;
    }

    @Override
    public boolean saveSq(XmXssqjl jl, String[] fileid, String[] clsm) {
        boolean success = false;
        boolean isEdit = false;
        if(StringUtils.isEmpty(jl.getSqjlId())){
            jl.setSqjlId(CmuStringUtil.UUID());

        }else{
            isEdit = true;
        }

        if(isEdit){
            int count = sqDao.updateByPrimaryKeySelective(jl);
            success = count>0;
        }else{
            int count = sqDao.insertSelective(jl);
            success = count>0;
        }


        //从表上传材料
        XmXssbfjParams fjParam = new XmXssbfjParams();

        XmXssbfjParams.Criteria fjCriteria = fjParam.createCriteria();
        fjCriteria.andSqjlIdEqualTo(jl.getSqjlId());
        xmfjDao.deleteByExample(fjParam);
        XmXssbfj fj = null;
        for (int i = 0; i < fileid.length; i++) {
            fj = new XmXssbfj(CmuStringUtil.UUID(),jl.getSqjlId(), fileid[i], clsm[i],null,null);
            logger.debug(fj);
            xmfjDao.insertSelective(fj);//添加附件
        }

        return success;
    }

    @Override
    public List<XmXssbfj> querySbFjs(String id) {

        XmXssbfjParams param = new XmXssbfjParams();

        param.createCriteria().andSqjlIdEqualTo(id);

        List list = xmfjDao.selectByExample(param);

        return list;
    }

    @Override
    public List listXmSqxs(Object... conditions) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        XmXssqjlParams params = new XmXssqjlParams();
        XmXssqjlParams.Criteria c1 = params.createCriteria();

        if (conditions != null && conditions.length > 0 && conditions[0] != null) {
            XmXssqjl jl = (XmXssqjl) conditions[0];

            c1.andXmIdEqualTo(jl.getXmId());

            if(StringUtils.isNotEmpty(jl.getXm())){
                c1.andXmLike("%" + jl.getXm() + "%");
            }
            super.addOrderBy(params, conditions);
        }

        return sqDao.selectByExample(params);


    }

    /**
     * 项目初审
     * @param id
     * @param status
     * @return
     * @throws Exception
     */
    @Override
    public boolean xsshCs(String id, String status) throws Exception {

        XmXssqjl sqjl = (XmXssqjl)sqDao.selectByPrimaryKey(id);

        sqjl.setStatus(status);

        int count = sqDao.updateByPrimaryKeySelective(sqjl);

        String sendUser = "";
        String title =          ResourceBundleUtils.getString("ifs.wechat.xm.sh.title");//【通知】国际交流项目审核
        String description = ResourceBundleUtils.getString("ifs.wechat.xm.sh.description");//国际事务部通知

        String content = null;
        if("02".equals(sqjl.getStatus() ) ) {//审核通过
            content = ResourceBundleUtils.getString("ifs.wechat.xm.cs.pass.content");
        }else if("03".equals(sqjl.getStatus())){
            content = ResourceBundleUtils.getString("ifs.wechat.xm.cs.back.content");
        }

        //异步发送微信消息,改为后台线程池 执行.
        SysThreadPoolRunner.submit(new WeChartUtils(sendUser,sqjl.getXh(), title, description, content));

        return count>0;
    }

    /**
     * 初审确认
     * @param id
     * @return
     */
    @Override
    public boolean confirmCs(String id) throws Exception {

        XmXssqjl jl  = (XmXssqjl) sqDao.selectByPrimaryKey(id);
        jl.setIsconfirm1("1"); //是否确认初审，0 未确认 默认， 1 已确认

        if("03".equals(jl.getStatus())){//如果是初审通过，则确认时将状态变为待复审
            jl.setConfirmStatus("01");//复审状态 待复审
        }

        int count = sqDao.updateByPrimaryKeySelective(jl);





        return count>0;
    }



    /**
     * 复审确认
     * @param id
     * @return
     */
    @Override
    public boolean confirmFs(String id) {

        XmXssqjl jl  = (XmXssqjl) sqDao.selectByPrimaryKey(id);
        jl.setIsconfirm2("1"); //是否确认复审，0 未确认 默认， 1 已确认

        int count = sqDao.updateByPrimaryKeySelective(jl);

        return count>0;
    }

    /**
     * 列表显示 项目中已复审通过 或自费 的学生名单
     * @param conditions
     * @return
     */
    @Override
    public List listXmmx(Object... conditions) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {


        XmXssqjlParams params = new XmXssqjlParams();
        XmXssqjlParams.Criteria c1 = params.createCriteria();
        XmXssqjlParams.Criteria c2 = params.or();

        c1.andConfirmStatusEqualTo("02"); //复审通过
        c2.andSelfPayEqualTo("Y");//自费

        if (conditions != null && conditions.length > 0 && conditions[0] != null) {
            XmXssqjl jl = (XmXssqjl) conditions[0];
            c1.andXmIdEqualTo(jl.getXmId());
            c2.andXmIdEqualTo(jl.getXmId());

            if(StringUtils.isNotEmpty(jl.getXm())){
                c1.andXmLike("%" + jl.getXm() + "%");
                c2.andXmLike("%" + jl.getXm() + "%");
            }
            super.addOrderBy(params, conditions);
        }

        return sqDao.selectByExample(params);
    }


    /**
     * 申请自费
     * @param id
     * @return
     */
    @Override
    public boolean sqzf(String id) {

        XmXssqjl jl  = (XmXssqjl) sqDao.selectByPrimaryKey(id);
        jl.setSelfPay("Y");
        jl.setIsconfirm2("1");//复审阶段已经确认

        int count = sqDao.updateByPrimaryKeySelective(jl);

        return count>0;
    }

    /**
     *  学生项目复审
     * @param jl
     * @return
     */
    @Override
    public boolean xsshFs(XmXssqjl jl) throws Exception {
        int count = sqDao.updateByPrimaryKeySelective(jl);


        String sendUser = "";
        String title =          ResourceBundleUtils.getString("ifs.wechat.xm.sh.title");//【通知】国际交流项目审核
        String description = ResourceBundleUtils.getString("ifs.wechat.xm.sh.description");//国际事务部通知

        String content = null;
        if("02".equals(jl.getConfirmStatus() ) ) {//审核通过
            content = ResourceBundleUtils.getString("ifs.wechat.xm.fs.pass.content");
        }else if("03".equals(jl.getConfirmStatus())){
            content = ResourceBundleUtils.getString("ifs.wechat.xm.fs.back.content");
        }

        //异步发送微信消息,改为后台线程池 执行.
//        new WeChartUtils(sendUser,receiveUser,title,description,content).sendWxMessageSync();
        SysThreadPoolRunner.submit(new WeChartUtils(sendUser,jl.getXh(), title, description, content));


        return count>0;
    }





    @Override
    public List listYsqxm(Object... conditions) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {


        XmXssqjlParams params = new XmXssqjlParams();
        XmXssqjlParams.Criteria c1 = params.createCriteria();
        XmXssqjlParams.Criteria c2 = params.or();

        c1.andConfirmStatusEqualTo("02"); //复审通过
        c2.andSelfPayEqualTo("Y");//自费

        if (conditions != null && conditions.length > 0 && conditions[0] != null) {
            XmXssqjl jl = (XmXssqjl) conditions[0];

            c1.andXhEqualTo(jl.getXh());
            c2.andXhEqualTo(jl.getXh());

            if(StringUtils.isNotEmpty(jl.getXmmc())){
                c1.andXmmcLike(jl.getXmmc());
                c2.andXmmcLike(jl.getXmmc());
            }
            if(StringUtils.isNotEmpty(jl.getXmzm())){
                c1.andXmzmLike(jl.getXmzm());
                c2.andXmzmLike(jl.getXmzm());
            }

            super.addOrderBy(params, conditions);
        }

        return sqExtDao.selectByExample(params);
    }


    //查询项目交流报告总结，供管理员和教师查看
    @Override
    public List<XmzjbgVO> selectXmzjbg(XmzjbgVO vo) {
        return daoExt.selectXmzjbg(vo);
    }

}