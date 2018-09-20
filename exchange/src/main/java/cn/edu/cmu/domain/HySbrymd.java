package cn.edu.cmu.domain;

import java.util.Date;

public class HySbrymd {
    /**
     * 名单id
     */
    private String mdid;

    /**
     * 会议申报id
     */
    private String sbid;

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
     * 状态是否有效
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
    public HySbrymd(String mdid, String sbid, String xm, String gj, String dw, String zw, String status, String valid, Date createTime) {
        this.mdid = mdid;
        this.sbid = sbid;
        this.xm = xm;
        this.gj = gj;
        this.dw = dw;
        this.zw = zw;
        this.status = status;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public HySbrymd() {
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
     * 会议申报id
     * @return SBID 会议申报id
     */
    public String getSbid() {
        return sbid;
    }

    /**
     * 会议申报id
     * @param sbid 会议申报id
     */
    public void setSbid(String sbid) {
        this.sbid = sbid == null ? null : sbid.trim();
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
     * 状态是否有效
     * @return STATUS 状态是否有效
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态是否有效
     * @param status 状态是否有效
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
        sb.append(", mdid=").append(mdid);
        sb.append(", sbid=").append(sbid);
        sb.append(", xm=").append(xm);
        sb.append(", gj=").append(gj);
        sb.append(", dw=").append(dw);
        sb.append(", zw=").append(zw);
        sb.append(", status=").append(status);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}