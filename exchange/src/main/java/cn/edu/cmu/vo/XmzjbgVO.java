package cn.edu.cmu.vo;

import lombok.Data;

import java.util.Date;

/***
 * @pj: cmu
 * @author : jshand
 * @date: 2019/6/25
 * @time: 20:44
 * @site: http://314649444.iteye.com
 * @desc：项目总结报告VO类
 */

@Data
public class XmzjbgVO {

    private String  zjid;//总结id
    private String  fileId;//总结时上传的文件id
    private String  xmbh;//项目编号
    private String  xmmc;//项目名称
    private String  xh; // 序号
    private String  xm; //姓名
    private String  unitName; //所属院系
    private String  sznj; //所在年级
    private String  xmlx;//项目类型
    private String  zzje;//资助金额
    private String  zymc;//校内专业
    private String  jlgjdqm;//国家地区
    private String  jlmbjgmc;//交流机构名称
    private String  jfly;//经费来源
    private Date xmkssj;//出国开始时间
    private Date  smjssj;//回国时间
    private String xmjlts;//交流时长
    private String rxn;//入学年
    private String xmcc;//项目层次

    //排序条件
    private String orderCol;
    private String orderType;



}
