package cn.edu.cmu.domain;

import java.util.Date;

public class ForeignTeacher {
    /**
     * 教师id
     */
    private String tid;

    /**
     * 教师姓名
     */
    private String name;

    /**
     * 教师性别
     */
    private String gender;

    /**
     * null
     */
    private String language;

    /**
     * null
     */
    private String gzdw;

    /**
     * null
     */
    private String zyly;

    /**
     * null
     */
    private String email;

    /**
     * null
     */
    private String phone;

    /**
     * null
     */
    private String zwzc;

    /**
     * null
     */
    private String glxm;

    /**
     * null
     */
    private String cz;

    /**
     * null
     */
    private String txdz;

    /**
     * 国籍
     */
    private String gj;

    /**
     * 状态
     */
    private String zt;

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
    public ForeignTeacher(String tid, String name, String gender, String language, String gzdw, String zyly, String email, String phone, String zwzc, String glxm, String cz, String txdz, String gj, String zt, String valid, Date createTime) {
        this.tid = tid;
        this.name = name;
        this.gender = gender;
        this.language = language;
        this.gzdw = gzdw;
        this.zyly = zyly;
        this.email = email;
        this.phone = phone;
        this.zwzc = zwzc;
        this.glxm = glxm;
        this.cz = cz;
        this.txdz = txdz;
        this.gj = gj;
        this.zt = zt;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-22
     */
    public ForeignTeacher() {
        super();
    }

    /**
     * 教师id
     * @return TID 教师id
     */
    public String getTid() {
        return tid;
    }

    /**
     * 教师id
     * @param tid 教师id
     */
    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    /**
     * 教师姓名
     * @return NAME 教师姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 教师姓名
     * @param name 教师姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 教师性别
     * @return GENDER 教师性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 教师性别
     * @param gender 教师性别
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * null
     * @return LANGUAGE null
     */
    public String getLanguage() {
        return language;
    }

    /**
     * null
     * @param language null
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    /**
     * null
     * @return GZDW null
     */
    public String getGzdw() {
        return gzdw;
    }

    /**
     * null
     * @param gzdw null
     */
    public void setGzdw(String gzdw) {
        this.gzdw = gzdw == null ? null : gzdw.trim();
    }

    /**
     * null
     * @return ZYLY null
     */
    public String getZyly() {
        return zyly;
    }

    /**
     * null
     * @param zyly null
     */
    public void setZyly(String zyly) {
        this.zyly = zyly == null ? null : zyly.trim();
    }

    /**
     * null
     * @return EMAIL null
     */
    public String getEmail() {
        return email;
    }

    /**
     * null
     * @param email null
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * null
     * @return PHONE null
     */
    public String getPhone() {
        return phone;
    }

    /**
     * null
     * @param phone null
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * null
     * @return ZWZC null
     */
    public String getZwzc() {
        return zwzc;
    }

    /**
     * null
     * @param zwzc null
     */
    public void setZwzc(String zwzc) {
        this.zwzc = zwzc == null ? null : zwzc.trim();
    }

    /**
     * null
     * @return GLXM null
     */
    public String getGlxm() {
        return glxm;
    }

    /**
     * null
     * @param glxm null
     */
    public void setGlxm(String glxm) {
        this.glxm = glxm == null ? null : glxm.trim();
    }

    /**
     * null
     * @return CZ null
     */
    public String getCz() {
        return cz;
    }

    /**
     * null
     * @param cz null
     */
    public void setCz(String cz) {
        this.cz = cz == null ? null : cz.trim();
    }

    /**
     * null
     * @return TXDZ null
     */
    public String getTxdz() {
        return txdz;
    }

    /**
     * null
     * @param txdz null
     */
    public void setTxdz(String txdz) {
        this.txdz = txdz == null ? null : txdz.trim();
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
     * 状态
     * @return ZT 状态
     */
    public String getZt() {
        return zt;
    }

    /**
     * 状态
     * @param zt 状态
     */
    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
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
        sb.append(", tid=").append(tid);
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", language=").append(language);
        sb.append(", gzdw=").append(gzdw);
        sb.append(", zyly=").append(zyly);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", zwzc=").append(zwzc);
        sb.append(", glxm=").append(glxm);
        sb.append(", cz=").append(cz);
        sb.append(", txdz=").append(txdz);
        sb.append(", gj=").append(gj);
        sb.append(", zt=").append(zt);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}