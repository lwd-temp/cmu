package cn.edu.cmu.domain;

import java.util.Date;

public class WbjdSxry {
    /**
     * 人员id
     */
    private String ryid;

    /**
     * 来访id
     */
    private String lfid;

    /**
     * 姓名
     */
    private String xm;

    /**
     * 国籍
     */
    private String gj;

    /**
     * 职务
     */
    private String zw;

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
     * @mbggenerated 2018-09-22
     */
    public WbjdSxry(String ryid, String lfid, String xm, String gj, String zw, String valid, Date createTime) {
        this.ryid = ryid;
        this.lfid = lfid;
        this.xm = xm;
        this.gj = gj;
        this.zw = zw;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-22
     */
    public WbjdSxry() {
        super();
    }

    /**
     * 人员id
     * @return RYID 人员id
     */
    public String getRyid() {
        return ryid;
    }

    /**
     * 人员id
     * @param ryid 人员id
     */
    public void setRyid(String ryid) {
        this.ryid = ryid == null ? null : ryid.trim();
    }

    /**
     * 来访id
     * @return LFID 来访id
     */
    public String getLfid() {
        return lfid;
    }

    /**
     * 来访id
     * @param lfid 来访id
     */
    public void setLfid(String lfid) {
        this.lfid = lfid == null ? null : lfid.trim();
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
     * @mbggenerated 2018-09-22
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ryid=").append(ryid);
        sb.append(", lfid=").append(lfid);
        sb.append(", xm=").append(xm);
        sb.append(", gj=").append(gj);
        sb.append(", zw=").append(zw);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}