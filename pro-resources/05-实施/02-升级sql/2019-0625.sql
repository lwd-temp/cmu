insert into t_sys_menu (MENU_ID, MENU_NAME, PARENT_ID, URL, MENU_ICON, MENU_STYLE, SORT, MEMO, VALID, CREATE_TIME)
values ('15', '已发布项目管理', '1', 'business/xmgl/xmgl_admin_list.jsp', null, null, 5, null, '1', to_date('23-09-2018 23:13:36', 'dd-mm-yyyy hh24:mi:ss'));


-- Add/modify columns
alter table T_XM modify xmzyxz VARCHAR2(4000);
---------------已执行 2019年6月25日18:29:02------------------------------