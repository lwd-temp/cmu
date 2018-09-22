package cn.edu.cmu.domain;

import java.util.Date;

public class HzxyQzr {
    /**
     * 人员id
     */
    private String ryid;

    /**
     * 人员姓名
     */
    private String xm;

    /**
     * 协议id
     */
    private String xyid;

    /**
     * 状态
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
     * @mbggenerated 2018-09-22
     */
    public HzxyQzr(String ryid, String xm, String xyid, String status, String valid, Date createTime) {
        this.ryid = ryid;
        this.xm = xm;
        this.xyid = xyid;
        this.status = status;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-22
     */
    public HzxyQzr() {
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
     * 人员姓名
     * @return XM 人员姓名
     */
    public String getXm() {
        return xm;
    }

    /**
     * 人员姓名
     * @param xm 人员姓名
     */
    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    /**
     * 协议id
     * @return XYID 协议id
     */
    public String getXyid() {
        return xyid;
    }

    /**
     * 协议id
     * @param xyid 协议id
     */
    public void setXyid(String xyid) {
        this.xyid = xyid == null ? null : xyid.trim();
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
        sb.append(", xm=").append(xm);
        sb.append(", xyid=").append(xyid);
        sb.append(", status=").append(status);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}