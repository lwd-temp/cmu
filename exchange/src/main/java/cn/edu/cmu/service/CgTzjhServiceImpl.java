package cn.edu.cmu.service;

import cn.edu.cmu.dao.CgTzcyMapper;
import cn.edu.cmu.dao.CgTzjhMapper;
import cn.edu.cmu.dao.CgTzjhMapperExt;
import cn.edu.cmu.dao.CgjhGbMapper;
import cn.edu.cmu.domain.*;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.UserContext;
import cn.edu.cmu.framework.threadpool.SysThreadPoolRunner;
import cn.edu.cmu.framework.util.*;
import cn.edu.cmu.framework.web.BaseService;
import cn.edu.cmu.vo.CgtzjhVO;
import com.github.pagehelper.StringUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
/*
*
 * <p><b>Project:</b>  		《ssm-0726》</p>
 * <p><b>Title:</b>   		UserServiceImpl</p>
 * <p><b>Description:</b> 	Description  </p>
 * <p><b>Company:</b>		www.neusoft.com.cn </p>
 * <p><b>Site:</b>			http://314649444.iteye.com/  </p>
 *
 * @date 2018-7-26   下午2:04:03
 * @author 东软，张金山
*/
@Service
public class CgTzjhServiceImpl extends BaseService<CgTzjh, CgTzjhParams, CgTzjhMapper> implements CgTzjhService {

    @Autowired
    private CgTzcyMapper tzcyDao;

    @Autowired
    private CgjhGbMapper gbDao;

