CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria ( 
	id_categoria INT AUTO_INCREMENT PRIMARY KEY,
	tamanho VARCHAR(20) NOT NULL,
	preco FLOAT NOT NULL,	
	borda BOOLEAN NOT NULL	
);

CREATE TABLE tb_pizza (
	id_pizza INT AUTO_INCREMENT PRIMARY KEY,
	sabor VARCHAR(30) NOT NULL,
	doce BOOLEAN NOT NULL,
	id_categoria INT NOT NULL,	
	FOREIGN KEY (id_categoria) REFERENCES tb_categoria(id_categoria)
);

SELECT * FROM tb_categoria;
SELECT * FROM tb_pizza;

INSERT INTO tb_categoria (tamanho, preco, borda)
VALUES 
("G", 50, true),
("M", 40, false),
("P", 35, false),
("Brotinho", 20, false);

INSERT INTO tb_pizza (sabor, doce, id_categoria)
VALUES 
("Calebresa", false, 2),
("Portuguesa", false, 1),
("Mussarela", false, 3),
("Nutella", true, 2),
("Morango", true, 3),
("Rúcula", false, 4);

SELECT * FROM tb_pizza INNER JOIN tb_categoria ON tb_pizza.id_pizza = tb_categoria.id_categoria WHERE preco >= 45;
SELECT * FROM tb_pizza INNER JOIN tb_categoria ON tb_pizza.id_pizza = tb_categoria.id_categoria WHERE preco >= 29 && preco <= 60;
SELECT * FROM tb_pizza WHERE sabor LIKE "%C%";
SELECT * FROM tb_pizza INNER JOIN tb_categoria;
SELECT * FROM tb_pizza INNER JOIN tb_categoria ON tb_pizza.id_categoria = tb_categoria.id_categoria WHERE tb_pizza.doce = true;

DROP TABLE tb_classe;
DROP TABLE tb_personagem; 

