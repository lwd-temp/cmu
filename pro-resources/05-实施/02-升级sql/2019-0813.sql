-- Add/modify columns
alter table T_CG_RWZXQKFK add HZHM VARCHAR2(100) not null;
alter table T_CG_RWZXQKFK add YXQZ DATE;
alter table T_CG_RWZXQKFK add QZSJ DATE;
-- Add comments to the columns
comment on column T_CG_RWZXQKFK.HZHM
  is '护照号码';
comment on column T_CG_RWZXQKFK.YXQZ
  is '护照有效期';
comment on column T_CG_RWZXQKFK.QZSJ
  is '签证有效期';
-----------------已执行 2019年8月13日09:42:50----121已执行-----------------------