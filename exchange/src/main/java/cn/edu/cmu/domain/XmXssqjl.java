package cn.edu.cmu.domain;

import java.math.BigDecimal;

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
    private String ycdm;

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
     * 专业
     */
    private String zy;

    /**
     * 班级
     */
    private String bj;

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
     * 01 非自费 02 自费
     */
    private String selftPay;

    /**
     * 默认值为“A”，其他值为“B”  此字段学生不可见。参与程序判断
     */
    private String xlcp;

    /**
     * 01 暂存  02 已提交待审批,  03 待复审,     04 复审通过     05 审核不通过
     */
    private String status;

    /**
     * 01 学生已知晓待复审  02 学生已知晓复审结果。 
     */
    private String confirmStatus;

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public XmXssqjl(String sqjlId, String xmId, String xh, String xm, String gender, String ycdm, String yxmc, String rxn, String nj, String zy, String bj, String chpm, String zhpj, String yysp, String phone, String email, BigDecimal zzje, String selftPay, String xlcp, String status, String confirmStatus) {
        this.sqjlId = sqjlId;
        this.xmId = xmId;
        this.xh = xh;
        this.xm = xm;
        this.gender = gender;
        this.ycdm = ycdm;
        this.yxmc = yxmc;
        this.rxn = rxn;
        this.nj = nj;
        this.zy = zy;
        this.bj = bj;
        this.chpm = chpm;
        this.zhpj = zhpj;
        this.yysp = yysp;
        this.phone = phone;
        this.email = email;
        this.zzje = zzje;
        this.selftPay = selftPay;
        this.xlcp = xlcp;
        this.status = status;
        this.confirmStatus = confirmStatus;
    }

    /**
     *
     * @mbggenerated 2018-09-17
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
     * @return YCDM 院系代码
     */
    public String getYcdm() {
        return ycdm;
    }

    /**
     * 院系代码
     * @param ycdm 院系代码
     */
    public void setYcdm(String ycdm) {
        this.ycdm = ycdm == null ? null : ycdm.trim();
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
     * 专业
     * @return ZY 专业
     */
    public String getZy() {
        return zy;
    }

    /**
     * 专业
     * @param zy 专业
     */
    public void setZy(String zy) {
        this.zy = zy == null ? null : zy.trim();
    }

    /**
     * 班级
     * @return BJ 班级
     */
    public String getBj() {
        return bj;
    }

    /**
     * 班级
     * @param bj 班级
     */
    public void setBj(String bj) {
        this.bj = bj == null ? null : bj.trim();
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
     * 01 非自费 02 自费
     * @return SELFT_PAY 01 非自费 02 自费
     */
    public String getSelftPay() {
        return selftPay;
    }

    /**
     * 01 非自费 02 自费
     * @param selftPay 01 非自费 02 自费
     */
    public void setSelftPay(String selftPay) {
        this.selftPay = selftPay == null ? null : selftPay.trim();
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
     * 01 学生已知晓待复审  02 学生已知晓复审结果。 
     * @return CONFIRM_STATUS 01 学生已知晓待复审  02 学生已知晓复审结果。 
     */
    public String getConfirmStatus() {
        return confirmStatus;
    }

    /**
     * 01 学生已知晓待复审  02 学生已知晓复审结果。 
     * @param confirmStatus 01 学生已知晓待复审  02 学生已知晓复审结果。 
     */
    public void setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus == null ? null : confirmStatus.trim();
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sqjlId=").append(sqjlId);
        sb.append(", xmId=").append(xmId);
        sb.append(", xh=").append(xh);
        sb.append(", xm=").append(xm);
        sb.append(", gender=").append(gender);
        sb.append(", ycdm=").append(ycdm);
        sb.append(", yxmc=").append(yxmc);
        sb.append(", rxn=").append(rxn);
        sb.append(", nj=").append(nj);
        sb.append(", zy=").append(zy);
        sb.append(", bj=").append(bj);
        sb.append(", chpm=").append(chpm);
        sb.append(", zhpj=").append(zhpj);
        sb.append(", yysp=").append(yysp);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", zzje=").append(zzje);
        sb.append(", selftPay=").append(selftPay);
        sb.append(", xlcp=").append(xlcp);
        sb.append(", status=").append(status);
        sb.append(", confirmStatus=").append(confirmStatus);
        sb.append("]");
        return sb.toString();
    }
}