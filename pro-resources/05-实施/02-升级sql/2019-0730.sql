-- Add/modify columns
alter table T_CG_DQCGJ add jflydsf VARCHAR2(100);
-- Add comments to the columns
comment on column T_CG_DQCGJ.jflydsf
  is '经费来源第三方名称';
-- Create/Recreate primary, unique and foreign key constraints
alter table T_CG_DQCGJ
  add constraint FK_T_CG_DQC_REFERENCE_T_DM_JFL foreign key (JFLY)
  references t_dm_jfly (CODE);
-----------------已执行 2019年7月30日15:18:10------------------------------