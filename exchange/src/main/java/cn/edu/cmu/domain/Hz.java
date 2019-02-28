package cn.edu.cmu.domain;

import java.util.Date;

public class Hz {
    /**
     * 护照id
     */
    private String hzid;

    /**
     * 护照号码
     */
    private String hzhm;

    /**
     * 姓名
     */
    private String xm;

    /**
     * 性别
     */
    private String gender;

    /**
     * 国籍
     */
    private String gj;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 出生地点
     */
    private String csdd;

    /**
     * 签发日期
     */
    private Date qfrq;

    /**
     * 签发地点
     */
    private String qfdd;

    /**
     * 有效期至
     */
    private Date yxqz;

    /**
     * 发证机关
     */
    private String fzjg;

    /**
     * 护照类型 01 因公护照、02 因公港澳、03 因公台湾
     */
    private String hzlx;

    /**
     * 借出时间
     */
    private Date jcsj;

    /**
     * 美国多次往返签证号码
     */
    private String dcwfqzhmMg;

    /**
     * 欧洲多次往返签证号码
     */
    private String dcwfqzhmOz;

    /**
     * 加拿大多次往返签证号码
     */
    private String dcwfqzhmJnd;

    /**
     * 其他地区多次往返签证号码
     */
    private String dcwfqzhmQt;

    /**
     * 出访内容
     */
    private String cfnr;

    /**
     * 多次签证或签注号码
     */
    private String qzhm;

    /**
     * null
     */
    private String dw;

    /**
     * null
     */
    private String zw;

    /**
     * null
     */
    private String zc;

    /**
     * null
     */
    private Date cfsjCj;

    /**
     * null
     */
    private Date cfsjRj;

    /**
     * 护照、通行证归还时间
     */
    private Date ghsj;

    /**
     * 签证或签注时间
     */
    private Date qzsj;

    /**
     * 出访目的地
     */
    private String cfmd;

    /**
     * null
     */
    private String cfrw;

    /**
     * null
     */
    private String jfly;

