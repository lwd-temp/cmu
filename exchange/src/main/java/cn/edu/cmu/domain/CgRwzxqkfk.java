package cn.edu.cmu.domain;

import java.math.BigDecimal;
import java.util.Date;

public class CgRwzxqkfk {
    /**
     * 反馈表主键id
     */
    private String rwfkId;

    /**
     * 团组单位：默认中国医科大学
     */
    private String tzdw;

    /**
     * 出访国家(地区)
     */
    private String cfgjdq;

    /**
     * 团长姓名
     */
    private String tzxm;

    /**
     * null
     */
    private String xb;

    /**
     * 团长单位
     */
    private String tzzdw;

    /**
     * 团长职务
     */
    private String tzzw;

    /**
     * null
     */
    private String ssejdw;

    /**
     * 批准出访人数
     */
    private BigDecimal pzcfrw;

    /**
     * 批准出访天数
     */
    private BigDecimal pzcfts;

    /**
     * 实际出访人数
     */
    private BigDecimal sjcfrs;

    /**
     * 实际出访天数
     */
    private BigDecimal sjcfts;

    /**
     * 出境时间
     */
    private Date cjsj;

    /**
     * 入境时间
     */
    private Date rjsj;

    /**
     * 任务批件文号
     */
    private String rwpjwh;

    /**
     * 出访标题
     */
    private String cfbt;

    /**
     * 任务执行情况
     */
    private String rwzxqk;

    /**
     * 任务未完成内容及原因
     */
    private String rwwwcnr;

    /**
     * 填报人
     */
    private String tbr;

    /**
     * 填表人联系电话
     */
    private String tbrDh;

    /**
     * 出国(境)id
     */
    private String cgid;

    /**
     * null
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
     * 护照号码
     */
    private String hzhm;

    /**
     * 护照有效期
     */
    private Date yxqz;

    /**
     * 签证有效期
     */
    private Date qzsj;

    /**
     *
     * @mbggenerated 2019-08-13
     */
    public CgRwzxqkfk(String rwfkId, String tzdw, String cfgjdq, String tzxm, String xb, String tzzdw, String tzzw, String ssejdw, BigDecimal pzcfrw, BigDecimal pzcfts, BigDecimal sjcfrs, BigDecimal sjcfts, Date cjsj, Date rjsj, String rwpjwh, String cfbt, String rwzxqk, String rwwwcnr, String tbr, String tbrDh, String cgid, String status, String valid, Date createTime, String hzhm, Date yxqz, Date qzsj) {
        this.rwfkId = rwfkId;
        this.tzdw = tzdw;
        this.cfgjdq = cfgjdq;
        this.tzxm = tzxm;
        this.xb = xb;
        this.tzzdw = tzzdw;
        this.tzzw = tzzw;
        this.ssejdw = ssejdw;
        this.pzcfrw = pzcfrw;
        this.pzcfts = pzcfts;
        this.sjcfrs = sjcfrs;
        this.sjcfts = sjcfts;
        this.cjsj = cjsj;
        this.rjsj = rjsj;
        this.rwpjwh = rwpjwh;
        this.cfbt = cfbt;
        this.rwzxqk = rwzxqk;
        this.rwwwcnr = rwwwcnr;
        this.tbr = tbr;
        this.tbrDh = tbrDh;
        this.cgid = cgid;
        this.status = status;
        this.valid = valid;
        this.createTime = createTime;
        this.hzhm = hzhm;
        this.yxqz = yxqz;
        this.qzsj = qzsj;
    }

    /**
     *
     * @mbggenerated 2019-08-13
     */
    public CgRwzxqkfk() {
        super();
    }

    /**
     * 反馈表主键id
     * @return RWFK_ID 反馈表主键id
     */
    public String getRwfkId() {
        return rwfkId;
    }

    /**
     * 反馈表主键id
     * @param rwfkId 反馈表主键id
     */
    public void setRwfkId(String rwfkId) {
        this.rwfkId = rwfkId == null ? null : rwfkId.trim();
    }

    /**
     * 团组单位：默认中国医科大学
     * @return TZDW 团组单位：默认中国医科大学
     */
    public String getTzdw() {
        return tzdw;
    }

    /**
     * 团组单位：默认中国医科大学
     * @param tzdw 团组单位：默认中国医科大学
     */
    public void setTzdw(String tzdw) {
        this.tzdw = tzdw == null ? null : tzdw.trim();
    }

