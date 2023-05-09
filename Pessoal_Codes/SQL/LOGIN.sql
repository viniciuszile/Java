create database login;
use login;

CREATE TABLE usuarios (
  id int(11) NOT NULL AUTO_INCREMENT,
  email varchar(50) NOT NULL,
  senha varchar(50) NOT NULL,
  PRIMARY KEY (id)
);

select * from usuarios;