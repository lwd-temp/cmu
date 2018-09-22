package cn.edu.cmu.domain;

import java.util.Date;

public class Contact {
    /**
     * 联系人id
     */
    private String lxrId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 国籍
     */
    private String gj;

    /**
     * 语种
     */
    private String yz;

    /**
     * 工作单位
     */
    private String gzdw;

    /**
     * 职务职称
     */
    private String zwzc;

    /**
     * 专业领域
     */
    private String zyly;

    /**
     * 关联项目
     */
    private String glxm;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 传真
     */
    private String fax;

    /**
     * 工作电话
     */
    private String telphone;

    /**
     * 通信地址
     */
    private String address;

    /**
     * 备注
     */
    private String remark;

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
    public Contact(String lxrId, String name, String gender, String gj, String yz, String gzdw, String zwzc, String zyly, String glxm, String email, String fax, String telphone, String address, String remark, String valid, Date createTime) {
        this.lxrId = lxrId;
        this.name = name;
        this.gender = gender;
        this.gj = gj;
        this.yz = yz;
        this.gzdw = gzdw;
        this.zwzc = zwzc;
        this.zyly = zyly;
        this.glxm = glxm;
        this.email = email;
        this.fax = fax;
        this.telphone = telphone;
        this.address = address;
        this.remark = remark;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-22
     */
    public Contact() {
        super();
    }

    /**
     * 联系人id
     * @return LXR_ID 联系人id
     */
    public String getLxrId() {
        return lxrId;
    }

    /**
     * 联系人id
     * @param lxrId 联系人id
     */
    public void setLxrId(String lxrId) {
        this.lxrId = lxrId == null ? null : lxrId.trim();
    }

    /**
     * 姓名
     * @return NAME 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     * 语种
     * @return YZ 语种
     */
    public String getYz() {
        return yz;
    }

    /**
     * 语种
     * @param yz 语种
     */
    public void setYz(String yz) {
        this.yz = yz == null ? null : yz.trim();
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
     * 传真
     * @return FAX 传真
     */
    public String getFax() {
        return fax;
    }

    /**
     * 传真
     * @param fax 传真
     */
    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    /**
     * 工作电话
     * @return TELPHONE 工作电话
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * 工作电话
     * @param telphone 工作电话
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    /**
     * 通信地址
     * @return ADDRESS 通信地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 通信地址
     * @param address 通信地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 备注
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        sb.append(", lxrId=").append(lxrId);
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", gj=").append(gj);
        sb.append(", yz=").append(yz);
        sb.append(", gzdw=").append(gzdw);
        sb.append(", zwzc=").append(zwzc);
        sb.append(", zyly=").append(zyly);
        sb.append(", glxm=").append(glxm);
        sb.append(", email=").append(email);
        sb.append(", fax=").append(fax);
        sb.append(", telphone=").append(telphone);
        sb.append(", address=").append(address);
        sb.append(", remark=").append(remark);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}