    @Autowired
    private CgTzjhMapperExt extDao;
    //
    @Override
    public List list(CgTzjh cgTzjh) {
        CgTzjhParams ex = new CgTzjhParams();
        if(cgTzjh != null){
            CgTzjhParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(cgTzjh.getCfdw())){
                c.andFzrxmLike("%"+cgTzjh.getCfdw()+"%");
            }
        }
        return dao.selectByExample(ex);
    }


    //分页查询
    @Override
    public List list(Object... conditions) throws Exception {
        CgTzjhParams params = new CgTzjhParams();
        CgTzjhParams.Criteria c = params.createCriteria();

        if(conditions != null && conditions.length>0 && conditions[0]!=null){//如果 User不等于 null 说明可能穿条件了
            CgTzjh tzjh = (CgTzjh) conditions[0];

            if(StringUtils.isNotEmpty(tzjh.getFzrxm())){
                c.andFzrxmLike("%"+tzjh.getFzrxm()+"%");
            }

            if(StringUtils.isNotEmpty(tzjh.getTzh())){
                c.andTzhLike("%"+tzjh.getTzh()+"%");
            }
            super.addOrderBy(params,conditions);
        }

        return dao.selectByExample(params);
    }

    @Override
    public boolean saveOrUpdate(CgtzjhVO vo) throws Exception {
        boolean isEdit = false;//是否修改标志

        CgTzjh cgTzjh = vo.getCgTzjh();
        String[] cfgbIds = vo.getCfgbIds();
        List<CgTzcy> cys = vo.getCys();
        if(StringUtil.isEmpty(cgTzjh.getTzid())){
            String keyId = CmuStringUtil.UUID();
            cgTzjh.setTzid(keyId);
            cgTzjh.setOperator(UserContext.getUserId());
        }else{//如果存在id则说明是修改
            isEdit = true;
        }

        //无论新增，还是修改，需要再成员表中维护主外键关系
        if((!CollectionUtils.isEmpty(cys)) ){
            for (CgTzcy cy : cys) {
                cy.setTzid(cgTzjh.getTzid());//设置外键团组计划id
            }
        }


        if(isEdit){ //修改
            dao.updateByPrimaryKeySelective(cgTzjh);

            //从表先删后查
            deleteCy(cgTzjh);
            //删完后添加从表数据
            insertCy(cys);

            //国别先删除后插入
            deleteGb(cgTzjh);
            //删完后添加从表国别数据
            insertGb(cgTzjh,cfgbIds);

        }else{  //添加
            //新增时需要生成团组号 2018-01-000001   ---> 201801000001
            String tzh = String.valueOf(DateUtils.getYear())+cgTzjh.getTzlb()+MaxNumUtils.getMaxNum("tzh",DateUtils.getYear(),6);
            cgTzjh.setTzh(tzh);

            dao.insertSelective(cgTzjh);

            insertCy(cys);

            insertGb(cgTzjh,cfgbIds);
        }

        return true;
    }

    @Override
    public List shlist(Object... conditions) throws Exception {
        CgTzjhParams params = new CgTzjhParams();
        CgTzjhParams.Criteria c = params.createCriteria();
        c.andStatusEqualTo(CmuConstants.TZ_STAUTS.REVIEW);


        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            CgTzjh tzjh = (CgTzjh) conditions[0];

            if(StringUtils.isNotEmpty(tzjh.getFzrxm())){
                c.andFzrxmLike("%"+tzjh.getFzrxm()+"%");
            }

            if(StringUtils.isNotEmpty(tzjh.getTzh())){
                c.andTzhLike("%"+tzjh.getTzh()+"%");
            }
            super.addOrderBy(params,conditions);
        }


        return dao.selectByExample(params);
    }

    /**
     * 审核处理，根据id，更新状态
     * @param id
     * @param status
     * @return
     */
    @Override
    public boolean sh(String id, String status) {
        CgTzjh domain = (CgTzjh) dao.selectByPrimaryKey(id);
        domain.setStatus(status);

        int count  = dao.updateByPrimaryKeySelective(domain);

        if(CmuConstants.CGTZJH.STATUS_BACK.equals(domain.getStatus())){

            String title =          ResourceBundleUtils.getString("ifs.wechat.cgtzjh.shth.title");//【通知】出国团组计划审核
            String description =    ResourceBundleUtils.getString("ifs.wechat.cgtzjh.shth.description");//国际事务部通知
            String content =        ResourceBundleUtils.getString("ifs.wechat.cgtzjh.shth.content");//尊敬的老师您好，您的出国团组计划申请已退回，请知悉。

            SysThreadPoolRunner.submit(new WeChartUtils("", domain.getOperator(), title, description, content));
        }

        return count>0  ;
    }

    @Override
    public List gllist(Object... conditions) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        CgTzjhParams params = new CgTzjhParams();
        CgTzjhParams.Criteria c = params.createCriteria();
        c.andStatusEqualTo(CmuConstants.TZ_STAUTS.PASS);


        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            CgTzjh tzjh = (CgTzjh) conditions[0];

            if(StringUtils.isNotEmpty(tzjh.getFzrxm())){
                c.andFzrxmLike("%"+tzjh.getFzrxm()+"%");
            }

            if(StringUtils.isNotEmpty(tzjh.getTzh())){
                c.andTzhLike("%"+tzjh.getTzh()+"%");
            }
            super.addOrderBy(params,conditions);
        }


        return dao.selectByExample(params);
    }

    @Override
    public List gllistExp(Object... conditions) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        CgTzjhParams params = new CgTzjhParams();
        CgTzjhParams.Criteria c = params.createCriteria();
        c.andStatusEqualTo(CmuConstants.TZ_STAUTS.PASS);


        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            CgTzjh tzjh = (CgTzjh) conditions[0];

            if(StringUtils.isNotEmpty(tzjh.getFzrxm())){
                c.andFzrxmLike("%"+tzjh.getFzrxm()+"%");
            }

            if(StringUtils.isNotEmpty(tzjh.getTzh())){
                c.andTzhLike("%"+tzjh.getTzh()+"%");
            }
            super.addOrderBy(params,conditions);
        }


        return extDao.selectByExampleTranslateCode(params);
    }

    /**
     * 插入新的国别
     * @param cgTzjh
     * @param cfgbIds
     */
    private void insertGb(CgTzjh cgTzjh, String[] cfgbIds) {
        if(!ArrayUtils.isEmpty(cfgbIds)) {
            for (String gbDm : cfgbIds) {
                CgjhGb gb = new CgjhGb(CmuStringUtil.UUID(), gbDm, cgTzjh.getTzid(), null, null);
                gbDao.insertSelective(gb);
            }
        }
    }

    /**
     * 删除就的国别
     * @param cgTzjh
     */
    private void deleteGb(CgTzjh cgTzjh) {
        CgjhGbParams params = new CgjhGbParams();
        params.createCriteria().andJhidEqualTo(cgTzjh.getTzid());
        List oldGbs = gbDao.selectByExample(params);
        if(!CollectionUtils.isEmpty(oldGbs)) {
            for (Object obj : oldGbs) {
                CgjhGb oldGb = (CgjhGb)obj;
                gbDao.deleteByPrimaryKey(oldGb.getGbid());
            }
        }
    }


    //删除团组对应的成员
    private void deleteCy(CgTzjh cgTzjh){
        CgTzcyParams params = new CgTzcyParams();
        params.createCriteria().andTzidEqualTo(cgTzjh.getTzid());//根据团组id查询所有从表数据
        List oldTzCys = tzcyDao.selectByExample(params);
        if(!CollectionUtils.isEmpty(oldTzCys)) {
            for (Object obj : oldTzCys) {
                CgTzcy oldTzCy = (CgTzcy)obj;
                tzcyDao.deleteByPrimaryKey(oldTzCy.getCyid());
            }
        }
    }


    /**
     * 添加团组成员
     * @param cys
     */
    private void insertCy(List<CgTzcy> cys){
        if(!CollectionUtils.isEmpty(cys)) {
            for (CgTzcy cy : cys) {
                cy.setCyid(CmuStringUtil.UUID());
                tzcyDao.insertSelective(cy);
            }
        }
    }



}
