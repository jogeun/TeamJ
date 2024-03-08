
CREATE TABLE PLACE (-- 영화관 장소
place_id int auto_increment,
place_name varchar(500) not null,
adress varchar(1000) not null,
reg_dt timestamp default now(),
chg_dt timestamp,
primary key(place_id)
);
-- COMMIT;

CREATE TABLE PLACE_ROOM (-- 영화관 장소
place_room_id char(1),
place_id int,
place_room_floor int,
reg_dt timestamp default now(),
chg_dt timestamp,
primary key(place_id,place_room_id),
foreign key(place_id) references place (place_id) 
);


CREATE TABLE SHOWS (
shows_id int auto_increment,
shows_name varchar(500) not null,
place_id int,
shows_explain varchar(1000) not null, -- 공연설명
shows_notice varchar(1000) not null, -- 공연 공지사항
open_date VARCHAR(8) not null, -- 티켓오픈일자
open_time VARCHAR(4) not null, -- 티켓오픈시간
start_date varchar(8) not null,-- 공연 개봉일
end_date varchar(8) not null,-- 공연 종료일
price VARCHAR(500) not null,-- 공연가격 기본값 설정
LIMIT_age VARCHAR(100), -- 연령제한
max_shows_cnt int, -- 최대 티켓 구매 가능 수
show_times VARCHAR(100) not null,-- 상영시간 기본값 설정
SHOWS_TYPE CHAR(1),
reg_dt timestamp default now(),
chg_dt timestamp,
primary key(shows_id),
foreign key(place_id) references place (place_id) 
);


CREATE TABLE SEATS (
seats_id int auto_increment,
place_room_id char(1),
place_id int,
seat_row int not null,
seat_col int not null,
seat_flag char(1) default 'N',
reg_dt timestamp default now(),
chg_dt timestamp,
primary key(seats_id),
foreign key(place_id,place_room_id) references PLACE_room (place_id,place_room_id) 

);


CREATE TABLE SHOWS_DT (
shows_dt_id int auto_increment,
shows_id int,
shows_date VARCHAR(8) not null, -- 공연 날짜
shows_time VARCHAR(4) not null, -- 공연 시간 
lead_actor varchar(1000),
sub_actor varchar(1000),
reg_dt timestamp default now(),
chg_dt timestamp,
primary key(shows_dt_id),
foreign key(shows_id) references SHOWS (shows_id) 
);

CREATE TABLE USER_BOOK (
book_id varchar(13),
place_id int,
seats_id int,
shows_dt_id int,
user_tel varchar(50),
user_email varchar(200),
user_birth varchar(8),
book_flag char(1) default 'N', -- 좌석이 여러개여도 -> 영화시간마다 예약여부가 다르니 사용자의 예약 정보로 구분해야할듯요..? 대신 예약하면 발번정보 생성하는데 -> 예매 취소하면 C, 유저정보 지움 -> 해당건은 카운트 안함
user_session varchar(2000),
reg_dt timestamp default now(), -- 예약날짜
chg_dt timestamp,
primary key(book_id),
foreign key(place_id) references PLACE (place_id) ,
foreign key(shows_dt_id) references SHOWS_DT (shows_dt_id) ,
foreign key(seats_id) references SEATS (seats_id) 
);



insert into place(place_name, adress) values ('오리역','경기 성남시 분당구 성남대로38 구미동 185-1');
insert into place(place_name, adress) values ('죽전역','경기 용인시 수지구 포은대로 530');

commit;

select * FROM PLACE_ROOM;

insert into place_room(place_room_id,place_id,place_room_floor)
values ('A',1,1);
insert into place_room(place_room_id,place_id,place_room_floor)
values ('B',1,2);
insert into place_room(place_room_id,place_id,place_room_floor)
values ('A',2,1);
insert into place_room(place_room_id,place_id,place_room_floor)
values ('B',2,2);

commit;

select * from seats;

insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,1,1);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,1,2);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,1,3);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,1,4);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,1,5);

insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,2,1);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,2,2);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,2,3);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,2,4);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,2,5);

insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,3,1);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,3,2);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,3,3);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,3,4);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,3,5);

insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,4,1);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,4,2);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,4,3);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,4,4);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,4,5);

insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,5,1);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,5,2);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,5,3);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,5,4);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',1,5,5);


insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,1,1);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,1,2);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,1,3);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,1,4);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,1,5);

insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,2,1);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,2,2);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,2,3);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,2,4);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,2,5);

insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,3,1);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,3,2);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,3,3);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,3,4);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,3,5);

insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,4,1);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,4,2);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,4,3);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,4,4);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,4,5);

insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,5,1);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,5,2);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,5,3);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,5,4);
insert into seats(place_room_id,place_id,seat_row,seat_col) values ('A',2,5,5);

