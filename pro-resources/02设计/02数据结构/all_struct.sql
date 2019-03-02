/*==============================================================*/
/* DBMS name:      ORACLE Version 11g                           */
/* Created on:     2019/2/28 21:26:09                           */
/*==============================================================*/


alter table t_cg_dqcgj
   drop constraint FK_T_CG_DQC_REFERENCE_T_CG_TZJ;

alter table t_cg_dqcgj
   drop constraint FK_T_CG_DQC_REFERENCE_T_CG_SQL;

alter table t_cg_dqcgj
   drop constraint FK_T_CG_DQC_REFERENCE_T_DM_CFM;

alter table t_cg_dqcgj
   drop constraint FK_T_CG_DQC_REFERENCE_T_DM_CGS;

alter table t_cg_rwzxqkfk
   drop constraint FK_T_CG_RWZ_REFERENCE_T_CG_DQC;

alter table t_cg_tzcy
   drop constraint FK_T_CG_TZC_REFERENCE_T_CG_TZJ;

alter table t_cg_tzjh
   drop constraint FK_T_CG_TZJ_REFERENCE_T_DM_TZL;

alter table t_cg_tzjh
   drop constraint FK_T_CG_TZJ_REFERENCE_T_DM_JHL;

alter table t_cg_tzjh
   drop constraint FK_T_CG_TZJ_REFERENCE_T_DM_TZJ;

alter table t_cg_tzjh
   drop constraint FK_T_CG_TZJ_REFERENCE_T_DM_ZZS;

alter table t_hy_rymd
   drop constraint FK_T_HY_RYM_REFERENCE_T_HY_JH;

alter table t_hy_sbrymd
   drop constraint FK_T_HY_SBR_REFERENCE_T_HY_SHE;

alter table t_hy_shenb
   drop constraint FK_T_HY_SHE_REFERENCE_T_HY_JH;

alter table t_hy_zj
   drop constraint FK_T_HY_ZJ_REFERENCE_T_HY_SHE;

alter table t_hz
   drop constraint FK_T_HZ_REFERENCE_T_DM_HZZ;

alter table t_hz_yw
   drop constraint FK_T_HZ_YW_REFERENCE_T_HZ;

alter table t_sjjl_zt
   drop constraint FK_T_SJJL_Z_REFERENCE_T_XM_XSS;

alter table t_sys_role_menu
   drop constraint FK_T_SYS_RO_REFERENCE_T_SYS_RO;

alter table t_sys_role_menu
   drop constraint FK_T_SYS_RO_REFERENCE_T_SYS_ME;

alter table t_sys_user_role
   drop constraint FK_T_SYS_US_ROLE_USER_T_SYS_RO;

alter table t_wbjd_sq
   drop constraint FK_T_WBJD_S_REFERENCE_T_DM_LFM;

alter table t_wbjd_sq
   drop constraint FK_T_WBJD_S_REFERENCE_T_DM_WBL;

alter table t_wbjd_sxry
   drop constraint FK_T_WBJD_S_REFERENCE_T_WBJD_S;

alter table t_wbjd_zj
   drop constraint FK_T_WBJD_Z_REFERENCE_T_WBJD_S;

alter table t_wbjd_zj
   drop constraint FK_T_WBJD_Z_REFERENCE_T_DM_LFM;

alter table t_wbjd_zj
   drop constraint FK_T_WBJD_Z_REFERENCE_T_DM_WBL;

alter table t_xm
   drop constraint FK_T_XM_REFERENCE_T_DM_XMC;

alter table t_xm
   drop constraint FK_T_XM_REFERENCE_T_DM_XML;

alter table t_xm
   drop constraint FK_T_XM_REFERENCE_T_DM_XMM;

alter table t_xm
   drop constraint FK_T_XM_REFERENCE_T_DM_JFL;

alter table t_xm_gsxy
   drop constraint FK_T_XM_GSX_REFERENCE_T_XM;

alter table t_xm_jlzjbg
   drop constraint FK_T_XM_JLZ_REFERENCE_T_SYS_UP;

alter table t_xm_jlzjbg
   drop constraint FK_T_XM_JLZ_REFERENCE_T_XM_XSS;

alter table t_xm_xssbfj
   drop constraint FK_T_XM_XSS_REFERENCE_T_SYS_UP;

alter table t_xm_xssbfj
   drop constraint FK_T_XM_XSS_SXSBFJ_T_XM_XSS;

alter table t_xm_xssqjl
   drop constraint FK_T_XM_XSS_REFERENCE_T_XM;

drop table t_cg_cgjh_gb cascade constraints;

drop table t_cg_dqcgj cascade constraints;

drop table t_cg_rwzxqkfk cascade constraints;

drop table t_cg_sqlx cascade constraints;

drop table t_cg_tzcy cascade constraints;

drop table t_cg_tzjh cascade constraints;

drop table t_cmu_contact cascade constraints;

drop table t_dm_cfmd cascade constraints;

drop table t_dm_cgspjg cascade constraints;

drop table t_dm_gb cascade constraints;

drop table t_dm_hylx cascade constraints;

drop table t_dm_hzlx cascade constraints;

drop table t_dm_hzzt cascade constraints;

drop table t_dm_jfly cascade constraints;

drop table t_dm_jhlx cascade constraints;

drop table t_dm_lfmd cascade constraints;

drop table t_dm_tzjb cascade constraints;

drop table t_dm_tzlb cascade constraints;

drop table t_dm_wblf_jdlx cascade constraints;

drop table t_dm_xb cascade constraints;

drop table t_dm_xmcc cascade constraints;

drop table t_dm_xmlx cascade constraints;

drop table t_dm_xmmc cascade constraints;

drop table t_dm_yn cascade constraints;

drop table t_dm_yy cascade constraints;

drop table t_dm_zhpj cascade constraints;

drop table t_dm_zzsk cascade constraints;

drop table t_foreign_teacher cascade constraints;

drop table t_hy_jh cascade constraints;

drop table t_hy_rymd cascade constraints;

drop table t_hy_sbrymd cascade constraints;

drop table t_hy_shenb cascade constraints;

drop table t_hy_zj cascade constraints;

drop table t_hz cascade constraints;

drop table t_hz_yw cascade constraints;

drop table t_hzxy cascade constraints;

drop table t_hzxy_gb cascade constraints;

drop table t_hzxy_qzr cascade constraints;

drop table t_sjjl_zt cascade constraints;

drop table t_sys_maxcode cascade constraints;

drop table t_sys_menu cascade constraints;

drop table t_sys_role cascade constraints;

drop table t_sys_role_menu cascade constraints;

drop table t_sys_upload cascade constraints;

drop table t_sys_user cascade constraints;

drop table t_sys_user_role cascade constraints;

drop table t_wbjd_gj cascade constraints;

drop table t_wbjd_sq cascade constraints;

drop table t_wbjd_sxry cascade constraints;

drop table t_wbjd_zj cascade constraints;

drop table t_wbjdzj_sxry cascade constraints;

drop table t_xm cascade constraints;

drop table t_xm_gjdq cascade constraints;

drop table t_xm_gsxy cascade constraints;

drop table t_xm_jlzjbg cascade constraints;

drop table t_xm_xssbfj cascade constraints;

drop table t_xm_xssqjl cascade constraints;

/*==============================================================*/
/* Table: t_cg_cgjh_gb                                          */
/*==============================================================*/
create table t_cg_cgjh_gb 
(
   gbid                 VARCHAR2(100)        not null,
   gjdm                 VARCHAR2(100),
   jhid                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_CG_CGJH_GB primary key (gbid)
);

comment on table t_cg_cgjh_gb is
'出访计划国别';

comment on column t_cg_cgjh_gb.gbid is
'国别id';

comment on column t_cg_cgjh_gb.gjdm is
'国家代码';

comment on column t_cg_cgjh_gb.jhid is
'计划id';

comment on column t_cg_cgjh_gb.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_cg_cgjh_gb.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_cg_dqcgj                                            */
/*==============================================================*/
create table t_cg_dqcgj 
(
   cgid                 varchar2(100)        not null,
   cglx                 varchar2(10),
   xm                   varchar2(100),
   xb                   varchar2(10),
   csrq                 date,
   csd                  varchar2(100),
   hjszd                varchar2(100),
   sfzh                 varchar2(30),
   ssejdw               varchar2(100),
   ks                   varchar2(100),
   zw                   varchar2(100),
   zc                   varchar2(100),
   lxdh                 varchar2(20),
   email                varchar2(100),
   nncfcs               INTEGER,
   qtshrz               VARCHAR2(4000),
   cfgj                 varchar2(100),
   rjcs                 varchar2(100),
   tzid                 varchar2(100),
   cfksrq               date,
   cfjsrq               date,
   cfmd                 varchar2(10),
   cfmd_qt              varchar2(200),
   yqr_xm               varchar2(100),
   yqr_zw               varchar2(100),
   yqr_dw               varchar2(100),
   yqr_xxdz             varchar2(100),
   yqr_dh               varchar2(50),
   yqr_xm_en            varchar2(200),
   yqr_zw_en            varchar2(200),
   yqr_dw_en            varchar2(500),
   yqr_xxdz_en          varchar2(500),
   yqr_dh_en            varchar2(100),
   jfly                 varchar2(200),
   jfysmx               varchar2(500),
   jfyshj               NUMERIC(10, 2),
   sqbsm                varchar2(100),
   sqrq                 date,
   status               VARCHAR2(5),
   shjg                 varchar2(10),
   shry                 varchar2(10),
   shyj                 varchar2(500),
   shrq                 date,
   gdwjid               VARCHAR2(100),
   cfzjbgid             varchar2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_CG_DQCGJ primary key (cgid)
);

comment on table t_cg_dqcgj is
'教职工基本信息：姓名、性别、出生日期、出生地、户籍所在地、身份证号、所属二级单位、科室、职务、职称、联系电话、邮箱；
';

comment on column t_cg_dqcgj.cgid is
'出国(境)id';

comment on column t_cg_dqcgj.cglx is
'出国类型 01 在职人员因公短期出国（境）申请、02 校管干部因私短期出国（境）申请  默认在职因公短期出国境';

comment on column t_cg_dqcgj.xm is
'教师姓名';

comment on column t_cg_dqcgj.xb is
'性别 从代码表中选择';

comment on column t_cg_dqcgj.csrq is
'出生日期';

comment on column t_cg_dqcgj.csd is
'出生地';

comment on column t_cg_dqcgj.hjszd is
'户籍所在地';

comment on column t_cg_dqcgj.sfzh is
'身份证号';

