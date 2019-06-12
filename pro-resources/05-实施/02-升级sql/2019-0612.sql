-- 外宾接待添加礼品表，一个接待可以允许有多个礼品信息

alter table t_wflf_lp
   drop constraint FK_T_WFLF_L_REFERENCE_T_WBJD_S;

drop table t_wflf_lp cascade constraints;

/*==============================================================*/
/* Table: t_wflf_lp                                             */
/*==============================================================*/
create table t_wflf_lp
(
   id                   VARCHAR2(100)        not null,
   mc                   VARCHAR2(2000),
   sl                   NUMBER(10),
   lfid                 VARCHAR2(100),
   valid                VARCHAR2(5)          default '1',
   create_time          DATE                 default sysdate,
   constraint PK_T_WFLF_LP primary key (id)
);

comment on table t_wflf_lp is
'外宾来访礼品表';

comment on column t_wflf_lp.id is
'主键';

comment on column t_wflf_lp.mc is
'礼品名称';

comment on column t_wflf_lp.sl is
'礼品数量 数字';

comment on column t_wflf_lp.lfid is
'来访id 外键';

comment on column t_wflf_lp.valid is
'数据是否有效(0已经删除 1有效)';

comment on column t_wflf_lp.create_time is
'创建时间默认当前数据生成时间';

alter table t_wflf_lp
   add constraint FK_T_WFLF_L_REFERENCE_T_WBJD_S foreign key (lfid)
      references t_wbjd_sq (lfid);
