drop database if exists testdb;
create database testdb default character set utf8;

use testdb;

drop table if exists user;
create table user(
	id int(11) auto_increment primary key,
	username varchar(20) not null unique,
	password varchar(20) not null,
	nick_name varchar(10) not null,
	name varchar(10) not null,
	sex varchar(1) check(sex='男' or sex='Ů'),
	age int(2),
	school int(2),
	studentid varchar(20) not null unique,
	summary varchar(100),
	datetime timestamp not null default current_timestamp,
	status int(2) not null default 1
)engine=InnoDB auto_increment=1 default charset=utf8;
insert into user values(null,'user','user','user','user','男',20,1,'123456','hello world!!',null,1);