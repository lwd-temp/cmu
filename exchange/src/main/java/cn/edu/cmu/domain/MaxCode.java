package cn.edu.cmu.domain;

import java.util.Date;

public class MaxCode {
    /**
     * 主键
     */
    private String id;

    /**
     * 类型
     */
    private String type;

    /**
     * 年度
     */
    private Long year;

    /**
     * 最大号码
     */
    private Long maxcode;

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
     * @mbggenerated 2018-10-01
     */
    public MaxCode(String id, String type, Long year, Long maxcode, String valid, Date createTime) {
        this.id = id;
        this.type = type;
        this.year = year;
        this.maxcode = maxcode;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-10-01
     */
    public MaxCode() {
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
     * 类型
     * @return TYPE 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 类型
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 年度
     * @return YEAR 年度
     */
    public Long getYear() {
        return year;
    }

    /**
     * 年度
     * @param year 年度
     */
    public void setYear(Long year) {
        this.year = year;
    }

    /**
     * 最大号码
     * @return MAXCODE 最大号码
     */
    public Long getMaxcode() {
        return maxcode;
    }

    /**
     * 最大号码
     * @param maxcode 最大号码
     */
    public void setMaxcode(Long maxcode) {
        this.maxcode = maxcode;
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
     * @mbggenerated 2018-10-01
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", year=").append(year);
        sb.append(", maxcode=").append(maxcode);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}