create table customers(
customer_number int auto_increment primary key,
fullname varchar(50) ,
address varchar(255) unique,
email varchar(255) unique,
phone int unique
) ;
create table accounts(
account_number int auto_increment primary key ,
account_type varchar(255) ,
date date ,
balance int ,
customer_number_id int ,
foreign key(customer_number_id) references customers(customer_number)
);
create table transactions(
tran_number int auto_increment primary key,
account_number int,
date date,
amounts double ,
descriptions varchar(255),
account_number_id int ,
foreign key (account_number_id) references accounts(account_number)
);

