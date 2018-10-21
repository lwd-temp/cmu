select *
  from t_sys_menu
  
  
  
  

select distinct *

  from t_sys_menu
 where menu_id in (select role_menu.menu_id
                     from t_sys_role_menu role_menu
                    inner join t_sys_user_role user_role
                       on role_menu.role_id = user_role.role_id
                    where user_role.user_id = '19981022')

 order by sort


 
