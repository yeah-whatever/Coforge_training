create database School;
use School;
CREATE table tbl_students(
studentid int primary key,
studentname varchar(50),
age int,
gender varchar(10),
city varchar(50)
);
INSERT into tbl_students(studentid,studentname,age,gender,city) VALUES
(101,"Rahul",20,"Male","Hyderabad"),
(102,"Priya",19,"Female","Chennai"),(103,"Arjun",21,"Male","Bengaluru"),(104,"Sneha",20,"Female","Mumbai"),(105,"Kiran",22,"Male","Pune");
SELECT * from tbl_students;
SELECT studentname,city from tbl_students;
SELECT * from tbl_students where age>20;
select * from tbl_students where city="Hyderabad";

select * from tbl_students order by studentname asc;
select * from tbl_students order by age desc;  
-- This sorts cities alphabetically, and within each city, names alphabetically.
select * from tbl_students order by city asc,studentname asc;
        
select * from tbl_students where age>19 and age<21;
select * from tbl_students where studentname like "R%";
select * from tbl_students where city like "%i";
select * from tbl_students where age in (20,22);

SET SQL_SAFE_UPDATES=0;
update tbl_students set city="Delhi" where studentname="Rahul";
update tbl_students set age=age+1 where studentname="Arjun";
update tbl_students set city="Kolkata" where studentname="Sneha";

delete from tbl_students where studentid=105;
delete from tbl_students where city="Chennai"
