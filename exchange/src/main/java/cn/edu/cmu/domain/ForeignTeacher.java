package cn.edu.cmu.domain;

import java.util.Date;

public class ForeignTeacher {
    /**
     * 教师id
     */
    private String tid;

    /**
     * 工号
     */
    private String gh;

    /**
     * 教师姓名
     */
    private String jsx;

    /**
     * 教师性别
     */
    private String jsm;

    /**
     * 语种
     */
    private String chineseName;

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
     * 婚姻状况
     */
    private String hyzk;

    /**
     * 护照类型
     */
    private String hzlx;

    /**
     * 护照号码
     */
    private String hzh;

    /**
     * 护照签发日期
     */
    private Date hzqfrq;

    /**
     * 护照有效期至
     */
    private Date hzyxq;

    /**
     * 最高学位（学历）
     */
    private String zgxw;

    /**
     * 汉语水平
     */
    private String hysp;

    /**
     * 申请人电子邮箱
     */
    private String email;

    /**
     * 所有曾授予你护照的国家
     */
    private String syccsyhzgj;

    /**
     * 工作岗位（职业）
     */
    private String gzgw;

    /**
     * 聘用合同/任职证明在华工作开始时间
     */
    private Date rzzmsj;

    /**
     * 申请在中国工作职务
     */
    private String gzzw;

    /**
     * 申请在华工作时间开始
     */
    private Date gzsjStart;

    /**
     * 申请在华工作时间结束
     */
    private Date gzsjEnd;

    /**
     * 在中国工作电话
     */
    private String phone;

