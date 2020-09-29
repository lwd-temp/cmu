package cn.edu.cmu.framework;

/**
 * @Author: jshand
 * @Date: 2018/10/2 11:34
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */

/**
 * 常量代码
 */
public class CmuConstants {

    public interface SESSION{
        //用户ID
        public final String USER_ID = "USER_ID";
         //用户名称
        public final String USER_NAME = "USER_NAME";
        //用户名称
        public final String USER_DEPT = "USER_DEPT";

        //用户类型
        public final String USER_TYPE = "USER_TYPE";

        //本科生
        public final String USER_TYPE_BKS = "1";
        //研究生生
        public final String USER_TYPE_YJS = "2";
        //教职工信息类型
        public final String USER_TYPE_JZG = "3";

        //教职工信息具体
        public final String USER_INFO_JZG = "USER_INFO_JZG";
        //教职工信息具体
        public final String USER_INFO_BKS = "USER_INFO_BKS";
        //教职工信息具体
        public final String USER_INFO_YJS = "USER_INFO_YJS";

        //本科生
        public final String USER_BKS = "USER_BKS";
        //研究生
        public final String USER_YJS = "USER_YJS";

    }


    //团组状态
    public interface TZ_STAUTS{
        //待审核
        public final String REVIEW = "02";

        //已审核通过
        public final String PASS = "04";
    }




    //外宾接待
    public interface WBJD{
        //退回
        public static final String  STATUS_BACK = "03";

        //重新开始
        public static final String  STATUS_RESTART = "00";

        //通过
        public static final String  STATUS_PASS = "04";
    }




    /**
     *护照
     */
    public interface HZ{

        /**
         * 借出中
         */
        public static final String  STATUS_JCZ = "04";

    }


    /**
     * 项目
     */
    public interface XM{
        public static final String STATUS_TEMPORARY_STORAGE = "01";//项目状态



        //申请暂存
        public static final String SQ_STATUS_TEMPORARY_STORAGE = "01";
        //项目待审核
        public static final String SQ_STATUS_XM_SH = "06";
        //项目审核未通过
        public static final String SQ_STATUS_XM_SH_PASS = "07";
        //申请提交，待初审
        public static final String SQ_STATUS_SUBMIT = "02";

        //学院初审通过
        public static final String SQ_STATUS_XY_PASS = "03";
        //学院初审不通过
        public static final String SQ_STATUS_XY_BACK = "04";

        //学生处初审通过
        public static final String SQ_STATUS_XSC_PASS = "05";
        //学生处初审不通过
        public static final String SQ_STATUS_XSC_BACK = "06";


        /**
         * 复审 状态，
         *    01 已发送微信通知，待复审
         *    02 复审通过
         *    03 复审不通过
         */
        public static final String SH_FS_STATUS_SEND_MSG = "01";
        public static final String SH_FS_STATUS_PASS = "02";
        public static final String SH_FS_STATUS_BACK = "03";


    }


    /**
     * 国际会议
     */
    public interface HY{
        //审核退回
        public static final String STATUS_BACK = "03";
    }



    //出国团组计划
    public interface CGTZJH{
        //审核退回
        public static final String STATUS_BACK = "03";
    }

    //出国境
    public interface DQCGJ{
        //审核退回
        public static final String STATUS_BACK = "03";
    }



}
