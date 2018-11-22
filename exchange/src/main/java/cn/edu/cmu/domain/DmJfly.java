package cn.edu.cmu.domain;

import java.util.Date;

public class DmJfly {
    /**
     * 来源id
     */
    private String code;

    /**
     * 经费来源
     */
    private String name;

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
     * @mbggenerated 2018-11-22
     */
    public DmJfly(String code, String name, String valid, Date createTime) {
        this.code = code;
        this.name = name;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-11-22
     */
    public DmJfly() {
        super();
    }

    /**
     * 来源id
     * @return CODE 来源id
     */
    public String getCode() {
        return code;
    }

    /**
     * 来源id
     * @param code 来源id
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 经费来源
     * @return NAME 经费来源
     */
    public String getName() {
        return name;
    }

    /**
     * 经费来源
     * @param name 经费来源
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     * @mbggenerated 2018-11-22
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}