-- Add/modify columns
alter table T_CG_DQCGJ add sfxd VARCHAR2(10);
-- Add comments to the columns
comment on column T_CG_DQCGJ.sfxd
  is '是否携带配偶或子女  01是 02否';
-----------------已执行 2019年10月9日16:30:40---------121已执行-------------