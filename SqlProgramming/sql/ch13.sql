--Section01 시퀀스 생성
create sequence seq_1;
--다음 수 얻기
select seq_1.nextval from dual;
--현재부여된 번호
select seq_1.currval from dual;

create sequence seq_2
  start with 101
  increment by 10
  maxvalue 1000
  nocycle
  nocache;
  
select seq_2.nextval from dual;

drop sequence seq_1;
drop sequence seq_2;

--Section04 인덱스 개요 , 위에서 아래로 테이블 검색을 table scan 이라고 한다. 좀 더 데이터를 빨리 찾을때 사용 / where 조건절에서 많이 쓰이는 컬럼일때 인덱스를 만들어라.
set timing on;
select * from board where btitle='제목9333';
--인덱스만드는방법1, 중복허용이 되는 컬럼에 사용
create index idx_board_btitle on board(btitle);
select * from board where btitle like '%제목9333%';
drop index idx_board_btitle;

--인덱스만드는방법2, 중복허용이 되지 않는 컬럼에 사용 , primary key /unique 제약을 할때 자동으로 만들어진다.
create unique index seq_board_bno on board(bno);
select * from board where bno=9333;
drop index seq_board_bno;











