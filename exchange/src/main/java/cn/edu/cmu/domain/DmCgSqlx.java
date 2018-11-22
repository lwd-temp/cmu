package cn.edu.cmu.domain;

import java.util.Date;

public class DmCgSqlx {
    /**
     * 代码 01，02 
     */
    private String code;

    /**
     * 名称 在职人员因公短期出国（境）申请、校管干部因私短期出国（境）申请
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
    public DmCgSqlx(String code, String name, String valid, Date createTime) {
        this.code = code;
        this.name = name;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-11-22
     */
    public DmCgSqlx() {
        super();
    }

    /**
     * 代码 01，02 
     * @return CODE 代码 01，02 
     */
    public String getCode() {
        return code;
    }

    /**
     * 代码 01，02 
     * @param code 代码 01，02 
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 名称 在职人员因公短期出国（境）申请、校管干部因私短期出国（境）申请
     * @return NAME 名称 在职人员因公短期出国（境）申请、校管干部因私短期出国（境）申请
     */
    public String getName() {
        return name;
    }

    /**
     * 名称 在职人员因公短期出国（境）申请、校管干部因私短期出国（境）申请
     * @param name 名称 在职人员因公短期出国（境）申请、校管干部因私短期出国（境）申请
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