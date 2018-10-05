package cn.edu.cmu.domain;

import java.util.Date;

public class HyRymd {
    /**
     * 名单id
     */
    private String mdid;

    /**
     * 姓名
     */
    private String xm;

    /**
     * 国籍
     */
    private String gj;

    /**
     * 单位
     */
    private String dw;

    /**
     * 职务
     */
    private String zw;

    /**
     * 计划id
     */
    private String jhid;

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
     * @mbggenerated 2018-10-04
     */
    public HyRymd(String mdid, String xm, String gj, String dw, String zw, String jhid, String valid, Date createTime) {
        this.mdid = mdid;
        this.xm = xm;
        this.gj = gj;
        this.dw = dw;
        this.zw = zw;
        this.jhid = jhid;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-10-04
     */
    public HyRymd() {
        super();
    }

    /**
     * 名单id
     * @return MDID 名单id
     */
    public String getMdid() {
        return mdid;
    }

    /**
     * 名单id
     * @param mdid 名单id
     */
    public void setMdid(String mdid) {
        this.mdid = mdid == null ? null : mdid.trim();
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
     * 国籍
     * @return GJ 国籍
     */
    public String getGj() {
        return gj;
    }

    /**
     * 国籍
     * @param gj 国籍
     */
    public void setGj(String gj) {
        this.gj = gj == null ? null : gj.trim();
    }

    /**
     * 单位
     * @return DW 单位
     */
    public String getDw() {
        return dw;
    }

    /**
     * 单位
     * @param dw 单位
     */
    public void setDw(String dw) {
        this.dw = dw == null ? null : dw.trim();
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
     * 计划id
     * @return JHID 计划id
     */
    public String getJhid() {
        return jhid;
    }

    /**
     * 计划id
     * @param jhid 计划id
     */
    public void setJhid(String jhid) {
        this.jhid = jhid == null ? null : jhid.trim();
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
     * @mbggenerated 2018-10-04
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mdid=").append(mdid);
        sb.append(", xm=").append(xm);
        sb.append(", gj=").append(gj);
        sb.append(", dw=").append(dw);
        sb.append(", zw=").append(zw);
        sb.append(", jhid=").append(jhid);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}