    /**
     * 是否是HR ，Y从HR导入
     */
    private String hr;

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
     * @mbggenerated 2018-11-22
     */
    public ForeignTeacher(String tid, String gh, String jsx, String jsm, String chineseName, String gender, String gj, Date birthday, String hyzk, String hzlx, String hzh, Date hzqfrq, Date hzyxq, String zgxw, String hysp, String email, String syccsyhzgj, String gzgw, Date rzzmsj, String gzzw, Date gzsjStart, Date gzsjEnd, String phone, String hr, String valid, Date createTime) {
        this.tid = tid;
        this.gh = gh;
        this.jsx = jsx;
        this.jsm = jsm;
        this.chineseName = chineseName;
        this.gender = gender;
        this.gj = gj;
        this.birthday = birthday;
        this.hyzk = hyzk;
        this.hzlx = hzlx;
        this.hzh = hzh;
        this.hzqfrq = hzqfrq;
        this.hzyxq = hzyxq;
        this.zgxw = zgxw;
        this.hysp = hysp;
        this.email = email;
        this.syccsyhzgj = syccsyhzgj;
        this.gzgw = gzgw;
        this.rzzmsj = rzzmsj;
        this.gzzw = gzzw;
        this.gzsjStart = gzsjStart;
        this.gzsjEnd = gzsjEnd;
        this.phone = phone;
        this.hr = hr;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-11-22
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
     * 工号
     * @return GH 工号
     */
    public String getGh() {
        return gh;
    }

    /**
     * 工号
     * @param gh 工号
     */
    public void setGh(String gh) {
        this.gh = gh == null ? null : gh.trim();
    }

    /**
     * 教师姓名
     * @return JSX 教师姓名
     */
    public String getJsx() {
        return jsx;
    }

    /**
     * 教师姓名
     * @param jsx 教师姓名
     */
    public void setJsx(String jsx) {
        this.jsx = jsx == null ? null : jsx.trim();
    }

    /**
     * 教师性别
     * @return JSM 教师性别
     */
    public String getJsm() {
        return jsm;
    }

    /**
     * 教师性别
     * @param jsm 教师性别
     */
    public void setJsm(String jsm) {
        this.jsm = jsm == null ? null : jsm.trim();
    }

    /**
     * 语种
     * @return CHINESE_NAME 语种
     */
    public String getChineseName() {
        return chineseName;
    }

    /**
     * 语种
     * @param chineseName 语种
     */
    public void setChineseName(String chineseName) {
        this.chineseName = chineseName == null ? null : chineseName.trim();
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
     * 婚姻状况
     * @return HYZK 婚姻状况
     */
    public String getHyzk() {
        return hyzk;
    }

    /**
     * 婚姻状况
     * @param hyzk 婚姻状况
     */
    public void setHyzk(String hyzk) {
        this.hyzk = hyzk == null ? null : hyzk.trim();
    }

    /**
     * 护照类型
     * @return HZLX 护照类型
     */
    public String getHzlx() {
        return hzlx;
    }

    /**
     * 护照类型
     * @param hzlx 护照类型
     */
    public void setHzlx(String hzlx) {
        this.hzlx = hzlx == null ? null : hzlx.trim();
    }

    /**
     * 护照号码
     * @return HZH 护照号码
     */
    public String getHzh() {
        return hzh;
    }

    /**
     * 护照号码
     * @param hzh 护照号码
     */
    public void setHzh(String hzh) {
        this.hzh = hzh == null ? null : hzh.trim();
    }

    /**
     * 护照签发日期
     * @return HZQFRQ 护照签发日期
     */
    public Date getHzqfrq() {
        return hzqfrq;
    }

    /**
     * 护照签发日期
     * @param hzqfrq 护照签发日期
     */
    public void setHzqfrq(Date hzqfrq) {
        this.hzqfrq = hzqfrq;
    }

    /**
     * 护照有效期至
     * @return HZYXQ 护照有效期至
     */
    public Date getHzyxq() {
        return hzyxq;
    }

    /**
     * 护照有效期至
     * @param hzyxq 护照有效期至
     */
    public void setHzyxq(Date hzyxq) {
        this.hzyxq = hzyxq;
    }

    /**
     * 最高学位（学历）
     * @return ZGXW 最高学位（学历）
     */
    public String getZgxw() {
        return zgxw;
    }

    /**
     * 最高学位（学历）
     * @param zgxw 最高学位（学历）
     */
    public void setZgxw(String zgxw) {
        this.zgxw = zgxw == null ? null : zgxw.trim();
    }

    /**
     * 汉语水平
     * @return HYSP 汉语水平
     */
    public String getHysp() {
        return hysp;
    }

    /**
     * 汉语水平
     * @param hysp 汉语水平
     */
    public void setHysp(String hysp) {
        this.hysp = hysp == null ? null : hysp.trim();
    }

    /**
     * 申请人电子邮箱
     * @return EMAIL 申请人电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 申请人电子邮箱
     * @param email 申请人电子邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 所有曾授予你护照的国家
     * @return SYCCSYHZGJ 所有曾授予你护照的国家
     */
    public String getSyccsyhzgj() {
        return syccsyhzgj;
    }

    /**
     * 所有曾授予你护照的国家
     * @param syccsyhzgj 所有曾授予你护照的国家
     */
    public void setSyccsyhzgj(String syccsyhzgj) {
        this.syccsyhzgj = syccsyhzgj == null ? null : syccsyhzgj.trim();
    }

    /**
     * 工作岗位（职业）
     * @return GZGW 工作岗位（职业）
     */
    public String getGzgw() {
        return gzgw;
    }

    /**
     * 工作岗位（职业）
     * @param gzgw 工作岗位（职业）
     */
    public void setGzgw(String gzgw) {
        this.gzgw = gzgw == null ? null : gzgw.trim();
    }

    /**
     * 聘用合同/任职证明在华工作开始时间
     * @return RZZMSJ 聘用合同/任职证明在华工作开始时间
     */
    public Date getRzzmsj() {
        return rzzmsj;
    }

    /**
     * 聘用合同/任职证明在华工作开始时间
     * @param rzzmsj 聘用合同/任职证明在华工作开始时间
     */
    public void setRzzmsj(Date rzzmsj) {
        this.rzzmsj = rzzmsj;
    }

    /**
     * 申请在中国工作职务
     * @return GZZW 申请在中国工作职务
     */
    public String getGzzw() {
        return gzzw;
    }

    /**
     * 申请在中国工作职务
     * @param gzzw 申请在中国工作职务
     */
    public void setGzzw(String gzzw) {
        this.gzzw = gzzw == null ? null : gzzw.trim();
    }

    /**
     * 申请在华工作时间开始
     * @return GZSJ_START 申请在华工作时间开始
     */
    public Date getGzsjStart() {
        return gzsjStart;
    }

    /**
     * 申请在华工作时间开始
     * @param gzsjStart 申请在华工作时间开始
     */
    public void setGzsjStart(Date gzsjStart) {
        this.gzsjStart = gzsjStart;
    }

    /**
     * 申请在华工作时间结束
     * @return GZSJ_END 申请在华工作时间结束
     */
    public Date getGzsjEnd() {
        return gzsjEnd;
    }

    /**
     * 申请在华工作时间结束
     * @param gzsjEnd 申请在华工作时间结束
     */
    public void setGzsjEnd(Date gzsjEnd) {
        this.gzsjEnd = gzsjEnd;
    }

    /**
     * 在中国工作电话
     * @return PHONE 在中国工作电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 在中国工作电话
     * @param phone 在中国工作电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 是否是HR ，Y从HR导入
     * @return HR 是否是HR ，Y从HR导入
     */
    public String getHr() {
        return hr;
    }

    /**
     * 是否是HR ，Y从HR导入
     * @param hr 是否是HR ，Y从HR导入
     */
    public void setHr(String hr) {
        this.hr = hr == null ? null : hr.trim();
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
     * @mbggenerated 2018-11-22
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tid=").append(tid);
        sb.append(", gh=").append(gh);
        sb.append(", jsx=").append(jsx);
        sb.append(", jsm=").append(jsm);
        sb.append(", chineseName=").append(chineseName);
        sb.append(", gender=").append(gender);
        sb.append(", gj=").append(gj);
        sb.append(", birthday=").append(birthday);
        sb.append(", hyzk=").append(hyzk);
        sb.append(", hzlx=").append(hzlx);
        sb.append(", hzh=").append(hzh);
        sb.append(", hzqfrq=").append(hzqfrq);
        sb.append(", hzyxq=").append(hzyxq);
        sb.append(", zgxw=").append(zgxw);
        sb.append(", hysp=").append(hysp);
        sb.append(", email=").append(email);
        sb.append(", syccsyhzgj=").append(syccsyhzgj);
        sb.append(", gzgw=").append(gzgw);
        sb.append(", rzzmsj=").append(rzzmsj);
        sb.append(", gzzw=").append(gzzw);
        sb.append(", gzsjStart=").append(gzsjStart);
        sb.append(", gzsjEnd=").append(gzsjEnd);
        sb.append(", phone=").append(phone);
        sb.append(", hr=").append(hr);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}