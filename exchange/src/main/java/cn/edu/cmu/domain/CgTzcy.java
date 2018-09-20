package cn.edu.cmu.domain;

import java.util.Date;

public class CgTzcy {
    /**
     * 成员id
     */
    private String cyid;

    /**
     * 计划团组id
     */
    private String tzid;

    /**
     * 成员姓名
     */
    private String xm;

    /**
     * 二级单位名称
     */
    private String ejdwmc;

    /**
     * 职务
     */
    private String zw;

    /**
     * 级别
     */
    private String jb;

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
    public CgTzcy(String cyid, String tzid, String xm, String ejdwmc, String zw, String jb, String valid, Date createTime) {
        this.cyid = cyid;
        this.tzid = tzid;
        this.xm = xm;
        this.ejdwmc = ejdwmc;
        this.zw = zw;
        this.jb = jb;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public CgTzcy() {
        super();
    }

    /**
     * 成员id
     * @return CYID 成员id
     */
    public String getCyid() {
        return cyid;
    }

    /**
     * 成员id
     * @param cyid 成员id
     */
    public void setCyid(String cyid) {
        this.cyid = cyid == null ? null : cyid.trim();
    }

    /**
     * 计划团组id
     * @return TZID 计划团组id
     */
    public String getTzid() {
        return tzid;
    }

    /**
     * 计划团组id
     * @param tzid 计划团组id
     */
    public void setTzid(String tzid) {
        this.tzid = tzid == null ? null : tzid.trim();
    }

    /**
     * 成员姓名
     * @return XM 成员姓名
     */
    public String getXm() {
        return xm;
    }

    /**
     * 成员姓名
     * @param xm 成员姓名
     */
    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    /**
     * 二级单位名称
     * @return EJDWMC 二级单位名称
     */
    public String getEjdwmc() {
        return ejdwmc;
    }

    /**
     * 二级单位名称
     * @param ejdwmc 二级单位名称
     */
    public void setEjdwmc(String ejdwmc) {
        this.ejdwmc = ejdwmc == null ? null : ejdwmc.trim();
    }

    /**
     * 职务
     * @return ZW 职务
     */
    public String getZw() {
        return zw;
    }

    /**
     * 职务
     * @param zw 职务
     */
    public void setZw(String zw) {
        this.zw = zw == null ? null : zw.trim();
    }

    /**
     * 级别
     * @return JB 级别
     */
    public String getJb() {
        return jb;
    }

    /**
     * 级别
     * @param jb 级别
     */
    public void setJb(String jb) {
        this.jb = jb == null ? null : jb.trim();
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
        sb.append(", cyid=").append(cyid);
        sb.append(", tzid=").append(tzid);
        sb.append(", xm=").append(xm);
        sb.append(", ejdwmc=").append(ejdwmc);
        sb.append(", zw=").append(zw);
        sb.append(", jb=").append(jb);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}