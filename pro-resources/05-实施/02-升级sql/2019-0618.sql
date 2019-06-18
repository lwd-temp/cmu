update t_hy_shenb   t set t.hygm = null ;

commit;

alter table T_HY_SHENB modify hygm number(10);

-----------------已执行 2019年6月18日15:15:11 --------------------------------

