-- Add/modify columns
alter table T_CG_TZJH add operator varchar2(100);
-- Add comments to the columns
comment on column T_CG_TZJH.operator
  is '申请操作人id';
---------------已执行 2019年7月1日09:06:04------------------------------