drop database if exists banco_de_usuarios;

create database if not exists banco_de_usuarios;

use banco_de_usuarios;

create table usuario(
id int(3) primary key auto_increment,
nome varchar(50) not null,
email varchar(50) not null unique,
senha text(50) not null,
tel varchar(12) not null unique
);

select * from usuario;

insert into usuario values(null, 'Tiago Fernandes Ribeiro', 'tiagofernandesribeiro@yahoo.com.br', 'senha123', '99999-5979');