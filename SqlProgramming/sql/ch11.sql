--Section01 서브쿼리의 기본 개념
--테이블간의 데이터를 연결(Join문으로 변경가능)
--이문세 사원의 부서 이름은?????? 글쒜
select dname
from dept
where deptno=(select deptno from emp where ename='이문세'); --서브쿼리라고 한다.
--특수한 경우가 아닌경우 서브쿼리가 조인보다 빠르다.
select dname
from emp,dept
where emp.deptno = dept.deptno
  and dname='이문세';
  
--1.1 단일행 서브 쿼리
--이문세 사원의 부서명은
select dname
from dept
where deptno=(select deptno from emp where ename='이문세'); -- 서브쿼리의 수행 결과가 오직 하나의 행 만을 반환하는 것을 단일행 서브 쿼리라고 한다.
--최저 봉급을 받아가는 사원의 정보는?
select * from emp where sal=(select min(sal) from emp);
--평균 봉급 이상을 받아가는 사원의 수는?
select count(*) from emp where sal>=(select avg(sal) from emp);

--Section02 다중행 서브 쿼리 (in을 쓰고 처리한다.)
--서울에 근무하는 사원의 이름은?
select ename
from emp
where deptno in (select deptno from dept where loc='서울');

--2.4 EXISTS 연산자
--사원이 1명이라도 존재하는 부서의 이름은?
select distinct dname
from dept d,emp e
where e.DEPTNO=d.DEPTNO;

select dname
from dept
where exists (select * from emp where emp.deptno=dept.deptno);
--사원이 존재하지않는 부서이름은?
select dname
from dept
where not dname in (select distinct dname
from dept d,emp e
where e.DEPTNO=d.DEPTNO);

select dname
from dept
where not exists (select * from emp where emp.deptno=dept.deptno);

--Section03 서브쿼리를 이용하여 테이블을 생성하고 데이터를 조작하기 
--emp테이블 복제해서 emp2로 만드세요(하나의 DDL로 작성하시요)
--제약 조건(PK,FK,check 조약,not null)은 복제가 되지 안ㅅ습니다.
--인덱스도 복제가 되지 않습니다.
create table emp2
as
select * from emp;
--emp 테이블의 구조만 복제해서 emp3로 만드세요
--제약 조건과 인덱스는 복제하지 않아도 됨.
create table emp3
as 
select * from emp where 1=0; --false가 되면 된다!!
--3.3 서브 쿼리로 데이터를 삽입하기
--emp3을 만들었다면 10번 부서의 사원들만 복사하세요
insert into emp3 --values을 쓰면 한개의 결과값만 넣고 없을경우 여러 결과를 넣을수 있다.
select * from emp where deptno=10;

--3.4서브 쿼리를 이용한 데이터 변경
--20번 부서의 위치를 40분 부서의 위치로 변경하이소.
update dept set loc=(select loc from dept where deptno=40) where deptno=20;

--3.5서브 쿼리를 이용한 데이터 삭제
--영업부서의 사원을 삭제하세요.
delete emp where deptno=(select deptno from dept where dname='영업부');




