comment on column t_cg_dqcgj.ssejdw is
'所属二级单位';

comment on column t_cg_dqcgj.ks is
'科室';

comment on column t_cg_dqcgj.zw is
'职务';

comment on column t_cg_dqcgj.zc is
'职称';

comment on column t_cg_dqcgj.lxdh is
'联系电话';

comment on column t_cg_dqcgj.email is
'邮箱';

comment on column t_cg_dqcgj.nncfcs is
'年内出访次数';

comment on column t_cg_dqcgj.qtshrz is
'申请人其他社会任职';

comment on column t_cg_dqcgj.cfgj is
'出访国家（地区）';

comment on column t_cg_dqcgj.rjcs is
'入境城市（地区）';

comment on column t_cg_dqcgj.tzid is
'出访团组id  用于关联团组号，团组名称';

comment on column t_cg_dqcgj.cfksrq is
'出访开始日期';

comment on column t_cg_dqcgj.cfjsrq is
'出访结束日期';

comment on column t_cg_dqcgj.cfmd is
'出访目的（枚举：01 访问考察、02 学术会议、03 进修培训、04 合作研究、05 学术交流、06 短期讲学、99 其他[需具体录入]）';

comment on column t_cg_dqcgj.cfmd_qt is
'出访目的（其他）';

comment on column t_cg_dqcgj.yqr_xm is
'邀请人姓名';

comment on column t_cg_dqcgj.yqr_zw is
'邀请人职务';

comment on column t_cg_dqcgj.yqr_dw is
'邀请人单位';

comment on column t_cg_dqcgj.yqr_xxdz is
'邀请人详细地址';

comment on column t_cg_dqcgj.yqr_dh is
'邀请人电话';

comment on column t_cg_dqcgj.yqr_xm_en is
'邀请人姓名——英文';

comment on column t_cg_dqcgj.yqr_zw_en is
'邀请人职务——英文';

comment on column t_cg_dqcgj.yqr_dw_en is
'邀请人单位——英文';

comment on column t_cg_dqcgj.yqr_xxdz_en is
'邀请人详细地址——英文';

comment on column t_cg_dqcgj.yqr_dh_en is
'邀请人电话——英文';

comment on column t_cg_dqcgj.jfly is
'经费来源';

comment on column t_cg_dqcgj.jfysmx is
'经费预算明细 大段文本，客户填写，国际旅费、住宿费、伙食费、公杂费、其他等';

comment on column t_cg_dqcgj.jfyshj is
'经费预算合计金额 由客户手填，记录总的金额信息。';

comment on column t_cg_dqcgj.sqbsm is
'申请表说明（自然语言描述，用于显示在填表页面、生成的PDF中）  请';

comment on column t_cg_dqcgj.sqrq is
'申请日期';

comment on column t_cg_dqcgj.status is
'状态 暂存、已提交；提交后不能修改';

comment on column t_cg_dqcgj.shjg is
'审核结果分为“ 01 资料需修改、02 资料合格、03 办结”';

comment on column t_cg_dqcgj.shry is
'审核人 教职工工号';

comment on column t_cg_dqcgj.shyj is
'审核意见';

comment on column t_cg_dqcgj.shrq is
'审核日期';

comment on column t_cg_dqcgj.gdwjid is
'归档文件id 此id为上传文件表的id';

comment on column t_cg_dqcgj.cfzjbgid is
'出访总结报告 回国后自行撰写，定稿后电子版上传至系统；纸版上交国际事务部。';

comment on column t_cg_dqcgj.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_cg_dqcgj.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_cg_rwzxqkfk                                         */
/*==============================================================*/
create table t_cg_rwzxqkfk 
(
   rwfk_id              VARCHAR2(100)        not null,
   tzdw                 VARCHAR2(100),
   cfgjdq               VARCHAR2(100),
   tzxm                 VARCHAR2(100),
   xb                   VARCHAR2(10),
   tzzdw                VARCHAR2(100),
   tzzw                 VARCHAR2(100),
   ssejdw               VARCHAR2(100),
   pzcfrw               INTEGER,
   pzcfts               INTEGER,
   sjcfrs               INTEGER,
   sjcfts               INTEGER,
   cjsj                 DATE,
   rjsj                 DATE,
   rwpjwh               VARCHAR2(100),
   cfbt                 VARCHAR2(500),
   rwzxqk               CLOB,
   rwwwcnr              CLOB,
   tbr                  varchar2(50),
   tbr_dh               varchar2(100),
   cgid                 varchar2(100),
   status               varchar2(10),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_CG_RWZXQKFK primary key (rwfk_id)
);

comment on table t_cg_rwzxqkfk is
'任务执行情况反馈表';

comment on column t_cg_rwzxqkfk.rwfk_id is
'反馈表主键id';

comment on column t_cg_rwzxqkfk.tzdw is
'团组单位：默认中国医科大学';

comment on column t_cg_rwzxqkfk.cfgjdq is
'出访国家(地区)';

comment on column t_cg_rwzxqkfk.tzxm is
'团长姓名';

comment on column t_cg_rwzxqkfk.xb is
'性别';

comment on column t_cg_rwzxqkfk.tzzdw is
'团长单位';

comment on column t_cg_rwzxqkfk.tzzw is
'团长职务';

comment on column t_cg_rwzxqkfk.ssejdw is
'所属二级单位';

comment on column t_cg_rwzxqkfk.pzcfrw is
'批准出访人数';

comment on column t_cg_rwzxqkfk.pzcfts is
'批准出访天数';

comment on column t_cg_rwzxqkfk.sjcfrs is
'实际出访人数';

comment on column t_cg_rwzxqkfk.sjcfts is
'实际出访天数';

comment on column t_cg_rwzxqkfk.cjsj is
'出境时间';

comment on column t_cg_rwzxqkfk.rjsj is
'入境时间';

comment on column t_cg_rwzxqkfk.rwpjwh is
'任务批件文号';

comment on column t_cg_rwzxqkfk.cfbt is
'出访标题';

comment on column t_cg_rwzxqkfk.rwzxqk is
'任务执行情况';

comment on column t_cg_rwzxqkfk.rwwwcnr is
'任务未完成内容及原因';

comment on column t_cg_rwzxqkfk.tbr is
'填报人';

comment on column t_cg_rwzxqkfk.tbr_dh is
'填表人联系电话';

comment on column t_cg_rwzxqkfk.cgid is
'出国(境)id';

comment on column t_cg_rwzxqkfk.status is
'状态';

comment on column t_cg_rwzxqkfk.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_cg_rwzxqkfk.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_cg_sqlx                                             */
/*==============================================================*/
create table t_cg_sqlx 
(
   code                 varchar2(10)         not null,
   name                 varchar2(200),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_CG_SQLX primary key (code)
);

comment on table t_cg_sqlx is
'短期出国（境）申请类型代码表';

comment on column t_cg_sqlx.code is
'代码 01，02 ';

comment on column t_cg_sqlx.name is
'名称 在职人员因公短期出国（境）申请、校管干部因私短期出国（境）申请';

comment on column t_cg_sqlx.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_cg_sqlx.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_cg_tzcy                                             */
/*==============================================================*/
create table t_cg_tzcy 
(
   cyid                 varchar2(100)        not null,
   tzid                 varchar2(100),
   xm                   varchar2(100),
   ejdwmc               varchar2(100),
   zw                   varchar2(100),
   jb                   varchar2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_CG_TZCY primary key (cyid)
);

comment on table t_cg_tzcy is
'团组成员信息';

comment on column t_cg_tzcy.cyid is
'成员id';

comment on column t_cg_tzcy.tzid is
'计划团组id';

comment on column t_cg_tzcy.xm is
'成员姓名';

comment on column t_cg_tzcy.ejdwmc is
'二级单位名称';

comment on column t_cg_tzcy.zw is
'职务';

comment on column t_cg_tzcy.jb is
'级别';

comment on column t_cg_tzcy.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_cg_tzcy.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_cg_tzjh                                             */
/*==============================================================*/
create table t_cg_tzjh 
(
   tzid                 varchar2(100)        not null,
   tzh                  varchar2(100),
   tzmc                 VARCHAR2(500),
   tzlb                 VARCHAR2(10),
   jhlx                 varchar2(10),
   cfdw                 varchar2(100)        default '中国医科大学',
   tzjb                 varchar2(10),
   zzhsk                varchar2(10),
   fzrxm                varchar2(100),
   xzzw                 varchar2(100),
   xzjb                 varchar2(100),
   jszw                 varchar2(100),
   zw                   varchar2(100),
   zj                   varchar2(100),
   cfgj1                varchar2(100),
   cfgj2                varchar2(100),
   cfgj3                varchar2(100),
   cfgj4                varchar2(100),
   cfgj5                varchar2(100),
   ffgz                 varchar2(400),
   tzrs                 int,
   cfrw                 varchar2(500),
   cfsj                 DATE,
   cfts                 int,
   sjys                 NUMBER(10,2),
   qtys                 NUMBER(10,2),
   yshj                 NUMBER(10,2),
   rwpjwh               varchar2(100),
   rwpfsj               date,
   status               VARCHAR2(5),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_CG_TZJH primary key (tzid)
);

comment on table t_cg_tzjh is
'出国团组计划表';

comment on column t_cg_tzjh.tzid is
'计划id';

comment on column t_cg_tzjh.tzh is
'团组号';

comment on column t_cg_tzjh.tzmc is
'团组名称';

comment on column t_cg_tzjh.tzlb is
'团组类别：01 因公出国(赴港澳)行政类出访、02 因公出国(赴港澳)学术交流合作、03 因公出国(境)教学科研人员出国学术交流合作、04 因公赴台';

comment on column t_cg_tzjh.jhlx is
'计划类型：枚举 ''01 计划控制（行政类）''、''02 计划单列（行政类）'' 、''03 学术类''、''04 不涉及''。';

comment on column t_cg_tzjh.cfdw is
'出访单位';

comment on column t_cg_tzjh.tzjb is
'自主、双跨、其他团组级别：枚举：01 正厅级、02 副厅级、03 处级、04 处级以下、05 其他。';

comment on column t_cg_tzjh.zzhsk is
'自主或参加双跨：枚举：01 自主、02 双跨、99 其他。';

comment on column t_cg_tzjh.fzrxm is
'团组负责人姓名';

comment on column t_cg_tzjh.xzzw is
'行政职务   因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写';

comment on column t_cg_tzjh.xzjb is
'行政级别   因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写';

comment on column t_cg_tzjh.jszw is
'技术职务  因公出国(赴港澳)学术交流合作和因公出国(境)教学科研人员出国学术交流合作团组填写';

