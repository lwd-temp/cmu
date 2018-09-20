package cn.edu.cmu.domain;

import java.util.Date;

public class XmGsxy {
    /**
     * 主键
     */
    private String proCollegId;

    /**
     * 学院id
     */
    private String xyid;

    /**
     * 学院名称
     */
    private String xymc;

    /**
     * 扩展字段
     */
    private String xmid;

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
     * @mbggenerated 2018-09-20
     */
    public XmGsxy(String proCollegId, String xyid, String xymc, String xmid, String status, String valid, Date createTime) {
        this.proCollegId = proCollegId;
        this.xyid = xyid;
        this.xymc = xymc;
        this.xmid = xmid;
        this.status = status;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public XmGsxy() {
        super();
    }

    /**
     * 主键
     * @return PRO_COLLEG_ID 主键
     */
    public String getProCollegId() {
        return proCollegId;
    }

    /**
     * 主键
     * @param proCollegId 主键
     */
    public void setProCollegId(String proCollegId) {
        this.proCollegId = proCollegId == null ? null : proCollegId.trim();
    }

    /**
     * 学院id
     * @return XYID 学院id
     */
    public String getXyid() {
        return xyid;
    }

    /**
     * 学院id
     * @param xyid 学院id
     */
    public void setXyid(String xyid) {
        this.xyid = xyid == null ? null : xyid.trim();
    }

    /**
     * 学院名称
     * @return XYMC 学院名称
     */
    public String getXymc() {
        return xymc;
    }

    /**
     * 学院名称
     * @param xymc 学院名称
     */
    public void setXymc(String xymc) {
        this.xymc = xymc == null ? null : xymc.trim();
    }

    /**
     * 扩展字段
     * @return XMID 扩展字段
     */
    public String getXmid() {
        return xmid;
    }

    /**
     * 扩展字段
     * @param xmid 扩展字段
     */
    public void setXmid(String xmid) {
        this.xmid = xmid == null ? null : xmid.trim();
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
     * @mbggenerated 2018-09-20
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proCollegId=").append(proCollegId);
        sb.append(", xyid=").append(xyid);
        sb.append(", xymc=").append(xymc);
        sb.append(", xmid=").append(xmid);
        sb.append(", status=").append(status);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}