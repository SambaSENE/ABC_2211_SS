CREATE TABLE emp (
  empno int PRIMARY KEY,
  ename varchar(50),
  job varchar(50),
  mgr int,
  hiredate date,
  sal decimal(10, 2),
  comm decimal(10, 2),
  deptno int
);


ALTER TABLE emp
ADD CONSTRAINT fk_emp_mgr
FOREIGN KEY (mgr)
REFERENCES emp(empno);

CREATE TABLE dept (
  deptno int PRIMARY KEY,
  dname varchar(50),
  loc varchar(50)
);

/*EXERCICE 1
*/

SELECT ename, job, empno, sal FROM emp;

SELECT ename, job, empno, sal 
FROM emp 
WHERE deptno = 10;

/*EXERCICE 2*/

SELECT ename, job, sal 
FROM emp 
WHERE job = 'MANAGER' AND sal > 2800;
/*EXERCICE 3*/

SELECT ename, job 
FROM emp 
WHERE job = 'MANAGER' AND deptno != 30;

/*EXERCICE 4*/
SELECT ename, job, sal 
FROM emp 
WHERE sal BETWEEN 1200 AND 1400;