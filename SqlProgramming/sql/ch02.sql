-- 1.1 문장과 절
select * from emp;

-- 1.2 특정 데이터만 보기
select empno, ename from emp;
select ename, sal from emp;

-- 1.3 산술연산자
select ename, sal, sal*12 from emp;

-- 1.4 Null 연산시 주의할 점
select ename, sal, comm, sal*12+comm from emp;    -- 연산에 NULL 이 있으면 결과는 NULL 이 나온다.
select ename, sal, comm, sal*12+nvl(comm, 0) from emp;    -- nvl 함수 호출. comm 이 null 이면 0

-- 함수 -> 실행 블록
-- 메소드 -> 객체(실행블록(기능)) => 객체 안에 있는 실행블록

-- 1.5 컬럼 이름에 별칭 지정하기
select ename as 이름, sal as 월급, comm 보너스, sal*12+nvl(comm, 0) 연봉 from emp;   -- as 생략가능

-- 1.6 Concatenation 연산자의 정의와 사용 (문자열 결합)
select empno || '-' || ename as 이름 from emp;
select ename || '의 직급은 ' || job || ' 입니다.' from emp;
  
-- 1.7 DISTINCT 키워드(중복제거)
-- 사원이 있는 부서 번호는?
SELECT DEPTNO FROM EMP;
SELECT DISTINCT DEPTNO FROM EMP;

-------------------------------------------------------------------------------------------

-- 조건절 작성
SELECT ENAME FROM EMP WHERE DEPTNO=20;

-- 2.1 비교 연산자