comment on column t_cg_tzjh.zw is
'职务   赴港澳行政类出访填写';

comment on column t_cg_tzjh.zj is
'职级   赴港澳行政类出访填写';

comment on column t_cg_tzjh.cfgj1 is
'拟出访国家或地区1';

comment on column t_cg_tzjh.cfgj2 is
'拟出访国家或地区2';

comment on column t_cg_tzjh.cfgj3 is
'拟出访国家或地区3';

comment on column t_cg_tzjh.cfgj4 is
'拟出访国家或地区4';

comment on column t_cg_tzjh.cfgj5 is
'拟出访国家或地区5';

comment on column t_cg_tzjh.ffgz is
'分管工作  赴港澳行政类出访填写 ';

comment on column t_cg_tzjh.tzrs is
'团组人数';

comment on column t_cg_tzjh.cfrw is
'出访任务';

comment on column t_cg_tzjh.cfsj is
'出访时间(精确到月)';

comment on column t_cg_tzjh.cfts is
'出访天数(精确到日)';

comment on column t_cg_tzjh.sjys is
'省本级部门预算';

comment on column t_cg_tzjh.qtys is
'其他预算';

comment on column t_cg_tzjh.yshj is
'预算合计';

comment on column t_cg_tzjh.rwpjwh is
'任务批件文号';

comment on column t_cg_tzjh.rwpfsj is
'任务批复时间';

comment on column t_cg_tzjh.status is
'任务状态';

comment on column t_cg_tzjh.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_cg_tzjh.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_cmu_contact                                         */
/*==============================================================*/
create table t_cmu_contact 
(
   lxr_id               varchar2(100)        not null,
   name                 varchar2(100),
   gender               varchar2(100),
   gj                   varchar2(100),
   yz                   varchar2(100),
   gzdw                 varchar2(100),
   zwzc                 varchar2(100),
   zyly                 varchar2(100),
   glxm                 varchar2(100),
   email                varchar2(100),
   fax                  varchar2(50),
   telphone             varchar2(20),
   address              varchar2(200),
   remark               varchar2(1000),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_CMU_CONTACT primary key (lxr_id)
);

comment on table t_cmu_contact is
'联系人';

comment on column t_cmu_contact.lxr_id is
'联系人id';

comment on column t_cmu_contact.name is
'姓名';

comment on column t_cmu_contact.gender is
'性别';

comment on column t_cmu_contact.gj is
'国籍';

comment on column t_cmu_contact.yz is
'语种';

comment on column t_cmu_contact.gzdw is
'工作单位';

comment on column t_cmu_contact.zwzc is
'职务职称';

comment on column t_cmu_contact.zyly is
'专业领域';

comment on column t_cmu_contact.glxm is
'关联项目';

comment on column t_cmu_contact.email is
'邮箱';

comment on column t_cmu_contact.fax is
'传真';

comment on column t_cmu_contact.telphone is
'工作电话';

comment on column t_cmu_contact.address is
'通信地址';

comment on column t_cmu_contact.remark is
'备注';

comment on column t_cmu_contact.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_cmu_contact.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_cfmd                                             */
/*==============================================================*/
create table t_dm_cfmd 
(
   code                 varchar2(10)         not null,
   name                 varchar2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_CFMD primary key (code)
);

comment on table t_dm_cfmd is
'01 访问考察、02 学术会议、03 进修培训、04 合作研究、05 学术交流、06 短期讲学、99 其他[需具体录入';

comment on column t_dm_cfmd.code is
'代码';

comment on column t_dm_cfmd.name is
'名称';

comment on column t_dm_cfmd.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_cfmd.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_cgspjg                                           */
/*==============================================================*/
create table t_dm_cgspjg 
(
   code                 varchar2(10)         not null,
   name                 varchar2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_CGSPJG primary key (code)
);

comment on table t_dm_cgspjg is
'出国（境）审批 审核结果 代码表   审核结果分为“ 01 资料需修改、02 资料合格、03 办结”';

comment on column t_dm_cgspjg.code is
'代码';

comment on column t_dm_cgspjg.name is
'名称';

comment on column t_dm_cgspjg.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_cgspjg.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_gb                                               */
/*==============================================================*/
create table t_dm_gb 
(
   code                 VARCHAR2(100)        not null,
   name                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_GB primary key (code)
);

comment on table t_dm_gb is
'代码国别表';

comment on column t_dm_gb.code is
'人员id';

comment on column t_dm_gb.name is
'人员姓名';

comment on column t_dm_gb.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_gb.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_hylx                                             */
/*==============================================================*/
create table t_dm_hylx 
(
   code                 VARCHAR2(100)        not null,
   name                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_HYLX primary key (code)
);

comment on table t_dm_hylx is
'会议类型代码表';

comment on column t_dm_hylx.code is
'代码';

comment on column t_dm_hylx.name is
'名称';

comment on column t_dm_hylx.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_hylx.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_hzlx                                             */
/*==============================================================*/
create table t_dm_hzlx 
(
   code                 VARCHAR2(10)         not null,
   name                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_HZLX primary key (code)
);

comment on table t_dm_hzlx is
'因公护照类型';

comment on column t_dm_hzlx.code is
'代码';

comment on column t_dm_hzlx.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_hzlx.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_hzzt                                             */
/*==============================================================*/
create table t_dm_hzzt 
(
   code                 VARCHAR2(10)         not null,
   name                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_HZZT primary key (code)
);

comment on table t_dm_hzzt is
'护照状态表 护照状态 01 报废（过期）、02 在省签证处、03 在我部、04 借出中、05 调往新单位、06 调至省外 07  调至其他单位';

comment on column t_dm_hzzt.code is
'代码';

comment on column t_dm_hzzt.name is
'名称';

comment on column t_dm_hzzt.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_hzzt.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_jfly                                             */
/*==============================================================*/
create table t_dm_jfly 
(
   code                 VARCHAR2(100)        not null,
   name                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_JFLY primary key (code)
);

comment on table t_dm_jfly is
'经费来源代码表';

comment on column t_dm_jfly.code is
'来源id';

comment on column t_dm_jfly.name is
'经费来源';

comment on column t_dm_jfly.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_jfly.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_jhlx                                             */
/*==============================================================*/
create table t_dm_jhlx 
(
   code                 varchar2(10)         not null,
   name                 varchar2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_JHLX primary key (code)
);

comment on table t_dm_jhlx is
'计划类型代码表 枚举 ''01 计划控制（行政类）''、''02 计划单列（行政类）'' 、''03 学术类''、''04 不涉及''。';

comment on column t_dm_jhlx.code is
'代码';

comment on column t_dm_jhlx.name is
'名称';

comment on column t_dm_jhlx.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_jhlx.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_lfmd                                             */
/*==============================================================*/
create table t_dm_lfmd 
(
   code                 VARCHAR2(20)         not null,
   name                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_LFMD primary key (code)
);

comment on table t_dm_lfmd is
'来访目的（ 01 友好访问、02 科研合作、-03 学术讲座（填写演讲题目，非必填）、04 荣誉职称、05 其他）';

comment on column t_dm_lfmd.code is
'代码';

comment on column t_dm_lfmd.name is
'名称';

comment on column t_dm_lfmd.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_lfmd.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_tzjb                                             */
/*==============================================================*/
create table t_dm_tzjb 
(
   code                 varchar2(10)         not null,
   name                 varchar2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_TZJB primary key (code)
);

comment on table t_dm_tzjb is
'团组级别 代码表  枚举：01 正厅级、02 副厅级、03 处级、04 处级以下、05 其他。';

comment on column t_dm_tzjb.code is
'代码';

comment on column t_dm_tzjb.name is
'名称';

comment on column t_dm_tzjb.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_tzjb.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_tzlb                                             */
/*==============================================================*/
create table t_dm_tzlb 
(
   code                 VARCHAR2(10)         not null,
   name                 varchar2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_TZLB primary key (code)
);

comment on table t_dm_tzlb is
'团组类别：01 因公出国(赴港澳)行政类出访、02 因公出国(赴港澳)学术交流合作、03 因公出国(境)教学科研人员出国学术交流合作、04 因公赴台';

comment on column t_dm_tzlb.code is
'code';

comment on column t_dm_tzlb.name is
'name';

comment on column t_dm_tzlb.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_tzlb.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_wblf_jdlx                                        */
/*==============================================================*/
create table t_dm_wblf_jdlx 
(
   code                 VARCHAR2(20)         not null,
   name                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_WBLF_JDLX primary key (code)
);

comment on table t_dm_wblf_jdlx is
'外宾来访接待【接待类型】 代码表   （01 校级接待、02 院级接待）';

comment on column t_dm_wblf_jdlx.code is
'代码';

comment on column t_dm_wblf_jdlx.name is
'名称';

comment on column t_dm_wblf_jdlx.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_wblf_jdlx.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_xb                                               */
/*==============================================================*/
create table t_dm_xb 
(
   code                 VARCHAR2(20)         not null,
   name                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default SYSDATE,
   constraint PK_T_DM_XB primary key (code)
);

comment on table t_dm_xb is
'性别代码表';

comment on column t_dm_xb.code is
'代码';

comment on column t_dm_xb.name is
'名称';

comment on column t_dm_xb.valid is
'数据有效性';

comment on column t_dm_xb.create_time is
'创建时间';

/*==============================================================*/
/* Table: t_dm_xmcc                                             */
/*==============================================================*/
create table t_dm_xmcc 
(
   code                 VARCHAR2(100)        not null,
   name                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_XMCC primary key (code)
);

comment on table t_dm_xmcc is
'项目层次代码表  项目层次：01 学校项目、02 院系项目、03 个人项目';

comment on column t_dm_xmcc.code is
'层次代码';

comment on column t_dm_xmcc.name is
'层次名称';

comment on column t_dm_xmcc.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_xmcc.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_xmlx                                             */
/*==============================================================*/
create table t_dm_xmlx 
(
   code                 VARCHAR2(20)         not null,
   name                 VARCHAR2(50),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_XMLX primary key (code)
);

comment on table t_dm_xmlx is
'项目类型字典表 01 包括临床实习、02 假期访学、03 攻读学位、04课程学习、99其他，';

comment on column t_dm_xmlx.code is
'类型编码';

comment on column t_dm_xmlx.name is
'类型名称';

comment on column t_dm_xmlx.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_xmlx.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_xmmc                                             */
/*==============================================================*/
create table t_dm_xmmc 
(
   xm_id                VARCHAR2(100)        not null,
   xmmc                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_XMMC primary key (xm_id)
);

