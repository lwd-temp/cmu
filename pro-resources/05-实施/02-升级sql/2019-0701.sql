
delete from t_sys_menu t where t.menu_id ='13'

insert into t_sys_menu (MENU_ID, MENU_NAME, PARENT_ID, URL, MENU_ICON, MENU_STYLE, SORT, MEMO, VALID, CREATE_TIME)
values ('13', '项目初审管理(学院)', '1', 'business/xmgl/xmgl_sh.jsp?type=xy', null, null, 3, null, '1', to_date('23-09-2018 23:13:37', 'dd-mm-yyyy hh24:mi:ss'));



insert into t_sys_menu (MENU_ID, MENU_NAME, PARENT_ID, URL, MENU_ICON, MENU_STYLE, SORT, MEMO, VALID, CREATE_TIME)
values ('17', '项目初审管理(学生处)', '1', 'business/xmgl/xmgl_sh.jsp?type=xsc', null, null, 3, null, '1', to_date('23-09-2018 23:13:37', 'dd-mm-yyyy hh24:mi:ss'));



insert into t_sys_menu (MENU_ID, MENU_NAME, PARENT_ID, URL, MENU_ICON, MENU_STYLE, SORT, MEMO, VALID, CREATE_TIME)
values ('18', '项目复审管理(管理员)', '1', 'business/xmgl/xmgl_fs.jsp', null, null, 5, null, '1', to_date('23-09-2018 23:13:37', 'dd-mm-yyyy hh24:mi:ss'));


-- 修改心里测评默认值为空
alter table t_xm_xssqjl modify xlcp default null;


-- Add comments to the columns
comment on column T_XM_XSSQJL.xlcp is '心理测评值 A 合格 B不合格 C 待定';

---------------已执行 2019年7月1日09:06:04------------------------------