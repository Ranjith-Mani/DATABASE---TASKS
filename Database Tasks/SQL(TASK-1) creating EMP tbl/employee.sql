/* To CREATE a database */
CREATE database employee_db;

/* To CREATE (employee_tbl) TABLE in employee_db */
CREATE table employee_db.employee_tbl(
emp_no int,
emp_name varchar(255),
job varchar(255),
mgr int,
hire_date date,
sal decimal(8,2),
comm decimal(8,2),
dept_no int);

/* To INSERT values in employee_tbl */
/* Employee_1 details */
INSERT into employee_db.employee_tbl( emp_no, emp_name, job, mgr, hire_date, sal, comm, dept_no )
values(8369, "SMITH", "CLERK", 8902, "1990-12-18", 800.00, NULL, 20);

/* Employee_2 details */
INSERT into employee_db.employee_tbl( emp_no, emp_name, job, mgr, hire_date, sal, comm, dept_no )
values(8499, "ANYA", "SALESMAN", 8698, "1991-02-20", 1600.00, 300.00, 30);

/* Employee_3 details */
INSERT into employee_db.employee_tbl( emp_no, emp_name, job, mgr, hire_date, sal, comm, dept_no )
values(8521, "SETH", "SALESMAN", 8698, "1991-02-22", 1250.00, 500.00, 30);

/* Employee_4 details */
INSERT into employee_db.employee_tbl( emp_no, emp_name, job, mgr, hire_date, sal, comm, dept_no )
values(8566, "MAHADEVAN", "MANAGER", 8839, "1991-04-02", 2985.00, NULL, 20);

/* Employee_5 details */
INSERT into employee_db.employee_tbl( emp_no, emp_name, job, mgr, hire_date, sal, comm, dept_no )
values(8654, "MOMIN", "SALESMAN", 8698, "1991-09-28", 1250.00, 1400.00, 30);

/* Employee_6 details */
INSERT into employee_db.employee_tbl( emp_no, emp_name, job, mgr, hire_date, sal, comm, dept_no )
values(8698, "BINA", "MANAGER", 8839, "1991-05-01", 2850.00, NULL, 30);

/* Employee_7 details */
INSERT into employee_db.employee_tbl( emp_no, emp_name, job, mgr, hire_date, sal, comm, dept_no )
values(8882, "SHIVANSH", "MANAGER", 8839, "1991-06-09", 2450.00, NULL, 10);

/* Employee_8 details */
INSERT into employee_db.employee_tbl( emp_no, emp_name, job, mgr, hire_date, sal, comm, dept_no )
values(8888, "SCOTT", "ANALYST", 8566, "1992-12-09", 3000.00, NULL, 20);

/* Employee_9 details */
INSERT into employee_db.employee_tbl( emp_no, emp_name, job, mgr, hire_date, sal, comm, dept_no )
values(8839, "AMIR", "PRESIDENT", NULL, "1991-11-18", 5000.00, NULL, 10);

/* Employee_10 details */
INSERT into employee_db.employee_tbl( emp_no, emp_name, job, mgr, hire_date, sal, comm, dept_no )
values(8844, "KULDEEP", "SALESMAN", 8698, "1991-09-08", 1500.00, 0.00, 30);

/* To display table */
SELECT * FROM employee_tbl;

/* To display emp_name and sal of employees whose salary are greater than or equal to 2200 */
SELECT emp_name, sal FROM employee_tbl WHERE sal >= 2200;

/* To display employees who are not recieving a commission */
SELECT * FROM employee_tbl WHERE comm IS NULL;

/* To display emp_name and sal who don't have their salary in the range of 2500 to 4000 */
SELECT emp_name, sal FROM employee_tbl WHERE sal < 2500 OR sal > 4000;

/* To display emp_name, job, sal of employees who don't have a manager */
SELECT emp_name, job, sal FROM employee_tbl WHERE mgr IS NULL; 

/* To display the name of an employees whose name contains 'A' as a third alphabet */
SELECT emp_name FROM employee_tbl WHERE emp_name LIKE '__A%';

/* To display the name of an employees whose name contains 'T' as a last alphabet */
SELECT emp_name FROM employee_tbl WHERE emp_name LIKE '%T';
