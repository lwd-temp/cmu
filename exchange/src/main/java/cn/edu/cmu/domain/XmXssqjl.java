package cn.edu.cmu.domain;

import java.math.BigDecimal;
import java.util.Date;

public class XmXssqjl {
    /**
     * 申请记录id
     */
    private String sqjlId;

    /**
     * 项目主键
     */
    private String xmId;

    /**
     * 项目总名
     */
    private String xmzm;

    /**
     * 项目名称
     */
    private String xmmc;

    /**
     * 学号
     */
    private String xh;

    /**
     * 姓名
     */
    private String xm;

    /**
     * 性别
     */
    private String gender;

    /**
     * 院系代码
     */
    private String yxdm;

    /**
     * 院系名称
     */
    private String yxmc;

    /**
     * 入学年
     */
    private String rxn;

    /**
     * 年级
     */
    private String nj;

    /**
     * 专业号
     */
    private String zyh;

    /**
     * 专业名称
     */
    private String zymc;

    /**
     * 班级
     */
    private String bjh;

    /**
     * 班机名称
     */
    private String bjmc;

    /**
     * 最近一学年学业成绩排名（或最近一学年综合测评排名，记为'列A'）格式“20/100”
     */
    private String chpm;

    /**
     * 综合评级（ABCD或X）
     */
    private String zhpj;

    /**
     * 自然语言，考试种类+成绩
     */
    private String yysp;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 资助金额
     */
    private BigDecimal zzje;

    /**
     * 交流国家或地区码
     */
    private String jlgjdqm;

    /**
     * 默认值为“A”，其他值为“B”  此字段学生不可见。参与程序判断
     */
    private String xlcp;

    /**
     * 01 暂存  02 已提交待审批,  03 待复审,     04 复审通过     05 审核不通过
     */
    private String status;

    /**
     * 01 待复审 02 复审通过  03 复审不通过
     */
    private String confirmStatus;

    /**
     * 初审确认 0未确认 1 已确认
     */
    private String isconfirm1;

    /**
     * 复审确认 0未确认 1 已确认
     */
    private String isconfirm2;

    /**
     * 复审意见
     */
    private String fsyj;

    /**
     * Y 自费 N 非自费
     */
    private String selfPay;

    /**
     * 数据是否有效(0已经删除 1有效)
     */
    private String valid;

    /**
     * 创建时间默认当前数据生成时间
     */
    private Date createTime;

