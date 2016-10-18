select ename, sal, to_char(hiredate,'DD/MM/YYYY') from emp;

select deptno as 부서번호, dname as 부서명 from dept;

select distinct job from emp;

select empno,ename,sal from emp where 300>=sal;

select empno,ename,sal from emp where sal IN(250,300,500);
select empno,ename,sal from emp where sal=250 OR sal=300 OR sal=500;
select empno,ename,sal from emp where NOT sal IN(250,300,500);

select empno,ename from emp where ename like '김%' Or ename like '%기%';
select * from emp where mgr is null;