    /**
     * 出访国家(地区)
     * @return CFGJDQ 出访国家(地区)
     */
    public String getCfgjdq() {
        return cfgjdq;
    }

    /**
     * 出访国家(地区)
     * @param cfgjdq 出访国家(地区)
     */
    public void setCfgjdq(String cfgjdq) {
        this.cfgjdq = cfgjdq == null ? null : cfgjdq.trim();
    }

    /**
     * 团长姓名
     * @return TZXM 团长姓名
     */
    public String getTzxm() {
        return tzxm;
    }

    /**
     * 团长姓名
     * @param tzxm 团长姓名
     */
    public void setTzxm(String tzxm) {
        this.tzxm = tzxm == null ? null : tzxm.trim();
    }

    /**
     * null
     * @return XB null
     */
    public String getXb() {
        return xb;
    }

    /**
     * null
     * @param xb null
     */
    public void setXb(String xb) {
        this.xb = xb == null ? null : xb.trim();
    }

    /**
     * 团长单位
     * @return TZZDW 团长单位
     */
    public String getTzzdw() {
        return tzzdw;
    }

    /**
     * 团长单位
     * @param tzzdw 团长单位
     */
    public void setTzzdw(String tzzdw) {
        this.tzzdw = tzzdw == null ? null : tzzdw.trim();
    }

    /**
     * 团长职务
     * @return TZZW 团长职务
     */
    public String getTzzw() {
        return tzzw;
    }

    /**
     * 团长职务
     * @param tzzw 团长职务
     */
    public void setTzzw(String tzzw) {
        this.tzzw = tzzw == null ? null : tzzw.trim();
    }

    /**
     * null
     * @return SSEJDW null
     */
    public String getSsejdw() {
        return ssejdw;
    }

    /**
     * null
     * @param ssejdw null
     */
    public void setSsejdw(String ssejdw) {
        this.ssejdw = ssejdw == null ? null : ssejdw.trim();
    }

    /**
     * 批准出访人数
     * @return PZCFRW 批准出访人数
     */
    public BigDecimal getPzcfrw() {
        return pzcfrw;
    }

    /**
     * 批准出访人数
     * @param pzcfrw 批准出访人数
     */
    public void setPzcfrw(BigDecimal pzcfrw) {
        this.pzcfrw = pzcfrw;
    }

    /**
     * 批准出访天数
     * @return PZCFTS 批准出访天数
     */
    public BigDecimal getPzcfts() {
        return pzcfts;
    }

    /**
     * 批准出访天数
     * @param pzcfts 批准出访天数
     */
    public void setPzcfts(BigDecimal pzcfts) {
        this.pzcfts = pzcfts;
    }

    /**
     * 实际出访人数
     * @return SJCFRS 实际出访人数
     */
    public BigDecimal getSjcfrs() {
        return sjcfrs;
    }

    /**
     * 实际出访人数
     * @param sjcfrs 实际出访人数
     */
    public void setSjcfrs(BigDecimal sjcfrs) {
        this.sjcfrs = sjcfrs;
    }

    /**
     * 实际出访天数
     * @return SJCFTS 实际出访天数
     */
    public BigDecimal getSjcfts() {
        return sjcfts;
    }

    /**
     * 实际出访天数
     * @param sjcfts 实际出访天数
     */
    public void setSjcfts(BigDecimal sjcfts) {
        this.sjcfts = sjcfts;
    }

    /**
     * 出境时间
     * @return CJSJ 出境时间
     */
    public Date getCjsj() {
        return cjsj;
    }

    /**
     * 出境时间
     * @param cjsj 出境时间
     */
    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    /**
     * 入境时间
     * @return RJSJ 入境时间
     */
    public Date getRjsj() {
        return rjsj;
    }

    /**
     * 入境时间
     * @param rjsj 入境时间
     */
    public void setRjsj(Date rjsj) {
        this.rjsj = rjsj;
    }

    /**
     * 任务批件文号
     * @return RWPJWH 任务批件文号
     */
    public String getRwpjwh() {
        return rwpjwh;
    }

    /**
     * 任务批件文号
     * @param rwpjwh 任务批件文号
     */
    public void setRwpjwh(String rwpjwh) {
        this.rwpjwh = rwpjwh == null ? null : rwpjwh.trim();
    }

    /**
     * 出访标题
     * @return CFBT 出访标题
     */
    public String getCfbt() {
        return cfbt;
    }

