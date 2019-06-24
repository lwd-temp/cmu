alter table t_wbjdzj_fj
   drop constraint FK_T_WBJDZJ_REFERENCE_T_WBJD_Z;

drop table t_wbjdzj_fj cascade constraints;

/*==============================================================*/
/* Table: t_wbjdzj_fj                                           */
/*==============================================================*/
create table t_wbjdzj_fj
(
   id                   VARCHAR2(100)        not null,
   zjid                 VARCHAR2(100),
   fid                  VARCHAR2(100),
   zjms                 VARCHAR2(2000),
   create_time          DATE                 default sysdate,
   valid                VARCHAR2(10)         default '1',
   constraint PK_T_WBJDZJ_FJ primary key (id)
);

comment on table t_wbjdzj_fj is
'外宾来访接待总结上传附件';

comment on column t_wbjdzj_fj.id is
'id主键';

comment on column t_wbjdzj_fj.zjid is
'总结id';

comment on column t_wbjdzj_fj.fid is
'上传文件id';

comment on column t_wbjdzj_fj.zjms is
'文件说明';

comment on column t_wbjdzj_fj.create_time is
'创建时间';

comment on column t_wbjdzj_fj.valid is
'数据是否有效(0已经删除 1有效)';

alter table t_wbjdzj_fj
   add constraint FK_T_WBJDZJ_REFERENCE_T_WBJD_Z foreign key (zjid)
      references t_wbjd_zj (zjid);
---------------已执行 2019年6月23日18:06:54------------------------------