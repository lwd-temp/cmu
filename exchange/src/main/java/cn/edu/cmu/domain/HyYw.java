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
     *
     * @mbggenerated 2018-09-17
     */
    public HyYw(String ywid, String hzid, String operator, Date operatorTime, String sx) {
        this.ywid = ywid;
        this.hzid = hzid;
        this.operator = operator;
        this.operatorTime = operatorTime;
        this.sx = sx;
    }

    /**
     *
     * @mbggenerated 2018-09-17
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
     *
     * @mbggenerated 2018-09-17
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
        sb.append("]");
        return sb.toString();
    }
}