    /**
     * 出访标题
     * @param cfbt 出访标题
     */
    public void setCfbt(String cfbt) {
        this.cfbt = cfbt == null ? null : cfbt.trim();
    }

    /**
     * 任务执行情况
     * @return RWZXQK 任务执行情况
     */
    public String getRwzxqk() {
        return rwzxqk;
    }

    /**
     * 任务执行情况
     * @param rwzxqk 任务执行情况
     */
    public void setRwzxqk(String rwzxqk) {
        this.rwzxqk = rwzxqk == null ? null : rwzxqk.trim();
    }

    /**
     * 任务未完成内容及原因
     * @return RWWWCNR 任务未完成内容及原因
     */
    public String getRwwwcnr() {
        return rwwwcnr;
    }

    /**
     * 任务未完成内容及原因
     * @param rwwwcnr 任务未完成内容及原因
     */
    public void setRwwwcnr(String rwwwcnr) {
        this.rwwwcnr = rwwwcnr == null ? null : rwwwcnr.trim();
    }

    /**
     * 填报人
     * @return TBR 填报人
     */
    public String getTbr() {
        return tbr;
    }

    /**
     * 填报人
     * @param tbr 填报人
     */
    public void setTbr(String tbr) {
        this.tbr = tbr == null ? null : tbr.trim();
    }

    /**
     * 填表人联系电话
     * @return TBR_DH 填表人联系电话
     */
    public String getTbrDh() {
        return tbrDh;
    }

    /**
     * 填表人联系电话
     * @param tbrDh 填表人联系电话
     */
    public void setTbrDh(String tbrDh) {
        this.tbrDh = tbrDh == null ? null : tbrDh.trim();
    }

    /**
     * 出国(境)id
     * @return CGID 出国(境)id
     */
    public String getCgid() {
        return cgid;
    }

    /**
     * 出国(境)id
     * @param cgid 出国(境)id
     */
    public void setCgid(String cgid) {
        this.cgid = cgid == null ? null : cgid.trim();
    }

    /**
     * null
     * @return STATUS null
     */
    public String getStatus() {
        return status;
    }

    /**
     * null
     * @param status null
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
     * 护照号码
     * @return HZHM 护照号码
     */
    public String getHzhm() {
        return hzhm;
    }

    /**
     * 护照号码
     * @param hzhm 护照号码
     */
    public void setHzhm(String hzhm) {
        this.hzhm = hzhm == null ? null : hzhm.trim();
    }

    /**
     * 护照有效期
     * @return YXQZ 护照有效期
     */
    public Date getYxqz() {
        return yxqz;
    }

    /**
     * 护照有效期
     * @param yxqz 护照有效期
     */
    public void setYxqz(Date yxqz) {
        this.yxqz = yxqz;
    }

    /**
     * 签证有效期
     * @return QZSJ 签证有效期
     */
    public Date getQzsj() {
        return qzsj;
    }

    /**
     * 签证有效期
     * @param qzsj 签证有效期
     */
    public void setQzsj(Date qzsj) {
        this.qzsj = qzsj;
    }

    /**
     *
     * @mbggenerated 2019-08-13
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rwfkId=").append(rwfkId);
        sb.append(", tzdw=").append(tzdw);
        sb.append(", cfgjdq=").append(cfgjdq);
        sb.append(", tzxm=").append(tzxm);
        sb.append(", xb=").append(xb);
        sb.append(", tzzdw=").append(tzzdw);
        sb.append(", tzzw=").append(tzzw);
        sb.append(", ssejdw=").append(ssejdw);
        sb.append(", pzcfrw=").append(pzcfrw);
        sb.append(", pzcfts=").append(pzcfts);
        sb.append(", sjcfrs=").append(sjcfrs);
        sb.append(", sjcfts=").append(sjcfts);
        sb.append(", cjsj=").append(cjsj);
        sb.append(", rjsj=").append(rjsj);
        sb.append(", rwpjwh=").append(rwpjwh);
        sb.append(", cfbt=").append(cfbt);
        sb.append(", rwzxqk=").append(rwzxqk);
        sb.append(", rwwwcnr=").append(rwwwcnr);
        sb.append(", tbr=").append(tbr);
        sb.append(", tbrDh=").append(tbrDh);
        sb.append(", cgid=").append(cgid);
        sb.append(", status=").append(status);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append(", hzhm=").append(hzhm);
        sb.append(", yxqz=").append(yxqz);
        sb.append(", qzsj=").append(qzsj);
        sb.append("]");
        return sb.toString();
    }
}