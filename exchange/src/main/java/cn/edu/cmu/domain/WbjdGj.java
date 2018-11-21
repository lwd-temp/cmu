package cn.edu.cmu.domain;

import java.util.Date;

public class WbjdGj {
    /**
     * 人员id
     */
    private String gjid;

    /**
     * 来访id
     */
    private String lfjdgjid;

    /**
     * 国籍
     */
    private String lfid;

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
     * @mbggenerated 2018-11-21
     */
    public WbjdGj(String gjid, String lfjdgjid, String lfid, String valid, Date createTime) {
        this.gjid = gjid;
        this.lfjdgjid = lfjdgjid;
        this.lfid = lfid;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public WbjdGj() {
        super();
    }

    /**
     * 人员id
     * @return GJID 人员id
     */
    public String getGjid() {
        return gjid;
    }

    /**
     * 人员id
     * @param gjid 人员id
     */
    public void setGjid(String gjid) {
        this.gjid = gjid == null ? null : gjid.trim();
    }

    /**
     * 来访id
     * @return LFJDGJID 来访id
     */
    public String getLfjdgjid() {
        return lfjdgjid;
    }

    /**
     * 来访id
     * @param lfjdgjid 来访id
     */
    public void setLfjdgjid(String lfjdgjid) {
        this.lfjdgjid = lfjdgjid == null ? null : lfjdgjid.trim();
    }

    /**
     * 国籍
     * @return LFID 国籍
     */
    public String getLfid() {
        return lfid;
    }

    /**
     * 国籍
     * @param lfid 国籍
     */
    public void setLfid(String lfid) {
        this.lfid = lfid == null ? null : lfid.trim();
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
     * @mbggenerated 2018-11-21
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gjid=").append(gjid);
        sb.append(", lfjdgjid=").append(lfjdgjid);
        sb.append(", lfid=").append(lfid);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}