package cn.edu.cmu.framework.web;

import java.util.List;

public interface IBaseService<Domain,DomainParams> {



    //添加 部分属性 属性为null不会更新
    boolean insert(Domain domain);
    //添加全部子弹 属性为null也会更新 会覆盖默认字段的值
    boolean insertAllColumn(Domain domain);


    //根据主键删除
    boolean deleteById(String keyId);
    //根据参数删除
    boolean deleteByCondition(DomainParams params);


    //根据主键更新 所有属性 属性为null也会更新 会覆盖默认字段的值
    boolean updateByIdAllColumn(Domain domain);

    //根据主键更新 部分属性 属性为null不会更新
    boolean updateById(Domain domain);



    //按条件查询
    public List list(Domain domain);

    //根据主键查询
    Domain queryById(String keyId);

    //根据条件查询条数
    int countByCondition(DomainParams params);

}
