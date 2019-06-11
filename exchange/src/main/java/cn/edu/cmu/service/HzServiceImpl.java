package cn.edu.cmu.service;
import cn.edu.cmu.dao.HzMapper;
import cn.edu.cmu.domain.Hz;
import cn.edu.cmu.domain.HzParams;
import cn.edu.cmu.framework.CmuConstants;
import cn.edu.cmu.framework.threadpool.SysThreadPoolRunner;
import cn.edu.cmu.framework.util.FtlUtils;
import cn.edu.cmu.framework.util.ResourceBundleUtils;
import cn.edu.cmu.framework.util.WeChartUtils;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Service
public class HzServiceImpl extends BaseService<Hz, HzParams, HzMapper> implements HzService {
    @Override
    public List list(Hz Hz) {
        HzParams ex = new HzParams();
        if(Hz != null){
            HzParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(Hz.getXm())){
                c.andXmLike("%"+Hz.getXm()+"%");
            }
        }
        return dao.selectByExample(ex);
    }

    //分页查询 调用的是这个
    //conditions  参数就叫这个就行， 意思是 多个条件，
    @Override
    public List list(Object... conditions) throws Exception {
        HzParams params = new HzParams();
        HzParams.Criteria c = params.createCriteria();
        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            Hz hz = (Hz) conditions[0];
            if(StringUtils.isNotEmpty(hz.getXm())){
                c.andXmLike("%"+hz.getXm()+"%");//先按照这个查询，如果有多个条件 就在该这
            }
            super.addOrderBy(params,conditions);//排序
        }
        return dao.selectByExample(params);
    }

    /**
     * 护照半年有效期提醒
     */
    @Override
    public void halfYearRemind() {

        Calendar afterHalfYear = Calendar.getInstance();
        afterHalfYear.set(Calendar.MONTH, afterHalfYear.get(Calendar.MONTH)+6);//6个月后

        HzParams params = new HzParams();
        HzParams.Criteria cri = params.createCriteria();

        cri.andYxqzLessThan(afterHalfYear.getTime());
        List<Hz> list = dao.selectByExample(params);


        String title = ResourceBundleUtils.getString("ifs.wechat.hz.bntx.title");//【通知】护照半年到期提醒
        String description = ResourceBundleUtils.getString("ifs.wechat.hz.bntx.description");//国际事务部通知
        String content = ResourceBundleUtils.getString("ifs.wechat.hz.bntx.content");//尊敬的老师您好，您的护照还有半年即将超期，请知晓中文

        for (final Hz hz : list) {
            if(StringUtils.isNotEmpty(hz.getGh())){//如果存在工号，则发微信通知
                //提交到线程池，待执行任务
                SysThreadPoolRunner.submit(new WeChartUtils("", hz.getGh(), title, description, content));
            }else{
                logger.info("护照半年期提醒，姓名：["+hz.getXm()+"] 工号为空，未能发送微信提醒");
            }

        }

    }

    /**
     * 归国之后七天内微信提醒老师归还
     */
    @Override
    public void qiTianTixing() {
        Calendar now = Calendar.getInstance();
        now.set(Calendar.DAY_OF_MONTH, now.get(Calendar.DAY_OF_MONTH)+7);//6个月后

        HzParams params = new HzParams();
        HzParams.Criteria cri = params.createCriteria();

        cri.andCfsjRjGreaterThanOrEqualTo(now.getTime());
        cri.andStatusEqualTo(CmuConstants.HZ.STATUS_JCZ);

        List<Hz> list = dao.selectByExample(params);

        String title = ResourceBundleUtils.getString("ifs.wechat.hz.qttx.title");//【通知】护照半年到期提醒
        String description = ResourceBundleUtils.getString("ifs.wechat.hz.qttx.description");//国际事务部通知
        String content = ResourceBundleUtils.getString("ifs.wechat.hz.qttx.content");//尊敬的老师您好，您已归国超过七天，请归还护照到国际事务部

        for (final Hz hz : list) {
            if(StringUtils.isNotEmpty(hz.getGh())){//如果存在工号，则发微信通知
                //提交到线程池，待执行任务
                SysThreadPoolRunner.submit(new WeChartUtils("", hz.getGh(), title, description, content));
            }else{
                logger.info("护照归国7天提醒，姓名：["+hz.getXm()+"] 工号为空，未能发送微信提醒");
            }

        }
    }
}