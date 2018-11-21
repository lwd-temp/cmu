
--创建消息表
create table t_sys_msg(

  type varchar2(100),
  msg varchar2(1000)  ,   
  dd Date 

);


--创建存储过程
create or replace procedure proc_transfer_teacher AUTHID current_user is
  rc       integer;
  cur_time varchar2(100) := to_char(sysdate, 'yyyy-mm-dd_hh24:mi:ss');
  CURSOR cur_jzg IS
    select gh,xm,xbm,sfzjlxm,sfzjh,csrq from v_jzgjcsjxx where sfzjlxm = 'A';
begin
  insert into t_sys_msg values ('tt-tag', cur_time || '-开始', sysdate);
  commit;

  for rec in cur_jzg loop

    select count(1) into rc from t_foreign_teacher where tid = rec.gh;

    if rc <= 0 then
      insert into t_foreign_teacher
        (tid, gh, jsx, jsm, chinese_name, gender, birthday, hzh, hr)
      values
        (rec.gh,
         rec.gh,
         rec.xm,
         rec.xm,
         rec.xm,
         decode(rec.xbm, '1', '01', '2', '02'),
         to_date(rec.csrq, 'yyyy-mm-dd'),
         rec.sfzjh,
         'Y') ;
           insert into t_sys_msg values ('tt-running',  '同步工号:'||rec.gh, sysdate);

        commit;
    end if;
  end loop;

  insert into t_sys_msg values ('tt-tag', cur_time || '结束', sysdate);
  commit;

end proc_transfer_teacher;
/












https://blog.csdn.net/qiao000_000/article/details/4714388




