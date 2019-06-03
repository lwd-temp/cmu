 Oracle 增加修改删除字段


添加字段的语法：alter table tablename add (column datatype [default value][null/not null],….);

修改字段的语法：alter table tablename modify (column datatype [default value][null/not null],….);

删除字段的语法：alter table tablename drop (column);



添加、修改、删除多列的话，用逗号隔开。



使用alter table 来增加、删除和修改一个列的例子。



创建表结构：
create table test1
(id varchar2(20) not null);



增加一个字段：

alter table test1
add (name varchar2(30) default ‘无名氏’ not null);



使用一个SQL语句同时添加三个字段：

alter table test1
add (name varchar2(30) default ‘无名氏’ not null,

age integer default 22 not null,

has_money number(9,2)

);



修改一个字段

alter table test1
modify (name varchar2(16) default ‘unknown’);



另：比较正规的写法是：

-- Add/modify columns
alter table TABLE_NAME rename column FIELD_NAME to NEW_FIELD_NAME;



删除一个字段

alter table test1
drop column name;



需要注意的是如果某一列中已经存在值，如果你要修改的为比这些值还要小的列宽这样将会出现一个错误。

例如前面如果我们插入一个值
insert into test1
values (’1′,’我们很爱你’);

然后曾修改列： alter table test1
modify (name varchar2(8));
将会得到以下错误：
ERROR 位于第 2 行:
ORA-01441: 无法减小列长度, 因为一些值过大

---------------------------------------------------------------------------------------------------------------

高级用法：

重命名表
ALTER TABLE table_name RENAME TO new_table_name;



修改列的名称

语法：
ALTER TABLE table_name RENAME COLUMN supplier_name to sname;

范例：
alter table s_dept rename column age to age1;



附：创建带主键的表>>

create table student (
studentid int primary key not null,
studentname varchar(8),
age int);



1、创建表的同时创建主键约束
（1）无命名
create table student (
studentid int primary key not null,
studentname varchar(8),
age int);
（2）有命名
create table students (
studentid int ,
studentname varchar(8),
age int,
constraint yy primary key(studentid));


2、删除表中已有的主键约束
（1）无命名
可用 SELECT * from user_cons_columns;
查找表中主键名称得student表中的主键名为SYS_C002715
alter table student drop constraint SYS_C002715;
（2）有命名
alter table students drop constraint yy;


3、向表中添加主键约束
alter table student add constraint pk_student primary key(studentid);

 ---------------------------------------------------------------------------------------------------------------

转载自http://georgeinfo.blog.163.com/blog/static/163683341201112655637737/

版权给原创所有！
