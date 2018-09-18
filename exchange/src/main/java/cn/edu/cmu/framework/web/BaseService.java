package cn.edu.cmu.framework.web;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class BaseService<Domain,DomainParams,MyBatisMapper extends  BaseMapper> implements IBaseService<Domain,DomainParams> {

    @Autowired
    protected MyBatisMapper dao;


    @Override
    public boolean insert(Domain domain) {
        return dao.insertSelective(domain)>0;
    }

    @Override
    public boolean insertAllColumn(Domain domain) {
        return dao.insert(domain)>0;
    }

    @Override
    public boolean deleteById(String keyId) {
        return dao.deleteByPrimaryKey(keyId)>0;
    }

    @Override
    public boolean deleteByCondition(DomainParams domainParams) {
        return dao.deleteByExample(domainParams)>0;
    }

    @Override
    public boolean updateByIdAllColumn(Domain domain) {
        return dao.updateByPrimaryKey(domain)>0;
    }

    @Override
    public boolean updateById(Domain domain) {
        return dao.updateByPrimaryKeySelective(domain)>0;
    }

    /**
     * 每个表的查询条件都不一样，没法抽象，所以让继承类实现
     * @param domain
     * @return
     */
    @Override
    public abstract List list(Domain domain);

    @Override
    public Domain queryById(String keyId) {
        return (Domain) dao.selectByPrimaryKey(keyId);
    }

    @Override
    public int countByCondition(DomainParams domainParams) {
        return dao.countByExample(domainParams);
    }
}
