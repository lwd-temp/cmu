package cn.edu.cmu.vo;

import lombok.Data;

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

    //排序条件
    private String orderCol;
    private String orderType;

}
