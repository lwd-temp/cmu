package cn.edu.cmu.dao;

import cn.edu.cmu.domain.Menu;
import cn.edu.cmu.domain.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    /**
     *
     * @mbggenerated 2018-09-17
     */
    int countByExample(MenuExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByExample(MenuExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int deleteByPrimaryKey(String menuId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insert(Menu record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int insertSelective(Menu record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    List<Menu> selectByExample(MenuExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    Menu selectByPrimaryKey(String menuId);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKeySelective(Menu record);

    /**
     *
     * @mbggenerated 2018-09-17
     */
    int updateByPrimaryKey(Menu record);
}