comment on table t_dm_xmmc is
'项目名称字典表';

comment on column t_dm_xmmc.xm_id is
'项目名称id';

comment on column t_dm_xmmc.xmmc is
'项目名称';

comment on column t_dm_xmmc.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_xmmc.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_yn                                               */
/*==============================================================*/
create table t_dm_yn 
(
   code                 VARCHAR2(20)         not null,
   name                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default SYSDATE,
   constraint PK_T_DM_YN primary key (code)
);

comment on table t_dm_yn is
'是否代码表';

comment on column t_dm_yn.code is
'代码';

comment on column t_dm_yn.name is
'名称';

comment on column t_dm_yn.valid is
'数据有效性';

comment on column t_dm_yn.create_time is
'创建时间';

/*==============================================================*/
/* Table: t_dm_yy                                               */
/*==============================================================*/
create table t_dm_yy 
(
   code                 VARCHAR2(20)         not null,
   name                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default SYSDATE,
   constraint PK_T_DM_YY primary key (code)
);

comment on table t_dm_yy is
'语言代码表';

comment on column t_dm_yy.code is
'代码';

comment on column t_dm_yy.name is
'名称';

comment on column t_dm_yy.valid is
'数据有效性';

comment on column t_dm_yy.create_time is
'创建时间';

/*==============================================================*/
/* Table: t_dm_zhpj                                             */
/*==============================================================*/
create table t_dm_zhpj 
(
   code                 VARCHAR2(20)         not null,
   name                 VARCHAR2(50),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_ZHPJ primary key (code)
);

comment on table t_dm_zhpj is
'A B C D X';

comment on column t_dm_zhpj.code is
'代码';

comment on column t_dm_zhpj.name is
'名称';

comment on column t_dm_zhpj.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_zhpj.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_dm_zzsk                                             */
/*==============================================================*/
create table t_dm_zzsk 
(
   code                 varchar2(10)         not null,
   name                 varchar2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_DM_ZZSK primary key (code)
);

comment on table t_dm_zzsk is
'自主或参加双跨 代码表   01 自主、02 双跨、99其他';

comment on column t_dm_zzsk.code is
'代码';

comment on column t_dm_zzsk.name is
'名称';

comment on column t_dm_zzsk.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_dm_zzsk.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_foreign_teacher                                     */
/*==============================================================*/
create table t_foreign_teacher 
(
   tid                  VARCHAR2(100)        not null,
   gh                   VARCHAR2(100),
   jsx                  VARCHAR2(100),
   jsm                  VARCHAR2(10),
   chinese_name         VARCHAR2(100),
   gender               VARCHAR2(5),
   gj                   VARCHAR2(100),
   birthday             DATE,
   hyzk                 VARCHAR2(100),
   hzlx                 VARCHAR2(100),
   hzh                  VARCHAR2(100),
   hzqfrq               DATE,
   hzyxq                DATE,
   zgxw                 VARCHAR2(100),
   hysp                 VARCHAR2(100),
   email                VARCHAR2(100),
   syccsyhzgj           VARCHAR2(100),
   gzgw                 VARCHAR2(100),
   rzzmsj               DATE,
   gzzw                 VARCHAR2(100),
   gzsj_start           DATE,
   gzsj_end             DATE,
   phone                VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_FOREIGN_TEACHER primary key (tid)
);

comment on table t_foreign_teacher is
'外籍教师管理 --  需要确定是否由本系统管理？  外专局存在外籍教师信息，是否能有外专局 提供功能页面，本系统需要访问时 获取。';

comment on column t_foreign_teacher.tid is
'教师id';

comment on column t_foreign_teacher.gh is
'工号';

comment on column t_foreign_teacher.jsx is
'教师姓名';

comment on column t_foreign_teacher.jsm is
'教师性别';

comment on column t_foreign_teacher.chinese_name is
'语种';

comment on column t_foreign_teacher.gender is
'性别';

comment on column t_foreign_teacher.gj is
'国籍';

comment on column t_foreign_teacher.birthday is
'出生日期';

comment on column t_foreign_teacher.hyzk is
'婚姻状况';

comment on column t_foreign_teacher.hzlx is
'护照类型';

comment on column t_foreign_teacher.hzh is
'护照号码';

comment on column t_foreign_teacher.hzqfrq is
'护照签发日期';

comment on column t_foreign_teacher.hzyxq is
'护照有效期至';

comment on column t_foreign_teacher.zgxw is
'最高学位（学历）';

comment on column t_foreign_teacher.hysp is
'汉语水平';

comment on column t_foreign_teacher.email is
'申请人电子邮箱';

comment on column t_foreign_teacher.syccsyhzgj is
'所有曾授予你护照的国家';

comment on column t_foreign_teacher.gzgw is
'工作岗位（职业）';

comment on column t_foreign_teacher.rzzmsj is
'聘用合同/任职证明在华工作开始时间';

comment on column t_foreign_teacher.gzzw is
'申请在中国工作职务';

comment on column t_foreign_teacher.gzsj_start is
'申请在华工作时间开始';

comment on column t_foreign_teacher.gzsj_end is
'申请在华工作时间结束';

comment on column t_foreign_teacher.phone is
'在中国工作电话';

comment on column t_foreign_teacher.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_foreign_teacher.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_hy_jh                                               */
/*==============================================================*/
create table t_hy_jh 
(
   jhid                 VARCHAR2(100)        not null,
   hybh                 VARCHAR2(100),
   hylx                 VARCHAR2(100),
   hymc                 VARCHAR2(100),
   zbdw                 VARCHAR2(100),
   cbdw                 VARCHAR2(100),
   jxrq_ks              DATE,
   jxrq_js              date,
   dd                   VARCHAR2(100),
   jfly                 VARCHAR2(100),
   fzrxm                VARCHAR2(100),
   fzrdh                VARCHAR2(20),
   bgtm                 VARCHAR2(2000),
   bgnr                 VARCHAR2(2000),
   operator             VARCHAR2(100),
   status               VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_HY_JH primary key (jhid)
);

comment on table t_hy_jh is
'国际会议计划';

comment on column t_hy_jh.jhid is
'计划id';

comment on column t_hy_jh.hybh is
'国际会议编号';

comment on column t_hy_jh.hylx is
'会议类型（01 国际会议、02 两国间会议）';

comment on column t_hy_jh.hymc is
'会议名称';

comment on column t_hy_jh.zbdw is
'主办单位';

comment on column t_hy_jh.cbdw is
'承办单位';

comment on column t_hy_jh.jxrq_ks is
'举行日期(开始)';

comment on column t_hy_jh.jxrq_js is
'举行日期(结束)';

comment on column t_hy_jh.dd is
'地点';

comment on column t_hy_jh.jfly is
'经费来源';

comment on column t_hy_jh.fzrxm is
'负责人姓名';

comment on column t_hy_jh.fzrdh is
'负责人电话';

comment on column t_hy_jh.bgtm is
'报告、讲座等题目';

comment on column t_hy_jh.bgnr is
'报告、讲座等内容简介';

comment on column t_hy_jh.operator is
'操作人';

comment on column t_hy_jh.status is
'状态';

comment on column t_hy_jh.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_hy_jh.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_hy_rymd                                             */
/*==============================================================*/
create table t_hy_rymd 
(
   mdid                 VARCHAR2(100)        not null,
   xm                   VARCHAR2(100),
   gj                   VARCHAR2(100),
   dw                   VARCHAR2(100),
   zw                   VARCHAR2(100),
   jhid                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_HY_RYMD primary key (mdid)
);

comment on table t_hy_rymd is
'国际会议【计划】中外方人员名单表';

comment on column t_hy_rymd.mdid is
'名单id';

comment on column t_hy_rymd.xm is
'姓名';

comment on column t_hy_rymd.gj is
'国籍';

comment on column t_hy_rymd.dw is
'单位';

comment on column t_hy_rymd.zw is
'职务';

comment on column t_hy_rymd.jhid is
'计划id';

comment on column t_hy_rymd.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_hy_rymd.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_hy_sbrymd                                           */
/*==============================================================*/
create table t_hy_sbrymd 
(
   mdid                 VARCHAR2(100)        not null,
   sbid                 VARCHAR2(100),
   xm                   VARCHAR2(100),
   gj                   VARCHAR2(100),
   dw                   VARCHAR2(100),
   zw                   VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_HY_SBRYMD primary key (mdid)
);

comment on table t_hy_sbrymd is
'国际会议【申报】中外方人员名单表';

comment on column t_hy_sbrymd.mdid is
'名单id';

comment on column t_hy_sbrymd.sbid is
'会议申报id';

comment on column t_hy_sbrymd.xm is
'姓名';

comment on column t_hy_sbrymd.gj is
'国籍';

comment on column t_hy_sbrymd.dw is
'单位';

comment on column t_hy_sbrymd.zw is
'职务';

comment on column t_hy_sbrymd.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_hy_sbrymd.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_hy_shenb                                            */
/*==============================================================*/
create table t_hy_shenb 
(
   sbid                 VARCHAR2(100)        not null,
   jhid                 VARCHAR2(100),
   hylx                 VARCHAR2(10),
   hymc                 VARCHAR2(100),
   hymc_en              VARCHAR2(500),
   hybh                 VARCHAR2(100),
   jxrq_ks              DATE,
   jxrq_js              DATE,
   zbdw                 VARCHAR2(100),
   cbdw                 VARCHAR2(100),
   dd                   VARCHAR2(200),
   hyjbxx               VARCHAR2(2000),
   hygm                 VARCHAR2(2000),
   bjjbyx               VARCHAR2(2000)       not null,
   jfly                 VARCHAR2(100),
   fzrxm                VARCHAR2(100),
   fzrdh                VARCHAR2(50),
   bgtm                 VARCHAR2(2000),
   bgnr                 VARCHAR2(2000),
   sfbb                 VARCHAR2(5),
   operator             VARCHAR2(50),
   status               varchar2(5),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_HY_SHENB primary key (sbid)
);

comment on table t_hy_shenb is
'国际会议申报表';

comment on column t_hy_shenb.sbid is
'会议申报id';

comment on column t_hy_shenb.jhid is
'计划id';

comment on column t_hy_shenb.hylx is
'会议类型（01 国际会议、02 两国间会议）';

comment on column t_hy_shenb.hymc is
'会议中文名称';

comment on column t_hy_shenb.hymc_en is
'会议英文名称';

comment on column t_hy_shenb.hybh is
'会议编号';

comment on column t_hy_shenb.jxrq_ks is
'举办日期(开始)';

