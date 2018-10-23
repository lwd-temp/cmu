select distinct zyh, zymc from (
select bkszy.zyh zyh,bkszy.zymc zymc from v_bks_zyxxsjxx bkszy
union all
select yjszy.zyh zyh, yjszy.zymc zymc from v_yjs_zyxxsjxx yjszy)
