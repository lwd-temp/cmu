package cn.edu.cmu.domain;

import java.util.Date;

public class DmGb {
    /**
     * 人员id
     */
    private String code;

    /**
     * 人员姓名
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
     * @mbggenerated 2018-10-05
     */
    public DmGb(String code, String name, String valid, Date createTime) {
        this.code = code;
        this.name = name;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-10-05
     */
    public DmGb() {
        super();
    }

    /**
     * 人员id
     * @return CODE 人员id
     */
    public String getCode() {
        return code;
    }

    /**
     * 人员id
     * @param code 人员id
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 人员姓名
     * @return NAME 人员姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 人员姓名
     * @param name 人员姓名
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
     * @mbggenerated 2018-10-05
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