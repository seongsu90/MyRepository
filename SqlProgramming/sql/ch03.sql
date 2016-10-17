--Section01 Dual 테이블
select * from dual;
select 10+20 from emp; --emp테이블의 행의 수만큼 결과값이 출력된다. 한개만 얻을려면 dual을 쓴다.
select sysdate from dual; -- 괄호가 없는 시스템함수를 프로시저라고 한다.DBMS의 날짜를 출력한다.
--Section02 숫자 함수
--2.1 절대값을 구하는 ABS 함수
select abs(-10) as 절대값 from dual;
SELECT ABS(-15) "Absolute"  FROM DUAL;
-------------------------
update emp set sal=sal/4;
select * from emp;
rollback;
select * from emp;
update emp set sal=sal/7;
select * from emp;
---------------------
--소수 첫째자리까지 나타내기(반올림)
select sal,round(sal) from emp;
select sal,round(sal,1) from emp; --소수점 첫자리까지 나타내기
--바로 아래 정수(소수를 정수로 만드는 방법(소수점 전부 지우기))
select sal,floor(sal) from emp;
--바로 위 정수 (올림)
select sal,ceil(sal) from emp;
--소수 첫째자리까지 나타내기(잘라내기)
select sal, trunc(sal,1) from emp;

--Section03 문자 처리 함수
--3.1 대소문자 변환함수 (한글하곤 상관없음)
select * from employees;
select phone_number from employees where lower(first_name)='steven';
--3.3 문자 조작 함수
--3.3.1 문자열 일부만 추출하는 SUBSTR 함수
select * from employees;
select substr(first_name,1,5) from employees;
--3.3.5 특정 기호로 채우는 LPAD/RPAD 함수
select lpad('oracle',20,'*') from dual;
select rpad('oracle',20,'*') from dual;
--10자리 공간에 사원 이름을 5자리까지만 나오게 하고 나머지는  * 처리 오른쪽 // 시험문제
select rpad(substr(first_name,1,5),10,'*') from employees;

--Section 형 변환 함수
--4.1.1 날짜형을 문자형으로 변환하기 중요!
select hire_date,to_char(hire_date,'YYYY.MM.DD DAY') from employees;
--4.2 문자형을 날짜형으로 변환하기 중요!
select first_name,hire_date from employees where hire_date=to_date('06-17-2003','MM-DD-YYYY');

--Section05 날짜함수
--5.1 DBMS의 현재 날짜
select sysdate from dual;
--DBMS의 현재 날짜를 "2016.10.17 월요일" 로 변환해 보세요/. 시험
select to_char(sysdate,'YYYY.MM.DD DAY') from dual;

--Section06 Null을 다른 값으로 변환하는 NVL 함수 10월17일 종료
select salary*12 + nvl(commission_pct,0)*salary from employees;
select nvl2(commission_pct,salary*12+commission_pct*salary,salary*12) from employees;








