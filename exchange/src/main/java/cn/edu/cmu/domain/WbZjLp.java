package cn.edu.cmu.domain;

import java.util.Date;

public class WbZjLp {
    /**
     * 主键
     */
    private String id;

    /**
     * 总结id
     */
    private String zjid;

    /**
     * 礼品数量
     */
    private Long sl;

    /**
     * 礼品名称
     */
    private String mc;

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
    public WbZjLp(String id, String zjid, Long sl, String mc, String valid, Date createTime) {
        this.id = id;
        this.zjid = zjid;
        this.sl = sl;
        this.mc = mc;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2019-06-12
     */
    public WbZjLp() {
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
     * 总结id
     * @return ZJID 总结id
     */
    public String getZjid() {
        return zjid;
    }

    /**
     * 总结id
     * @param zjid 总结id
     */
    public void setZjid(String zjid) {
        this.zjid = zjid == null ? null : zjid.trim();
    }

    /**
     * 礼品数量
     * @return SL 礼品数量
     */
    public Long getSl() {
        return sl;
    }

    /**
     * 礼品数量
     * @param sl 礼品数量
     */
    public void setSl(Long sl) {
        this.sl = sl;
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
        sb.append(", zjid=").append(zjid);
        sb.append(", sl=").append(sl);
        sb.append(", mc=").append(mc);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}