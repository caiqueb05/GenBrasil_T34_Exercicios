CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;

CREATE TABLE tb_categoria ( 
	id_categoria INT AUTO_INCREMENT PRIMARY KEY,
	categoria_tipo_carne VARCHAR(30) NOT NULL,	
	tipo_corte VARCHAR(30) NOT NULL,
	ativo BOOLEAN NOT NULL
);

CREATE TABLE tb_produto (
	id_produto INT AUTO_INCREMENT PRIMARY KEY,	
	marca VARCHAR(30),
	preco FLOAT NOT NULL,
	peso FLOAT NOT NULL,	
	id_categoria INT NOT NULL,	
	FOREIGN KEY (id_categoria) REFERENCES tb_categoria(id_categoria)
);

SELECT * FROM tb_categoria;
SELECT * FROM tb_produto;

INSERT INTO tb_categoria (categoria_tipo_carne, tipo_corte, ativo)
VALUES 
("Ave", "Asinha", true),
("Ave", "Peito de Frango", false),
("Bovino", "Contra-filé", true),
("Bovino", "Patinho", true),
("Porco", "Bisteca", true),
("Porco", "Linguiça", true);

INSERT INTO tb_produto (marca, preco, peso, id_categoria)
VALUES 
("Sadia", 20, 1.5, 1),
("Aurora", 19.99, 3, 2),
("Friboi", 50, 1, 3),
("Swift", 26.59, 1.3, 4),
("Perdigão", 30.19, 2.5, 5),
("Aurora", 17.49, 1.75, 6);

SELECT * FROM tb_produto WHERE preco >= 50;
SELECT id_produto, marca, preco, peso, tipo_corte, categoria_tipo_carne, ativo FROM tb_produto INNER JOIN tb_categoria ON tb_produto.id_produto = tb_categoria.id_categoria WHERE preco >= 3 && preco <= 60;
SELECT * FROM tb_categoria WHERE tipo_corte LIKE "%C%";
SELECT id_produto, marca, preco, peso, tipo_corte, categoria_tipo_carne, ativo FROM tb_produto INNER JOIN tb_categoria WHERE tb_produto.id_categoria = tb_categoria.id_categoria;
SELECT id_produto, marca, preco, peso, tipo_corte, categoria_tipo_carne, ativo FROM tb_produto INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id_categoria WHERE tb_categoria.categoria_tipo_carne LIKE "Ave";

DROP TABLE tb_classe;
DROP TABLE tb_personagem; 