comment on column t_hy_shenb.jxrq_js is
'举办日期(结束)';

comment on column t_hy_shenb.zbdw is
'主办单位';

comment on column t_hy_shenb.cbdw is
'承办单位';

comment on column t_hy_shenb.dd is
'会议地点';

comment on column t_hy_shenb.hyjbxx is
'会议基本信息';

comment on column t_hy_shenb.hygm is
'会议规模';

comment on column t_hy_shenb.bjjbyx is
'会议背景及必要性（必填、1000字以内）';

comment on column t_hy_shenb.jfly is
'经费来源';

comment on column t_hy_shenb.fzrxm is
'会议责任人';

comment on column t_hy_shenb.fzrdh is
'负责人电话';

comment on column t_hy_shenb.bgtm is
'报告、讲座等题目';

comment on column t_hy_shenb.bgnr is
'报告、讲座等内容简介';

comment on column t_hy_shenb.sfbb is
'是否在属地公安部门报备 0 否 1 是';

comment on column t_hy_shenb.operator is
'操作人员';

comment on column t_hy_shenb.status is
'01 暂存、02 退回修改、03 确定提交';

comment on column t_hy_shenb.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_hy_shenb.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_hy_zj                                               */
/*==============================================================*/
create table t_hy_zj 
(
   zjid                 VARCHAR2(100)        not null,
   sbid                 VARCHAR2(100),
   jbxx                 VARCHAR2(4000),
   pjwh                 VARCHAR2(200),
   jtqkjs               CLOB,
   ccqkjs               CLOB,
   jyywt                CLOB,
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_HY_ZJ primary key (zjid)
);

comment on table t_hy_zj is
'国际会议【总结】表';

comment on column t_hy_zj.zjid is
'总结id';

comment on column t_hy_zj.sbid is
'会议申报id';

comment on column t_hy_zj.jbxx is
'会议基本信息';

comment on column t_hy_zj.pjwh is
'会议批件文号';

comment on column t_hy_zj.jtqkjs is
'会议具体情况介绍';

comment on column t_hy_zj.ccqkjs is
'会议产出情况介绍';

comment on column t_hy_zj.jyywt is
'会议申办主办过程中的经验与问题';

comment on column t_hy_zj.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_hy_zj.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_hz                                                  */
/*==============================================================*/
create table t_hz 
(
   hzid                 VARCHAR2(100)        not null,
   hzhm                 VARCHAR2(100)        not null,
   xm                   VARCHAR2(100),
   gender               VARCHAR2(5),
   gj                   VARCHAR2(100),
   birthday             DATE,
   csdd                 VARCHAR2(100),
   qfrq                 DATE,
   qfdd                 VARCHAR2(100),
   yxqz                 DATE,
   fzjg                 VARCHAR2(100),
   hzlx                 VARCHAR2(100),
   jcsj                 DATE,
   dcwfqzhm_mg          VARCHAR2(100),
   dcwfqzhm_oz          VARCHAR2(100),
   dcwfqzhm_jnd         VARCHAR2(100),
   dcwfqzhm_qt          VARCHAR2(100),
   cfnr                 VARCHAR2(4000),
   qzhm                 VARCHAR2(4000),
   dw                   VARCHAR2(1000),
   zw                   VARCHAR2(1000),
   zc                   VARCHAR2(1000),
   cfsj_cj              DATE,
   cfsj_rj              DATE,
   ghsj                 DATE,
   qzsj                 DATE,
   cfmd                 VARCHAR2(2000),
   cfrw                 VARCHAR2(2000),
   jfly                 VARCHAR2(1000),
   status               VARCHAR2(10),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_HZ primary key (hzid)
);

comment on table t_hz is
'因公护照管理';

comment on column t_hz.hzid is
'护照id';

comment on column t_hz.hzhm is
'护照号码';

comment on column t_hz.xm is
'姓名';

comment on column t_hz.gender is
'性别';

comment on column t_hz.gj is
'国籍';

comment on column t_hz.birthday is
'出生日期';

comment on column t_hz.csdd is
'出生地点';

comment on column t_hz.qfrq is
'签发日期';

comment on column t_hz.qfdd is
'签发地点';

comment on column t_hz.yxqz is
'有效期至';

comment on column t_hz.fzjg is
'发证机关';

comment on column t_hz.hzlx is
'护照类型 01 因公护照、02 因公港澳、03 因公台湾';

comment on column t_hz.jcsj is
'借出时间';

comment on column t_hz.dcwfqzhm_mg is
'美国多次往返签证号码';

comment on column t_hz.dcwfqzhm_oz is
'欧洲多次往返签证号码';

comment on column t_hz.dcwfqzhm_jnd is
'加拿大多次往返签证号码';

comment on column t_hz.dcwfqzhm_qt is
'其他地区多次往返签证号码';

comment on column t_hz.cfnr is
'出访内容';

comment on column t_hz.qzhm is
'多次签证或签注号码';

comment on column t_hz.ghsj is
'护照、通行证归还时间';

comment on column t_hz.qzsj is
'签证或签注时间';

comment on column t_hz.cfmd is
'出访目的地';

comment on column t_hz.status is
'护照状态 01 报废（过期）、02 在省签证处、03 在我部、04 借出中、05 调往新单位、06 调至省外';

comment on column t_hz.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_hz.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_hz_yw                                               */
/*==============================================================*/
create table t_hz_yw 
(
   ywid                 VARCHAR2(100)        not null,
   hzid                 VARCHAR2(100),
   operator             VARCHAR2(100),
   operator_time        DATE,
   sx                   VARCHAR2(1000),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_HZ_YW primary key (ywid)
);

comment on table t_hz_yw is
'因公护照业务';

comment on column t_hz_yw.ywid is
'业务id';

comment on column t_hz_yw.hzid is
'护照id';

comment on column t_hz_yw.operator is
'人员';

comment on column t_hz_yw.operator_time is
'时间';

comment on column t_hz_yw.sx is
'事项';

comment on column t_hz_yw.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_hz_yw.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_hzxy                                                */
/*==============================================================*/
create table t_hzxy 
(
   xyid                 VARCHAR2(100)        not null,
   xymc                 VARCHAR2(200),
   hzfmc                VARCHAR2(100),
   qdrq                 DATE,
   sxrq                 DATE,
   upload_id            VARCHAR2(200),
   qzr                  VARCHAR2(200),
   qzrzw                VARCHAR2(200),
   memo                 VARCHAR2(4000),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_HZXY primary key (xyid)
);

comment on table t_hzxy is
'交流合作协议管理表';

comment on column t_hzxy.xyid is
'协议id';

comment on column t_hzxy.xymc is
'协议名称';

comment on column t_hzxy.hzfmc is
'合作方名称';

comment on column t_hzxy.qdrq is
'签订日期';

comment on column t_hzxy.sxrq is
'失效日期';

comment on column t_hzxy.upload_id is
'电子稿上传路径';

comment on column t_hzxy.qzr is
'签字人';

comment on column t_hzxy.qzrzw is
'签字人职务';

comment on column t_hzxy.memo is
'备注';

comment on column t_hzxy.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_hzxy.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_hzxy_gb                                             */
/*==============================================================*/
create table t_hzxy_gb 
(
   gbid                 VARCHAR2(100)        not null,
   gjdm                 VARCHAR2(100),
   hzys                 VARCHAR2(100),
   xyid                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_HZXY_GB primary key (gbid)
);

comment on table t_hzxy_gb is
'交流合作协议——国别子表';

comment on column t_hzxy_gb.gbid is
'国别id';

comment on column t_hzxy_gb.gjdm is
'国家代码';

comment on column t_hzxy_gb.hzys is
'盒子颜色 此处需求还需待确认???';

comment on column t_hzxy_gb.xyid is
'协议id';

comment on column t_hzxy_gb.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_hzxy_gb.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_hzxy_qzr                                            */
/*==============================================================*/
create table t_hzxy_qzr 
(
   ryid                 VARCHAR2(100)        not null,
   xm                   VARCHAR2(100),
   status               VARCHAR2(5),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_HZXY_QZR primary key (ryid)
);

comment on table t_hzxy_qzr is
'交流合作协议签字人子表';

comment on column t_hzxy_qzr.ryid is
'人员id';

comment on column t_hzxy_qzr.xm is
'人员姓名';

comment on column t_hzxy_qzr.status is
'状态';

comment on column t_hzxy_qzr.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_hzxy_qzr.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_sjjl_zt                                             */
/*==============================================================*/
create table t_sjjl_zt 
(
   gjid                 varchar2(100)        not null,
   gjnr                 varchar2(200),
   createtime           date,
   czgh                 varchar2(50),
   sqjl_id              varchar2(100)        not null,
   status               varchar2(10),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_SJJL_ZT primary key (gjid)
);

comment on table t_sjjl_zt is
'申请记录历史轨迹';

comment on column t_sjjl_zt.gjid is
'轨迹id';

comment on column t_sjjl_zt.gjnr is
'轨迹内容';

comment on column t_sjjl_zt.createtime is
'操作时间';

comment on column t_sjjl_zt.czgh is
'操作工号';

comment on column t_sjjl_zt.sqjl_id is
'申请记录id';

comment on column t_sjjl_zt.status is
'状态';

comment on column t_sjjl_zt.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_sjjl_zt.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_sys_maxcode                                         */
/*==============================================================*/
create table t_sys_maxcode 
(
   id                   VARCHAR2(100)        not null,
   type                 VARCHAR2(20),
   year                 NUMBER(10)           not null,
   maxcode              NUMBER(10)           not null,
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_SYS_MAXCODE primary key (id)
);

comment on table t_sys_maxcode is
'系统最大号码表';

comment on column t_sys_maxcode.id is
'主键';

comment on column t_sys_maxcode.type is
'类型';

comment on column t_sys_maxcode.year is
'年度';

comment on column t_sys_maxcode.maxcode is
'最大号码';

comment on column t_sys_maxcode.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_sys_maxcode.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_sys_menu                                            */
/*==============================================================*/
create table t_sys_menu 
(
   menu_id              VARCHAR2(100)        not null,
   menu_name            VARCHAR2(100),
   parent_id            VARCHAR2(100),
   url                  VARCHAR2(200),
   menu_icon            VARCHAR2(100),
   menu_style           VARCHAR2(100),
   sort                 NUMBER(5),
   memo                 VARCHAR2(2000),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_SYS_MENU primary key (menu_id)
);

comment on table t_sys_menu is
'功能菜单表';

comment on column t_sys_menu.menu_id is
'功能id';

comment on column t_sys_menu.menu_name is
'功能名称';

