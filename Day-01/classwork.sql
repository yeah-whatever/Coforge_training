create database mydatabase;
use mydatabase;
CREATE table tbl_employee(
eid int,
ename varchar(20),
esalary int
);
desc tbl_employee;
insert INTO tbl_employee VALUES(
101,
"Ramesh",
10000
);
insert INTO tbl_employee VALUES(
102,
"Laasya",
20000
);
select * from tbl_employee;
select eid,esalary from tbl_employee;

Insert INTO tbl_employee VALUES(103,null,30000);  -- Method 1 for passing null value 
Insert INTO tbl_employee (eid,esalary) VALUES(104,40000); -- Method 2 for passing null value 

select * from tbl_employee where eid=101;
select * from tbl_employee where eid!=101;
select * from tbl_employee where eid <> 101;  -- Functionality of <> is same as that of !=
select ename from tbl_employee where esalary<=30000;

select eid,ename from tbl_employee where ename is null;
select eid,ename from tbl_employee where ename is not null;

select * from tbl_employee where eid in (101,103);
select * from tbl_employee where eid not in (101,103);

select * from tbl_employee where eid=105;

select * from tbl_employee where esalary between 10000 and 40000; -- The result is given INCLUDING the tuples where salary equals to 10000 or 40000
select * from tbl_employee where esalary between 40000 and 10000; -- The result is blank 
-- We use upper limit first and  lower limit next to get the negative values

select * from tbl_employee where esalary not between 40000 and 10000;

select * from tbl_employee where ename like 'R%';
select * from tbl_employee where ename like '_a%'; -- single character before a;zero or more characters after a
select * from tbl_employee where ename like '%e%';

SET SQL_SAFE_UPDATES=0;
update tbl_employee set esalary=0 where eid=101;
rollback;  -- May not be working because you might have selected "auto-commit" in the settings during installation
select * from tbl_employee;    
delete from tbl_employee where ename is null;

select 'Lahari' from tbl_employee;
select 'Lahari',100+200 from tbl_employee;
select eid,'Lahari',100+200 from tbl_employee;

select eid,sysdate(),'Lahari',100+200 from tbl_employee;
select eid as "Employee id",sysdate(),'Lahari',100+200 from tbl_employee;  -- Only the display column name of eid changes to Employee id, but the column name remains as eid in the base table
select eid as "Employee id",sysdate() as "current date",'Lahari',100+200 as "sum" from tbl_employee;

alter table tbl_employee add column dno integer;
alter table tbl_employee add column dsalary integer;
alter table tbl_employee drop column dno;
alter table tbl_employee rename column eid to empid;

truncate table tbl_employee;  -- permanently deletes all the records in the table
rename table tbl_employee to tbl_employee1;
drop table tbl_employee;  -- permanently deletes the entire table
