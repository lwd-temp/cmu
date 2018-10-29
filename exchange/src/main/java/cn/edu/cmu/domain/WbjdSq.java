package cn.edu.cmu.domain;

import java.math.BigDecimal;
import java.util.Date;

public class WbjdSq {
    /**
     * 来访id
     */
    private String lfid;

    /**
     * 代表团名称
     */
    private String dbtmc;

    /**
     * 来访人数
     */
    private BigDecimal lfrs;

    /**
     * 来访时间
     */
    private Date lfsjStart;

    /**
     * 来访时间止
     */
    private Date lfsjEnd;

    /**
     * 停留时间（时间开始）
     */
    private Date tlsjStart;

    /**
     * 停留时间（时间结束）
     */
    private Date tlsjEnd;

    /**
     * 来访目的（ 01 友好访问、02 科研合作、-03 学术讲座（填写演讲题目，非必填）、04 荣誉职称、05 其他）
     */
    private String lfmd;

    /**
     * 其他请文字说明
     */
    private String lfmdQt;

    /**
     * 演讲题目
     */
    private String yjtm;

    /**
     * 邀请信息
     */
    private String yqxx;

    /**
     * 经费来源
     */
    private String jfly;

    /**
     * 礼品
     */
    private String lp;

    /**
     * 礼品数量
     */
    private BigDecimal lpsl;

    /**
     * 情况记录（领导接见等）
     */
    private String qkjl;

    /**
     * 访问成果
     */
    private String fwcg;

    /**
     * 团长姓名
     */
    private String tzxm;

    /**
     * 团长国籍
     */
    private String tzgj;

    /**
     * 团长性别
     */
    private String tzxb;

    /**
     * 团长出生日期
     */
    private Date tzcsrq;

    /**
     * 团长工作单位
     */
    private String tzgzdw;

    /**
     * 团长职称
     */
    private String tzzc;

    /**
     * 团长职务
     */
    private String tzzw;

    /**
     * 团长专业
     */
    private String tzzy;

    /**
     * 团长学术领域
     */
    private String tzxsly;

    /**
     * 预期成果
     */
    private String yqcg;

    /**
     * 主请人姓名
     */
    private String zqrxm;

    /**
     * 主请人电话
     */
    private String zqrdh;

    /**
     * 主请联系人姓名
     */
    private String zqlxrxm;

    /**
     * 主请联系人电话
     */
    private String zqlxrdh;

    /**
     * 接待部门 j机构id
     */
    private String jdbm;

    /**
     * 是否邀请校领导
     */
    private String ynYqxld;

    /**
     * 是否获学院同意
     */
    private String ynXyty;

    /**
     * 是否报备所属公安部门
     */
    private String ynBbssgabm;

    /**
     * 是否报备所属宣传部门
     */
    private String ynBbssxcbm;

    /**
     * 接待类型   01 校级接待、02 院级接待
     */
    private String jdlx;

