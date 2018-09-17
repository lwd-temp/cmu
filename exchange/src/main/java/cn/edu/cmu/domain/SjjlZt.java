package cn.edu.cmu.domain;

import java.util.Date;

public class SjjlZt {
    /**
     * 轨迹id
     */
    private String gjid;

    /**
     * 轨迹内容
     */
    private String gjnr;

    /**
     * 操作时间
     */
    private Date createtime;

    /**
     * 操作工号
     */
    private String czgh;

    /**
     * 申请记录id
     */
    private String sqjlId;

    /**
     * 状态
     */
    private String status;

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public SjjlZt(String gjid, String gjnr, Date createtime, String czgh, String sqjlId, String status) {
        this.gjid = gjid;
        this.gjnr = gjnr;
        this.createtime = createtime;
        this.czgh = czgh;
        this.sqjlId = sqjlId;
        this.status = status;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public SjjlZt() {
        super();
    }

    /**
     * 轨迹id
     * @return GJID 轨迹id
     */
    public String getGjid() {
        return gjid;
    }

    /**
     * 轨迹id
     * @param gjid 轨迹id
     */
    public void setGjid(String gjid) {
        this.gjid = gjid == null ? null : gjid.trim();
    }

    /**
     * 轨迹内容
     * @return GJNR 轨迹内容
     */
    public String getGjnr() {
        return gjnr;
    }

    /**
     * 轨迹内容
     * @param gjnr 轨迹内容
     */
    public void setGjnr(String gjnr) {
        this.gjnr = gjnr == null ? null : gjnr.trim();
    }

    /**
     * 操作时间
     * @return CREATETIME 操作时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 操作时间
     * @param createtime 操作时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 操作工号
     * @return CZGH 操作工号
     */
    public String getCzgh() {
        return czgh;
    }

    /**
     * 操作工号
     * @param czgh 操作工号
     */
    public void setCzgh(String czgh) {
        this.czgh = czgh == null ? null : czgh.trim();
    }

    /**
     * 申请记录id
     * @return SQJL_ID 申请记录id
     */
    public String getSqjlId() {
        return sqjlId;
    }

    /**
     * 申请记录id
     * @param sqjlId 申请记录id
     */
    public void setSqjlId(String sqjlId) {
        this.sqjlId = sqjlId == null ? null : sqjlId.trim();
    }

    /**
     * 状态
     * @return STATUS 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        sb.append(", gjid=").append(gjid);
        sb.append(", gjnr=").append(gjnr);
        sb.append(", createtime=").append(createtime);
        sb.append(", czgh=").append(czgh);
        sb.append(", sqjlId=").append(sqjlId);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}