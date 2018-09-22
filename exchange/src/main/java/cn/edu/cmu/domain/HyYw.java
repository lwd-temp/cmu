package cn.edu.cmu.domain;

import java.util.Date;

public class HyYw {
    /**
     * 业务id
     */
    private String ywid;

    /**
     * 护照id
     */
    private String hzid;

    /**
     * 人员
     */
    private String operator;

    /**
     * 时间
     */
    private Date operatorTime;

    /**
     * 事项
     */
    private String sx;

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
     * @mbggenerated 2018-09-22
     */
    public HyYw(String ywid, String hzid, String operator, Date operatorTime, String sx, String valid, Date createTime) {
        this.ywid = ywid;
        this.hzid = hzid;
        this.operator = operator;
        this.operatorTime = operatorTime;
        this.sx = sx;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-22
     */
    public HyYw() {
        super();
    }

    /**
     * 业务id
     * @return YWID 业务id
     */
    public String getYwid() {
        return ywid;
    }

    /**
     * 业务id
     * @param ywid 业务id
     */
    public void setYwid(String ywid) {
        this.ywid = ywid == null ? null : ywid.trim();
    }

    /**
     * 护照id
     * @return HZID 护照id
     */
    public String getHzid() {
        return hzid;
    }

    /**
     * 护照id
     * @param hzid 护照id
     */
    public void setHzid(String hzid) {
        this.hzid = hzid == null ? null : hzid.trim();
    }

    /**
     * 人员
     * @return OPERATOR 人员
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 人员
     * @param operator 人员
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * 时间
     * @return OPERATOR_TIME 时间
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * 时间
     * @param operatorTime 时间
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    /**
     * 事项
     * @return SX 事项
     */
    public String getSx() {
        return sx;
    }

    /**
     * 事项
     * @param sx 事项
     */
    public void setSx(String sx) {
        this.sx = sx == null ? null : sx.trim();
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
     * @mbggenerated 2018-09-22
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ywid=").append(ywid);
        sb.append(", hzid=").append(hzid);
        sb.append(", operator=").append(operator);
        sb.append(", operatorTime=").append(operatorTime);
        sb.append(", sx=").append(sx);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}