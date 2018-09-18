package cn.edu.cmu.domain;

import java.math.BigDecimal;
import java.util.Date;

public class CgDqcgj {
    /**
     * 出国(境)id
     */
    private String cgid;

    /**
     * 出国类型 01 在职人员因公短期出国（境）申请、02 校管干部因私短期出国（境）申请  默认在职因公短期出国境
     */
    private String cglx;

    /**
     * 教师姓名
     */
    private String xm;

    /**
     * 性别 从代码表中选择
     */
    private String xb;

    /**
     * 出生日期
     */
    private Date csrq;

    /**
     * 出生地
     */
    private String csd;

    /**
     * 户籍所在地
     */
    private String hjszd;

    /**
     * 身份证号
     */
    private String sfzh;

    /**
     * 所属二级单位
     */
    private String ssejdw;

    /**
     * 科室
     */
    private String ks;

    /**
     * 职务
     */
    private String zw;

    /**
     * 职称
     */
    private String zc;

    /**
     * 联系电话
     */
    private String lxdh;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 出访国家（地区）
     */
    private String cfgj;

    /**
     * 入境城市（地区）
     */
    private String rjcs;

    /**
     * 出访团组id  用于关联团组号，团组名称
     */
    private String tzid;

    /**
     * 出访开始日期
     */
    private Date cfksrq;

    /**
     * 出访结束日期
     */
    private Date cfjsrq;

    /**
     * 出访目的（枚举：01 访问考察、02 学术会议、03 进修培训、04 合作研究、05 学术交流、06 短期讲学、99 其
     */
    private String cfmd;

    /**
     * 出访目的（其他）
     */
    private String cfmdQt;

    /**
     * 邀请人姓名
     */
    private String yqrXm;

    /**
     * 邀请人职务
     */
    private String yqrZw;

    /**
     * 邀请人单位
     */
    private String yqrDw;

    /**
     * 邀请人详细地址
     */
    private String yqrXxdz;

    /**
     * 邀请人电话
     */
    private String yqrDh;

    /**
     * 邀请人姓名——英文
     */
    private String yqrXmEn;

    /**
     * 邀请人职务——英文
     */
    private String yqrZwEn;

    /**
     * 邀请人单位——英文
     */
    private String yqrDwEn;

    /**
     * 邀请人详细地址——英文
     */
    private String yqrXxdzEn;

    /**
     * 邀请人电话——英文
     */
    private String yqrDhEn;

    /**
     * 经费来源
     */
    private String jfly;

    /**
     * 经费预算明细 大段文本，客户填写，国际旅费、住宿费、伙食费、公杂费、其他等
     */
    private String jfysmx;

    /**
     * 经费预算合计金额 由客户手填，记录总的金额信息。
     */
    private BigDecimal jfyshj;

    /**
     * 申请表说明（自然语言描述，用于显示在填表页面、生成的PDF中）  请
     */
    private String sqbsm;

    /**
     * 申请日期
     */
    private Date sqrq;

    /**
     * 状态 暂存、已提交；提交后不能修改
     */
    private String status;

    /**
     * 审核结果分为“ 01 资料需修改、02 资料合格、03 办结”
     */
    private String shjg;

    /**
     * 审核人 教职工工号
     */
    private String shr;

    /**
     * 审核意见
     */
    private String shyj;

    /**
     * 审核日期
     */
    private Date shrq;

    /**
     * 归档文件id 此id为上传文件表的id
     */
    private String gdwjid;

