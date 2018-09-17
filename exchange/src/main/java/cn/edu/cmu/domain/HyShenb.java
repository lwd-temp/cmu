package cn.edu.cmu.domain;

import java.util.Date;

public class HyShenb {
    /**
     * 会议申报id
     */
    private String sbid;

    /**
     * 计划id
     */
    private String jhid;

    /**
     * 会议类型（01 国际会议、02 两国间会议）
     */
    private String hylx;

    /**
     * 会议中文名称
     */
    private String hymc;

    /**
     * 会议英文名称
     */
    private String hymcEn;

    /**
     * 举办日期
     */
    private Date jbrq;

    /**
     * 主办单位
     */
    private String jbdw;

    /**
     * 会议地点
     */
    private String hydd;

    /**
     * 会议基本信息
     */
    private String hyjbxx;

    /**
     * 会议规模
     */
    private String hygm;

    /**
     * 会议背景及必要性（必填、1000字以内）
     */
    private String bjjbyx;

    /**
     * 经费来源
     */
    private String jfly;

    /**
     * 会议责任人
     */
    private String zrr;

    /**
     * 是否在属地公安部门报备 0 否 1 是
     */
    private String sfbb;

    /**
     * 01 暂存、02 退回修改、03 确定提交
     */
    private String status;

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public HyShenb(String sbid, String jhid, String hylx, String hymc, String hymcEn, Date jbrq, String jbdw, String hydd, String hyjbxx, String hygm, String bjjbyx, String jfly, String zrr, String sfbb, String status) {
        this.sbid = sbid;
        this.jhid = jhid;
        this.hylx = hylx;
        this.hymc = hymc;
        this.hymcEn = hymcEn;
        this.jbrq = jbrq;
        this.jbdw = jbdw;
        this.hydd = hydd;
        this.hyjbxx = hyjbxx;
        this.hygm = hygm;
        this.bjjbyx = bjjbyx;
        this.jfly = jfly;
        this.zrr = zrr;
        this.sfbb = sfbb;
        this.status = status;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public HyShenb() {
        super();
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
     * 计划id
     * @return JHID 计划id
     */
    public String getJhid() {
        return jhid;
    }

    /**
     * 计划id
     * @param jhid 计划id
     */
    public void setJhid(String jhid) {
        this.jhid = jhid == null ? null : jhid.trim();
    }

    /**
     * 会议类型（01 国际会议、02 两国间会议）
     * @return HYLX 会议类型（01 国际会议、02 两国间会议）
     */
    public String getHylx() {
        return hylx;
    }

    /**
     * 会议类型（01 国际会议、02 两国间会议）
     * @param hylx 会议类型（01 国际会议、02 两国间会议）
     */
    public void setHylx(String hylx) {
        this.hylx = hylx == null ? null : hylx.trim();
    }

    /**
     * 会议中文名称
     * @return HYMC 会议中文名称
     */
    public String getHymc() {
        return hymc;
    }

    /**
     * 会议中文名称
     * @param hymc 会议中文名称
     */
    public void setHymc(String hymc) {
        this.hymc = hymc == null ? null : hymc.trim();
    }

    /**
     * 会议英文名称
     * @return HYMC_EN 会议英文名称
     */
    public String getHymcEn() {
        return hymcEn;
    }

    /**
     * 会议英文名称
     * @param hymcEn 会议英文名称
     */
    public void setHymcEn(String hymcEn) {
        this.hymcEn = hymcEn == null ? null : hymcEn.trim();
    }

    /**
     * 举办日期
     * @return JBRQ 举办日期
     */
    public Date getJbrq() {
        return jbrq;
    }

    /**
     * 举办日期
     * @param jbrq 举办日期
     */
    public void setJbrq(Date jbrq) {
        this.jbrq = jbrq;
    }

    /**
     * 主办单位
     * @return JBDW 主办单位
     */
    public String getJbdw() {
        return jbdw;
    }

    /**
     * 主办单位
     * @param jbdw 主办单位
     */
    public void setJbdw(String jbdw) {
        this.jbdw = jbdw == null ? null : jbdw.trim();
    }

    /**
     * 会议地点
     * @return HYDD 会议地点
     */
    public String getHydd() {
        return hydd;
    }

    /**
     * 会议地点
     * @param hydd 会议地点
     */
    public void setHydd(String hydd) {
        this.hydd = hydd == null ? null : hydd.trim();
    }

    /**
     * 会议基本信息
     * @return HYJBXX 会议基本信息
     */
    public String getHyjbxx() {
        return hyjbxx;
    }

    /**
     * 会议基本信息
     * @param hyjbxx 会议基本信息
     */
    public void setHyjbxx(String hyjbxx) {
        this.hyjbxx = hyjbxx == null ? null : hyjbxx.trim();
    }

    /**
     * 会议规模
     * @return HYGM 会议规模
     */
    public String getHygm() {
        return hygm;
    }

    /**
     * 会议规模
     * @param hygm 会议规模
     */
    public void setHygm(String hygm) {
        this.hygm = hygm == null ? null : hygm.trim();
    }

    /**
     * 会议背景及必要性（必填、1000字以内）
     * @return BJJBYX 会议背景及必要性（必填、1000字以内）
     */
    public String getBjjbyx() {
        return bjjbyx;
    }

    /**
     * 会议背景及必要性（必填、1000字以内）
     * @param bjjbyx 会议背景及必要性（必填、1000字以内）
     */
    public void setBjjbyx(String bjjbyx) {
        this.bjjbyx = bjjbyx == null ? null : bjjbyx.trim();
    }

    /**
     * 经费来源
     * @return JFLY 经费来源
     */
    public String getJfly() {
        return jfly;
    }

    /**
     * 经费来源
     * @param jfly 经费来源
     */
    public void setJfly(String jfly) {
        this.jfly = jfly == null ? null : jfly.trim();
    }

    /**
     * 会议责任人
     * @return ZRR 会议责任人
     */
    public String getZrr() {
        return zrr;
    }

    /**
     * 会议责任人
     * @param zrr 会议责任人
     */
    public void setZrr(String zrr) {
        this.zrr = zrr == null ? null : zrr.trim();
    }

    /**
     * 是否在属地公安部门报备 0 否 1 是
     * @return SFBB 是否在属地公安部门报备 0 否 1 是
     */
    public String getSfbb() {
        return sfbb;
    }

    /**
     * 是否在属地公安部门报备 0 否 1 是
     * @param sfbb 是否在属地公安部门报备 0 否 1 是
     */
    public void setSfbb(String sfbb) {
        this.sfbb = sfbb == null ? null : sfbb.trim();
    }

    /**
     * 01 暂存、02 退回修改、03 确定提交
     * @return STATUS 01 暂存、02 退回修改、03 确定提交
     */
    public String getStatus() {
        return status;
    }

    /**
     * 01 暂存、02 退回修改、03 确定提交
     * @param status 01 暂存、02 退回修改、03 确定提交
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
        sb.append(", sbid=").append(sbid);
        sb.append(", jhid=").append(jhid);
        sb.append(", hylx=").append(hylx);
        sb.append(", hymc=").append(hymc);
        sb.append(", hymcEn=").append(hymcEn);
        sb.append(", jbrq=").append(jbrq);
        sb.append(", jbdw=").append(jbdw);
        sb.append(", hydd=").append(hydd);
        sb.append(", hyjbxx=").append(hyjbxx);
        sb.append(", hygm=").append(hygm);
        sb.append(", bjjbyx=").append(bjjbyx);
        sb.append(", jfly=").append(jfly);
        sb.append(", zrr=").append(zrr);
        sb.append(", sfbb=").append(sfbb);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}