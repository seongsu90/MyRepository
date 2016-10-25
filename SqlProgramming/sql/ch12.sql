-- 행 순번 붙이기
select rownum, bno, btitle
from board order by bno; -- rownum은 정렬되기전에 숫자가 부여된다.

select rownum, bno, btitle
from (select bno, btitle from board order by bno);

select rownum, bno, btitle
from (select bno, btitle from board order by bno desc);

--최근 삽입된 행 5개를 가져와라
select rownum, bno, btitle
from (select bno, btitle from board order by bno desc)
where rownum<=5;


select rownum, bno, btitle
from (select bno, btitle from board order by bno desc)
where rownum>5000; --결과값이 나오지 않는다. rownum은 하나씩 번호를 줄때마다 조건(where)을 확인한다.

--행의 순번이 11번~20번까지를 가져와라
select rn,bno,btitle
from
(select rownum as rn, bno, btitle
from (select bno, btitle from board order by bno desc)
where rownum<=20
)
where rn>=11;

--1페이지에 10개씩 구성하고, n번째 페이지를 가져와라

select rn,bno,btitle
from
(select rownum as rn, bno, btitle
from (select bno, btitle from board order by bno desc)
where rownum<=(n*10) -- n 원하는 페이지 넘버
)
where rn>=((n-1)*10+1);




















