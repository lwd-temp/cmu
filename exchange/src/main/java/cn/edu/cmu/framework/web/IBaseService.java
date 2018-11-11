package cn.edu.cmu.framework.web;

import java.util.List;

public interface IBaseService<Domain,DomainParams> {



    //添加 部分属性 属性为null不会更新
    boolean insert(Domain domain)throws Exception;

    //添加全部子弹 属性为null也会更新 会覆盖默认字段的值
    boolean insertAllColumn(Domain domain)throws Exception;


    //根据主键删除
    boolean deleteById(String keyId)throws Exception;
    //根据参数删除
    boolean deleteByCondition(DomainParams params)throws Exception;


    //根据主键更新 所有属性 属性为null也会更新 会覆盖默认字段的值
    boolean updateByIdAllColumn(Domain domain)throws Exception;

    //根据主键更新 部分属性 属性为null不会更新
    boolean updateById(Domain domain)throws Exception;



    //按条件查询
    public List list(Domain domain)throws Exception;


    public List listByParam(DomainParams params)throws Exception;


    //按条件查询
    public abstract List list(Object... conditions) throws Exception;


    //根据主键查询
    Domain queryById(String keyId)throws Exception;

    //根据条件查询条数
    int countByCondition(DomainParams params)throws Exception;

}
