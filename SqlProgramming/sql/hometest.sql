--ch10 11번
select e.ename, d.deptno,d.dname
from emp e
inner join dept d
on e.deptno=d.deptno;

--ch10 12번
select e.ename, e.hiredate
from emp e, dept d
where e.DEPTNO=d.DEPTNO
and d.DNAME='경리부';

--ch10 13번
select e.ename, d.dname
from emp e, dept d
where e.DEPTNO=d.DEPTNO
and e.JOB='과장';

--ch10 14번
select work.ename, work.job
from emp work, emp manager
where work.mgr = manager.empno
and manager.ename='감우성';

--ch10 15번
select work.ename, friend.ename
from emp work, emp friend
where work.deptno=friend.deptno
and work.ename='감우성'
and not friend.ENAME='감우성';

--ch11 7번
create table emp06
as
select * from emp where 1=0;

insert into emp06 select * from emp;

select * from emp06;

--ch11 8번
select ename, sal, job
from emp06
where sal > (select min(sal)from emp06 where job='과장')
and not job='과장' order by sal desc;

--ch11 9번
update emp06 
set sal=sal+100
where deptno=(select deptno
               from dept
               where loc='인천');

select * from emp06 order by empno;

--ch11 10번
delete emp06 where deptno=(select deptno from dept where dname='경리부');
select * from emp06;

--ch11 11번
select ename, deptno
from emp 
where deptno=(select deptno from emp where ename='이문세')
and not ENAME='이문세';

--ch11 12번
select * from emp where job= (select job from emp where ename='이문세')
and not ename='이문세';

--ch11 13번
select ename,sal
from emp
where not ename='이문세'
and sal>=(select sal from emp where ename='이문세');

--ch11 14번
select ename, deptno
from emp
where deptno = (select deptno from dept where loc='인천');

--ch11 15번
select ename, sal, mgr
from emp
where mgr = (select empno from emp where ename='감우성');

--ch11 16번
select empno, ename, sal, deptno
from emp e
where sal = (select Max(sal) from emp where deptno = e.deptno);

--ch11 17번 
select deptno, dname, loc
from dept
where deptno in (select deptno from emp where job='과장');

--ch11 18번
select ename, sal, job
from emp
where sal > all(select sal from emp where job='과장');

--ch13 3번