    /**
     *
     * @mbggenerated 2018-11-11
     */
    public XmXssqjl(String sqjlId, String xmId, String xmzm, String xmmc, String xh, String xm, String gender, String yxdm, String yxmc, String rxn, String nj, String zyh, String zymc, String bjh, String bjmc, String chpm, String zhpj, String yysp, String phone, String email, BigDecimal zzje, String jlgjdqm, String xlcp, String status, String confirmStatus, String isconfirm1, String isconfirm2, String fsyj, String selfPay, String valid, Date createTime) {
        this.sqjlId = sqjlId;
        this.xmId = xmId;
        this.xmzm = xmzm;
        this.xmmc = xmmc;
        this.xh = xh;
        this.xm = xm;
        this.gender = gender;
        this.yxdm = yxdm;
        this.yxmc = yxmc;
        this.rxn = rxn;
        this.nj = nj;
        this.zyh = zyh;
        this.zymc = zymc;
        this.bjh = bjh;
        this.bjmc = bjmc;
        this.chpm = chpm;
        this.zhpj = zhpj;
        this.yysp = yysp;
        this.phone = phone;
        this.email = email;
        this.zzje = zzje;
        this.jlgjdqm = jlgjdqm;
        this.xlcp = xlcp;
        this.status = status;
        this.confirmStatus = confirmStatus;
        this.isconfirm1 = isconfirm1;
        this.isconfirm2 = isconfirm2;
        this.fsyj = fsyj;
        this.selfPay = selfPay;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-11-11
     */
    public XmXssqjl() {
        super();
    }

    /**
     * 申请记录id
     * @return SQJL_ID 申请记录id
     */
    public String getSqjlId() {
        return sqjlId;
    }

    /**
     * 申请记录id
     * @param sqjlId 申请记录id
     */
    public void setSqjlId(String sqjlId) {
        this.sqjlId = sqjlId == null ? null : sqjlId.trim();
    }

    /**
     * 项目主键
     * @return XM_ID 项目主键
     */
    public String getXmId() {
        return xmId;
    }

    /**
     * 项目主键
     * @param xmId 项目主键
     */
    public void setXmId(String xmId) {
        this.xmId = xmId == null ? null : xmId.trim();
    }

    /**
     * 项目总名
     * @return XMZM 项目总名
     */
    public String getXmzm() {
        return xmzm;
    }

    /**
     * 项目总名
     * @param xmzm 项目总名
     */
    public void setXmzm(String xmzm) {
        this.xmzm = xmzm == null ? null : xmzm.trim();
    }

    /**
     * 项目名称
     * @return XMMC 项目名称
     */
    public String getXmmc() {
        return xmmc;
    }

    /**
     * 项目名称
     * @param xmmc 项目名称
     */
    public void setXmmc(String xmmc) {
        this.xmmc = xmmc == null ? null : xmmc.trim();
    }

    /**
     * 学号
     * @return XH 学号
     */
    public String getXh() {
        return xh;
    }

    /**
     * 学号
     * @param xh 学号
     */
    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    /**
     * 姓名
     * @return XM 姓名
     */
    public String getXm() {
        return xm;
    }

    /**
     * 姓名
     * @param xm 姓名
     */
    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    /**
     * 性别
     * @return GENDER 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 性别
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * 院系代码
     * @return YXDM 院系代码
     */
    public String getYxdm() {
        return yxdm;
    }

    /**
     * 院系代码
     * @param yxdm 院系代码
     */
    public void setYxdm(String yxdm) {
        this.yxdm = yxdm == null ? null : yxdm.trim();
    }

    /**
     * 院系名称
     * @return YXMC 院系名称
     */
    public String getYxmc() {
        return yxmc;
    }

    /**
     * 院系名称
     * @param yxmc 院系名称
     */
    public void setYxmc(String yxmc) {
        this.yxmc = yxmc == null ? null : yxmc.trim();
    }

    /**
     * 入学年
     * @return RXN 入学年
     */
    public String getRxn() {
        return rxn;
    }

    /**
     * 入学年
     * @param rxn 入学年
     */
    public void setRxn(String rxn) {
        this.rxn = rxn == null ? null : rxn.trim();
    }

    /**
     * 年级
     * @return NJ 年级
     */
    public String getNj() {
        return nj;
    }

    /**
     * 年级
     * @param nj 年级
     */
    public void setNj(String nj) {
        this.nj = nj == null ? null : nj.trim();
    }

    /**
     * 专业号
     * @return ZYH 专业号
     */
    public String getZyh() {
        return zyh;
    }

    /**
     * 专业号
     * @param zyh 专业号
     */
    public void setZyh(String zyh) {
        this.zyh = zyh == null ? null : zyh.trim();
    }

    /**
     * 专业名称
     * @return ZYMC 专业名称
     */
    public String getZymc() {
        return zymc;
    }

    /**
     * 专业名称
     * @param zymc 专业名称
     */
    public void setZymc(String zymc) {
        this.zymc = zymc == null ? null : zymc.trim();
    }

    /**
     * 班级
     * @return BJH 班级
     */
    public String getBjh() {
        return bjh;
    }

    /**
     * 班级
     * @param bjh 班级
     */
    public void setBjh(String bjh) {
        this.bjh = bjh == null ? null : bjh.trim();
    }

    /**
     * 班机名称
     * @return BJMC 班机名称
     */
    public String getBjmc() {
        return bjmc;
    }

    /**
     * 班机名称
     * @param bjmc 班机名称
     */
    public void setBjmc(String bjmc) {
        this.bjmc = bjmc == null ? null : bjmc.trim();
    }

    /**
     * 最近一学年学业成绩排名（或最近一学年综合测评排名，记为'列A'）格式“20/100”
     * @return CHPM 最近一学年学业成绩排名（或最近一学年综合测评排名，记为'列A'）格式“20/100”
     */
    public String getChpm() {
        return chpm;
    }

    /**
     * 最近一学年学业成绩排名（或最近一学年综合测评排名，记为'列A'）格式“20/100”
     * @param chpm 最近一学年学业成绩排名（或最近一学年综合测评排名，记为'列A'）格式“20/100”
     */
    public void setChpm(String chpm) {
        this.chpm = chpm == null ? null : chpm.trim();
    }

    /**
     * 综合评级（ABCD或X）
     * @return ZHPJ 综合评级（ABCD或X）
     */
    public String getZhpj() {
        return zhpj;
    }

    /**
     * 综合评级（ABCD或X）
     * @param zhpj 综合评级（ABCD或X）
     */
    public void setZhpj(String zhpj) {
        this.zhpj = zhpj == null ? null : zhpj.trim();
    }

    /**
     * 自然语言，考试种类+成绩
     * @return YYSP 自然语言，考试种类+成绩
     */
    public String getYysp() {
        return yysp;
    }

    /**
     * 自然语言，考试种类+成绩
     * @param yysp 自然语言，考试种类+成绩
     */
    public void setYysp(String yysp) {
        this.yysp = yysp == null ? null : yysp.trim();
    }

    /**
     * 手机号码
     * @return PHONE 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号码
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 邮箱
     * @return EMAIL 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 资助金额
     * @return ZZJE 资助金额
     */
    public BigDecimal getZzje() {
        return zzje;
    }

    /**
     * 资助金额
     * @param zzje 资助金额
     */
    public void setZzje(BigDecimal zzje) {
        this.zzje = zzje;
    }

    /**
     * 交流国家或地区码
     * @return JLGJDQM 交流国家或地区码
     */
    public String getJlgjdqm() {
        return jlgjdqm;
    }

    /**
     * 交流国家或地区码
     * @param jlgjdqm 交流国家或地区码
     */
    public void setJlgjdqm(String jlgjdqm) {
        this.jlgjdqm = jlgjdqm == null ? null : jlgjdqm.trim();
    }

    /**
     * 默认值为“A”，其他值为“B”  此字段学生不可见。参与程序判断
     * @return XLCP 默认值为“A”，其他值为“B”  此字段学生不可见。参与程序判断
     */
    public String getXlcp() {
        return xlcp;
    }

    /**
     * 默认值为“A”，其他值为“B”  此字段学生不可见。参与程序判断
     * @param xlcp 默认值为“A”，其他值为“B”  此字段学生不可见。参与程序判断
     */
    public void setXlcp(String xlcp) {
        this.xlcp = xlcp == null ? null : xlcp.trim();
    }

    /**
     * 01 暂存  02 已提交待审批,  03 待复审,     04 复审通过     05 审核不通过
     * @return STATUS 01 暂存  02 已提交待审批,  03 待复审,     04 复审通过     05 审核不通过
     */
    public String getStatus() {
        return status;
    }

    /**
     * 01 暂存  02 已提交待审批,  03 待复审,     04 复审通过     05 审核不通过
     * @param status 01 暂存  02 已提交待审批,  03 待复审,     04 复审通过     05 审核不通过
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 01 待复审 02 复审通过  03 复审不通过
     * @return CONFIRM_STATUS 01 待复审 02 复审通过  03 复审不通过
     */
    public String getConfirmStatus() {
        return confirmStatus;
    }

    /**
     * 01 待复审 02 复审通过  03 复审不通过
     * @param confirmStatus 01 待复审 02 复审通过  03 复审不通过
     */
    public void setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus == null ? null : confirmStatus.trim();
    }

