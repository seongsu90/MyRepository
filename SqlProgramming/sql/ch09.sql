--Section04 유일한 값만 허용하는 UNIQUE 제약 조건 10월 20일 수업시작.
drop table member;
create table member(
  mid varchar(10) unique not null, 
  mname varchar(10) not null,
  mage number(3) null,
  memail char(50) unique null,
  mbirth date null
);

insert into member values('user1','사용자1',25,'user1@sw.com',sysdate);
insert into member values('user2','사용자1',25,'user2@sw.com',sysdate);
insert into member values('user3','사용자3',25,null,sysdate);
insert into member values('user4','사용자4',25,null,sysdate);

--Section06 데이터 구분을 위한 PRIMARY KEY 제약조건
--unique 하면서 not null의 특성을 가짐(uniqye+not null) , 한 테이블당 1개만 설정가능
--행을 구별하는 식별값으로 사용
--not null 과 null 이 정의 안 되어있으면 기본값은 null 이다.
drop table member;
create table member(
  mid varchar(10) primary key,
  mname varchar(10) not null,
  mage number(3) null,
  memail char(50) unique null,
  mbirth date null
);

--Section07 참조 무결성을 위한 FOREIGN KEY 제약조건
--외부 테이블의 PK 값만 입력 할 수 있도록 함
drop table board;
create table board(
  bno number(10) primary key,
  btitle char(100) not null,
  bcontent varchar(4000) not null,
  bwriter varchar(10) references member(mid),
  bhitcount number(5) null,
  bdate date null
);

insert into board values(1,'제목1','내용1','user1',0,sysdate);
insert into board values(2,'제목2','내용2','user1',0,sysdate);

--Section08 CHECK 제약 조건
drop table member;
create table member(
  mid varchar(10) primary key,
  mname varchar(10) not null,
  mage number(3) check(mage>=0 and mage<150),
  msex varchar(4) check(msex in ('남자','여자')),
  memail char(50) unique null,
  mbirth date null
);

insert into member values('user1','사용자1',25,'남자','user1@sw.com',sysdate);
insert into member values('user2','사용자1',200,'여자','user1@sw.com',sysdate);
insert into member values('user3','사용자1',null,null,'user1@sw.com',sysdate);
insert into member values('user4','사용자1',30,'중성','user1@sw.com',sysdate);


--Section09 DEFAULT 제약조건
drop table board;
create table board(
  bno number(10) primary key,
  btitle char(100) not null,
  bcontent varchar(4000) not null,
  bwriter varchar(10) not null,
  bhitcount number(5) default 0,
  bkind varchar(15) default '자유',
  bdate date null
);

insert into board values(1,'제목1','내용1','user1',0,'자유',sysdate);
insert into board values(2,'제목2','내용2','user2',default,default,sysdate);
insert into board(bno,btitle,bcontent,bwriter) values(3,'제목3','내용3','user3');

--Section05 컬럼 레벨로 제약 조건 설정 (컬럼을 만들때 정의,not null은 컬럼 레벌정의할때만 쓸 수 있다.)
drop table board;
drop table member;
create table member(
  mid varchar(10) constraint pk_member_mid primary key,
  mage varchar(10) constraint ch_member_mage check(mage>=0 and mage<150)
);
create table board(
  bno number(10) constraint pk_board_bno primary key,
  bwriter varchar(10) constraint fk_board_bwriter references member(mid) --컬럼레벨에선 references만 선언
  
);

--Section10 테이블 레벨로 제약 조건 설정 , (컬럼 설정을 다 한뒤 나중에 정의)
create table member(
  ssn1 varchar(6) not null,
  ssn2 varchar(7) not null,
  mage varchar(10) not null,
  constraint pk_member_ssn primary key(ssn1,ssn2), -- 복합키(Complex Key)
  constraint ch_member_mage check(mage>=0 and mage<150)
);
create table board(
  bno number(10),
  bwriter varchar(10),
  constraint pk_board_bno primary key(bno),
  constraint fk_board_bwriter foreign key(bwriter) references member(mid) --테이블수준으로 레벨 설정할때는 컬럼 명시를 하기위해 foreign key를 선언해야된다.
  
);

--Section11 제약조건 변경하기
--11.1 제약 조건 추가하기.
drop table member;
create table member(
  ssn1 varchar(6) not null,
  ssn2 varchar(7) not null,
  mage varchar(10) not null
);

alter table member
  add constraint pk_member_ssn primary key(ssn1,ssn2);
  
alter table member
  add constraint ch_member_mage check(mage>=0 and mage<150);
  
  create table board(
  bno number(10),
  bwriter varchar(10)
);
alter table member
  add constraint pk_board_bno primary key(bno);

alter table member
  add constraint fk_board_bwriter foreign key(bwriter) references member(mid);
  
--11.3 제약 조건 제거하기
drop table member;
create table member(
  ssn1 varchar(6) not null,
  ssn2 varchar(7) not null,
  mage varchar(10) not null,
  constraint pk_member_ssn primary key(ssn1,ssn2), -- 복합키(Complex Key)
  constraint ch_member_mage check(mage>=0 and mage<150)
);
alter table member drop primary key; -- 테이블당 기본키는 하나이기 때문에 primary만 입력해도 된다.
alter table member drop constraint ch_member_mage; -- 한 테이블의 여러개의 check 제약이 존재할 수 있기 때문에


--Section12 제약조건의 비활성화와 CASCADE
drop table board;
drop table member;
create table member(
  mid varchar(10) constraint pk_member_mid primary key,
  mage varchar(10) constraint ch_member_mage check(mage>=0 and mage<150)
);
create table board(
  bno number(10) constraint pk_board_bno primary key,
  bwriter varchar(10) constraint fk_board_bwriter references member(mid) --컬럼레벨에선 references만 선언
);

--12.1 제약조건의 비활성화
alter table board disable primary key;
--12.2 제약조건의 활성화
alter table board enable primary key;
--12.3 CASCADE
alter table member disable primary key cascade;
alter table member enable primary key; -- 실행안됨
alter table board enable constraint fk_board_bwriter;
--12.4 ON DELETE CASCADE
insert into member values('user1',25);
insert into board values(1,'user1');
insert into board values(2,'user1');
--지우는 방법1 .. 불편하다
delete from board where bwriter='user1';
delete from member where mid='user1';

drop table board;
drop table member;
create table member(
  mid varchar(10) constraint pk_member_mid primary key,
  mage varchar(10) constraint ch_member_mage check(mage>=0 and mage<150)
);
create table board(
  bno number(10) constraint pk_board_bno primary key,
  bwriter varchar(10) constraint fk_board_bwriter references member(mid) on delete cascade --컬럼레벨에선 references만 선언
); --                                                                                              지우는방법2
insert into member values('user1',25);
insert into board values(1,'user1');
insert into board values(2,'user1');
delete from member where mid='user1';














































