package cn.edu.cmu.domain;

import java.util.Date;

public class Hzxy {
    /**
     * 协议id
     */
    private String xyid;

    /**
     * 协议名称
     */
    private String xymc;

    /**
     * 合作方名称
     */
    private String hzfmc;

    /**
     * 签订日期
     */
    private Date qdrq;

    /**
     * 失效日期
     */
    private Date sxrq;

    /**
     * 电子稿上传路径
     */
    private String uploadId;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public Hzxy(String xyid, String xymc, String hzfmc, Date qdrq, Date sxrq, String uploadId) {
        this.xyid = xyid;
        this.xymc = xymc;
        this.hzfmc = hzfmc;
        this.qdrq = qdrq;
        this.sxrq = sxrq;
        this.uploadId = uploadId;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public Hzxy() {
        super();
    }

    /**
     * 协议id
     * @return XYID 协议id
     */
    public String getXyid() {
        return xyid;
    }

    /**
     * 协议id
     * @param xyid 协议id
     */
    public void setXyid(String xyid) {
        this.xyid = xyid == null ? null : xyid.trim();
    }

    /**
     * 协议名称
     * @return XYMC 协议名称
     */
    public String getXymc() {
        return xymc;
    }

    /**
     * 协议名称
     * @param xymc 协议名称
     */
    public void setXymc(String xymc) {
        this.xymc = xymc == null ? null : xymc.trim();
    }

    /**
     * 合作方名称
     * @return HZFMC 合作方名称
     */
    public String getHzfmc() {
        return hzfmc;
    }

    /**
     * 合作方名称
     * @param hzfmc 合作方名称
     */
    public void setHzfmc(String hzfmc) {
        this.hzfmc = hzfmc == null ? null : hzfmc.trim();
    }

    /**
     * 签订日期
     * @return QDRQ 签订日期
     */
    public Date getQdrq() {
        return qdrq;
    }

    /**
     * 签订日期
     * @param qdrq 签订日期
     */
    public void setQdrq(Date qdrq) {
        this.qdrq = qdrq;
    }

    /**
     * 失效日期
     * @return SXRQ 失效日期
     */
    public Date getSxrq() {
        return sxrq;
    }

    /**
     * 失效日期
     * @param sxrq 失效日期
     */
    public void setSxrq(Date sxrq) {
        this.sxrq = sxrq;
    }

    /**
     * 电子稿上传路径
     * @return UPLOAD_ID 电子稿上传路径
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * 电子稿上传路径
     * @param uploadId 电子稿上传路径
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId == null ? null : uploadId.trim();
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", xyid=").append(xyid);
        sb.append(", xymc=").append(xymc);
        sb.append(", hzfmc=").append(hzfmc);
        sb.append(", qdrq=").append(qdrq);
        sb.append(", sxrq=").append(sxrq);
        sb.append(", uploadId=").append(uploadId);
        sb.append("]");
        return sb.toString();
    }
}