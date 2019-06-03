------------------------------
------------------------------
---------需要备份原数据---------
------------------------------
------------------------------

alter table t_hz
   drop constraint FK_T_HZ_REFERENCE_T_DM_HZZ;

drop table t_hz cascade constraints;

/*==============================================================*/
/* Table: t_hz                                                  */
/*==============================================================*/
create table t_hz
(
   hzid                 VARCHAR2(100)        not null,
   hzhm                 VARCHAR2(100)        not null,
   gh                   VARCHAR2(100),
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
   bz                   VARCHAR2(2000),
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

comment on column t_hz.gh is
'工号';

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

alter table t_hz
   add constraint FK_T_HZ_REFERENCE_T_DM_HZZ foreign key (status)
      references t_dm_hzzt (code);

-----------------已执行 2019年6月3日22:08:40--------------------------------

