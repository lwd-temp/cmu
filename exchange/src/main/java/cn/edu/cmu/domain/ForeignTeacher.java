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
     * 语种
     */
    private String language;

    /**
     * 工作单位
     */
    private String gzdw;

    /**
     * 专业领域
     */
    private String zyly;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 工作电话
     */
    private String phone;

    /**
     * 职务职称
     */
    private String zwzc;

    /**
     * 关联项目
     */
    private String glxm;

    /**
     * 传真
     */
    private String cz;

    /**
     * 通信地址
     */
    private String txdz;

    /**
     * 国籍
     */
    private String gj;

    /**
     * 备注
     */
    private String memo;

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
     * @mbggenerated 2018-10-28
     */
    public ForeignTeacher(String tid, String name, String gender, String language, String gzdw, String zyly, String email, String phone, String zwzc, String glxm, String cz, String txdz, String gj, String memo, String valid, Date createTime) {
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
        this.memo = memo;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-10-28
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
     * 语种
     * @return LANGUAGE 语种
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 语种
     * @param language 语种
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    /**
     * 工作单位
     * @return GZDW 工作单位
     */
    public String getGzdw() {
        return gzdw;
    }

    /**
     * 工作单位
     * @param gzdw 工作单位
     */
    public void setGzdw(String gzdw) {
        this.gzdw = gzdw == null ? null : gzdw.trim();
    }

    /**
     * 专业领域
     * @return ZYLY 专业领域
     */
    public String getZyly() {
        return zyly;
    }

    /**
     * 专业领域
     * @param zyly 专业领域
     */
    public void setZyly(String zyly) {
        this.zyly = zyly == null ? null : zyly.trim();
    }

    /**
     * 邮箱
     * @return EMAIL 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 工作电话
     * @return PHONE 工作电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 工作电话
     * @param phone 工作电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 职务职称
     * @return ZWZC 职务职称
     */
    public String getZwzc() {
        return zwzc;
    }

    /**
     * 职务职称
     * @param zwzc 职务职称
     */
    public void setZwzc(String zwzc) {
        this.zwzc = zwzc == null ? null : zwzc.trim();
    }

    /**
     * 关联项目
     * @return GLXM 关联项目
     */
    public String getGlxm() {
        return glxm;
    }

    /**
     * 关联项目
     * @param glxm 关联项目
     */
    public void setGlxm(String glxm) {
        this.glxm = glxm == null ? null : glxm.trim();
    }

    /**
     * 传真
     * @return CZ 传真
     */
    public String getCz() {
        return cz;
    }

    /**
     * 传真
     * @param cz 传真
     */
    public void setCz(String cz) {
        this.cz = cz == null ? null : cz.trim();
    }

    /**
     * 通信地址
     * @return TXDZ 通信地址
     */
    public String getTxdz() {
        return txdz;
    }

    /**
     * 通信地址
     * @param txdz 通信地址
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
     * 备注
     * @return MEMO 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 备注
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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
     * @mbggenerated 2018-10-28
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
        sb.append(", memo=").append(memo);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}