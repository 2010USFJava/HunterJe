create schema if not exists hunterjdbcbank authorization jenny77;
set search_path to hunterjdbcbank;

--create tables
create table customer(
"Customer_Id" serial primary key,
"First_Name" varchar not null,
"Last_Name" varchar not null,
"Address" varchar not null,
"username" varchar not null unique,
"password" varchar not null
);

create table employee(
"Employee_id" serial primary key,
"Emp_username" varchar not null unique,
"Emp_password"varchar not null
);

create table accounts(
cid serial not null unique,
first_name varchar not null,
last_name varchar not null,
balance numeric(100),
foreign key (cid) references customer on delete cascade
);

--select from statements
select * from customer;
select * from employee;
select * from accounts;

insert into employee ("Employee_id", "Emp_username", "Emp_password") values
(1001, 'emp01', 'al77');

alter table accounts
rename column "Account_id" to account_id;

alter table accounts
rename column customer_id to cid;

alter table customer
rename column "Customer_Id" to cid;

alter table customer
add column balance numeric;

alter table accounts
rename column "Balance" to balance;

drop table accounts;
