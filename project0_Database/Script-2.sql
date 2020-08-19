create database bank;

create table Users(

user_id serial primary key,
user_name varchar(20),
user_type varchar(10),
last_name varchar(20),
first_name varchar(20),
bdate varchar(20)

);

--drop table Users;
--drop table Account;

create table Account(

user_password varchar(20),
acc_id int primary key,
acc_balance numeric,
acc_type integer,
acc_num integer,
username varchar(30),
user_id int references Users(user_id)
);


insert into Account(user_password,acc_id,acc_balance,acc_type,acc_num,username)
values('nada12345', '12345', '100','1','1','nada'),
('ahmad12345', '22345', '500','1','1','ahmad');

insert into Users(user_name, user_type, last_name,first_name,bdate)
values('nada12345', 'customer','alrefaei','nada','08/15'),
('ah12345', 'customer','alref','ahmad','05/14')

--delete from Account where acc_id =12345;