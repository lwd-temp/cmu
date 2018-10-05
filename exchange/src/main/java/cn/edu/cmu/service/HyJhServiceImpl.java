package cn.edu.cmu.service;

import cn.edu.cmu.dao.HyJhMapper;
import cn.edu.cmu.dao.HyRymdMapper;
import cn.edu.cmu.domain.HyJh;
import cn.edu.cmu.domain.HyJhParams;
import cn.edu.cmu.domain.HyRymd;
import cn.edu.cmu.domain.HyRymdParams;
import cn.edu.cmu.framework.util.CmuStringUtil;
import cn.edu.cmu.framework.util.DateUtils;
import cn.edu.cmu.framework.util.MaxNumUtils;
import cn.edu.cmu.framework.web.BaseService;
import cn.edu.cmu.vo.HyjhVO;
import com.github.pagehelper.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Calendar;
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
public class HyJhServiceImpl extends BaseService<HyJh, HyJhParams, HyJhMapper> implements HyJhService {


    @Autowired
    private HyRymdMapper ryDao;

    @Override
    public List list(HyJh hyJh) {
        HyJhParams ex = new HyJhParams();
        if(hyJh != null){
            HyJhParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(hyJh.getFzrxm())){
                c.andFzrxmLike("%"+hyJh.getFzrxm()+"%");
            }
        }
        return dao.selectByExample(ex);
    }



    @Override
    public List list(Object... conditions) throws Exception {
        HyJhParams params = new HyJhParams();
        HyJhParams.Criteria c1 = params.createCriteria();
        HyJhParams.Criteria c2 = params.createCriteria();

        if(conditions != null && conditions.length>0 && conditions[0]!=null){
            HyJh hyjh = (HyJh) conditions[0];

            if(StringUtils.isNotEmpty(hyjh.getZbdw())){
                c1.andZbdwLike("%"+hyjh.getZbdw()+"%");
            }
            if(StringUtils.isNotEmpty(hyjh.getCbdw())){
                c1.andCbdwLike("%"+hyjh.getCbdw()+"%");
            }


            c2.andCbdwLike("%"+hyjh.getZbdw()+"%");
            super.addOrderBy(params,conditions);
        }

        return dao.selectByExample(params);
    }

    /**
     * 如果如表没有主键则新增，否则修改
     * @param hyjhVo
     * @return
     * @throws Exception
     */
    @Override
    public boolean save(HyjhVO hyjhVo) throws Exception {

        HyJh hyjh = hyjhVo.getHyJh();

        boolean isEdit = false;//是否修改标志
        if(StringUtil.isEmpty(hyjh.getJhid())){
            String keyId = CmuStringUtil.UUID();
            hyjh.setJhid(keyId);
        }else{//如果存在id则说明是修改
            isEdit = true;
        }

        logger.info("待保存 主表的 hyJh:"+hyjh);
        int count = 0;
        if(isEdit){
            count = dao.updateByPrimaryKeySelective(hyjh);
        }else{
            //新增需要生成会议编号
            String hybh = DateUtils.getYear() + "909" + MaxNumUtils.getMaxNum("hyjh", (long) Calendar.getInstance().get(Calendar.YEAR), 3);
            hyjh.setHybh(hybh);
            count = dao.insertSelective(hyjh);
        }
        logger.info("保存 主表的hyJh 结果 :"+(count>0));

        //从表信息 参会人员名单
        List<HyRymd> rys = hyjhVo.getChrys();
        if(!CollectionUtils.isEmpty(rys)){
            if(isEdit){//如果是修改则删除原来从表数据
                HyRymdParams params = new HyRymdParams();
                params.createCriteria().andJhidEqualTo(hyjh.getJhid());
                ryDao.deleteByExample(params);
            }
            for (HyRymd ry : rys) {
                ry.setMdid(CmuStringUtil.UUID());
                ry.setJhid(hyjh.getJhid());
                ryDao.insertSelective(ry);
            }

        }

        return count>0;
    }

    /**
     * 获取会议计划对应的人员名单
     * @param jhid
     * @return
     */
    @Override
    public List rymcList(String jhid){
        HyRymdParams params = new HyRymdParams();
        params.createCriteria().andJhidEqualTo(jhid);
        return ryDao.selectByExample(params);
    }

}
