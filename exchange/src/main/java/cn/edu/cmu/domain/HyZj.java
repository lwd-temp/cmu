package cn.edu.cmu.domain;

import java.util.Date;

public class HyZj {
    /**
     * 总结id
     */
    private String zjid;

    /**
     * 会议申报id
     */
    private String sbid;

    /**
     * 会议基本信息
     */
    private String jbxx;

    /**
     * 会议批件文号
     */
    private String pjwh;

    /**
     * 会议具体情况介绍
     */
    private String jtqkjs;

    /**
     * 会议产出情况介绍
     */
    private String ccqkjs;

    /**
     * 会议申办主办过程中的经验与问题
     */
    private String jyywt;

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
    public HyZj(String zjid, String sbid, String jbxx, String pjwh, String jtqkjs, String ccqkjs, String jyywt, String valid, Date createTime) {
        this.zjid = zjid;
        this.sbid = sbid;
        this.jbxx = jbxx;
        this.pjwh = pjwh;
        this.jtqkjs = jtqkjs;
        this.ccqkjs = ccqkjs;
        this.jyywt = jyywt;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-22
     */
    public HyZj() {
        super();
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
     * 会议申报id
     * @return SBID 会议申报id
     */
    public String getSbid() {
        return sbid;
    }

    /**
     * 会议申报id
     * @param sbid 会议申报id
     */
    public void setSbid(String sbid) {
        this.sbid = sbid == null ? null : sbid.trim();
    }

    /**
     * 会议基本信息
     * @return JBXX 会议基本信息
     */
    public String getJbxx() {
        return jbxx;
    }

    /**
     * 会议基本信息
     * @param jbxx 会议基本信息
     */
    public void setJbxx(String jbxx) {
        this.jbxx = jbxx == null ? null : jbxx.trim();
    }

    /**
     * 会议批件文号
     * @return PJWH 会议批件文号
     */
    public String getPjwh() {
        return pjwh;
    }

    /**
     * 会议批件文号
     * @param pjwh 会议批件文号
     */
    public void setPjwh(String pjwh) {
        this.pjwh = pjwh == null ? null : pjwh.trim();
    }

    /**
     * 会议具体情况介绍
     * @return JTQKJS 会议具体情况介绍
     */
    public String getJtqkjs() {
        return jtqkjs;
    }

    /**
     * 会议具体情况介绍
     * @param jtqkjs 会议具体情况介绍
     */
    public void setJtqkjs(String jtqkjs) {
        this.jtqkjs = jtqkjs == null ? null : jtqkjs.trim();
    }

    /**
     * 会议产出情况介绍
     * @return CCQKJS 会议产出情况介绍
     */
    public String getCcqkjs() {
        return ccqkjs;
    }

    /**
     * 会议产出情况介绍
     * @param ccqkjs 会议产出情况介绍
     */
    public void setCcqkjs(String ccqkjs) {
        this.ccqkjs = ccqkjs == null ? null : ccqkjs.trim();
    }

    /**
     * 会议申办主办过程中的经验与问题
     * @return JYYWT 会议申办主办过程中的经验与问题
     */
    public String getJyywt() {
        return jyywt;
    }

    /**
     * 会议申办主办过程中的经验与问题
     * @param jyywt 会议申办主办过程中的经验与问题
     */
    public void setJyywt(String jyywt) {
        this.jyywt = jyywt == null ? null : jyywt.trim();
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
        sb.append(", zjid=").append(zjid);
        sb.append(", sbid=").append(sbid);
        sb.append(", jbxx=").append(jbxx);
        sb.append(", pjwh=").append(pjwh);
        sb.append(", jtqkjs=").append(jtqkjs);
        sb.append(", ccqkjs=").append(ccqkjs);
        sb.append(", jyywt=").append(jyywt);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}