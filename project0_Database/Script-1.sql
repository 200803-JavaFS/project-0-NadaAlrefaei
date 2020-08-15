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
is_active boolean,
acc_id integer primary key,
balance integer,
acc_type varchar(10),
acc_num integer,
user_id integer references Users(user_id)
);