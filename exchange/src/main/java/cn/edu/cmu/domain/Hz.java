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
     * 护照状态 01 报废（过期）、02 在省签证处、03 在我部、04 借出中、05 调往新单位、06 调至省外
     */
    private String status;

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public Hz(String hzid, String hzhm, String xm, String gender, String gj, Date birthday, String csdd, Date qfrq, String qfdd, Date yxqz, String fzjg, String hzlx, Date jcsj, String status) {
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
        this.status = status;
    }

    /**
     *
     * @mbggenerated 2018-09-17
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
     *
     * @mbggenerated 2018-09-17
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
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}