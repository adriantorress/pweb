drop table tb_school; 
create table  tb_school (
	id INT primary key,
	nome varchar(50),
    data_nascimento date,
    nomedamae varchar(50),
    nomedopai varchar(50),
    ddd int,
    numero int,
    ramal int,
    email varchar(50),
    serie varchar(30),
    turno varchar(16)
);
use db_example;
select * from tb_school