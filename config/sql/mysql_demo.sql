create database if not exists demo;
use demo;
create table if not exists user (
    id int(8) not null auto_increment,
    name varchar(50),
    gender tinyint(1),
    birthday date,
    primary key(id)
) engine innodb default character set utf8;

insert into user (name, gender, birthday) values('赵波', '1', '1986-05-29');
insert into user (name, gender, birthday) values('djh', '0', '1988-03-22');

