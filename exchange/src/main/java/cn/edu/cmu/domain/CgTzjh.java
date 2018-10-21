package cn.edu.cmu.domain;

import java.math.BigDecimal;
import java.util.Date;

public class CgTzjh {
    /**
     * 计划id
     */
    private String tzid;

    /**
     * 团组号
     */
    private String tzh;

    /**
     * 团组名称
     */
    private String tzmc;

    /**
     * 团组类别：01 因公出国(赴港澳)行政类出访、02 因公出国(赴港澳)学术交流合作、03 因公出国(境)教学科研人员出国
     */
    private String tzlb;

    /**
     * 计划类型：枚举 '01 计划控制（行政类）'、'02 计划单列（行政类）' 、'03 学术类'、'04 不
     */
    private String jhlx;

    /**
     * 出访单位
     */
    private String cfdw;

    /**
     * 自主、双跨、其他团组级别：枚举：01 正厅级、02 副厅级、03 处级、04 处级以下、05 其他。
     */
    private String tzjb;

    /**
     * 自主或参加双跨：枚举：01 自主、02 双跨、99 其他。
     */
    private String zzhsk;

    /**
     * 团组负责人姓名
     */
    private String fzrxm;

    /**
     * 行政职务   因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写
     */
    private String xzzw;

    /**
     * 行政级别   因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写
     */
    private String xzjb;

    /**
     * 技术职务  因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写
     */
    private String jszw;

    /**
     * 职务   赴港澳行政类出访填写
     */
    private String zw;

    /**
     * 职级   赴港澳行政类出访填写
     */
    private String zj;

    /**
     * 拟出访国家或地区1
     */
    private String cfgj1;

    /**
     * 拟出访国家或地区2
     */
    private String cfgj2;

    /**
     * 拟出访国家或地区3
     */
    private String cfgj3;

    /**
     * 拟出访国家或地区4
     */
    private String cfgj4;

    /**
     * 拟出访国家或地区5
     */
    private String cfgj5;

    /**
     * 分管工作  赴港澳行政类出访填写 
     */
    private String ffgz;

    /**
     * 团组人数
     */
    private BigDecimal tzrs;

    /**
     * 出访任务
     */
    private String cfrw;

    /**
     * 出访时间(精确到月)
     */
    private Date cfsj;

    /**
     * 出访天数(精确到日)
     */
    private BigDecimal cfts;

    /**
     * 省本级部门预算
     */
    private BigDecimal sjys;

    /**
     * 其他预算
     */
    private BigDecimal qtys;

    /**
     * 预算合计
     */
    private BigDecimal yshj;

    /**
     * 任务批件文号
     */
    private String rwpjwh;

    /**
     * 任务批复时间
     */
    private Date rwpfsj;