    /**
     * 护照状态 01 报废（过期）、02 在省签证处、03 在我部、04 借出中、05 调往新单位、06 调至省外
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
    public Hz(String hzid, String hzhm, String xm, String gender, String gj, Date birthday, String csdd, Date qfrq, String qfdd, Date yxqz, String fzjg, String hzlx, Date jcsj, String dcwfqzhmMg, String dcwfqzhmOz, String dcwfqzhmJnd, String dcwfqzhmQt, String cfnr, String qzhm, String dw, String zw, String zc, Date cfsjCj, Date cfsjRj, Date ghsj, Date qzsj, String cfmd, String cfrw, String jfly, String status, String valid, Date createTime) {
        this.hzid = hzid;
        this.hzhm = hzhm;
        this.xm = xm;
        this.gender = gender;
        this.gj = gj;
        this.birthday = birthday;
        this.csdd = csdd;
        this.qfrq = qfrq;
        this.qfdd = qfdd;
        this.yxqz = yxqz;
        this.fzjg = fzjg;
        this.hzlx = hzlx;
        this.jcsj = jcsj;
        this.dcwfqzhmMg = dcwfqzhmMg;
        this.dcwfqzhmOz = dcwfqzhmOz;
        this.dcwfqzhmJnd = dcwfqzhmJnd;
        this.dcwfqzhmQt = dcwfqzhmQt;
        this.cfnr = cfnr;
        this.qzhm = qzhm;
        this.dw = dw;
        this.zw = zw;
        this.zc = zc;
        this.cfsjCj = cfsjCj;
        this.cfsjRj = cfsjRj;
        this.ghsj = ghsj;
        this.qzsj = qzsj;
        this.cfmd = cfmd;
        this.cfrw = cfrw;
        this.jfly = jfly;
        this.status = status;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2019-02-28
     */
    public Hz() {
        super();
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
     * 姓名
     * @return XM 姓名
     */
    public String getXm() {
        return xm;
    }

    /**
     * 姓名
     * @param xm 姓名
     */
    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    /**
     * 性别
     * @return GENDER 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 性别
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * 国籍
     * @return GJ 国籍
     */
    public String getGj() {
        return gj;
    }

    /**
     * 国籍
     * @param gj 国籍
     */
    public void setGj(String gj) {
        this.gj = gj == null ? null : gj.trim();
    }

    /**
     * 出生日期
     * @return BIRTHDAY 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 出生日期
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 出生地点
     * @return CSDD 出生地点
     */
    public String getCsdd() {
        return csdd;
    }

    /**
     * 出生地点
     * @param csdd 出生地点
     */
    public void setCsdd(String csdd) {
        this.csdd = csdd == null ? null : csdd.trim();
    }

    /**
     * 签发日期
     * @return QFRQ 签发日期
     */
    public Date getQfrq() {
        return qfrq;
    }

    /**
     * 签发日期
     * @param qfrq 签发日期
     */
    public void setQfrq(Date qfrq) {
        this.qfrq = qfrq;
    }

    /**
     * 签发地点
     * @return QFDD 签发地点
     */
    public String getQfdd() {
        return qfdd;
    }

    /**
     * 签发地点
     * @param qfdd 签发地点
     */
    public void setQfdd(String qfdd) {
        this.qfdd = qfdd == null ? null : qfdd.trim();
    }

    /**
     * 有效期至
     * @return YXQZ 有效期至
     */
    public Date getYxqz() {
        return yxqz;
    }

    /**
     * 有效期至
     * @param yxqz 有效期至
     */
    public void setYxqz(Date yxqz) {
        this.yxqz = yxqz;
    }

    /**
     * 发证机关
     * @return FZJG 发证机关
     */
    public String getFzjg() {
        return fzjg;
    }

    /**
     * 发证机关
     * @param fzjg 发证机关
     */
    public void setFzjg(String fzjg) {
        this.fzjg = fzjg == null ? null : fzjg.trim();
    }

    /**
     * 护照类型 01 因公护照、02 因公港澳、03 因公台湾
     * @return HZLX 护照类型 01 因公护照、02 因公港澳、03 因公台湾
     */
    public String getHzlx() {
        return hzlx;
    }

    /**
     * 护照类型 01 因公护照、02 因公港澳、03 因公台湾
     * @param hzlx 护照类型 01 因公护照、02 因公港澳、03 因公台湾
     */
    public void setHzlx(String hzlx) {
        this.hzlx = hzlx == null ? null : hzlx.trim();
    }

    /**
     * 借出时间
     * @return JCSJ 借出时间
     */
    public Date getJcsj() {
        return jcsj;
    }

    /**
     * 借出时间
     * @param jcsj 借出时间
     */
    public void setJcsj(Date jcsj) {
        this.jcsj = jcsj;
    }

    /**
     * 美国多次往返签证号码
     * @return DCWFQZHM_MG 美国多次往返签证号码
     */
    public String getDcwfqzhmMg() {
        return dcwfqzhmMg;
    }

    /**
     * 美国多次往返签证号码
     * @param dcwfqzhmMg 美国多次往返签证号码
     */
    public void setDcwfqzhmMg(String dcwfqzhmMg) {
        this.dcwfqzhmMg = dcwfqzhmMg == null ? null : dcwfqzhmMg.trim();
    }

    /**
     * 欧洲多次往返签证号码
     * @return DCWFQZHM_OZ 欧洲多次往返签证号码
     */
    public String getDcwfqzhmOz() {
        return dcwfqzhmOz;
    }

    /**
     * 欧洲多次往返签证号码
     * @param dcwfqzhmOz 欧洲多次往返签证号码
     */
    public void setDcwfqzhmOz(String dcwfqzhmOz) {
        this.dcwfqzhmOz = dcwfqzhmOz == null ? null : dcwfqzhmOz.trim();
    }

    /**
     * 加拿大多次往返签证号码
     * @return DCWFQZHM_JND 加拿大多次往返签证号码
     */
    public String getDcwfqzhmJnd() {
        return dcwfqzhmJnd;
    }

    /**
     * 加拿大多次往返签证号码
     * @param dcwfqzhmJnd 加拿大多次往返签证号码
     */
    public void setDcwfqzhmJnd(String dcwfqzhmJnd) {
        this.dcwfqzhmJnd = dcwfqzhmJnd == null ? null : dcwfqzhmJnd.trim();
    }

    /**
     * 其他地区多次往返签证号码
     * @return DCWFQZHM_QT 其他地区多次往返签证号码
     */
    public String getDcwfqzhmQt() {
        return dcwfqzhmQt;
    }

    /**
     * 其他地区多次往返签证号码
     * @param dcwfqzhmQt 其他地区多次往返签证号码
     */
    public void setDcwfqzhmQt(String dcwfqzhmQt) {
        this.dcwfqzhmQt = dcwfqzhmQt == null ? null : dcwfqzhmQt.trim();
    }

    /**
     * 出访内容
     * @return CFNR 出访内容
     */
    public String getCfnr() {
        return cfnr;
    }

    /**
     * 出访内容
     * @param cfnr 出访内容
     */
    public void setCfnr(String cfnr) {
        this.cfnr = cfnr == null ? null : cfnr.trim();
    }

    /**
     * 多次签证或签注号码
     * @return QZHM 多次签证或签注号码
     */
    public String getQzhm() {
        return qzhm;
    }

    /**
     * 多次签证或签注号码
     * @param qzhm 多次签证或签注号码
     */
    public void setQzhm(String qzhm) {
        this.qzhm = qzhm == null ? null : qzhm.trim();
    }

    /**
     * null
     * @return DW null
     */
    public String getDw() {
        return dw;
    }

    /**
     * null
     * @param dw null
     */
    public void setDw(String dw) {
        this.dw = dw == null ? null : dw.trim();
    }

    /**
     * null
     * @return ZW null
     */
    public String getZw() {
        return zw;
    }

    /**
     * null
     * @param zw null
     */
    public void setZw(String zw) {
        this.zw = zw == null ? null : zw.trim();
    }

    /**
     * null
     * @return ZC null
     */
    public String getZc() {
        return zc;
    }

    /**
     * null
     * @param zc null
     */
    public void setZc(String zc) {
        this.zc = zc == null ? null : zc.trim();
    }

    /**
     * null
     * @return CFSJ_CJ null
     */
    public Date getCfsjCj() {
        return cfsjCj;
    }

    /**
     * null
     * @param cfsjCj null
     */
    public void setCfsjCj(Date cfsjCj) {
        this.cfsjCj = cfsjCj;
    }

    /**
     * null
     * @return CFSJ_RJ null
     */
    public Date getCfsjRj() {
        return cfsjRj;
    }

    /**
     * null
     * @param cfsjRj null
     */
    public void setCfsjRj(Date cfsjRj) {
        this.cfsjRj = cfsjRj;
    }

    /**
     * 护照、通行证归还时间
     * @return GHSJ 护照、通行证归还时间
     */
    public Date getGhsj() {
        return ghsj;
    }

    /**
     * 护照、通行证归还时间
     * @param ghsj 护照、通行证归还时间
     */
    public void setGhsj(Date ghsj) {
        this.ghsj = ghsj;
    }

    /**
     * 签证或签注时间
     * @return QZSJ 签证或签注时间
     */
    public Date getQzsj() {
        return qzsj;
    }

    /**
     * 签证或签注时间
     * @param qzsj 签证或签注时间
     */
    public void setQzsj(Date qzsj) {
        this.qzsj = qzsj;
    }

    /**
     * 出访目的地
     * @return CFMD 出访目的地
     */
    public String getCfmd() {
        return cfmd;
    }

    /**
     * 出访目的地
     * @param cfmd 出访目的地
     */
    public void setCfmd(String cfmd) {
        this.cfmd = cfmd == null ? null : cfmd.trim();
    }

    /**
     * null
     * @return CFRW null
     */
    public String getCfrw() {
        return cfrw;
    }

    /**
     * null
     * @param cfrw null
     */
    public void setCfrw(String cfrw) {
        this.cfrw = cfrw == null ? null : cfrw.trim();
    }

    /**
     * null
     * @return JFLY null
     */
    public String getJfly() {
        return jfly;
    }

    /**
     * null
     * @param jfly null
     */
    public void setJfly(String jfly) {
        this.jfly = jfly == null ? null : jfly.trim();
    }

    /**
     * 护照状态 01 报废（过期）、02 在省签证处、03 在我部、04 借出中、05 调往新单位、06 调至省外
     * @return STATUS 护照状态 01 报废（过期）、02 在省签证处、03 在我部、04 借出中、05 调往新单位、06 调至省外
     */
    public String getStatus() {
        return status;
    }

    /**
     * 护照状态 01 报废（过期）、02 在省签证处、03 在我部、04 借出中、05 调往新单位、06 调至省外
     * @param status 护照状态 01 报废（过期）、02 在省签证处、03 在我部、04 借出中、05 调往新单位、06 调至省外
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
        sb.append(", hzid=").append(hzid);
        sb.append(", hzhm=").append(hzhm);
        sb.append(", xm=").append(xm);
        sb.append(", gender=").append(gender);
        sb.append(", gj=").append(gj);
        sb.append(", birthday=").append(birthday);
        sb.append(", csdd=").append(csdd);
        sb.append(", qfrq=").append(qfrq);
        sb.append(", qfdd=").append(qfdd);
        sb.append(", yxqz=").append(yxqz);
        sb.append(", fzjg=").append(fzjg);
        sb.append(", hzlx=").append(hzlx);
        sb.append(", jcsj=").append(jcsj);
        sb.append(", dcwfqzhmMg=").append(dcwfqzhmMg);
        sb.append(", dcwfqzhmOz=").append(dcwfqzhmOz);
        sb.append(", dcwfqzhmJnd=").append(dcwfqzhmJnd);
        sb.append(", dcwfqzhmQt=").append(dcwfqzhmQt);
        sb.append(", cfnr=").append(cfnr);
        sb.append(", qzhm=").append(qzhm);
        sb.append(", dw=").append(dw);
        sb.append(", zw=").append(zw);
        sb.append(", zc=").append(zc);
        sb.append(", cfsjCj=").append(cfsjCj);
        sb.append(", cfsjRj=").append(cfsjRj);
        sb.append(", ghsj=").append(ghsj);
        sb.append(", qzsj=").append(qzsj);
        sb.append(", cfmd=").append(cfmd);
        sb.append(", cfrw=").append(cfrw);
        sb.append(", jfly=").append(jfly);
        sb.append(", status=").append(status);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}