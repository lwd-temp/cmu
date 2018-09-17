package cn.edu.cmu.dao;

import cn.edu.cmu.domain.Contact;
import cn.edu.cmu.domain.ContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(ContactExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(ContactExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String lxrId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(Contact record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(Contact record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<Contact> selectByExample(ContactExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    Contact selectByPrimaryKey(String lxrId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") Contact record, @Param("example") ContactExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") Contact record, @Param("example") ContactExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(Contact record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(Contact record);
}