    /**
     * 任务状态
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
     * @mbggenerated 2018-10-21
     */
    public CgTzjh(String tzid, String tzh, String tzmc, String tzlb, String jhlx, String cfdw, String tzjb, String zzhsk, String fzrxm, String xzzw, String xzjb, String jszw, String zw, String zj, String cfgj1, String cfgj2, String cfgj3, String cfgj4, String cfgj5, String ffgz, BigDecimal tzrs, String cfrw, Date cfsj, BigDecimal cfts, BigDecimal sjys, BigDecimal qtys, BigDecimal yshj, String rwpjwh, Date rwpfsj, String status, String valid, Date createTime) {
        this.tzid = tzid;
        this.tzh = tzh;
        this.tzmc = tzmc;
        this.tzlb = tzlb;
        this.jhlx = jhlx;
        this.cfdw = cfdw;
        this.tzjb = tzjb;
        this.zzhsk = zzhsk;
        this.fzrxm = fzrxm;
        this.xzzw = xzzw;
        this.xzjb = xzjb;
        this.jszw = jszw;
        this.zw = zw;
        this.zj = zj;
        this.cfgj1 = cfgj1;
        this.cfgj2 = cfgj2;
        this.cfgj3 = cfgj3;
        this.cfgj4 = cfgj4;
        this.cfgj5 = cfgj5;
        this.ffgz = ffgz;
        this.tzrs = tzrs;
        this.cfrw = cfrw;
        this.cfsj = cfsj;
        this.cfts = cfts;
        this.sjys = sjys;
        this.qtys = qtys;
        this.yshj = yshj;
        this.rwpjwh = rwpjwh;
        this.rwpfsj = rwpfsj;
        this.status = status;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-10-21
     */
    public CgTzjh() {
        super();
    }

    /**
     * 计划id
     * @return TZID 计划id
     */
    public String getTzid() {
        return tzid;
    }

    /**
     * 计划id
     * @param tzid 计划id
     */
    public void setTzid(String tzid) {
        this.tzid = tzid == null ? null : tzid.trim();
    }

    /**
     * 团组号
     * @return TZH 团组号
     */
    public String getTzh() {
        return tzh;
    }

    /**
     * 团组号
     * @param tzh 团组号
     */
    public void setTzh(String tzh) {
        this.tzh = tzh == null ? null : tzh.trim();
    }

    /**
     * 团组名称
     * @return TZMC 团组名称
     */
    public String getTzmc() {
        return tzmc;
    }

    /**
     * 团组名称
     * @param tzmc 团组名称
     */
    public void setTzmc(String tzmc) {
        this.tzmc = tzmc == null ? null : tzmc.trim();
    }

    /**
     * 团组类别：01 因公出国(赴港澳)行政类出访、02 因公出国(赴港澳)学术交流合作、03 因公出国(境)教学科研人员出国
     * @return TZLB 团组类别：01 因公出国(赴港澳)行政类出访、02 因公出国(赴港澳)学术交流合作、03 因公出国(境)教学科研人员出国
     */
    public String getTzlb() {
        return tzlb;
    }

    /**
     * 团组类别：01 因公出国(赴港澳)行政类出访、02 因公出国(赴港澳)学术交流合作、03 因公出国(境)教学科研人员出国
     * @param tzlb 团组类别：01 因公出国(赴港澳)行政类出访、02 因公出国(赴港澳)学术交流合作、03 因公出国(境)教学科研人员出国
     */
    public void setTzlb(String tzlb) {
        this.tzlb = tzlb == null ? null : tzlb.trim();
    }

    /**
     * 计划类型：枚举 '01 计划控制（行政类）'、'02 计划单列（行政类）' 、'03 学术类'、'04 不
     * @return JHLX 计划类型：枚举 '01 计划控制（行政类）'、'02 计划单列（行政类）' 、'03 学术类'、'04 不
     */
    public String getJhlx() {
        return jhlx;
    }

    /**
     * 计划类型：枚举 '01 计划控制（行政类）'、'02 计划单列（行政类）' 、'03 学术类'、'04 不
     * @param jhlx 计划类型：枚举 '01 计划控制（行政类）'、'02 计划单列（行政类）' 、'03 学术类'、'04 不
     */
    public void setJhlx(String jhlx) {
        this.jhlx = jhlx == null ? null : jhlx.trim();
    }

    /**
     * 出访单位
     * @return CFDW 出访单位
     */
    public String getCfdw() {
        return cfdw;
    }

    /**
     * 出访单位
     * @param cfdw 出访单位
     */
    public void setCfdw(String cfdw) {
        this.cfdw = cfdw == null ? null : cfdw.trim();
    }

    /**
     * 自主、双跨、其他团组级别：枚举：01 正厅级、02 副厅级、03 处级、04 处级以下、05 其他。
     * @return TZJB 自主、双跨、其他团组级别：枚举：01 正厅级、02 副厅级、03 处级、04 处级以下、05 其他。
     */
    public String getTzjb() {
        return tzjb;
    }

    /**
     * 自主、双跨、其他团组级别：枚举：01 正厅级、02 副厅级、03 处级、04 处级以下、05 其他。
     * @param tzjb 自主、双跨、其他团组级别：枚举：01 正厅级、02 副厅级、03 处级、04 处级以下、05 其他。
     */
    public void setTzjb(String tzjb) {
        this.tzjb = tzjb == null ? null : tzjb.trim();
    }

    /**
     * 自主或参加双跨：枚举：01 自主、02 双跨、99 其他。
     * @return ZZHSK 自主或参加双跨：枚举：01 自主、02 双跨、99 其他。
     */
    public String getZzhsk() {
        return zzhsk;
    }

    /**
     * 自主或参加双跨：枚举：01 自主、02 双跨、99 其他。
     * @param zzhsk 自主或参加双跨：枚举：01 自主、02 双跨、99 其他。
     */
    public void setZzhsk(String zzhsk) {
        this.zzhsk = zzhsk == null ? null : zzhsk.trim();
    }

    /**
     * 团组负责人姓名
     * @return FZRXM 团组负责人姓名
     */
    public String getFzrxm() {
        return fzrxm;
    }

    /**
     * 团组负责人姓名
     * @param fzrxm 团组负责人姓名
     */
    public void setFzrxm(String fzrxm) {
        this.fzrxm = fzrxm == null ? null : fzrxm.trim();
    }

    /**
     * 行政职务   因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写
     * @return XZZW 行政职务   因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写
     */
    public String getXzzw() {
        return xzzw;
    }

    /**
     * 行政职务   因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写
     * @param xzzw 行政职务   因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写
     */
    public void setXzzw(String xzzw) {
        this.xzzw = xzzw == null ? null : xzzw.trim();
    }

    /**
     * 行政级别   因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写
     * @return XZJB 行政级别   因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写
     */
    public String getXzjb() {
        return xzjb;
    }

    /**
     * 行政级别   因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写
     * @param xzjb 行政级别   因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写
     */
    public void setXzjb(String xzjb) {
        this.xzjb = xzjb == null ? null : xzjb.trim();
    }

    /**
     * 技术职务  因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写
     * @return JSZW 技术职务  因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写
     */
    public String getJszw() {
        return jszw;
    }

    /**
     * 技术职务  因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写
     * @param jszw 技术职务  因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写
     */
    public void setJszw(String jszw) {
        this.jszw = jszw == null ? null : jszw.trim();
    }

    /**
     * 职务   赴港澳行政类出访填写
     * @return ZW 职务   赴港澳行政类出访填写
     */
    public String getZw() {
        return zw;
    }

    /**
     * 职务   赴港澳行政类出访填写
     * @param zw 职务   赴港澳行政类出访填写
     */
    public void setZw(String zw) {
        this.zw = zw == null ? null : zw.trim();
    }

    /**
     * 职级   赴港澳行政类出访填写
     * @return ZJ 职级   赴港澳行政类出访填写
     */
    public String getZj() {
        return zj;
    }

    /**
     * 职级   赴港澳行政类出访填写
     * @param zj 职级   赴港澳行政类出访填写
     */
    public void setZj(String zj) {
        this.zj = zj == null ? null : zj.trim();
    }

    /**
     * 拟出访国家或地区1
     * @return CFGJ1 拟出访国家或地区1
     */
    public String getCfgj1() {
        return cfgj1;
    }

    /**
     * 拟出访国家或地区1
     * @param cfgj1 拟出访国家或地区1
     */
    public void setCfgj1(String cfgj1) {
        this.cfgj1 = cfgj1 == null ? null : cfgj1.trim();
    }

    /**
     * 拟出访国家或地区2
     * @return CFGJ2 拟出访国家或地区2
     */
    public String getCfgj2() {
        return cfgj2;
    }

    /**
     * 拟出访国家或地区2
     * @param cfgj2 拟出访国家或地区2
     */
    public void setCfgj2(String cfgj2) {
        this.cfgj2 = cfgj2 == null ? null : cfgj2.trim();
    }

    /**
     * 拟出访国家或地区3
     * @return CFGJ3 拟出访国家或地区3
     */
    public String getCfgj3() {
        return cfgj3;
    }

    /**
     * 拟出访国家或地区3
     * @param cfgj3 拟出访国家或地区3
     */
    public void setCfgj3(String cfgj3) {
        this.cfgj3 = cfgj3 == null ? null : cfgj3.trim();
    }

    /**
     * 拟出访国家或地区4
     * @return CFGJ4 拟出访国家或地区4
     */
    public String getCfgj4() {
        return cfgj4;
    }

    /**
     * 拟出访国家或地区4
     * @param cfgj4 拟出访国家或地区4
     */
    public void setCfgj4(String cfgj4) {
        this.cfgj4 = cfgj4 == null ? null : cfgj4.trim();
    }

    /**
     * 拟出访国家或地区5
     * @return CFGJ5 拟出访国家或地区5
     */
    public String getCfgj5() {
        return cfgj5;
    }

    /**
     * 拟出访国家或地区5
     * @param cfgj5 拟出访国家或地区5
     */
    public void setCfgj5(String cfgj5) {
        this.cfgj5 = cfgj5 == null ? null : cfgj5.trim();
    }

    /**
     * 分管工作  赴港澳行政类出访填写 
     * @return FFGZ 分管工作  赴港澳行政类出访填写 
     */
    public String getFfgz() {
        return ffgz;
    }

    /**
     * 分管工作  赴港澳行政类出访填写 
     * @param ffgz 分管工作  赴港澳行政类出访填写 
     */
    public void setFfgz(String ffgz) {
        this.ffgz = ffgz == null ? null : ffgz.trim();
    }

    /**
     * 团组人数
     * @return TZRS 团组人数
     */
    public BigDecimal getTzrs() {
        return tzrs;
    }

    /**
     * 团组人数
     * @param tzrs 团组人数
     */
    public void setTzrs(BigDecimal tzrs) {
        this.tzrs = tzrs;
    }

    /**
     * 出访任务
     * @return CFRW 出访任务
     */
    public String getCfrw() {
        return cfrw;
    }

    /**
     * 出访任务
     * @param cfrw 出访任务
     */
    public void setCfrw(String cfrw) {
        this.cfrw = cfrw == null ? null : cfrw.trim();
    }

    /**
     * 出访时间(精确到月)
     * @return CFSJ 出访时间(精确到月)
     */
    public Date getCfsj() {
        return cfsj;
    }

    /**
     * 出访时间(精确到月)
     * @param cfsj 出访时间(精确到月)
     */
    public void setCfsj(Date cfsj) {
        this.cfsj = cfsj;
    }

    /**
     * 出访天数(精确到日)
     * @return CFTS 出访天数(精确到日)
     */
    public BigDecimal getCfts() {
        return cfts;
    }

    /**
     * 出访天数(精确到日)
     * @param cfts 出访天数(精确到日)
     */
    public void setCfts(BigDecimal cfts) {
        this.cfts = cfts;
    }

    /**
     * 省本级部门预算
     * @return SJYS 省本级部门预算
     */
    public BigDecimal getSjys() {
        return sjys;
    }

    /**
     * 省本级部门预算
     * @param sjys 省本级部门预算
     */
    public void setSjys(BigDecimal sjys) {
        this.sjys = sjys;
    }

    /**
     * 其他预算
     * @return QTYS 其他预算
     */
    public BigDecimal getQtys() {
        return qtys;
    }

    /**
     * 其他预算
     * @param qtys 其他预算
     */
    public void setQtys(BigDecimal qtys) {
        this.qtys = qtys;
    }

    /**
     * 预算合计
     * @return YSHJ 预算合计
     */
    public BigDecimal getYshj() {
        return yshj;
    }

    /**
     * 预算合计
     * @param yshj 预算合计
     */
    public void setYshj(BigDecimal yshj) {
        this.yshj = yshj;
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
     * 任务批复时间
     * @return RWPFSJ 任务批复时间
     */
    public Date getRwpfsj() {
        return rwpfsj;
    }

    /**
     * 任务批复时间
     * @param rwpfsj 任务批复时间
     */
    public void setRwpfsj(Date rwpfsj) {
        this.rwpfsj = rwpfsj;
    }

    /**
     * 任务状态
     * @return STATUS 任务状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 任务状态
     * @param status 任务状态
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
     * @mbggenerated 2018-10-21
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tzid=").append(tzid);
        sb.append(", tzh=").append(tzh);
        sb.append(", tzmc=").append(tzmc);
        sb.append(", tzlb=").append(tzlb);
        sb.append(", jhlx=").append(jhlx);
        sb.append(", cfdw=").append(cfdw);
        sb.append(", tzjb=").append(tzjb);
        sb.append(", zzhsk=").append(zzhsk);
        sb.append(", fzrxm=").append(fzrxm);
        sb.append(", xzzw=").append(xzzw);
        sb.append(", xzjb=").append(xzjb);
        sb.append(", jszw=").append(jszw);
        sb.append(", zw=").append(zw);
        sb.append(", zj=").append(zj);
        sb.append(", cfgj1=").append(cfgj1);
        sb.append(", cfgj2=").append(cfgj2);
        sb.append(", cfgj3=").append(cfgj3);
        sb.append(", cfgj4=").append(cfgj4);
        sb.append(", cfgj5=").append(cfgj5);
        sb.append(", ffgz=").append(ffgz);
        sb.append(", tzrs=").append(tzrs);
        sb.append(", cfrw=").append(cfrw);
        sb.append(", cfsj=").append(cfsj);
        sb.append(", cfts=").append(cfts);
        sb.append(", sjys=").append(sjys);
        sb.append(", qtys=").append(qtys);
        sb.append(", yshj=").append(yshj);
        sb.append(", rwpjwh=").append(rwpjwh);
        sb.append(", rwpfsj=").append(rwpfsj);
        sb.append(", status=").append(status);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}