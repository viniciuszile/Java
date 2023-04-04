INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Arroz', 50);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Feijão', 50);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Macarrão', 80);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Leite', 120);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Café', 70);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Açúcar', 90);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Óleo', 50);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Sal', 40);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Farinha de trigo', 60);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Farinha de milho', 30);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Biscoito', 120);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Chá', 50);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Refrigerante', 90);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Suco', 60);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Cerveja', 150);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Vinho', 80);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Água', 200);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Sabão em pó', 50);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Sabão em barra', 70);
INSERT INTO produtos (idproduto,nome_produto, quantidade_produto) VALUES (default,'Detergente', 90);

INSERT INTO clientes (nome_cliente, cpf_cliente, numero_cliente) 
VALUES ('João da Silva', '111.111.111-11', '(11) 1111-1111');
INSERT INTO clientes (nome_cliente, cpf_cliente, numero_cliente)
VALUES 
('Maria Silva', '111.111.111-11', '(11) 1111-1111'),
('João Santos', '222.222.222-22', '(22) 2222-2222'),
('Ana Souza', '333.333.333-33', '(33) 3333-3333'),
('Pedro Rocha', '444.444.444-44', '(44) 4444-4444'),
('Luciana Mendes', '555.555.555-55', '(55) 5555-5555'),
('Fernando Xavier', '666.666.666-66', '(66) 6666-6666'),
('Larissa Oliveira', '777.777.777-77', '(77) 7777-7777'),
('Gustavo Pereira', '888.888.888-88', '(88) 8888-8888'),
('Carla Costa', '999.999.999-99', '(99) 9999-9999'),
('Rafael Santos', '000.000.000-00', '(00) 0000-0000'),
('Isabela Alves', '111.222.333-44', '(11) 2222-3333'),
('Roberto Oliveira', '222.333.444-55', '(22) 3333-4444'),
('Mariana Silva', '333.444.555-66', '(33) 4444-5555'),
('Júlio Costa', '444.555.666-77', '(44) 5555-6666'),
('Lucas Xavier', '555.666.777-88', '(55) 6666-7777'),
('Natália Souza', '666.777.888-99', '(66) 7777-8888'),
('Ricardo Rocha', '777.888.999-00', '(77) 8888-9999'),
('Sofia Mendes', '888.999.000-11', '(88) 9999-0000'),
('Henrique Pereira', '999.000.111-22', '(99) 0000-1111')
;

select * from produtos;
select * from clientes;
select * from nota;


use loja;

UPDATE produtos SET preco_produto =
CASE
WHEN nome_produto = 'Arroz' THEN 20.00
WHEN nome_produto = 'Feijão' THEN 10.00
WHEN nome_produto = 'Macarrão' THEN 5.00
WHEN nome_produto = 'Leite' THEN 3.50
WHEN nome_produto = 'Café' THEN 8.00
WHEN nome_produto = 'Açúcar' THEN 4.50
WHEN nome_produto = 'Óleo' THEN 10.00
WHEN nome_produto = 'Sal' THEN 2.00
WHEN nome_produto = 'Farinha de trigo' THEN 4.00
WHEN nome_produto = 'Farinha de milho' THEN 3.50
WHEN nome_produto = 'Biscoito' THEN 2.50
WHEN nome_produto = 'Chá' THEN 3.00
WHEN nome_produto = 'Refrigerante' THEN 5.00
WHEN nome_produto = 'Suco' THEN 6.00
WHEN nome_produto = 'Cerveja' THEN 3.00
WHEN nome_produto = 'Vinho' THEN 20.00
WHEN nome_produto = 'Água' THEN 2.00
WHEN nome_produto = 'Sabão em pó' THEN 12.00
WHEN nome_produto = 'Sabão em barra' THEN 2.50
WHEN nome_produto = 'Detergente' THEN 3.50
END;
