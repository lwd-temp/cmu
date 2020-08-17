-- Add/modify columns
alter table T_HZ add sfzhm VARCHAR2(100);
-- Add comments to the columns
comment on column T_HZ.sfzhm
  is '身份证号码';
-----------------已执行 2019年10月8日09:00:40---------121已执行----2020年8月17号 13:42:20------学校数据库已更新----------