package cn.edu.cmu.domain;

import java.util.Date;

public class CgjhGb {
    /**
     * 国别id
     */
    private String gbid;

    /**
     * 国家代码
     */
    private String gjdm;

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
     * @mbggenerated 2018-11-21
     */
    public CgjhGb(String gbid, String gjdm, String jhid, String valid, Date createTime) {
        this.gbid = gbid;
        this.gjdm = gjdm;
        this.jhid = jhid;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public CgjhGb() {
        super();
    }

    /**
     * 国别id
     * @return GBID 国别id
     */
    public String getGbid() {
        return gbid;
    }

    /**
     * 国别id
     * @param gbid 国别id
     */
    public void setGbid(String gbid) {
        this.gbid = gbid == null ? null : gbid.trim();
    }

    /**
     * 国家代码
     * @return GJDM 国家代码
     */
    public String getGjdm() {
        return gjdm;
    }

    /**
     * 国家代码
     * @param gjdm 国家代码
     */
    public void setGjdm(String gjdm) {
        this.gjdm = gjdm == null ? null : gjdm.trim();
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
     * @mbggenerated 2018-11-21
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gbid=").append(gbid);
        sb.append(", gjdm=").append(gjdm);
        sb.append(", jhid=").append(jhid);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}