use demo;

create table if not exists t_department (
	id int(10) not null auto_increment,
	name varchar(50),
	index(id),
	primary key(id)
) engine innodb default character set utf8;

create table if not exists t_employee (
	id int(10) not null auto_increment,
	name varchar(50),
	gender int(1),
	birthday date,
	dept_id int(10),
	index(id, dept_id),
	primary key(id),
	foreign key(dept_id) references t_department(id) 
) engine innodb default character set utf8;

insert into t_department(name) values('部门一');
insert into t_department(name) values('部门二');
insert into t_department(name) values('部门三');

insert into t_employee(name, gender, birthday, dept_id) values ('赵波', 1, '1986-05-29', 1);
insert into t_employee(name, gender, birthday, dept_id) values ('djh', 0, '1988-03-22', 2);
insert into t_employee(name, gender, birthday, dept_id) values ('aa', 1, '1986-05-22', 3);
