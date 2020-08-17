-- Add/modify columns
alter table T_XM add xjhsj date;
alter table T_XM add xjhdd VARCHAR2(100);
alter table T_XM add zxqq VARCHAR2(50);
-- Add comments to the columns
comment on column T_XM.xjhsj
is '宣讲会时间';
comment on column T_XM.xjhdd
is '宣讲会地点';
comment on column T_XM.zxqq
is '咨询qq';
-----------------已执行 2019年10月21日10:09:53---------121已执行-----2020年8月17号 13:42:20------学校数据库已更新-------------