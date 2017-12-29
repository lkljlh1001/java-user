create table sungjuk (
sjno int primary key,
name nvarchar2(6) not null,
kor number(3),
eng number(3),
mat number(3),
tot number(3),
avrg number(4,1),  --소수점 한자리 포함
grd nvarchar2(1),
regdate timestamp default sysdate
);  --성적 테이블 생성

create sequence sjno ; -- 시퀀스 생성

insert into sungjuk 
(sjno,name,kor,eng,mat,tot,avrg,grd)
values
(sjno.nextval,'혜교',99,98,99,296,99.8,'가');  -- 실행할 문장을 드래그 하고 alt x 누르면 넣어짐
--성적 데이터 추가

select sjno,name,kor,eng,mat from sungjuk
order by sjno desc;
--성적 데이터 전체 조회
select * from sungjuk
where sjno = 1;
--상세 성적 데이터 조회
