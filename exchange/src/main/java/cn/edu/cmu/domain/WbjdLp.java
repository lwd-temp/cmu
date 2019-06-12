package cn.edu.cmu.domain;

import java.util.Date;

public class WbjdLp {
    /**
     * 主键
     */
    private String id;

    /**
     * 礼品名称
     */
    private String mc;

    /**
     * 礼品数量 数字
     */
    private Long sl;

    /**
     * 来访id 外键
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
     * @mbggenerated 2019-06-12
     */
    public WbjdLp(String id, String mc, Long sl, String lfid, String valid, Date createTime) {
        this.id = id;
        this.mc = mc;
        this.sl = sl;
        this.lfid = lfid;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2019-06-12
     */
    public WbjdLp() {
        super();
    }

    /**
     * 主键
     * @return ID 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 礼品名称
     * @return MC 礼品名称
     */
    public String getMc() {
        return mc;
    }

    /**
     * 礼品名称
     * @param mc 礼品名称
     */
    public void setMc(String mc) {
        this.mc = mc == null ? null : mc.trim();
    }

    /**
     * 礼品数量 数字
     * @return SL 礼品数量 数字
     */
    public Long getSl() {
        return sl;
    }

    /**
     * 礼品数量 数字
     * @param sl 礼品数量 数字
     */
    public void setSl(Long sl) {
        this.sl = sl;
    }

    /**
     * 来访id 外键
     * @return LFID 来访id 外键
     */
    public String getLfid() {
        return lfid;
    }

    /**
     * 来访id 外键
     * @param lfid 来访id 外键
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
     * @mbggenerated 2019-06-12
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mc=").append(mc);
        sb.append(", sl=").append(sl);
        sb.append(", lfid=").append(lfid);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}