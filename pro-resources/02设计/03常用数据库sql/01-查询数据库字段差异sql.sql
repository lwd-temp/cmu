select 

  /*t.TABLE_NAME, count(1) count*/
  t.TABLE_NAME,t.COLUMN_NAME,t.DATA_TYPE
  
  from user_tab_columns t

 where t.TABLE_NAME not like 'T_V_%' and t.TABLE_NAME not like 'V_%'
 /*group by t.TABLE_NAME*/
 order by t.TABLE_NAME,t.COLUMN_NAME,t.DATA_TYPE
