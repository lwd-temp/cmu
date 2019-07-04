-- Add/modify columns
alter table T_WBJD_SQ add operator VARCHAR2(500);
-- Add comments to the columns
comment on column T_WBJD_SQ.operator is '申请操作人id';

---------------已执行 2019年7月1日09:06:04------------------------------