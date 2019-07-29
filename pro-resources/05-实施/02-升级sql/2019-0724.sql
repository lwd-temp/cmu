-- Add/modify columns
alter table T_XM_XSSQJL add scwjid VARCHAR2(100);
-- Add comments to the columns
comment on column T_XM_XSSQJL.scwjid
  is '上传文件位置';
-- Add/modify columns
alter table T_CG_DQCGJ add ysfbjzljj VARCHAR2(500);
alter table T_CG_DQCGJ add cfrwjj VARCHAR2(100);
alter table T_CG_DQCGJ add cfyy VARCHAR2(100);
alter table T_CG_DQCGJ add cfgsxxbid VARCHAR2(100);
alter table T_CG_DQCGJ add cfrcbid VARCHAR2(100);
alter table T_CG_DQCGJ add yqhid VARCHAR2(100);
alter table T_CG_DQCGJ add ysqfyjid VARCHAR2(100);
alter table T_CG_DQCGJ add cgrwhysspyjbid VARCHAR2(100);
alter table T_CG_DQCGJ add xnsqbid VARCHAR2(100);
alter table T_CG_DQCGJ add cfsc VARCHAR2(10);
-- Add comments to the columns
comment on column T_CG_DQCGJ.ysfbjzljj
  is '邀请方背景资料简介';
comment on column T_CG_DQCGJ.cfrwjj
  is '出访任务简介';
comment on column T_CG_DQCGJ.cfyy
  is '出访意义';
comment on column T_CG_DQCGJ.cfgsxxbid
  is '出访团组公示信息表';
comment on column T_CG_DQCGJ.cfrcbid
  is '出访团组日程表';
comment on column T_CG_DQCGJ.yqhid
  is '邀请函';
comment on column T_CG_DQCGJ.ysqfyjid
  is '邀请函翻译件';
comment on column T_CG_DQCGJ.cgrwhysspyjbid
  is '因公临时出国任务和预算审批意见表';
comment on column T_CG_DQCGJ.xnsqbid
  is '校内审签表';
comment on column T_CG_DQCGJ.cfsc
  is '出访时长';
---------------已执行 2019年7月24日10:31:45------------------------------