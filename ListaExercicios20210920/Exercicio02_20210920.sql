CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE produtos(
	id bigint auto_increment primary key,
	tipo varchar(30) not null,
	categoria varchar(30) not null,
	preco decimal not null,
	quantidade bigint,
	marca_id varchar(30) not null	
);

SELECT * FROM produtos;

INSERT INTO produtos (tipo, categoria, preco, quantidade, marca_id)
VALUES ("celular", "eletrônico", 2599.99, 2, "Samsung")

INSERT INTO produtos (tipo, categoria, preco, quantidade, marca_id)
VALUES ("jogo", "eletrônico", 299.99, 4, "Playstation 4")

INSERT INTO produtos (tipo, categoria, preco, quantidade, marca_id)
VALUES ("Refrigerador", "Eletro-Doméstico", 3599.99, 2, "Electrolux")

INSERT INTO produtos (tipo, categoria, preco, quantidade, marca_id)
VALUES ("Fogão", "Eletro-Doméstico", 599.99, 2, "Brastemp")

INSERT INTO produtos (tipo, categoria, preco, quantidade, marca_id) 
VALUES ("Teclado", "eletrônico", 199.99, 6, "Logitech"),

INSERT INTO produtos (tipo, categoria, preco, quantidade, marca_id) 
VALUES ("Guarda-Roupas", "Móveis", 1599.99, 2, "Itatiaia"),

INSERT INTO produtos (tipo, categoria, preco, quantidade, marca_id) 
VALUES ("Furadeira", "Ferramentas", 599.99, 2, "Bosch")

SELECT * FROM produtos p where preco > 500;
SELECT * FROM produtos p where preco < 500;

UPDATE produtos SET tipo = "Mouse", preco = 150.00 WHERE id = 5;