    /**
     * 状态 01 资料需修改、02 资料合格、03 办结
     */
    private String status;

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
    public WbjdSq(String lfid, String dbtmc, BigDecimal lfrs, Date lfsjStart, Date lfsjEnd, Date tlsjStart, Date tlsjEnd, String lfmd, String lfmdQt, String yjtm, String yqxx, String jfly, String lp, BigDecimal lpsl, String qkjl, String fwcg, String tzxm, String tzgj, String tzxb, Date tzcsrq, String tzgzdw, String tzzc, String tzzw, String tzzy, String tzxsly, String yqcg, String zqrxm, String zqrdh, String zqlxrxm, String zqlxrdh, String jdbm, String ynYqxld, String ynXyty, String ynBbssgabm, String ynBbssxcbm, String jdlx, String status, String memo, String valid, Date createTime) {
        this.lfid = lfid;
        this.dbtmc = dbtmc;
        this.lfrs = lfrs;
        this.lfsjStart = lfsjStart;
        this.lfsjEnd = lfsjEnd;
        this.tlsjStart = tlsjStart;
        this.tlsjEnd = tlsjEnd;
        this.lfmd = lfmd;
        this.lfmdQt = lfmdQt;
        this.yjtm = yjtm;
        this.yqxx = yqxx;
        this.jfly = jfly;
        this.lp = lp;
        this.lpsl = lpsl;
        this.qkjl = qkjl;
        this.fwcg = fwcg;
        this.tzxm = tzxm;
        this.tzgj = tzgj;
        this.tzxb = tzxb;
        this.tzcsrq = tzcsrq;
        this.tzgzdw = tzgzdw;
        this.tzzc = tzzc;
        this.tzzw = tzzw;
        this.tzzy = tzzy;
        this.tzxsly = tzxsly;
        this.yqcg = yqcg;
        this.zqrxm = zqrxm;
        this.zqrdh = zqrdh;
        this.zqlxrxm = zqlxrxm;
        this.zqlxrdh = zqlxrdh;
        this.jdbm = jdbm;
        this.ynYqxld = ynYqxld;
        this.ynXyty = ynXyty;
        this.ynBbssgabm = ynBbssgabm;
        this.ynBbssxcbm = ynBbssxcbm;
        this.jdlx = jdlx;
        this.status = status;
        this.memo = memo;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-10-28
     */
    public WbjdSq() {
        super();
    }

    /**
     * 来访id
     * @return LFID 来访id
     */
    public String getLfid() {
        return lfid;
    }

    /**
     * 来访id
     * @param lfid 来访id
     */
    public void setLfid(String lfid) {
        this.lfid = lfid == null ? null : lfid.trim();
    }

    /**
     * 代表团名称
     * @return DBTMC 代表团名称
     */
    public String getDbtmc() {
        return dbtmc;
    }

    /**
     * 代表团名称
     * @param dbtmc 代表团名称
     */
    public void setDbtmc(String dbtmc) {
        this.dbtmc = dbtmc == null ? null : dbtmc.trim();
    }

    /**
     * 来访人数
     * @return LFRS 来访人数
     */
    public BigDecimal getLfrs() {
        return lfrs;
    }

    /**
     * 来访人数
     * @param lfrs 来访人数
     */
    public void setLfrs(BigDecimal lfrs) {
        this.lfrs = lfrs;
    }

    /**
     * 来访时间
     * @return LFSJ_START 来访时间
     */
    public Date getLfsjStart() {
        return lfsjStart;
    }

    /**
     * 来访时间
     * @param lfsjStart 来访时间
     */
    public void setLfsjStart(Date lfsjStart) {
        this.lfsjStart = lfsjStart;
    }

    /**
     * 来访时间止
     * @return LFSJ_END 来访时间止
     */
    public Date getLfsjEnd() {
        return lfsjEnd;
    }

    /**
     * 来访时间止
     * @param lfsjEnd 来访时间止
     */
    public void setLfsjEnd(Date lfsjEnd) {
        this.lfsjEnd = lfsjEnd;
    }

    /**
     * 停留时间（时间开始）
     * @return TLSJ_START 停留时间（时间开始）
     */
    public Date getTlsjStart() {
        return tlsjStart;
    }

    /**
     * 停留时间（时间开始）
     * @param tlsjStart 停留时间（时间开始）
     */
    public void setTlsjStart(Date tlsjStart) {
        this.tlsjStart = tlsjStart;
    }

    /**
     * 停留时间（时间结束）
     * @return TLSJ_END 停留时间（时间结束）
     */
    public Date getTlsjEnd() {
        return tlsjEnd;
    }

    /**
     * 停留时间（时间结束）
     * @param tlsjEnd 停留时间（时间结束）
     */
    public void setTlsjEnd(Date tlsjEnd) {
        this.tlsjEnd = tlsjEnd;
    }

    /**
     * 来访目的（ 01 友好访问、02 科研合作、-03 学术讲座（填写演讲题目，非必填）、04 荣誉职称、05 其他）
     * @return LFMD 来访目的（ 01 友好访问、02 科研合作、-03 学术讲座（填写演讲题目，非必填）、04 荣誉职称、05 其他）
     */
    public String getLfmd() {
        return lfmd;
    }

    /**
     * 来访目的（ 01 友好访问、02 科研合作、-03 学术讲座（填写演讲题目，非必填）、04 荣誉职称、05 其他）
     * @param lfmd 来访目的（ 01 友好访问、02 科研合作、-03 学术讲座（填写演讲题目，非必填）、04 荣誉职称、05 其他）
     */
    public void setLfmd(String lfmd) {
        this.lfmd = lfmd == null ? null : lfmd.trim();
    }

    /**
     * 其他请文字说明
     * @return LFMD_QT 其他请文字说明
     */
    public String getLfmdQt() {
        return lfmdQt;
    }

    /**
     * 其他请文字说明
     * @param lfmdQt 其他请文字说明
     */
    public void setLfmdQt(String lfmdQt) {
        this.lfmdQt = lfmdQt == null ? null : lfmdQt.trim();
    }

    /**
     * 演讲题目
     * @return YJTM 演讲题目
     */
    public String getYjtm() {
        return yjtm;
    }

    /**
     * 演讲题目
     * @param yjtm 演讲题目
     */
    public void setYjtm(String yjtm) {
        this.yjtm = yjtm == null ? null : yjtm.trim();
    }

    /**
     * 邀请信息
     * @return YQXX 邀请信息
     */
    public String getYqxx() {
        return yqxx;
    }

    /**
     * 邀请信息
     * @param yqxx 邀请信息
     */
    public void setYqxx(String yqxx) {
        this.yqxx = yqxx == null ? null : yqxx.trim();
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
     * 礼品
     * @return LP 礼品
     */
    public String getLp() {
        return lp;
    }

    /**
     * 礼品
     * @param lp 礼品
     */
    public void setLp(String lp) {
        this.lp = lp == null ? null : lp.trim();
    }

    /**
     * 礼品数量
     * @return LPSL 礼品数量
     */
    public BigDecimal getLpsl() {
        return lpsl;
    }

    /**
     * 礼品数量
     * @param lpsl 礼品数量
     */
    public void setLpsl(BigDecimal lpsl) {
        this.lpsl = lpsl;
    }

    /**
     * 情况记录（领导接见等）
     * @return QKJL 情况记录（领导接见等）
     */
    public String getQkjl() {
        return qkjl;
    }

    /**
     * 情况记录（领导接见等）
     * @param qkjl 情况记录（领导接见等）
     */
    public void setQkjl(String qkjl) {
        this.qkjl = qkjl == null ? null : qkjl.trim();
    }

    /**
     * 访问成果
     * @return FWCG 访问成果
     */
    public String getFwcg() {
        return fwcg;
    }

    /**
     * 访问成果
     * @param fwcg 访问成果
     */
    public void setFwcg(String fwcg) {
        this.fwcg = fwcg == null ? null : fwcg.trim();
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
     * 团长国籍
     * @return TZGJ 团长国籍
     */
    public String getTzgj() {
        return tzgj;
    }

    /**
     * 团长国籍
     * @param tzgj 团长国籍
     */
    public void setTzgj(String tzgj) {
        this.tzgj = tzgj == null ? null : tzgj.trim();
    }

    /**
     * 团长性别
     * @return TZXB 团长性别
     */
    public String getTzxb() {
        return tzxb;
    }

    /**
     * 团长性别
     * @param tzxb 团长性别
     */
    public void setTzxb(String tzxb) {
        this.tzxb = tzxb == null ? null : tzxb.trim();
    }

    /**
     * 团长出生日期
     * @return TZCSRQ 团长出生日期
     */
    public Date getTzcsrq() {
        return tzcsrq;
    }

    /**
     * 团长出生日期
     * @param tzcsrq 团长出生日期
     */
    public void setTzcsrq(Date tzcsrq) {
        this.tzcsrq = tzcsrq;
    }

    /**
     * 团长工作单位
     * @return TZGZDW 团长工作单位
     */
    public String getTzgzdw() {
        return tzgzdw;
    }

    /**
     * 团长工作单位
     * @param tzgzdw 团长工作单位
     */
    public void setTzgzdw(String tzgzdw) {
        this.tzgzdw = tzgzdw == null ? null : tzgzdw.trim();
    }

    /**
     * 团长职称
     * @return TZZC 团长职称
     */
    public String getTzzc() {
        return tzzc;
    }

    /**
     * 团长职称
     * @param tzzc 团长职称
     */
    public void setTzzc(String tzzc) {
        this.tzzc = tzzc == null ? null : tzzc.trim();
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
     * 团长专业
     * @return TZZY 团长专业
     */
    public String getTzzy() {
        return tzzy;
    }

    /**
     * 团长专业
     * @param tzzy 团长专业
     */
    public void setTzzy(String tzzy) {
        this.tzzy = tzzy == null ? null : tzzy.trim();
    }

    /**
     * 团长学术领域
     * @return TZXSLY 团长学术领域
     */
    public String getTzxsly() {
        return tzxsly;
    }

    /**
     * 团长学术领域
     * @param tzxsly 团长学术领域
     */
    public void setTzxsly(String tzxsly) {
        this.tzxsly = tzxsly == null ? null : tzxsly.trim();
    }

    /**
     * 预期成果
     * @return YQCG 预期成果
     */
    public String getYqcg() {
        return yqcg;
    }

    /**
     * 预期成果
     * @param yqcg 预期成果
     */
    public void setYqcg(String yqcg) {
        this.yqcg = yqcg == null ? null : yqcg.trim();
    }

    /**
     * 主请人姓名
     * @return ZQRXM 主请人姓名
     */
    public String getZqrxm() {
        return zqrxm;
    }

    /**
     * 主请人姓名
     * @param zqrxm 主请人姓名
     */
    public void setZqrxm(String zqrxm) {
        this.zqrxm = zqrxm == null ? null : zqrxm.trim();
    }

    /**
     * 主请人电话
     * @return ZQRDH 主请人电话
     */
    public String getZqrdh() {
        return zqrdh;
    }

    /**
     * 主请人电话
     * @param zqrdh 主请人电话
     */
    public void setZqrdh(String zqrdh) {
        this.zqrdh = zqrdh == null ? null : zqrdh.trim();
    }

    /**
     * 主请联系人姓名
     * @return ZQLXRXM 主请联系人姓名
     */
    public String getZqlxrxm() {
        return zqlxrxm;
    }

    /**
     * 主请联系人姓名
     * @param zqlxrxm 主请联系人姓名
     */
    public void setZqlxrxm(String zqlxrxm) {
        this.zqlxrxm = zqlxrxm == null ? null : zqlxrxm.trim();
    }

    /**
     * 主请联系人电话
     * @return ZQLXRDH 主请联系人电话
     */
    public String getZqlxrdh() {
        return zqlxrdh;
    }

    /**
     * 主请联系人电话
     * @param zqlxrdh 主请联系人电话
     */
    public void setZqlxrdh(String zqlxrdh) {
        this.zqlxrdh = zqlxrdh == null ? null : zqlxrdh.trim();
    }

    /**
     * 接待部门 j机构id
     * @return JDBM 接待部门 j机构id
     */
    public String getJdbm() {
        return jdbm;
    }

    /**
     * 接待部门 j机构id
     * @param jdbm 接待部门 j机构id
     */
    public void setJdbm(String jdbm) {
        this.jdbm = jdbm == null ? null : jdbm.trim();
    }

    /**
     * 是否邀请校领导
     * @return YN_YQXLD 是否邀请校领导
     */
    public String getYnYqxld() {
        return ynYqxld;
    }

    /**
     * 是否邀请校领导
     * @param ynYqxld 是否邀请校领导
     */
    public void setYnYqxld(String ynYqxld) {
        this.ynYqxld = ynYqxld == null ? null : ynYqxld.trim();
    }

    /**
     * 是否获学院同意
     * @return YN_XYTY 是否获学院同意
     */
    public String getYnXyty() {
        return ynXyty;
    }

    /**
     * 是否获学院同意
     * @param ynXyty 是否获学院同意
     */
    public void setYnXyty(String ynXyty) {
        this.ynXyty = ynXyty == null ? null : ynXyty.trim();
    }

    /**
     * 是否报备所属公安部门
     * @return YN_BBSSGABM 是否报备所属公安部门
     */
    public String getYnBbssgabm() {
        return ynBbssgabm;
    }

    /**
     * 是否报备所属公安部门
     * @param ynBbssgabm 是否报备所属公安部门
     */
    public void setYnBbssgabm(String ynBbssgabm) {
        this.ynBbssgabm = ynBbssgabm == null ? null : ynBbssgabm.trim();
    }

    /**
     * 是否报备所属宣传部门
     * @return YN_BBSSXCBM 是否报备所属宣传部门
     */
    public String getYnBbssxcbm() {
        return ynBbssxcbm;
    }

    /**
     * 是否报备所属宣传部门
     * @param ynBbssxcbm 是否报备所属宣传部门
     */
    public void setYnBbssxcbm(String ynBbssxcbm) {
        this.ynBbssxcbm = ynBbssxcbm == null ? null : ynBbssxcbm.trim();
    }

    /**
     * 接待类型   01 校级接待、02 院级接待
     * @return JDLX 接待类型   01 校级接待、02 院级接待
     */
    public String getJdlx() {
        return jdlx;
    }

    /**
     * 接待类型   01 校级接待、02 院级接待
     * @param jdlx 接待类型   01 校级接待、02 院级接待
     */
    public void setJdlx(String jdlx) {
        this.jdlx = jdlx == null ? null : jdlx.trim();
    }

    /**
     * 状态 01 资料需修改、02 资料合格、03 办结
     * @return STATUS 状态 01 资料需修改、02 资料合格、03 办结
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态 01 资料需修改、02 资料合格、03 办结
     * @param status 状态 01 资料需修改、02 资料合格、03 办结
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        sb.append(", lfid=").append(lfid);
        sb.append(", dbtmc=").append(dbtmc);
        sb.append(", lfrs=").append(lfrs);
        sb.append(", lfsjStart=").append(lfsjStart);
        sb.append(", lfsjEnd=").append(lfsjEnd);
        sb.append(", tlsjStart=").append(tlsjStart);
        sb.append(", tlsjEnd=").append(tlsjEnd);
        sb.append(", lfmd=").append(lfmd);
        sb.append(", lfmdQt=").append(lfmdQt);
        sb.append(", yjtm=").append(yjtm);
        sb.append(", yqxx=").append(yqxx);
        sb.append(", jfly=").append(jfly);
        sb.append(", lp=").append(lp);
        sb.append(", lpsl=").append(lpsl);
        sb.append(", qkjl=").append(qkjl);
        sb.append(", fwcg=").append(fwcg);
        sb.append(", tzxm=").append(tzxm);
        sb.append(", tzgj=").append(tzgj);
        sb.append(", tzxb=").append(tzxb);
        sb.append(", tzcsrq=").append(tzcsrq);
        sb.append(", tzgzdw=").append(tzgzdw);
        sb.append(", tzzc=").append(tzzc);
        sb.append(", tzzw=").append(tzzw);
        sb.append(", tzzy=").append(tzzy);
        sb.append(", tzxsly=").append(tzxsly);
        sb.append(", yqcg=").append(yqcg);
        sb.append(", zqrxm=").append(zqrxm);
        sb.append(", zqrdh=").append(zqrdh);
        sb.append(", zqlxrxm=").append(zqlxrxm);
        sb.append(", zqlxrdh=").append(zqlxrdh);
        sb.append(", jdbm=").append(jdbm);
        sb.append(", ynYqxld=").append(ynYqxld);
        sb.append(", ynXyty=").append(ynXyty);
        sb.append(", ynBbssgabm=").append(ynBbssgabm);
        sb.append(", ynBbssxcbm=").append(ynBbssxcbm);
        sb.append(", jdlx=").append(jdlx);
        sb.append(", status=").append(status);
        sb.append(", memo=").append(memo);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}