-- Add/modify columns
alter table T_CG_DQCGJ add operator varchar2(100);
-- Add comments to the columns
comment on column T_CG_DQCGJ.operator
  is '申请人id';
