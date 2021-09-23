CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

CREATE TABLE tb_categoria ( 
	id_categoria INT AUTO_INCREMENT PRIMARY KEY,
	categoria VARCHAR(20) NOT NULL,
	tipo VARCHAR(30) NOT NULL,
	ativo BOOLEAN NOT NULL
);

CREATE TABLE tb_produto (
	id_produto INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(30) NOT NULL,
	fabricante VARCHAR(30),
	preco FLOAT NOT NULL,	
	id_categoria INT NOT NULL,	
	FOREIGN KEY (id_categoria) REFERENCES tb_categoria(id_categoria)
);

SELECT * FROM tb_categoria;
SELECT * FROM tb_produto;

INSERT INTO tb_categoria (categoria, tipo, ativo)
VALUES 
("Medicamento", "Comprimido", true),
("Cosmético", "Esmalte", false),
("Higiene", "Pasta de Dente", true),
("Equipamento", "Medidor de Pressão", true);

INSERT INTO tb_produto (nome, fabricante, preco, id_categoria)
VALUES 
("Protetor Solar", "Johnson&Johnson", 50, 2)
("Rivotril", "Medley", 25.99, 1),
("Miami Blue", "Risqué", 10.89, 2),
("Colgate", "Unilever", 3.40, 3),
("Medidor", "Abbot", 240.30, 4);

SELECT * FROM tb_produto WHERE preco >= 50;
SELECT id_produto, nome, fabricante, preco, categoria, tipo, ativo FROM tb_produto INNER JOIN tb_categoria ON tb_produto.id_produto = tb_categoria.id_categoria WHERE preco >= 3 && preco <= 60;
SELECT * FROM tb_produto WHERE nome LIKE "%B%";
SELECT id_produto, nome, fabricante, preco, categoria, tipo, ativo FROM tb_produto INNER JOIN tb_categoria WHERE tb_produto.id_categoria = tb_categoria.id_categoria;
SELECT id_produto, nome, fabricante, preco, categoria, tipo, ativo FROM tb_produto INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id_categoria WHERE tb_categoria.categoria LIKE "Cosmético";

DROP TABLE tb_classe;
DROP TABLE tb_personagem; 

