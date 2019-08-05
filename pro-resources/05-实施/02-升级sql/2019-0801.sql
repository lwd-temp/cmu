-- Create table
create table T_DM_CFRW
(
  CODE        VARCHAR2(10) not null,
  NAME        VARCHAR2(100),
  VALID       VARCHAR2(5) default '1',
  CREATE_TIME DATE default sysdate
)
tablespace EX_PRO_DATA01
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table
comment on table T_DM_CFRW
  is '.出访任务：校际交流及访问、参加国际学术会议、学术交流与合作、执行援外任务、执行国家下派任务、其他';
-- Add comments to the columns
comment on column T_DM_CFRW.CODE
  is '代码';
comment on column T_DM_CFRW.NAME
  is '名称';
comment on column T_DM_CFRW.VALID
  is '数据是否有效(0已经删除 1有效)';
comment on column T_DM_CFRW.CREATE_TIME
  is '创建时间默认当前数据生成时间';
-- Create/Recreate primary, unique and foreign key constraints
alter table T_DM_CFRW
  add constraint PK_T_DM_CFRW primary key (CODE);

删掉出访任务字段
-- Add/modify columns
alter table T_CG_TZJH add cfrw VARCHAR2(100);
-- Add comments to the columns
comment on column T_CG_TZJH.cfrw
  is '出访任务';
  -- Create/Recreate primary, unique and foreign key constraints
alter table T_CG_TZJH
  add constraint FK_T_CG_TZJ_REFERENCE_T_DM_CFRW foreign key (CFRW)
  references t_dm_cfrw (CODE);
-----------------已执行 2019年7月30日15:18:10----121已执行-----------------------