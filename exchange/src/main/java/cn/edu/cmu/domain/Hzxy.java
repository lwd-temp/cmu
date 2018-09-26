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
     * 签字人
     */
    private String qzr;

    /**
     * 签字人职务
     */
    private String qzrzw;

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
     * @mbggenerated 2018-09-26
     */
    public Hzxy(String xyid, String xymc, String hzfmc, Date qdrq, Date sxrq, String uploadId, String qzr, String qzrzw, String valid, Date createTime) {
        this.xyid = xyid;
        this.xymc = xymc;
        this.hzfmc = hzfmc;
        this.qdrq = qdrq;
        this.sxrq = sxrq;
        this.uploadId = uploadId;
        this.qzr = qzr;
        this.qzrzw = qzrzw;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-26
     */
    public Hzxy() {
        super();
    }

    /**
     * 协议id
     * @return xyid 协议id
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
     * @return xymc 协议名称
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
     * @return hzfmc 合作方名称
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
     * @return qdrq 签订日期
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
     * @return sxrq 失效日期
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
     * @return upload_id 电子稿上传路径
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
     * 签字人
     * @return qzr 签字人
     */
    public String getQzr() {
        return qzr;
    }

    /**
     * 签字人
     * @param qzr 签字人
     */
    public void setQzr(String qzr) {
        this.qzr = qzr == null ? null : qzr.trim();
    }

    /**
     * 签字人职务
     * @return qzrzw 签字人职务
     */
    public String getQzrzw() {
        return qzrzw;
    }

    /**
     * 签字人职务
     * @param qzrzw 签字人职务
     */
    public void setQzrzw(String qzrzw) {
        this.qzrzw = qzrzw == null ? null : qzrzw.trim();
    }

    /**
     * 数据是否有效(0已经删除 1有效)
     * @return valid 数据是否有效(0已经删除 1有效)
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
     * @return create_time 创建时间默认当前数据生成时间
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
     * @mbggenerated 2018-09-26
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
        sb.append(", qzr=").append(qzr);
        sb.append(", qzrzw=").append(qzrzw);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}