comment on column t_sys_menu.parent_id is
'上级功能id';

comment on column t_sys_menu.url is
'功能路径';

comment on column t_sys_menu.menu_icon is
'图标';

comment on column t_sys_menu.menu_style is
'样式';

comment on column t_sys_menu.sort is
'排序';

comment on column t_sys_menu.memo is
'备注';

comment on column t_sys_menu.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_sys_menu.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_sys_role                                            */
/*==============================================================*/
create table t_sys_role 
(
   role_id              VARCHAR2(100)        not null,
   role_name            VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_SYS_ROLE primary key (role_id)
);

comment on table t_sys_role is
'角色表';

comment on column t_sys_role.role_id is
'角色id';

comment on column t_sys_role.role_name is
'角色名称';

comment on column t_sys_role.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_sys_role.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_sys_role_menu                                       */
/*==============================================================*/
create table t_sys_role_menu 
(
   role_id              VARCHAR2(100)        not null,
   menu_id              VARCHAR2(100)        not null,
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_SYS_ROLE_MENU primary key (role_id, menu_id)
);

comment on table t_sys_role_menu is
'角色菜单表';

comment on column t_sys_role_menu.role_id is
'角色id';

comment on column t_sys_role_menu.menu_id is
'功能id';

comment on column t_sys_role_menu.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_sys_role_menu.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_sys_upload                                          */
/*==============================================================*/
create table t_sys_upload 
(
   file_id              VARCHAR2(100)        not null,
   upload_path          VARCHAR2(100),
   ext                  VARCHAR2(50),
   operator             VARCHAR2(100),
   ip                   VARCHAR2(80),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_SYS_UPLOAD primary key (file_id)
);

comment on table t_sys_upload is
'上传文件记录';

comment on column t_sys_upload.file_id is
'文件id';

comment on column t_sys_upload.upload_path is
'上传文件路径';

comment on column t_sys_upload.ext is
'扩展名';

comment on column t_sys_upload.operator is
'操作者';

comment on column t_sys_upload.ip is
'操作ip';

comment on column t_sys_upload.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_sys_upload.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_sys_user                                            */
/*==============================================================*/
create table t_sys_user 
(
   user_id              VARCHAR2(100)        not null,
   user_name            VARCHAR2(100),
   password             VARCHAR2(100),
   last_modify_time     date,
   last_login_time      DATE,
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_SYS_USER primary key (user_id)
);

comment on table t_sys_user is
'用户表';

comment on column t_sys_user.user_id is
'用户id';

comment on column t_sys_user.user_name is
'用户名';

comment on column t_sys_user.password is
'密码';

comment on column t_sys_user.last_modify_time is
'最后一次修改日';

comment on column t_sys_user.last_login_time is
'最后登录日期';

comment on column t_sys_user.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_sys_user.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_sys_user_role                                       */
/*==============================================================*/
create table t_sys_user_role 
(
   user_id              VARCHAR2(100)        not null,
   role_id              VARCHAR2(100)        not null,
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_SYS_USER_ROLE primary key (user_id, role_id)
);

comment on table t_sys_user_role is
'用户角色';

comment on column t_sys_user_role.user_id is
'用户id';

comment on column t_sys_user_role.role_id is
'角色id';

comment on column t_sys_user_role.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_sys_user_role.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_wbjd_gj                                             */
/*==============================================================*/
create table t_wbjd_gj 
(
   gjid                 VARCHAR2(100)        not null,
   lfjdgjid             VARCHAR2(100),
   lfid                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_WBJD_GJ primary key (gjid)
);

comment on table t_wbjd_gj is
'外宾来访接待——国家';

comment on column t_wbjd_gj.gjid is
'人员id';

comment on column t_wbjd_gj.lfjdgjid is
'来访id';

comment on column t_wbjd_gj.lfid is
'国籍';

comment on column t_wbjd_gj.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_wbjd_gj.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_wbjd_sq                                             */
/*==============================================================*/
create table t_wbjd_sq 
(
   lfid                 VARCHAR2(100)        not null,
   dbtmc                VARCHAR2(100),
   lfrs                 INTEGER,
   lfsj_start           DATE,
   lfsj_end             DATE,
   tlsj_start           DATE,
   tlsj_end             DATE,
   lfmd                 VARCHAR2(20),
   lfmd_qt              VARCHAR2(100),
   yjtm                 VARCHAR2(100),
   yqxx                 VARCHAR2(100),
   jfly                 VARCHAR2(100),
   lp                   VARCHAR2(100),
   lpsl                 INTEGER,
   qkjl                 VARCHAR2(100),
   fwcg                 VARCHAR2(100),
   tzxm                 VARCHAR2(100),
   tzgj                 VARCHAR2(100),
   tzxb                 VARCHAR2(10),
   tzcsrq               DATE,
   tzgzdw               VARCHAR2(100),
   tzzc                 VARCHAR2(100),
   tzzw                 VARCHAR2(100),
   tzzy                 VARCHAR2(100),
   tzxsly               VARCHAR2(100),
   yqcg                 VARCHAR2(100),
   zqrxm                VARCHAR2(100),
   zqrdh                VARCHAR2(20),
   zqlxrxm              VARCHAR2(100),
   zqlxrdh              VARCHAR2(20),
   jdbm                 VARCHAR2(100),
   yn_yqxld             VARCHAR2(5),
   yn_xyty              VARCHAR2(5),
   yn_bbssgabm          VARCHAR2(5),
   yn_bbssxcbm          VARCHAR2(5),
   jdlx                 VARCHAR2(20),
   status               VARCHAR2(100)        not null,
   memo                 VARCHAR2(500),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_WBJD_SQ primary key (lfid)
);

comment on table t_wbjd_sq is
'外宾来访接待【申请】 表';

comment on column t_wbjd_sq.lfid is
'来访id';

comment on column t_wbjd_sq.dbtmc is
'代表团名称';

comment on column t_wbjd_sq.lfrs is
'来访人数';

comment on column t_wbjd_sq.lfsj_start is
'来访时间';

comment on column t_wbjd_sq.lfsj_end is
'来访时间止';

comment on column t_wbjd_sq.tlsj_start is
'停留时间（时间开始）';

comment on column t_wbjd_sq.tlsj_end is
'停留时间（时间结束）';

comment on column t_wbjd_sq.lfmd is
'来访目的（ 01 友好访问、02 科研合作、-03 学术讲座（填写演讲题目，非必填）、04 荣誉职称、05 其他）';

comment on column t_wbjd_sq.lfmd_qt is
'其他请文字说明';

comment on column t_wbjd_sq.yjtm is
'演讲题目';

comment on column t_wbjd_sq.yqxx is
'邀请信息';

comment on column t_wbjd_sq.jfly is
'经费来源';

comment on column t_wbjd_sq.lp is
'礼品';

comment on column t_wbjd_sq.lpsl is
'礼品数量';

comment on column t_wbjd_sq.qkjl is
'情况记录（领导接见等）';

comment on column t_wbjd_sq.fwcg is
'访问成果';

comment on column t_wbjd_sq.tzxm is
'团长姓名';

comment on column t_wbjd_sq.tzgj is
'团长国籍';

comment on column t_wbjd_sq.tzxb is
'团长性别';

comment on column t_wbjd_sq.tzcsrq is
'团长出生日期';

comment on column t_wbjd_sq.tzgzdw is
'团长工作单位';

comment on column t_wbjd_sq.tzzc is
'团长职称';

comment on column t_wbjd_sq.tzzw is
'团长职务';

comment on column t_wbjd_sq.tzzy is
'团长专业';

comment on column t_wbjd_sq.tzxsly is
'团长学术领域';

comment on column t_wbjd_sq.yqcg is
'预期成果';

comment on column t_wbjd_sq.zqrxm is
'主请人姓名';

comment on column t_wbjd_sq.zqrdh is
'主请人电话';

comment on column t_wbjd_sq.zqlxrxm is
'主请联系人姓名';

comment on column t_wbjd_sq.zqlxrdh is
'主请联系人电话';

comment on column t_wbjd_sq.jdbm is
'接待部门 j机构id';

comment on column t_wbjd_sq.yn_yqxld is
'是否邀请校领导';

comment on column t_wbjd_sq.yn_xyty is
'是否获学院同意';

comment on column t_wbjd_sq.yn_bbssgabm is
'是否报备所属公安部门';

comment on column t_wbjd_sq.yn_bbssxcbm is
'是否报备所属宣传部门';

comment on column t_wbjd_sq.jdlx is
'接待类型   01 校级接待、02 院级接待';

comment on column t_wbjd_sq.status is
'状态 01 资料需修改、02 资料合格、03 办结';

comment on column t_wbjd_sq.memo is
'备注';

comment on column t_wbjd_sq.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_wbjd_sq.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_wbjd_sxry                                           */
/*==============================================================*/
create table t_wbjd_sxry 
(
   ryid                 VARCHAR2(100)        not null,
   lfid                 VARCHAR2(100),
   xm                   VARCHAR2(100),
   gj                   VARCHAR2(100),
   zw                   VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_WBJD_SXRY primary key (ryid)
);

comment on table t_wbjd_sxry is
'外宾来访接待——随行人员表';

comment on column t_wbjd_sxry.ryid is
'人员id';

comment on column t_wbjd_sxry.lfid is
'来访id';

comment on column t_wbjd_sxry.xm is
'姓名';

comment on column t_wbjd_sxry.gj is
'国籍';

comment on column t_wbjd_sxry.zw is
'职务';

comment on column t_wbjd_sxry.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_wbjd_sxry.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_wbjd_zj                                             */
/*==============================================================*/
create table t_wbjd_zj 
(
   zjid                 VARCHAR2(100)        not null,
   lfid                 VARCHAR2(100),
   dbtmc                VARCHAR2(100),
   lfrs                 INTEGER,
   lfsj_start           DATE,
   lfsj_end             DATE,
   tlsj_start           DATE,
   tlsj_end             DATE,
   lfmd                 VARCHAR2(20),
   yjtm                 VARCHAR2(100),
   lfmd_qt              VARCHAR2(100),
   yqxx                 VARCHAR2(100),
   jfly                 VARCHAR2(100),
   lp                   VARCHAR2(100),
   lpsl                 INTEGER,
   qkjl                 VARCHAR2(100),
   fwcg                 VARCHAR2(100),
   tzxm                 VARCHAR2(100),
   tzgj                 VARCHAR2(100),
   tzxb                 VARCHAR2(10),
   tzcsrq               DATE,
   tzgzdw               VARCHAR2(100),
   tzzw                 VARCHAR2(100),
   tzzy                 VARCHAR2(100),
   tzxsly               VARCHAR2(100),
   yqcg                 VARCHAR2(100),
   zqrxm                VARCHAR2(100),
   zqrdh                VARCHAR2(20),
   zqlxrxm              VARCHAR2(100),
   zqlxrdh              VARCHAR2(20),
   jdbm                 VARCHAR2(100),
   yn_yqxld             VARCHAR2(5),
   yn_xyty              VARCHAR2(5),
   yn_bbssgabm          VARCHAR2(5),
   yn_bbssxcbm          VARCHAR2(5),
   memo                 VARCHAR2(500),
   jdlx                 VARCHAR2(20),
   归档id                 VARCHAR2(100),
   tzzc                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   status               VARCHAR2(100),
   create_time          DATE                 default sysdate,
   constraint PK_T_WBJD_ZJ primary key (zjid)
);

