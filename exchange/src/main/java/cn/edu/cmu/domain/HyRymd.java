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
     * 创建时间
     */
    private Date createtime;

    /**
     * 计划id
     */
    private String jhid;

    /**
     * 状态
     */
    private String status;

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public HyRymd(String mdid, String xm, String gj, String dw, String zw, Date createtime, String jhid, String status) {
        this.mdid = mdid;
        this.xm = xm;
        this.gj = gj;
        this.dw = dw;
        this.zw = zw;
        this.createtime = createtime;
        this.jhid = jhid;
        this.status = status;
    }

    /**
     *
     * @mbggenerated 2018-09-17
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
     * 创建时间
     * @return CREATETIME 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 创建时间
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
     * 状态
     * @return STATUS 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        sb.append(", mdid=").append(mdid);
        sb.append(", xm=").append(xm);
        sb.append(", gj=").append(gj);
        sb.append(", dw=").append(dw);
        sb.append(", zw=").append(zw);
        sb.append(", createtime=").append(createtime);
        sb.append(", jhid=").append(jhid);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}