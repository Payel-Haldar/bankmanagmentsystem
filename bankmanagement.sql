create database bankmanagement ;
use bankmanagement;
create table signup(formno varchar(20), name varchar(20),father_name varchar(20),dob varchar(20),gender varchar(20),email varchar(30),marital_status varchar(20), address varchar(50),city varchar(25),pincode varchar(20),state varchar(25) );
show tables;
select* from signup;

INSERT INTO signup VALUES();
select* from signup;

create table signupTWO(formno varchar(20), religion varchar(20),category varchar(20),income varchar(20),educational varchar(20),occupation varchar(30),pan varchar(20), aadhar varchar(50),scitizen varchar(25),account varchar(20) );
INSERT INTO signupTWO VALUES();
select* from signupTWO;
create table signup3(formno varchar(20), atype varchar(20),cardno varchar(20),pin varchar(20),facility varchar(20) );
create table login(formno varchar(20),cardno varchar(20),pin varchar(20));
INSERT INTO signup3 VALUES();
select* from signup3;
select* from login;
create table bank(pin varchar(20), date varchar(100),type char(50),amount varchar(20));
drop table bank;
select* from bank;
