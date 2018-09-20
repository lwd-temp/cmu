package cn.edu.cmu.domain;

import java.util.Date;

public class DmXmmc {
    /**
     * 项目名称id
     */
    private String xmId;

    /**
     * 项目名称
     */
    private String xmmc;

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
    public DmXmmc(String xmId, String xmmc, String valid, Date createTime) {
        this.xmId = xmId;
        this.xmmc = xmmc;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public DmXmmc() {
        super();
    }

    /**
     * 项目名称id
     * @return XM_ID 项目名称id
     */
    public String getXmId() {
        return xmId;
    }

    /**
     * 项目名称id
     * @param xmId 项目名称id
     */
    public void setXmId(String xmId) {
        this.xmId = xmId == null ? null : xmId.trim();
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
        sb.append(", xmmc=").append(xmmc);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}