    /**
     * 初审确认 0未确认 1 已确认
     * @return ISCONFIRM1 初审确认 0未确认 1 已确认
     */
    public String getIsconfirm1() {
        return isconfirm1;
    }

    /**
     * 初审确认 0未确认 1 已确认
     * @param isconfirm1 初审确认 0未确认 1 已确认
     */
    public void setIsconfirm1(String isconfirm1) {
        this.isconfirm1 = isconfirm1 == null ? null : isconfirm1.trim();
    }

    /**
     * 复审确认 0未确认 1 已确认
     * @return ISCONFIRM2 复审确认 0未确认 1 已确认
     */
    public String getIsconfirm2() {
        return isconfirm2;
    }

    /**
     * 复审确认 0未确认 1 已确认
     * @param isconfirm2 复审确认 0未确认 1 已确认
     */
    public void setIsconfirm2(String isconfirm2) {
        this.isconfirm2 = isconfirm2 == null ? null : isconfirm2.trim();
    }

    /**
     * 复审意见
     * @return FSYJ 复审意见
     */
    public String getFsyj() {
        return fsyj;
    }

    /**
     * 复审意见
     * @param fsyj 复审意见
     */
    public void setFsyj(String fsyj) {
        this.fsyj = fsyj == null ? null : fsyj.trim();
    }

    /**
     * Y 自费 N 非自费
     * @return SELF_PAY Y 自费 N 非自费
     */
    public String getSelfPay() {
        return selfPay;
    }

    /**
     * Y 自费 N 非自费
     * @param selfPay Y 自费 N 非自费
     */
    public void setSelfPay(String selfPay) {
        this.selfPay = selfPay == null ? null : selfPay.trim();
    }

    /**
     * 数据是否有效(0已经删除 1有效)
     * @return VALID 数据是否有效(0已经删除 1有效)
     */
    public String getValid() {
        return valid;
    }

    /**
     * 数据是否有效(0已经删除 1有效)
     * @param valid 数据是否有效(0已经删除 1有效)
     */
    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }

    /**
     * 创建时间默认当前数据生成时间
     * @return CREATE_TIME 创建时间默认当前数据生成时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间默认当前数据生成时间
     * @param createTime 创建时间默认当前数据生成时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-11-11
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sqjlId=").append(sqjlId);
        sb.append(", xmId=").append(xmId);
        sb.append(", xmzm=").append(xmzm);
        sb.append(", xmmc=").append(xmmc);
        sb.append(", xh=").append(xh);
        sb.append(", xm=").append(xm);
        sb.append(", gender=").append(gender);
        sb.append(", yxdm=").append(yxdm);
        sb.append(", yxmc=").append(yxmc);
        sb.append(", rxn=").append(rxn);
        sb.append(", nj=").append(nj);
        sb.append(", zyh=").append(zyh);
        sb.append(", zymc=").append(zymc);
        sb.append(", bjh=").append(bjh);
        sb.append(", bjmc=").append(bjmc);
        sb.append(", chpm=").append(chpm);
        sb.append(", zhpj=").append(zhpj);
        sb.append(", yysp=").append(yysp);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", zzje=").append(zzje);
        sb.append(", jlgjdqm=").append(jlgjdqm);
        sb.append(", xlcp=").append(xlcp);
        sb.append(", status=").append(status);
        sb.append(", confirmStatus=").append(confirmStatus);
        sb.append(", isconfirm1=").append(isconfirm1);
        sb.append(", isconfirm2=").append(isconfirm2);
        sb.append(", fsyj=").append(fsyj);
        sb.append(", selfPay=").append(selfPay);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}