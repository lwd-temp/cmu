package cn.edu.cmu.framework.web;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public abstract class BaseService<Domain, DomainParams, MyBatisMapper extends BaseMapper> implements IBaseService<Domain, DomainParams> {

    protected Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    protected MyBatisMapper dao;


    @Override
    public boolean insert(Domain domain)throws Exception {
        return dao.insertSelective(domain) > 0;
    }

    @Override
    public boolean insertAllColumn(Domain domain)throws Exception {
        return dao.insert(domain) > 0;
    }

    @Override
    public boolean deleteById(String keyId)throws Exception {
        Object domain = dao.selectByPrimaryKey(keyId);
        Field field = domain.getClass().getDeclaredField("valid");
        field.setAccessible(true);

        field.set(domain,"0");//将valid 设置为 0 逻辑删除，查询时默认只查询valid为1的
        int count = dao.updateByPrimaryKeySelective(domain);
        return count > 0;
    }

    @Override
    public boolean deleteByCondition(DomainParams domainParams)throws Exception {
        return dao.deleteByExample(domainParams) > 0;
    }

    @Override
    public boolean updateByIdAllColumn(Domain domain)throws Exception {
        return dao.updateByPrimaryKey(domain) > 0;
    }

    @Override
    public boolean updateById(Domain domain)throws Exception {
        return dao.updateByPrimaryKeySelective(domain) > 0;
    }

    /**
     * 每个表的查询条件都不一样，没法抽象，所以让继承类实现
     *
     * @param domain
     * @return
     */
    @Override
    public abstract List list(Domain domain)throws Exception;


    @Override
    public List listByParam(DomainParams domainParams) throws Exception {

        return dao.selectByExample(domainParams);
    }

    @Override
    public abstract List list(Object... conditions) throws  Exception;

    @Override
    public Domain queryById(String keyId)throws Exception {
        return (Domain) dao.selectByPrimaryKey(keyId);
    }


    @Override
    public int countByCondition(DomainParams domainParams)throws Exception {
        return dao.countByExample(domainParams);
    }



    public void addOrderBy(Object myBatisParam,Object... conditions) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Assert.notNull(myBatisParam,"mybatis查询条件不能为空.");
        if(conditions == null || conditions.length <=1){
            return ;
        }

        Method setOrderByClauseMethod = myBatisParam.getClass().getDeclaredMethod("setOrderByClause", String.class);
        String orderCol = (String) conditions[1];
        String orderType = (String) (conditions.length>2 ?conditions[2]:"");

        if(StringUtils.isEmpty(orderCol)){
            return;
        }
        //order by %s %s
        setOrderByClauseMethod.invoke(myBatisParam,String.format(" %s %s",orderCol,orderType));

    }

}