comment on table t_wbjd_zj is
'外宾来访接待【总结】';

comment on column t_wbjd_zj.zjid is
'总结id';

comment on column t_wbjd_zj.lfid is
'来访id';

comment on column t_wbjd_zj.dbtmc is
'代表团名称';

comment on column t_wbjd_zj.lfrs is
'来访人数';

comment on column t_wbjd_zj.lfsj_start is
'来访时间';

comment on column t_wbjd_zj.lfsj_end is
'来访时间止';

comment on column t_wbjd_zj.tlsj_start is
'停留时间（时间开始）';

comment on column t_wbjd_zj.tlsj_end is
'停留时间（时间结束）';

comment on column t_wbjd_zj.lfmd is
'来访目的（ 01 友好访问、02 科研合作、-03 学术讲座（填写演讲题目，非必填）、04 荣誉职称、05 其他）';

comment on column t_wbjd_zj.yjtm is
'演讲题目';

comment on column t_wbjd_zj.lfmd_qt is
'其他请文字说明';

comment on column t_wbjd_zj.yqxx is
'邀请信息';

comment on column t_wbjd_zj.jfly is
'经费来源';

comment on column t_wbjd_zj.lp is
'礼品';

comment on column t_wbjd_zj.lpsl is
'礼品数量';

comment on column t_wbjd_zj.qkjl is
'情况记录（领导接见等）';

comment on column t_wbjd_zj.fwcg is
'访问成果';

comment on column t_wbjd_zj.tzxm is
'团长姓名';

comment on column t_wbjd_zj.tzgj is
'团长国籍';

comment on column t_wbjd_zj.tzxb is
'团长性别';

comment on column t_wbjd_zj.tzcsrq is
'团长出生日期';

comment on column t_wbjd_zj.tzgzdw is
'团长工作单位';

comment on column t_wbjd_zj.tzzw is
'团长职务';

comment on column t_wbjd_zj.tzzy is
'团长专业';

comment on column t_wbjd_zj.tzxsly is
'团长学术领域';

comment on column t_wbjd_zj.yqcg is
'预期成果';

comment on column t_wbjd_zj.zqrxm is
'主请人姓名';

comment on column t_wbjd_zj.zqrdh is
'主请人电话';

comment on column t_wbjd_zj.zqlxrxm is
'主请联系人姓名';

comment on column t_wbjd_zj.zqlxrdh is
'主请联系人电话';

comment on column t_wbjd_zj.jdbm is
'接待部门 j机构id';

comment on column t_wbjd_zj.yn_yqxld is
'是否邀请校领导';

comment on column t_wbjd_zj.yn_xyty is
'是否获学院同意';

comment on column t_wbjd_zj.yn_bbssgabm is
'是否报备所属公安部门';

comment on column t_wbjd_zj.yn_bbssxcbm is
'是否报备所属宣传部门';

comment on column t_wbjd_zj.memo is
'备注';

comment on column t_wbjd_zj.jdlx is
'接待类型   01 校级接待、02 院级接待';

comment on column t_wbjd_zj.归档id is
'归档id';

comment on column t_wbjd_zj.tzzc is
'团长职称';

comment on column t_wbjd_zj.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_wbjd_zj.status is
'状态';

comment on column t_wbjd_zj.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_wbjdzj_sxry                                         */
/*==============================================================*/
create table t_wbjdzj_sxry 
(
   ryid                 VARCHAR2(100)        not null,
   lfid                 VARCHAR2(100),
   xm                   VARCHAR2(100),
   gj                   VARCHAR2(100),
   zw                   VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_WBJDZJ_SXRY primary key (ryid)
);

comment on table t_wbjdzj_sxry is
'外宾来访接待总结——随行人员表';

comment on column t_wbjdzj_sxry.ryid is
'人员id';

comment on column t_wbjdzj_sxry.lfid is
'来访id';

comment on column t_wbjdzj_sxry.xm is
'姓名';

comment on column t_wbjdzj_sxry.gj is
'国籍';

comment on column t_wbjdzj_sxry.zw is
'职务';

comment on column t_wbjdzj_sxry.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_wbjdzj_sxry.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_xm                                                  */
/*==============================================================*/
create table t_xm 
(
   xm_id                VARCHAR2(100)        not null,
   xmlx                 VARCHAR2(20),
   xmzm                 VARCHAR2(100),
   glxmmcid             VARCHAR2(100),
   xmmc                 VARCHAR2(100),
   xmbh                 VARCHAR2(100),
   xmkssj               DATE,
   smjssj               DATE,
   xmjlts               INTEGER,
   xmcc                 VARCHAR2(10),
   jfly                 VARCHAR2(100),
   zjje                 varchar2(200),
   xmgk                 CLOB,
   xmzzjh               CLOB,
   jlmbjgmc             VARCHAR2(100),
   fybz                 NUMBER(10,2),
   zysm                 VARCHAR2(100),
   sfxzrs               varchar2(5)          default 'Y',
   jhrs                 INTEGER,
   xmnjxz               VARCHAR2(10),
   yyyq                 VARCHAR2(100),
   xmzyxz               VARCHAR2(10),
   gsyxdm               VARCHAR2(50),
   gsyxmc               VARCHAR2(200),
   gsxsdm               VARCHAR2(50),
   gsxsxm               VARCHAR2(200),
   operator_code        VARCHAR2(10),
   status               VARCHAR2(10),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_XM primary key (xm_id)
);

comment on table t_xm is
'交流项目表';

comment on column t_xm.xm_id is
'项目主键';

comment on column t_xm.xmlx is
'项目类型  01 包括临床实习、02 假期访学、03 攻读学位、04课程学习、99其他，';

comment on column t_xm.xmzm is
'项目总名';

comment on column t_xm.glxmmcid is
'关联项目名称id';

comment on column t_xm.xmmc is
'项目名称';

comment on column t_xm.xmbh is
'项目编号';

comment on column t_xm.xmkssj is
'项目开始时间';

comment on column t_xm.smjssj is
'项目结束时间';

comment on column t_xm.xmjlts is
'项目交流天数';

comment on column t_xm.xmcc is
'项目层次';

comment on column t_xm.jfly is
'经费来源';

comment on column t_xm.zjje is
'资助金额';

comment on column t_xm.xmgk is
'项目概况';

comment on column t_xm.xmzzjh is
'项目资助计划';

comment on column t_xm.jlmbjgmc is
'交流目标机构名称';

comment on column t_xm.fybz is
'项目收费标准';

comment on column t_xm.zysm is
'项目收费说明';

comment on column t_xm.sfxzrs is
'是否限制人数 N 表示不限制，Y 表示限制';

comment on column t_xm.jhrs is
'计划人数';

comment on column t_xm.xmnjxz is
'项目年级限制';

comment on column t_xm.yyyq is
'语言要求';

comment on column t_xm.xmzyxz is
'项目专业限制';

comment on column t_xm.gsyxdm is
'归属学院号';

comment on column t_xm.gsyxmc is
'归属学院名称';

comment on column t_xm.gsxsdm is
'归属学生号';

comment on column t_xm.gsxsxm is
'归属学生名称';

comment on column t_xm.operator_code is
'项目录入人';

comment on column t_xm.status is
'01 暂存、02 发布、03 允许申报、04 申报结束、05 项目终结';

comment on column t_xm.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_xm.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_xm_gjdq                                             */
/*==============================================================*/
create table t_xm_gjdq 
(
   gbid                 VARCHAR2(100)        not null,
   gjdm                 VARCHAR2(100),
   xmid                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_XM_GJDQ primary key (gbid)
);

comment on table t_xm_gjdq is
'项目交流国家地区表';

comment on column t_xm_gjdq.gbid is
'国别id';

comment on column t_xm_gjdq.gjdm is
'国家代码';

comment on column t_xm_gjdq.xmid is
'xmid';

comment on column t_xm_gjdq.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_xm_gjdq.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_xm_gsxy                                             */
/*==============================================================*/
create table t_xm_gsxy 
(
   pro_colleg_id        VARCHAR2(100)        not null,
   xyid                 VARCHAR2(100),
   xymc                 VARCHAR2(100),
   xmid                 VARCHAR2(100),
   status               VARCHAR2(5),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_XM_GSXY primary key (pro_colleg_id)
);

comment on table t_xm_gsxy is
'项目发布归属学院表';

comment on column t_xm_gsxy.pro_colleg_id is
'主键';

comment on column t_xm_gsxy.xyid is
'学院id';

comment on column t_xm_gsxy.xymc is
'学院名称';

comment on column t_xm_gsxy.xmid is
'扩展字段';

comment on column t_xm_gsxy.status is
'状态';

comment on column t_xm_gsxy.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_xm_gsxy.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_xm_jlzjbg                                           */
/*==============================================================*/
create table t_xm_jlzjbg 
(
   zjid                 varchar2(100)        not null,
   sqjl_id              varchar2(100),
   file_id              VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_XM_JLZJBG primary key (zjid)
);

comment on table t_xm_jlzjbg is
'交流总结报告';

comment on column t_xm_jlzjbg.zjid is
'总结id';

comment on column t_xm_jlzjbg.sqjl_id is
'申请记录id';

comment on column t_xm_jlzjbg.file_id is
'文件id';

comment on column t_xm_jlzjbg.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_xm_jlzjbg.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_xm_xssbfj                                           */
/*==============================================================*/
create table t_xm_xssbfj 
(
   fj_id                VARCHAR2(100)        not null,
   sqjl_id              VARCHAR2(100),
   file_id              VARCHAR2(100),
   clsm                 VARCHAR2(4000),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_XM_XSSBFJ primary key (fj_id)
);

comment on table t_xm_xssbfj is
'学生申报附件';