insert into shows(shows_name,SHOWS_TYPE, place_id, shows_explain, shows_notice
,open_date,open_time,start_date, end_date, price, LIMIT_age,show_times,max_shows_cnt) values
('레미제라블','M',1,'프랑스의 소설가 빅토르 위고가 1862년에 발표한 소설로 프랑스 혁명전후 19세기의 프랑스 왕국~7월 왕정 기간[2]의 시대적 배경을 가지고 있으며,사랑, 용기, 희생, 인간 본성 등 다양한 주제를 다룬 대하소설로 그의 대표작이자 프랑스를 대표하는 최고의 걸작 중 하나이며 서양 문학사의 가장 위대한 소설 중 하나로 평가받는다.','■ 예매자는 본 안내페이지의 모든 내용을 숙지 및 동의한 것으로 간주합니다.\n
- 관람연령 / 티켓수령 / 공연 관람 안내 미숙지로 인한 책임은 관람자 본인에게 있으며, 이로 인한 공연 당일 취소 및 변경, 환불은 불가하오니 각별히 유의하시기 바랍니다.\n
- 공연 운영관련 변경사항이 발생될 경우 예매자 정보입력 시 기재된 연락처로 문자 안내 드립니다. 잘못된 연락처 기입으로 인한 책임은 예매자 본인에게 있으니 올바른 기입 바랍니다.','20240105','1700','20240106','20240117',
'VIP석 180000 / R석 150000 / S석 120000 / A석 90000','초등학생 이상','	180 분(인터미션 : 20분)',5
);

insert into shows(shows_name,SHOWS_TYPE, place_id, shows_explain, shows_notice
,open_date,open_time,start_date, end_date, price, LIMIT_age,show_times,max_shows_cnt) values
('뮤지컬 〈레베카〉 10주년 기념 공연 앙코르','M',1,'《레베카》(Rebecca)는 영국의 소설가 대프니 뒤 모리에가 쓴 동명의 소설을 원작으로 한 뮤지컬 작품이다. 《엘리자벳》, 《모차르트!》를 제작한 미하엘 쿤체와 실베스터 르베이가 제작하였다. 대한민국에서는 EMK뮤지컬컴퍼니의 프로덕션으로 2013년 초연하였고, 2014년과 2016년, 2017년[1], 2019년[2]까지 꾸준히 공연될 정도로 대중적 인기가 높은 작품이다. 신영숙은 다섯 시즌 연속으로 댄버스 부인 역을 맡았다.','■ 예매자는 본 안내페이지의 모든 내용을 숙지 및 동의한 것으로 간주합니다.\n
- 관람연령 / 티켓수령 / 공연 관람 안내 미숙지로 인한 책임은 관람자 본인에게 있으며, 이로 인한 공연 당일 취소 및 변경, 환불은 불가하오니 각별히 유의하시기 바랍니다.\n
- 공연 운영관련 변경사항이 발생될 경우 예매자 정보입력 시 기재된 연락처로 문자 안내 드립니다. 잘못된 연락처 기입으로 인한 책임은 예매자 본인에게 있으니 올바른 기입 바랍니다.','20240103','1800','20240106','20240117',
'VIP석 170000 / R석 140000 / S석 110000 / A석 80000','8세 이상','175분(인터미션 : 20분)',10
);

-- AGE NULL일시 연령제한 X 
insert into shows(shows_name,SHOWS_TYPE, place_id, shows_explain, shows_notice
,open_date,open_time,start_date, end_date, price, LIMIT_age,show_times,max_shows_cnt) values
('CHA EUN-WOO 2024 Just One 10 Minute [Mystery Elevator] in Seoul','C',2,'차은우 팬미팅','공연정보
- 공연명 : CHA EUN-WOO 2024 Just One 10 Minute [Mystery Elevator] in Seoul\n
- 공연일시 : 2024년 2월 17일(토) 오후 6시(KST)\n
- 공연장소 : 잠실실내체육관\n
- 티켓가격 : VVIP석 165,000원 / VIP석 154,000원 / R석 143,000원','20240215','1830'
,'20240217','20240217','VVIP석 165000 / VIP석 154000 / R석 143000',NULL,'120',2
);

COMMIT;

-- 좌석 가격 추가
ALTER TABLE seats ADD COLUMN seat_type char(1) AFTER seat_flag;
commit;

update seats 
set seats_type = 'A'
WHERE SEATS_ID between 1 and 50;



insert into SHOWS_DT(shows_ID,SHOWS_DATE, SHOWS_TIME, LEAD_ACTOR, sub_actor) values
(1,
 '20240110',
 '1200',
 '민우혁, 최재림',
 '김우형, 카이, 조정은, 린아, 임기홍, 육현욱'
);
insert into SHOWS_DT(shows_ID,SHOWS_DATE, SHOWS_TIME, LEAD_ACTOR, SUB_ACTOR) values
(1, '20240110','1430','최재림','조정은, 린아, 임기홍, 육현욱, 박준면, 김영주')
;

