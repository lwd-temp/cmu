alter table T_XM drop column jlmbjgmc
-- Create table
create table t_dm_jljgmc
(
  CODE        VARCHAR2(100),
  NAME        VARCHAR2(50),
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
    next 1
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table
comment on table t_dm_jljgmc
  is '交流机构名称代码表';
-- Add comments to the columns
comment on column t_dm_jljgmc.CODE
  is '交流目标机构id';
comment on column t_dm_jljgmc.NAME
  is '类型名称';
comment on column t_dm_jljgmc.VALID
  is '数据是否有效(0已经删除 1有效)';
comment on column t_dm_jljgmc.CREATE_TIME
  is '创建时间默认当前数据生成时间';
-- Create/Recreate primary, unique and foreign key constraints
alter table t_dm_jljgmc
  add constraint t_dm_jljgmc primary key (CODE);

-- Add/modify columns
alter table T_XM add jljgmc VARCHAR2(50);
-- Add comments to the columns
comment on column T_XM.jljgmc
  is '交流机构名称';
-----------------已执行 2019年8月14日10:47:10---------121已执行----2019年8月15日15:39:15----学校数据库已更新--------------
