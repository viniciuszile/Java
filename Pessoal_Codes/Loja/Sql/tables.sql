create database loja;

use loja;

create table clientes(
idcliente int(4) primary key auto_increment,
nome_cliente varchar(100) not null,
cpf_cliente char(13) not null,
numero_cliente varchar(11)
);

create table produtos(
idproduto int(4) primary key auto_increment,
nome_produto varchar(100),
quantidade_produto int(4),
preco_produto decimal(7,2)

);

create table nota(
idnota int(4) auto_increment primary key,
total decimal(7,2),

id_cliente INT(4),
FOREIGN KEY (id_cliente) 
references clientes (idcliente),

id_produto INT(4),
FOREIGN KEY (id_produto) 
references produtos (idproduto)
);