insert into SHOWS_DT(shows_ID,SHOWS_DATE, SHOWS_TIME, LEAD_ACTOR, SUB_ACTOR) values
(1, '20240111','1200','장세린, 이형준','박준면, 김영주, 김성식, 김진욱, 김수하, 루미나, 윤은오, 김경록, 이상아, 류인아, 장세린, 이형준')
;
insert into SHOWS_DT(shows_ID,SHOWS_DATE, SHOWS_TIME, LEAD_ACTOR, SUB_ACTOR) values
(3, '20240217','1800','차은우',NULL)
;
insert into SHOWS_DT(shows_ID,SHOWS_DATE, SHOWS_TIME, LEAD_ACTOR, SUB_ACTOR) values
(1, '20240110','1800','김성식','임기홍, 육현욱, 박준면, 김영주, 김성식, 김진욱, 김수하, 루미나, 윤은오, 김경록, 이상아')
;

insert into SHOWS_DT(shows_ID,SHOWS_DATE, SHOWS_TIME, LEAD_ACTOR, SUB_ACTOR) values
(2, '20240111','1800','김성식','임기홍, 육현욱, 박준면, 김영주, 김성식, 김진욱, 김수하, 루미나, 윤은오, 김경록, 이상아')
;


insert into SHOWS_DT(shows_ID,SHOWS_DATE, SHOWS_TIME, LEAD_ACTOR, sub_actor) values
(2,
 '20240112',
 '1200',
 '민우혁, 최재림',
 '김우형, 카이, 조정은, 린아, 임기홍, 육현욱'
);
insert into SHOWS_DT(shows_ID,SHOWS_DATE, SHOWS_TIME, LEAD_ACTOR, SUB_ACTOR) values
(2, '20240111','1430','최재림','조정은, 린아, 임기홍, 육현욱, 박준면, 김영주')
;

insert into SHOWS_DT(shows_ID,SHOWS_DATE, SHOWS_TIME, LEAD_ACTOR, SUB_ACTOR) values
(2, '20240111','1200','장세린, 이형준','박준면, 김영주, 김성식, 김진욱, 김수하, 루미나, 윤은오, 김경록, 이상아, 류인아, 장세린, 이형준')
;

insert into SHOWS_DT(shows_ID,SHOWS_DATE, SHOWS_TIME, LEAD_ACTOR, SUB_ACTOR) values
(1, '20240112','0900','조정은, 린아','임기홍, 육현욱, 박준면, 김영주, 김성식, 김진욱, 김수하, 루미나, 윤은오, 김경록, 이상아')
;


SELECT * FROM USER_BOOK;
-- 날짜(6) +  SHOWS_TYPE + SEQ(6)

insert into USER_BOOK(BOOK_ID, place_id, SEATS_ID, SHOWS_DT_ID,
USER_TEL, USER_EMAIL, USER_BIRTH, BOOK_FLAG) values(
'240109M111111',1,10,1,'01011112222','km@naver.com','20231019','Y') -- Y만 생성하기 
;

insert into USER_BOOK(BOOK_ID, place_id, SEATS_ID, SHOWS_DT_ID,
USER_TEL, USER_EMAIL, USER_BIRTH, BOOK_FLAG) values(
'240109M111112',1,4,2,'','','','C') -- 예매하다 취소한 애들 + 유저정보 생성 X
;

insert into USER_BOOK(BOOK_ID, place_id, SEATS_ID, SHOWS_DT_ID,
USER_TEL, USER_EMAIL, USER_BIRTH, BOOK_FLAG) values(
'240109M111113',1,3,3,'01011112223','kdsm@naver.com','20231011','Y')
;

insert into USER_BOOK(BOOK_ID, place_id, SEATS_ID, SHOWS_DT_ID,
USER_TEL, USER_EMAIL, USER_BIRTH, BOOK_FLAG) values(
'240109M111114',2,5,4,'01011112223','kdsm@naver.com','20231011','Y')
;
insert into USER_BOOK(BOOK_ID, place_id, SEATS_ID, SHOWS_DT_ID,
USER_TEL, USER_EMAIL, USER_BIRTH, BOOK_FLAG) values(
'240109M111115',1,4,3,'','','','P') -- 예매 중 새로운 좌석
;

insert into USER_BOOK(BOOK_ID, place_id, SEATS_ID, SHOWS_DT_ID,
USER_TEL, USER_EMAIL, USER_BIRTH, BOOK_FLAG) values(
'240109M111116',1,4,2,'','','','P') -- 예매 취소한거와, 예매중인거 동시에 존재할때 
;

insert into common_code (
cm_id, cm_name, udv_1_nm,udv_2_nm, udv_3_nm
) values( 'CG001','공연타입','','','');

insert into common_code_dt (
cm_id,cm_dt_id, cm_dt_name,  udv_1_val,udv_2_val, udv_3_val
) values( 'CG001','M','뮤지컬','','','' );

insert into common_code_dt (
cm_id,cm_dt_id, cm_dt_name,  udv_1_val,udv_2_val, udv_3_val
) values( 'CG001','C','콘서트','','','' );

commit;