    /**
     * 出访总结报告 回国后自行撰写，定稿后电子版上传至系统；纸版上交国际事务部。
     */
    private String cfzjbgid;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public CgDqcgj(String cgid, String cglx, String xm, String xb, Date csrq, String csd, String hjszd, String sfzh, String ssejdw, String ks, String zw, String zc, String lxdh, String email, String cfgj, String rjcs, String tzid, Date cfksrq, Date cfjsrq, String cfmd, String cfmdQt, String yqrXm, String yqrZw, String yqrDw, String yqrXxdz, String yqrDh, String yqrXmEn, String yqrZwEn, String yqrDwEn, String yqrXxdzEn, String yqrDhEn, String jfly, String jfysmx, BigDecimal jfyshj, String sqbsm, Date sqrq, String status, String shjg, String shr, String shyj, Date shrq, String gdwjid, String cfzjbgid) {
        this.cgid = cgid;
        this.cglx = cglx;
        this.xm = xm;
        this.xb = xb;
        this.csrq = csrq;
        this.csd = csd;
        this.hjszd = hjszd;
        this.sfzh = sfzh;
        this.ssejdw = ssejdw;
        this.ks = ks;
        this.zw = zw;
        this.zc = zc;
        this.lxdh = lxdh;
        this.email = email;
        this.cfgj = cfgj;
        this.rjcs = rjcs;
        this.tzid = tzid;
        this.cfksrq = cfksrq;
        this.cfjsrq = cfjsrq;
        this.cfmd = cfmd;
        this.cfmdQt = cfmdQt;
        this.yqrXm = yqrXm;
        this.yqrZw = yqrZw;
        this.yqrDw = yqrDw;
        this.yqrXxdz = yqrXxdz;
        this.yqrDh = yqrDh;
        this.yqrXmEn = yqrXmEn;
        this.yqrZwEn = yqrZwEn;
        this.yqrDwEn = yqrDwEn;
        this.yqrXxdzEn = yqrXxdzEn;
        this.yqrDhEn = yqrDhEn;
        this.jfly = jfly;
        this.jfysmx = jfysmx;
        this.jfyshj = jfyshj;
        this.sqbsm = sqbsm;
        this.sqrq = sqrq;
        this.status = status;
        this.shjg = shjg;
        this.shr = shr;
        this.shyj = shyj;
        this.shrq = shrq;
        this.gdwjid = gdwjid;
        this.cfzjbgid = cfzjbgid;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public CgDqcgj() {
        super();
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
     * 出国类型 01 在职人员因公短期出国（境）申请、02 校管干部因私短期出国（境）申请  默认在职因公短期出国境
     * @return CGLX 出国类型 01 在职人员因公短期出国（境）申请、02 校管干部因私短期出国（境）申请  默认在职因公短期出国境
     */
    public String getCglx() {
        return cglx;
    }

    /**
     * 出国类型 01 在职人员因公短期出国（境）申请、02 校管干部因私短期出国（境）申请  默认在职因公短期出国境
     * @param cglx 出国类型 01 在职人员因公短期出国（境）申请、02 校管干部因私短期出国（境）申请  默认在职因公短期出国境
     */
    public void setCglx(String cglx) {
        this.cglx = cglx == null ? null : cglx.trim();
    }

    /**
     * 教师姓名
     * @return XM 教师姓名
     */
    public String getXm() {
        return xm;
    }

    /**
     * 教师姓名
     * @param xm 教师姓名
     */
    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    /**
     * 性别 从代码表中选择
     * @return XB 性别 从代码表中选择
     */
    public String getXb() {
        return xb;
    }

    /**
     * 性别 从代码表中选择
     * @param xb 性别 从代码表中选择
     */
    public void setXb(String xb) {
        this.xb = xb == null ? null : xb.trim();
    }

    /**
     * 出生日期
     * @return CSRQ 出生日期
     */
    public Date getCsrq() {
        return csrq;
    }

    /**
     * 出生日期
     * @param csrq 出生日期
     */
    public void setCsrq(Date csrq) {
        this.csrq = csrq;
    }

    /**
     * 出生地
     * @return CSD 出生地
     */
    public String getCsd() {
        return csd;
    }

    /**
     * 出生地
     * @param csd 出生地
     */
    public void setCsd(String csd) {
        this.csd = csd == null ? null : csd.trim();
    }

    /**
     * 户籍所在地
     * @return HJSZD 户籍所在地
     */
    public String getHjszd() {
        return hjszd;
    }

    /**
     * 户籍所在地
     * @param hjszd 户籍所在地
     */
    public void setHjszd(String hjszd) {
        this.hjszd = hjszd == null ? null : hjszd.trim();
    }

    /**
     * 身份证号
     * @return SFZH 身份证号
     */
    public String getSfzh() {
        return sfzh;
    }

    /**
     * 身份证号
     * @param sfzh 身份证号
     */
    public void setSfzh(String sfzh) {
        this.sfzh = sfzh == null ? null : sfzh.trim();
    }

    /**
     * 所属二级单位
     * @return SSEJDW 所属二级单位
     */
    public String getSsejdw() {
        return ssejdw;
    }

    /**
     * 所属二级单位
     * @param ssejdw 所属二级单位
     */
    public void setSsejdw(String ssejdw) {
        this.ssejdw = ssejdw == null ? null : ssejdw.trim();
    }

    /**
     * 科室
     * @return KS 科室
     */
    public String getKs() {
        return ks;
    }

    /**
     * 科室
     * @param ks 科室
     */
    public void setKs(String ks) {
        this.ks = ks == null ? null : ks.trim();
    }

    /**
     * 职务
     * @return ZW 职务
     */
    public String getZw() {
        return zw;
    }

    /**
     * 职务
     * @param zw 职务
     */
    public void setZw(String zw) {
        this.zw = zw == null ? null : zw.trim();
    }

    /**
     * 职称
     * @return ZC 职称
     */
    public String getZc() {
        return zc;
    }

    /**
     * 职称
     * @param zc 职称
     */
    public void setZc(String zc) {
        this.zc = zc == null ? null : zc.trim();
    }

    /**
     * 联系电话
     * @return LXDH 联系电话
     */
    public String getLxdh() {
        return lxdh;
    }

    /**
     * 联系电话
     * @param lxdh 联系电话
     */
    public void setLxdh(String lxdh) {
        this.lxdh = lxdh == null ? null : lxdh.trim();
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
     * 出访国家（地区）
     * @return CFGJ 出访国家（地区）
     */
    public String getCfgj() {
        return cfgj;
    }

    /**
     * 出访国家（地区）
     * @param cfgj 出访国家（地区）
     */
    public void setCfgj(String cfgj) {
        this.cfgj = cfgj == null ? null : cfgj.trim();
    }

    /**
     * 入境城市（地区）
     * @return RJCS 入境城市（地区）
     */
    public String getRjcs() {
        return rjcs;
    }

    /**
     * 入境城市（地区）
     * @param rjcs 入境城市（地区）
     */
    public void setRjcs(String rjcs) {
        this.rjcs = rjcs == null ? null : rjcs.trim();
    }

    /**
     * 出访团组id  用于关联团组号，团组名称
     * @return TZID 出访团组id  用于关联团组号，团组名称
     */
    public String getTzid() {
        return tzid;
    }

    /**
     * 出访团组id  用于关联团组号，团组名称
     * @param tzid 出访团组id  用于关联团组号，团组名称
     */
    public void setTzid(String tzid) {
        this.tzid = tzid == null ? null : tzid.trim();
    }

    /**
     * 出访开始日期
     * @return CFKSRQ 出访开始日期
     */
    public Date getCfksrq() {
        return cfksrq;
    }

    /**
     * 出访开始日期
     * @param cfksrq 出访开始日期
     */
    public void setCfksrq(Date cfksrq) {
        this.cfksrq = cfksrq;
    }

    /**
     * 出访结束日期
     * @return CFJSRQ 出访结束日期
     */
    public Date getCfjsrq() {
        return cfjsrq;
    }

    /**
     * 出访结束日期
     * @param cfjsrq 出访结束日期
     */
    public void setCfjsrq(Date cfjsrq) {
        this.cfjsrq = cfjsrq;
    }

    /**
     * 出访目的（枚举：01 访问考察、02 学术会议、03 进修培训、04 合作研究、05 学术交流、06 短期讲学、99 其
     * @return CFMD 出访目的（枚举：01 访问考察、02 学术会议、03 进修培训、04 合作研究、05 学术交流、06 短期讲学、99 其
     */
    public String getCfmd() {
        return cfmd;
    }

    /**
     * 出访目的（枚举：01 访问考察、02 学术会议、03 进修培训、04 合作研究、05 学术交流、06 短期讲学、99 其
     * @param cfmd 出访目的（枚举：01 访问考察、02 学术会议、03 进修培训、04 合作研究、05 学术交流、06 短期讲学、99 其
     */
    public void setCfmd(String cfmd) {
        this.cfmd = cfmd == null ? null : cfmd.trim();
    }

    /**
     * 出访目的（其他）
     * @return CFMD_QT 出访目的（其他）
     */
    public String getCfmdQt() {
        return cfmdQt;
    }

    /**
     * 出访目的（其他）
     * @param cfmdQt 出访目的（其他）
     */
    public void setCfmdQt(String cfmdQt) {
        this.cfmdQt = cfmdQt == null ? null : cfmdQt.trim();
    }

    /**
     * 邀请人姓名
     * @return YQR_XM 邀请人姓名
     */
    public String getYqrXm() {
        return yqrXm;
    }

    /**
     * 邀请人姓名
     * @param yqrXm 邀请人姓名
     */
    public void setYqrXm(String yqrXm) {
        this.yqrXm = yqrXm == null ? null : yqrXm.trim();
    }

    /**
     * 邀请人职务
     * @return YQR_ZW 邀请人职务
     */
    public String getYqrZw() {
        return yqrZw;
    }

    /**
     * 邀请人职务
     * @param yqrZw 邀请人职务
     */
    public void setYqrZw(String yqrZw) {
        this.yqrZw = yqrZw == null ? null : yqrZw.trim();
    }

    /**
     * 邀请人单位
     * @return YQR_DW 邀请人单位
     */
    public String getYqrDw() {
        return yqrDw;
    }

    /**
     * 邀请人单位
     * @param yqrDw 邀请人单位
     */
    public void setYqrDw(String yqrDw) {
        this.yqrDw = yqrDw == null ? null : yqrDw.trim();
    }

    /**
     * 邀请人详细地址
     * @return YQR_XXDZ 邀请人详细地址
     */
    public String getYqrXxdz() {
        return yqrXxdz;
    }

    /**
     * 邀请人详细地址
     * @param yqrXxdz 邀请人详细地址
     */
    public void setYqrXxdz(String yqrXxdz) {
        this.yqrXxdz = yqrXxdz == null ? null : yqrXxdz.trim();
    }

    /**
     * 邀请人电话
     * @return YQR_DH 邀请人电话
     */
    public String getYqrDh() {
        return yqrDh;
    }

    /**
     * 邀请人电话
     * @param yqrDh 邀请人电话
     */
    public void setYqrDh(String yqrDh) {
        this.yqrDh = yqrDh == null ? null : yqrDh.trim();
    }

    /**
     * 邀请人姓名——英文
     * @return YQR_XM_EN 邀请人姓名——英文
     */
    public String getYqrXmEn() {
        return yqrXmEn;
    }

    /**
     * 邀请人姓名——英文
     * @param yqrXmEn 邀请人姓名——英文
     */
    public void setYqrXmEn(String yqrXmEn) {
        this.yqrXmEn = yqrXmEn == null ? null : yqrXmEn.trim();
    }

    /**
     * 邀请人职务——英文
     * @return YQR_ZW_EN 邀请人职务——英文
     */
    public String getYqrZwEn() {
        return yqrZwEn;
    }

    /**
     * 邀请人职务——英文
     * @param yqrZwEn 邀请人职务——英文
     */
    public void setYqrZwEn(String yqrZwEn) {
        this.yqrZwEn = yqrZwEn == null ? null : yqrZwEn.trim();
    }

    /**
     * 邀请人单位——英文
     * @return YQR_DW_EN 邀请人单位——英文
     */
    public String getYqrDwEn() {
        return yqrDwEn;
    }

    /**
     * 邀请人单位——英文
     * @param yqrDwEn 邀请人单位——英文
     */
    public void setYqrDwEn(String yqrDwEn) {
        this.yqrDwEn = yqrDwEn == null ? null : yqrDwEn.trim();
    }

    /**
     * 邀请人详细地址——英文
     * @return YQR_XXDZ_EN 邀请人详细地址——英文
     */
    public String getYqrXxdzEn() {
        return yqrXxdzEn;
    }

    /**
     * 邀请人详细地址——英文
     * @param yqrXxdzEn 邀请人详细地址——英文
     */
    public void setYqrXxdzEn(String yqrXxdzEn) {
        this.yqrXxdzEn = yqrXxdzEn == null ? null : yqrXxdzEn.trim();
    }

    /**
     * 邀请人电话——英文
     * @return YQR_DH_EN 邀请人电话——英文
     */
    public String getYqrDhEn() {
        return yqrDhEn;
    }

    /**
     * 邀请人电话——英文
     * @param yqrDhEn 邀请人电话——英文
     */
    public void setYqrDhEn(String yqrDhEn) {
        this.yqrDhEn = yqrDhEn == null ? null : yqrDhEn.trim();
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
     * 经费预算明细 大段文本，客户填写，国际旅费、住宿费、伙食费、公杂费、其他等
     * @return JFYSMX 经费预算明细 大段文本，客户填写，国际旅费、住宿费、伙食费、公杂费、其他等
     */
    public String getJfysmx() {
        return jfysmx;
    }

    /**
     * 经费预算明细 大段文本，客户填写，国际旅费、住宿费、伙食费、公杂费、其他等
     * @param jfysmx 经费预算明细 大段文本，客户填写，国际旅费、住宿费、伙食费、公杂费、其他等
     */
    public void setJfysmx(String jfysmx) {
        this.jfysmx = jfysmx == null ? null : jfysmx.trim();
    }

    /**
     * 经费预算合计金额 由客户手填，记录总的金额信息。
     * @return JFYSHJ 经费预算合计金额 由客户手填，记录总的金额信息。
     */
    public BigDecimal getJfyshj() {
        return jfyshj;
    }

    /**
     * 经费预算合计金额 由客户手填，记录总的金额信息。
     * @param jfyshj 经费预算合计金额 由客户手填，记录总的金额信息。
     */
    public void setJfyshj(BigDecimal jfyshj) {
        this.jfyshj = jfyshj;
    }

    /**
     * 申请表说明（自然语言描述，用于显示在填表页面、生成的PDF中）  请
     * @return SQBSM 申请表说明（自然语言描述，用于显示在填表页面、生成的PDF中）  请
     */
    public String getSqbsm() {
        return sqbsm;
    }

    /**
     * 申请表说明（自然语言描述，用于显示在填表页面、生成的PDF中）  请
     * @param sqbsm 申请表说明（自然语言描述，用于显示在填表页面、生成的PDF中）  请
     */
    public void setSqbsm(String sqbsm) {
        this.sqbsm = sqbsm == null ? null : sqbsm.trim();
    }

    /**
     * 申请日期
     * @return SQRQ 申请日期
     */
    public Date getSqrq() {
        return sqrq;
    }

    /**
     * 申请日期
     * @param sqrq 申请日期
     */
    public void setSqrq(Date sqrq) {
        this.sqrq = sqrq;
    }

    /**
     * 状态 暂存、已提交；提交后不能修改
     * @return STATUS 状态 暂存、已提交；提交后不能修改
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态 暂存、已提交；提交后不能修改
     * @param status 状态 暂存、已提交；提交后不能修改
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 审核结果分为“ 01 资料需修改、02 资料合格、03 办结”
     * @return SHJG 审核结果分为“ 01 资料需修改、02 资料合格、03 办结”
     */
    public String getShjg() {
        return shjg;
    }

    /**
     * 审核结果分为“ 01 资料需修改、02 资料合格、03 办结”
     * @param shjg 审核结果分为“ 01 资料需修改、02 资料合格、03 办结”
     */
    public void setShjg(String shjg) {
        this.shjg = shjg == null ? null : shjg.trim();
    }

    /**
     * 审核人 教职工工号
     * @return SHR 审核人 教职工工号
     */
    public String getShr() {
        return shr;
    }

    /**
     * 审核人 教职工工号
     * @param shr 审核人 教职工工号
     */
    public void setShr(String shr) {
        this.shr = shr == null ? null : shr.trim();
    }

    /**
     * 审核意见
     * @return SHYJ 审核意见
     */
    public String getShyj() {
        return shyj;
    }

    /**
     * 审核意见
     * @param shyj 审核意见
     */
    public void setShyj(String shyj) {
        this.shyj = shyj == null ? null : shyj.trim();
    }

    /**
     * 审核日期
     * @return SHRQ 审核日期
     */
    public Date getShrq() {
        return shrq;
    }

    /**
     * 审核日期
     * @param shrq 审核日期
     */
    public void setShrq(Date shrq) {
        this.shrq = shrq;
    }

    /**
     * 归档文件id 此id为上传文件表的id
     * @return GDWJID 归档文件id 此id为上传文件表的id
     */
    public String getGdwjid() {
        return gdwjid;
    }

    /**
     * 归档文件id 此id为上传文件表的id
     * @param gdwjid 归档文件id 此id为上传文件表的id
     */
    public void setGdwjid(String gdwjid) {
        this.gdwjid = gdwjid == null ? null : gdwjid.trim();
    }

    /**
     * 出访总结报告 回国后自行撰写，定稿后电子版上传至系统；纸版上交国际事务部。
     * @return CFZJBGID 出访总结报告 回国后自行撰写，定稿后电子版上传至系统；纸版上交国际事务部。
     */
    public String getCfzjbgid() {
        return cfzjbgid;
    }

    /**
     * 出访总结报告 回国后自行撰写，定稿后电子版上传至系统；纸版上交国际事务部。
     * @param cfzjbgid 出访总结报告 回国后自行撰写，定稿后电子版上传至系统；纸版上交国际事务部。
     */
    public void setCfzjbgid(String cfzjbgid) {
        this.cfzjbgid = cfzjbgid == null ? null : cfzjbgid.trim();
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cgid=").append(cgid);
        sb.append(", cglx=").append(cglx);
        sb.append(", xm=").append(xm);
        sb.append(", xb=").append(xb);
        sb.append(", csrq=").append(csrq);
        sb.append(", csd=").append(csd);
        sb.append(", hjszd=").append(hjszd);
        sb.append(", sfzh=").append(sfzh);
        sb.append(", ssejdw=").append(ssejdw);
        sb.append(", ks=").append(ks);
        sb.append(", zw=").append(zw);
        sb.append(", zc=").append(zc);
        sb.append(", lxdh=").append(lxdh);
        sb.append(", email=").append(email);
        sb.append(", cfgj=").append(cfgj);
        sb.append(", rjcs=").append(rjcs);
        sb.append(", tzid=").append(tzid);
        sb.append(", cfksrq=").append(cfksrq);
        sb.append(", cfjsrq=").append(cfjsrq);
        sb.append(", cfmd=").append(cfmd);
        sb.append(", cfmdQt=").append(cfmdQt);
        sb.append(", yqrXm=").append(yqrXm);
        sb.append(", yqrZw=").append(yqrZw);
        sb.append(", yqrDw=").append(yqrDw);
        sb.append(", yqrXxdz=").append(yqrXxdz);
        sb.append(", yqrDh=").append(yqrDh);
        sb.append(", yqrXmEn=").append(yqrXmEn);
        sb.append(", yqrZwEn=").append(yqrZwEn);
        sb.append(", yqrDwEn=").append(yqrDwEn);
        sb.append(", yqrXxdzEn=").append(yqrXxdzEn);
        sb.append(", yqrDhEn=").append(yqrDhEn);
        sb.append(", jfly=").append(jfly);
        sb.append(", jfysmx=").append(jfysmx);
        sb.append(", jfyshj=").append(jfyshj);
        sb.append(", sqbsm=").append(sqbsm);
        sb.append(", sqrq=").append(sqrq);
        sb.append(", status=").append(status);
        sb.append(", shjg=").append(shjg);
        sb.append(", shr=").append(shr);
        sb.append(", shyj=").append(shyj);
        sb.append(", shrq=").append(shrq);
        sb.append(", gdwjid=").append(gdwjid);
        sb.append(", cfzjbgid=").append(cfzjbgid);
        sb.append("]");
        return sb.toString();
    }
}