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
     * 会议编号
     */
    private String hybh;

    /**
     * 举办日期(开始)
     */
    private Date jxrqKs;

    /**
     * 举办日期(结束)
     */
    private Date jxrqJs;

    /**
     * 主办单位
     */
    private String zbdw;

    /**
     * 承办单位
     */
    private String cbdw;

    /**
     * 会议地点
     */
    private String dd;

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
    private String fzrxm;

    /**
     * 负责人电话
     */
    private String fzrdh;

    /**
     * 报告、讲座等题目
     */
    private String bgtm;

    /**
     * 报告、讲座等内容简介
     */
    private String bgnr;

    /**
     * 是否在属地公安部门报备 0 否 1 是
     */
    private String sfbb;

    /**
     * 操作人员
     */
    private String operator;

    /**
     * 01 暂存、02 退回修改、03 确定提交
     */
    private String status;

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
     * @mbggenerated 2019-02-28
     */
    public HyShenb(String sbid, String jhid, String hylx, String hymc, String hymcEn, String hybh, Date jxrqKs, Date jxrqJs, String zbdw, String cbdw, String dd, String hyjbxx, String hygm, String bjjbyx, String jfly, String fzrxm, String fzrdh, String bgtm, String bgnr, String sfbb, String operator, String status, String valid, Date createTime) {
        this.sbid = sbid;
        this.jhid = jhid;
        this.hylx = hylx;
        this.hymc = hymc;
        this.hymcEn = hymcEn;
        this.hybh = hybh;
        this.jxrqKs = jxrqKs;
        this.jxrqJs = jxrqJs;
        this.zbdw = zbdw;
        this.cbdw = cbdw;
        this.dd = dd;
        this.hyjbxx = hyjbxx;
        this.hygm = hygm;
        this.bjjbyx = bjjbyx;
        this.jfly = jfly;
        this.fzrxm = fzrxm;
        this.fzrdh = fzrdh;
        this.bgtm = bgtm;
        this.bgnr = bgnr;
        this.sfbb = sfbb;
        this.operator = operator;
        this.status = status;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2019-02-28
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
     * 会议编号
     * @return HYBH 会议编号
     */
    public String getHybh() {
        return hybh;
    }

    /**
     * 会议编号
     * @param hybh 会议编号
     */
    public void setHybh(String hybh) {
        this.hybh = hybh == null ? null : hybh.trim();
    }

    /**
     * 举办日期(开始)
     * @return JXRQ_KS 举办日期(开始)
     */
    public Date getJxrqKs() {
        return jxrqKs;
    }

    /**
     * 举办日期(开始)
     * @param jxrqKs 举办日期(开始)
     */
    public void setJxrqKs(Date jxrqKs) {
        this.jxrqKs = jxrqKs;
    }

    /**
     * 举办日期(结束)
     * @return JXRQ_JS 举办日期(结束)
     */
    public Date getJxrqJs() {
        return jxrqJs;
    }

    /**
     * 举办日期(结束)
     * @param jxrqJs 举办日期(结束)
     */
    public void setJxrqJs(Date jxrqJs) {
        this.jxrqJs = jxrqJs;
    }

    /**
     * 主办单位
     * @return ZBDW 主办单位
     */
    public String getZbdw() {
        return zbdw;
    }

    /**
     * 主办单位
     * @param zbdw 主办单位
     */
    public void setZbdw(String zbdw) {
        this.zbdw = zbdw == null ? null : zbdw.trim();
    }

    /**
     * 承办单位
     * @return CBDW 承办单位
     */
    public String getCbdw() {
        return cbdw;
    }

    /**
     * 承办单位
     * @param cbdw 承办单位
     */
    public void setCbdw(String cbdw) {
        this.cbdw = cbdw == null ? null : cbdw.trim();
    }

    /**
     * 会议地点
     * @return DD 会议地点
     */
    public String getDd() {
        return dd;
    }

    /**
     * 会议地点
     * @param dd 会议地点
     */
    public void setDd(String dd) {
        this.dd = dd == null ? null : dd.trim();
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
     * @return FZRXM 会议责任人
     */
    public String getFzrxm() {
        return fzrxm;
    }

    /**
     * 会议责任人
     * @param fzrxm 会议责任人
     */
    public void setFzrxm(String fzrxm) {
        this.fzrxm = fzrxm == null ? null : fzrxm.trim();
    }

    /**
     * 负责人电话
     * @return FZRDH 负责人电话
     */
    public String getFzrdh() {
        return fzrdh;
    }

    /**
     * 负责人电话
     * @param fzrdh 负责人电话
     */
    public void setFzrdh(String fzrdh) {
        this.fzrdh = fzrdh == null ? null : fzrdh.trim();
    }

    /**
     * 报告、讲座等题目
     * @return BGTM 报告、讲座等题目
     */
    public String getBgtm() {
        return bgtm;
    }

    /**
     * 报告、讲座等题目
     * @param bgtm 报告、讲座等题目
     */
    public void setBgtm(String bgtm) {
        this.bgtm = bgtm == null ? null : bgtm.trim();
    }

    /**
     * 报告、讲座等内容简介
     * @return BGNR 报告、讲座等内容简介
     */
    public String getBgnr() {
        return bgnr;
    }

    /**
     * 报告、讲座等内容简介
     * @param bgnr 报告、讲座等内容简介
     */
    public void setBgnr(String bgnr) {
        this.bgnr = bgnr == null ? null : bgnr.trim();
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
     * 操作人员
     * @return OPERATOR 操作人员
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 操作人员
     * @param operator 操作人员
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
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
     * @mbggenerated 2019-02-28
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
        sb.append(", hybh=").append(hybh);
        sb.append(", jxrqKs=").append(jxrqKs);
        sb.append(", jxrqJs=").append(jxrqJs);
        sb.append(", zbdw=").append(zbdw);
        sb.append(", cbdw=").append(cbdw);
        sb.append(", dd=").append(dd);
        sb.append(", hyjbxx=").append(hyjbxx);
        sb.append(", hygm=").append(hygm);
        sb.append(", bjjbyx=").append(bjjbyx);
        sb.append(", jfly=").append(jfly);
        sb.append(", fzrxm=").append(fzrxm);
        sb.append(", fzrdh=").append(fzrdh);
        sb.append(", bgtm=").append(bgtm);
        sb.append(", bgnr=").append(bgnr);
        sb.append(", sfbb=").append(sfbb);
        sb.append(", operator=").append(operator);
        sb.append(", status=").append(status);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}