comment on column t_xm_xssbfj.fj_id is
'附件id';

comment on column t_xm_xssbfj.sqjl_id is
'申请记录id';

comment on column t_xm_xssbfj.file_id is
'文件id';

comment on column t_xm_xssbfj.clsm is
'材料说明';

comment on column t_xm_xssbfj.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_xm_xssbfj.create_time is
'创建时间默认当前数据生成时间';

/*==============================================================*/
/* Table: t_xm_xssqjl                                           */
/*==============================================================*/
create table t_xm_xssqjl 
(
   sqjl_id              varchar2(100)        not null,
   xm_id                VARCHAR2(100),
   xmzm                 VARCHAR2(100),
   xmmc                 VARCHAR2(100),
   xh                   varchar2(100),
   xm                   varchar2(100),
   gender               varchar2(100),
   yxdm                 varchar2(100),
   yxmc                 varchar2(100),
   rxn                  varchar2(100),
   nj                   varchar2(100),
   zyh                  varchar2(100),
   zymc                 varchar2(100),
   bjh                  varchar2(100),
   bjmc                 varchar2(100),
   chpm                 varchar2(50),
   zhpj                 varchar2(10),
   yysp                 varchar2(10),
   phone                varchar2(20),
   email                varchar2(100),
   zzje                 NUMBER(10,2),
   jlgjdqm              varchar2(5),
   xlcp                 VARCHAR(5)           default 'A',
   status               varchar2(10),
   confirm_status       varchar2(10),
   isConfirm1           VARCHAR(5)           default '0',
   isConfirm2           VARCHAR(5)           default '0',
   fsyj                 VARCHAR2(4000),
   self_pay             varchar2(5),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_XM_XSSQJL primary key (sqjl_id)
);

comment on table t_xm_xssqjl is
'项目学生申请记录';

comment on column t_xm_xssqjl.sqjl_id is
'申请记录id';

comment on column t_xm_xssqjl.xm_id is
'项目主键';

comment on column t_xm_xssqjl.xmzm is
'项目总名';

comment on column t_xm_xssqjl.xmmc is
'项目名称';

comment on column t_xm_xssqjl.xh is
'学号';

comment on column t_xm_xssqjl.xm is
'姓名';

comment on column t_xm_xssqjl.gender is
'性别';

comment on column t_xm_xssqjl.yxdm is
'院系代码';

comment on column t_xm_xssqjl.yxmc is
'院系名称';

comment on column t_xm_xssqjl.rxn is
'入学年';

comment on column t_xm_xssqjl.nj is
'年级';

comment on column t_xm_xssqjl.zyh is
'专业号';

comment on column t_xm_xssqjl.zymc is
'专业名称';

comment on column t_xm_xssqjl.bjh is
'班级';

comment on column t_xm_xssqjl.bjmc is
'班机名称';

comment on column t_xm_xssqjl.chpm is
'最近一学年学业成绩排名（或最近一学年综合测评排名，记为''列A''）格式“20/100”';

comment on column t_xm_xssqjl.zhpj is
'综合评级（ABCD或X）';

comment on column t_xm_xssqjl.yysp is
'自然语言，考试种类+成绩';

comment on column t_xm_xssqjl.phone is
'手机号码';

comment on column t_xm_xssqjl.email is
'邮箱';

comment on column t_xm_xssqjl.zzje is
'资助金额';

comment on column t_xm_xssqjl.jlgjdqm is
'交流国家或地区码';

comment on column t_xm_xssqjl.xlcp is
'默认值为“A”，其他值为“B”  此字段学生不可见。参与程序判断';

comment on column t_xm_xssqjl.status is
'01 暂存  02 已提交待审批,  03 待复审,     04 复审通过     05 审核不通过';

comment on column t_xm_xssqjl.confirm_status is
'01 待复审 02 复审通过  03 复审不通过';

comment on column t_xm_xssqjl.isConfirm1 is
'初审确认 0未确认 1 已确认';

comment on column t_xm_xssqjl.isConfirm2 is
'复审确认 0未确认 1 已确认';

comment on column t_xm_xssqjl.fsyj is
'复审意见';

comment on column t_xm_xssqjl.self_pay is
'Y 自费 N非自费';

comment on column t_xm_xssqjl.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_xm_xssqjl.create_time is
'创建时间默认当前数据生成时间';

alter table t_cg_dqcgj
   add constraint FK_T_CG_DQC_REFERENCE_T_CG_TZJ foreign key (tzid)
      references t_cg_tzjh (tzid);

alter table t_cg_dqcgj
   add constraint FK_T_CG_DQC_REFERENCE_T_CG_SQL foreign key (cglx)
      references t_cg_sqlx (code);

alter table t_cg_dqcgj
   add constraint FK_T_CG_DQC_REFERENCE_T_DM_CFM foreign key (cfmd)
      references t_dm_cfmd (code);

alter table t_cg_dqcgj
   add constraint FK_T_CG_DQC_REFERENCE_T_DM_CGS foreign key (shjg)
      references t_dm_cgspjg (code);

alter table t_cg_rwzxqkfk
   add constraint FK_T_CG_RWZ_REFERENCE_T_CG_DQC foreign key (cgid)
      references t_cg_dqcgj (cgid);

alter table t_cg_tzcy
   add constraint FK_T_CG_TZC_REFERENCE_T_CG_TZJ foreign key (tzid)
      references t_cg_tzjh (tzid);

alter table t_cg_tzjh
   add constraint FK_T_CG_TZJ_REFERENCE_T_DM_TZL foreign key (tzlb)
      references t_dm_tzlb (code);

alter table t_cg_tzjh
   add constraint FK_T_CG_TZJ_REFERENCE_T_DM_JHL foreign key (jhlx)
      references t_dm_jhlx (code);

alter table t_cg_tzjh
   add constraint FK_T_CG_TZJ_REFERENCE_T_DM_TZJ foreign key (tzjb)
      references t_dm_tzjb (code);

alter table t_cg_tzjh
   add constraint FK_T_CG_TZJ_REFERENCE_T_DM_ZZS foreign key (zzhsk)
      references t_dm_zzsk (code);

alter table t_hy_rymd
   add constraint FK_T_HY_RYM_REFERENCE_T_HY_JH foreign key (jhid)
      references t_hy_jh (jhid);

alter table t_hy_sbrymd
   add constraint FK_T_HY_SBR_REFERENCE_T_HY_SHE foreign key (sbid)
      references t_hy_shenb (sbid);

alter table t_hy_shenb
   add constraint FK_T_HY_SHE_REFERENCE_T_HY_JH foreign key (jhid)
      references t_hy_jh (jhid);

alter table t_hy_zj
   add constraint FK_T_HY_ZJ_REFERENCE_T_HY_SHE foreign key (sbid)
      references t_hy_shenb (sbid);

alter table t_hz
   add constraint FK_T_HZ_REFERENCE_T_DM_HZZ foreign key (status)
      references t_dm_hzzt (code);

alter table t_hz_yw
   add constraint FK_T_HZ_YW_REFERENCE_T_HZ foreign key (hzid)
      references t_hz (hzid);

alter table t_sjjl_zt
   add constraint FK_T_SJJL_Z_REFERENCE_T_XM_XSS foreign key (sqjl_id)
      references t_xm_xssqjl (sqjl_id);

alter table t_sys_role_menu
   add constraint FK_T_SYS_RO_REFERENCE_T_SYS_RO foreign key (role_id)
      references t_sys_role (role_id);

alter table t_sys_role_menu
   add constraint FK_T_SYS_RO_REFERENCE_T_SYS_ME foreign key (menu_id)
      references t_sys_menu (menu_id);

alter table t_sys_user_role
   add constraint FK_T_SYS_US_ROLE_USER_T_SYS_RO foreign key (role_id)
      references t_sys_role (role_id);

alter table t_wbjd_sq
   add constraint FK_T_WBJD_S_REFERENCE_T_DM_LFM foreign key (lfmd)
      references t_dm_lfmd (code);

alter table t_wbjd_sq
   add constraint FK_T_WBJD_S_REFERENCE_T_DM_WBL foreign key (jdlx)
      references t_dm_wblf_jdlx (code);

alter table t_wbjd_sxry
   add constraint FK_T_WBJD_S_REFERENCE_T_WBJD_S foreign key (lfid)
      references t_wbjd_sq (lfid);

alter table t_wbjd_zj
   add constraint FK_T_WBJD_Z_REFERENCE_T_WBJD_S foreign key (lfid)
      references t_wbjd_sq (lfid);

alter table t_wbjd_zj
   add constraint FK_T_WBJD_Z_REFERENCE_T_DM_LFM foreign key (lfmd)
      references t_dm_lfmd (code);

alter table t_wbjd_zj
   add constraint FK_T_WBJD_Z_REFERENCE_T_DM_WBL foreign key (jdlx)
      references t_dm_wblf_jdlx (code);

alter table t_xm
   add constraint FK_T_XM_REFERENCE_T_DM_XMC foreign key (xmcc)
      references t_dm_xmcc (code);

alter table t_xm
   add constraint FK_T_XM_REFERENCE_T_DM_XML foreign key (xmlx)
      references t_dm_xmlx (code);

alter table t_xm
   add constraint FK_T_XM_REFERENCE_T_DM_XMM foreign key (glxmmcid)
      references t_dm_xmmc (xm_id);

alter table t_xm
   add constraint FK_T_XM_REFERENCE_T_DM_JFL foreign key (jfly)
      references t_dm_jfly (code);

alter table t_xm_gsxy
   add constraint FK_T_XM_GSX_REFERENCE_T_XM foreign key (xmid)
      references t_xm (xm_id);

alter table t_xm_jlzjbg
   add constraint FK_T_XM_JLZ_REFERENCE_T_SYS_UP foreign key (file_id)
      references t_sys_upload (file_id);

alter table t_xm_jlzjbg
   add constraint FK_T_XM_JLZ_REFERENCE_T_XM_XSS foreign key (sqjl_id)
      references t_xm_xssqjl (sqjl_id);

alter table t_xm_xssbfj
   add constraint FK_T_XM_XSS_REFERENCE_T_SYS_UP foreign key (file_id)
      references t_sys_upload (file_id);

alter table t_xm_xssbfj
   add constraint FK_T_XM_XSS_SXSBFJ_T_XM_XSS foreign key (sqjl_id)
      references t_xm_xssqjl (sqjl_id);

alter table t_xm_xssqjl
   add constraint FK_T_XM_XSS_REFERENCE_T_XM foreign key (xm_id)
      references t_xm (xm_id);

