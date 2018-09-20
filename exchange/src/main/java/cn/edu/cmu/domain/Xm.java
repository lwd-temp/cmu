package cn.edu.cmu.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Xm {
    /**
     * 项目主键
     */
    private String xmId;

    /**
     * 项目类型  01 包括临床实习、02 假期访学、03 攻读学位、04课程学习、99其他，
     */
    private String xmlx;

    /**
     * 项目总名
     */
    private String xmzm;

    /**
     * null
     */
    private String glxmmcid;

    /**
     * null
     */
    private String xmmc;

    /**
     * 项目编号
     */
    private String xmbh;

    /**
     * 项目开始时间
     */
    private Date xmkssj;

    /**
     * 项目结束时间
     */
    private Date smjssj;

    /**
     * 项目交流天数
     */
    private BigDecimal xmjlts;

    /**
     * 项目层次
     */
    private String xmcc;

    /**
     * 经费来源
     */
    private String jfly;

    /**
     * 资助金额
     */
    private String zjje;

    /**
     * 项目概况
     */
    private String xmgk;

    /**
     * 项目资助计划
     */
    private String xmzzjh;

    /**
     * 交流目标机构名称
     */
    private String jlmbjgmc;

    /**
     * 交流目标国家或地区
     */
    private String jlmbgj;

    /**
     * 项目收费标准
     */
    private BigDecimal fybz;

    /**
     * 项目收费说明
     */
    private String zysm;

    /**
     * 是否限制人数 0 表示不限制，1 表示限制
     */
    private String sfxzrs;

    /**
     * 计划人数
     */
    private BigDecimal jhrs;

    /**
     * 项目年级限制
     */
    private String xmnjxz;

    /**
     * 项目专业限制
     */
    private String xmzyxz;

    /**
     * 项目录入人
     */
    private String operatorCode;

    /**
     * 01 暂存、02 发布、03 允许申报、04 申报结束、05 项目终结
     */
    private String status;

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
     * @mbggenerated 2018-09-20
     */
    public Xm(String xmId, String xmlx, String xmzm, String glxmmcid, String xmmc, String xmbh, Date xmkssj, Date smjssj, BigDecimal xmjlts, String xmcc, String jfly, String zjje, String xmgk, String xmzzjh, String jlmbjgmc, String jlmbgj, BigDecimal fybz, String zysm, String sfxzrs, BigDecimal jhrs, String xmnjxz, String xmzyxz, String operatorCode, String status, String valid, Date createTime) {
        this.xmId = xmId;
        this.xmlx = xmlx;
        this.xmzm = xmzm;
        this.glxmmcid = glxmmcid;
        this.xmmc = xmmc;
        this.xmbh = xmbh;
        this.xmkssj = xmkssj;
        this.smjssj = smjssj;
        this.xmjlts = xmjlts;
        this.xmcc = xmcc;
        this.jfly = jfly;
        this.zjje = zjje;
        this.xmgk = xmgk;
        this.xmzzjh = xmzzjh;
        this.jlmbjgmc = jlmbjgmc;
        this.jlmbgj = jlmbgj;
        this.fybz = fybz;
        this.zysm = zysm;
        this.sfxzrs = sfxzrs;
        this.jhrs = jhrs;
        this.xmnjxz = xmnjxz;
        this.xmzyxz = xmzyxz;
        this.operatorCode = operatorCode;
        this.status = status;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public Xm() {
        super();
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
     * 项目类型  01 包括临床实习、02 假期访学、03 攻读学位、04课程学习、99其他，
     * @return XMLX 项目类型  01 包括临床实习、02 假期访学、03 攻读学位、04课程学习、99其他，
     */
    public String getXmlx() {
        return xmlx;
    }

    /**
     * 项目类型  01 包括临床实习、02 假期访学、03 攻读学位、04课程学习、99其他，
     * @param xmlx 项目类型  01 包括临床实习、02 假期访学、03 攻读学位、04课程学习、99其他，
     */
    public void setXmlx(String xmlx) {
        this.xmlx = xmlx == null ? null : xmlx.trim();
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
     * null
     * @return GLXMMCID null
     */
    public String getGlxmmcid() {
        return glxmmcid;
    }

    /**
     * null
     * @param glxmmcid null
     */
    public void setGlxmmcid(String glxmmcid) {
        this.glxmmcid = glxmmcid == null ? null : glxmmcid.trim();
    }

    /**
     * null
     * @return XMMC null
     */
    public String getXmmc() {
        return xmmc;
    }

    /**
     * null
     * @param xmmc null
     */
    public void setXmmc(String xmmc) {
        this.xmmc = xmmc == null ? null : xmmc.trim();
    }

    /**
     * 项目编号
     * @return XMBH 项目编号
     */
    public String getXmbh() {
        return xmbh;
    }

    /**
     * 项目编号
     * @param xmbh 项目编号
     */
    public void setXmbh(String xmbh) {
        this.xmbh = xmbh == null ? null : xmbh.trim();
    }

    /**
     * 项目开始时间
     * @return XMKSSJ 项目开始时间
     */
    public Date getXmkssj() {
        return xmkssj;
    }

    /**
     * 项目开始时间
     * @param xmkssj 项目开始时间
     */
    public void setXmkssj(Date xmkssj) {
        this.xmkssj = xmkssj;
    }

    /**
     * 项目结束时间
     * @return SMJSSJ 项目结束时间
     */
    public Date getSmjssj() {
        return smjssj;
    }

    /**
     * 项目结束时间
     * @param smjssj 项目结束时间
     */
    public void setSmjssj(Date smjssj) {
        this.smjssj = smjssj;
    }

    /**
     * 项目交流天数
     * @return XMJLTS 项目交流天数
     */
    public BigDecimal getXmjlts() {
        return xmjlts;
    }

    /**
     * 项目交流天数
     * @param xmjlts 项目交流天数
     */
    public void setXmjlts(BigDecimal xmjlts) {
        this.xmjlts = xmjlts;
    }

    /**
     * 项目层次
     * @return XMCC 项目层次
     */
    public String getXmcc() {
        return xmcc;
    }

    /**
     * 项目层次
     * @param xmcc 项目层次
     */
    public void setXmcc(String xmcc) {
        this.xmcc = xmcc == null ? null : xmcc.trim();
    }

    /**
     * 经费来源
     * @return JFLY 经费来源
     */
    public String getJfly() {
        return jfly;
    }

    /**
     * 经费来源
     * @param jfly 经费来源
     */
    public void setJfly(String jfly) {
        this.jfly = jfly == null ? null : jfly.trim();
    }

    /**
     * 资助金额
     * @return ZJJE 资助金额
     */
    public String getZjje() {
        return zjje;
    }

    /**
     * 资助金额
     * @param zjje 资助金额
     */
    public void setZjje(String zjje) {
        this.zjje = zjje == null ? null : zjje.trim();
    }

    /**
     * 项目概况
     * @return XMGK 项目概况
     */
    public String getXmgk() {
        return xmgk;
    }

    /**
     * 项目概况
     * @param xmgk 项目概况
     */
    public void setXmgk(String xmgk) {
        this.xmgk = xmgk == null ? null : xmgk.trim();
    }

    /**
     * 项目资助计划
     * @return XMZZJH 项目资助计划
     */
    public String getXmzzjh() {
        return xmzzjh;
    }

    /**
     * 项目资助计划
     * @param xmzzjh 项目资助计划
     */
    public void setXmzzjh(String xmzzjh) {
        this.xmzzjh = xmzzjh == null ? null : xmzzjh.trim();
    }

    /**
     * 交流目标机构名称
     * @return JLMBJGMC 交流目标机构名称
     */
    public String getJlmbjgmc() {
        return jlmbjgmc;
    }

    /**
     * 交流目标机构名称
     * @param jlmbjgmc 交流目标机构名称
     */
    public void setJlmbjgmc(String jlmbjgmc) {
        this.jlmbjgmc = jlmbjgmc == null ? null : jlmbjgmc.trim();
    }

    /**
     * 交流目标国家或地区
     * @return JLMBGJ 交流目标国家或地区
     */
    public String getJlmbgj() {
        return jlmbgj;
    }

    /**
     * 交流目标国家或地区
     * @param jlmbgj 交流目标国家或地区
     */
    public void setJlmbgj(String jlmbgj) {
        this.jlmbgj = jlmbgj == null ? null : jlmbgj.trim();
    }

    /**
     * 项目收费标准
     * @return FYBZ 项目收费标准
     */
    public BigDecimal getFybz() {
        return fybz;
    }

    /**
     * 项目收费标准
     * @param fybz 项目收费标准
     */
    public void setFybz(BigDecimal fybz) {
        this.fybz = fybz;
    }

    /**
     * 项目收费说明
     * @return ZYSM 项目收费说明
     */
    public String getZysm() {
        return zysm;
    }

    /**
     * 项目收费说明
     * @param zysm 项目收费说明
     */
    public void setZysm(String zysm) {
        this.zysm = zysm == null ? null : zysm.trim();
    }

    /**
     * 是否限制人数 0 表示不限制，1 表示限制
     * @return SFXZRS 是否限制人数 0 表示不限制，1 表示限制
     */
    public String getSfxzrs() {
        return sfxzrs;
    }

    /**
     * 是否限制人数 0 表示不限制，1 表示限制
     * @param sfxzrs 是否限制人数 0 表示不限制，1 表示限制
     */
    public void setSfxzrs(String sfxzrs) {
        this.sfxzrs = sfxzrs == null ? null : sfxzrs.trim();
    }

    /**
     * 计划人数
     * @return JHRS 计划人数
     */
    public BigDecimal getJhrs() {
        return jhrs;
    }

    /**
     * 计划人数
     * @param jhrs 计划人数
     */
    public void setJhrs(BigDecimal jhrs) {
        this.jhrs = jhrs;
    }

    /**
     * 项目年级限制
     * @return XMNJXZ 项目年级限制
     */
    public String getXmnjxz() {
        return xmnjxz;
    }

    /**
     * 项目年级限制
     * @param xmnjxz 项目年级限制
     */
    public void setXmnjxz(String xmnjxz) {
        this.xmnjxz = xmnjxz == null ? null : xmnjxz.trim();
    }

    /**
     * 项目专业限制
     * @return XMZYXZ 项目专业限制
     */
    public String getXmzyxz() {
        return xmzyxz;
    }

    /**
     * 项目专业限制
     * @param xmzyxz 项目专业限制
     */
    public void setXmzyxz(String xmzyxz) {
        this.xmzyxz = xmzyxz == null ? null : xmzyxz.trim();
    }

    /**
     * 项目录入人
     * @return OPERATOR_CODE 项目录入人
     */
    public String getOperatorCode() {
        return operatorCode;
    }

    /**
     * 项目录入人
     * @param operatorCode 项目录入人
     */
    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode == null ? null : operatorCode.trim();
    }

    /**
     * 01 暂存、02 发布、03 允许申报、04 申报结束、05 项目终结
     * @return STATUS 01 暂存、02 发布、03 允许申报、04 申报结束、05 项目终结
     */
    public String getStatus() {
        return status;
    }

    /**
     * 01 暂存、02 发布、03 允许申报、04 申报结束、05 项目终结
     * @param status 01 暂存、02 发布、03 允许申报、04 申报结束、05 项目终结
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
     * @mbggenerated 2018-09-20
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", xmId=").append(xmId);
        sb.append(", xmlx=").append(xmlx);
        sb.append(", xmzm=").append(xmzm);
        sb.append(", glxmmcid=").append(glxmmcid);
        sb.append(", xmmc=").append(xmmc);
        sb.append(", xmbh=").append(xmbh);
        sb.append(", xmkssj=").append(xmkssj);
        sb.append(", smjssj=").append(smjssj);
        sb.append(", xmjlts=").append(xmjlts);
        sb.append(", xmcc=").append(xmcc);
        sb.append(", jfly=").append(jfly);
        sb.append(", zjje=").append(zjje);
        sb.append(", xmgk=").append(xmgk);
        sb.append(", xmzzjh=").append(xmzzjh);
        sb.append(", jlmbjgmc=").append(jlmbjgmc);
        sb.append(", jlmbgj=").append(jlmbgj);
        sb.append(", fybz=").append(fybz);
        sb.append(", zysm=").append(zysm);
        sb.append(", sfxzrs=").append(sfxzrs);
        sb.append(", jhrs=").append(jhrs);
        sb.append(", xmnjxz=").append(xmnjxz);
        sb.append(", xmzyxz=").append(xmzyxz);
        sb.append(", operatorCode=").append(operatorCode);
        sb.append(", status=").append(status);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}