alter table t_wjjs_zjxx
   drop constraint FK_T_WJJS_Z_REFERENCE_T_FOREIG;

drop table t_wjjs_zjxx cascade constraints;

/*==============================================================*/
/* Table: t_wjjs_zjxx                                           */
/*==============================================================*/
create table t_wjjs_zjxx
(
   id                   VARCHAR2(100)        not null,
   fid                  VARCHAR2(100),
   zjms                 VARCHAR2(2000),
   tid                  VARCHAR2(100),
   create_time          DATE                 default sysdate,
   valid                VARCHAR2(10)         default '1',
   constraint PK_T_WJJS_ZJXX primary key (id)
);

comment on table t_wjjs_zjxx is
'外籍教师证件信息（上传证件信息表）护照首页”、“签证页”、“出入境盖章页”';

comment on column t_wjjs_zjxx.id is
'id主键';

comment on column t_wjjs_zjxx.fid is
'上传文件id';

comment on column t_wjjs_zjxx.zjms is
'文件说明';

comment on column t_wjjs_zjxx.tid is
'教师id';

comment on column t_wjjs_zjxx.create_time is
'创建时间';

comment on column t_wjjs_zjxx.valid is
'数据是否有效(0已经删除 1有效)';

alter table t_wjjs_zjxx
   add constraint FK_T_WJJS_Z_REFERENCE_T_FOREIG foreign key (tid)
      references t_foreign_teacher (tid);

-----------------已执行 2019年5月3日15:21:32--------------------------------
