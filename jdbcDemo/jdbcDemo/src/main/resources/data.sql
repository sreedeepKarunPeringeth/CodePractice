CREATE TABLE PERSON
				(person_id integer not null, 
				 name varchar2(50) not null, 
				 location varchar(70),
				 birth_date timestamp, 
				 primary key(person_id)
				 );
				 
insert into PERSON(person_id , name, location ,birth_date)  values (100,'sree','kerala',sysdate() );
insert into PERSON(person_id , name, location ,birth_date)  values (101,'karun','nileshwar',sysdate() );