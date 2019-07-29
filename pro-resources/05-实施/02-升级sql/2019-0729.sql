-- Add/modify columns
alter table T_CG_TZJH add jfly VARCHAR2(100);
-- Add comments to the columns
comment on column T_CG_TZJH.jfly
  is '经费来源';
-- Create/Recreate primary, unique and foreign key constraints
alter table T_CG_TZJH
  add constraint FK_T_CG_TZJ_REFERENCE_T_DM_JFL foreign key (JFLY)
  references t_dm_jfly (CODE);
-- Add/modify columns
alter table T_CG_TZJH add jflydsf VARCHAR2(100);
-- Add comments to the columns
comment on column T_CG_TZJH.jflydsf
  is '经费来源第三方名称';

-- Add/modify columns
alter table T_XM add gbdq VARCHAR2(50);
-- Add comments to the columns
comment on column T_XM.gbdq
  is '国别地区';

删掉字段 FYBZ
-- Add/modify columns
alter table T_XM add FYBZ VARCHAR2(50);
-- Add comments to the columns
comment on column T_XM.FYBZ2
  is '项目收费标准';
-----------------已执行 2019年7月29日09:55:22--------------------------------