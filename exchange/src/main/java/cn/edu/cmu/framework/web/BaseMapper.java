package cn.edu.cmu.framework.web;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseMapper<DomainParams> {

    int countByExample(DomainParams params);


    int deleteByExample(DomainParams params);


    int deleteByPrimaryKey(String keyId);


    int insert(Object record);


    int insertSelective(Object record);


    List<Object> selectByExample(DomainParams params);


    Object selectByPrimaryKey(String keyId);


    int updateByExampleSelective(@Param("record") Object record, @Param("example") DomainParams params);


    int updateByExample(@Param("record") Object record, @Param("example") DomainParams params);


    int updateByPrimaryKeySelective(Object record);


    int updateByPrimaryKey(Object record);
}
