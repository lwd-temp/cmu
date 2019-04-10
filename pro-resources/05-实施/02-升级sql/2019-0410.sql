--  护照 添加备注字段
alter table T_HZ add bz varchar2(2000);
-- Add comments to the columns
comment on column T_HZ.bz  is '备注';

-----------------已执行 2019年4月10日19:51:32--------------------------------
