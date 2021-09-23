CREATE DATABASE db_construindo_a_nossa_vida;

USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria ( 
	id_categoria INT AUTO_INCREMENT PRIMARY KEY,
	categoria VARCHAR(30) NOT NULL,
	tipo VARCHAR(30) NOT NULL,
	ativo BOOLEAN NOT NULL
);

CREATE TABLE tb_produto (
	id_produto INT AUTO_INCREMENT PRIMARY KEY,
	material VARCHAR(30) NOT NULL,
	fabricante VARCHAR(30),
	preco FLOAT NOT NULL,	
	id_categoria INT NOT NULL,	
	FOREIGN KEY (id_categoria) REFERENCES tb_categoria(id_categoria)
);

SELECT * FROM tb_categoria;
SELECT * FROM tb_produto;

INSERT INTO tb_categoria (categoria, tipo, ativo)
VALUES 
("Ferramentas Elétricas", "Furadeira", true),
("Iluminação", "Lâmpada", false),
("Hidráulica", "Caixa d'Água", true),
("Ferramenta Manual", "Alicate", true);

INSERT INTO tb_produto (material, fabricante, preco, id_categoria)
VALUES 
("Plástico", "Bosch", 500, 1),
("Vidro", "Ourolux", 15.39, 2),
("Plástico", "Fortlev", 250, 3),
("Metal", "Tramontina", 50, 4);


SELECT * FROM tb_produto WHERE preco >= 50;
SELECT id_produto, material, fabricante, preco, categoria, tipo, ativo FROM tb_produto INNER JOIN tb_categoria ON tb_produto.id_produto = tb_categoria.id_categoria WHERE preco >= 3 && preco <= 60;
SELECT * FROM tb_categoria WHERE tipo LIKE "%C%";
SELECT id_produto, material, fabricante, preco, categoria, tipo, ativo FROM tb_produto INNER JOIN tb_categoria WHERE tb_produto.id_categoria = tb_categoria.id_categoria;
SELECT id_produto, material, fabricante, preco, categoria, tipo, ativo FROM tb_produto INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id_categoria WHERE tb_categoria.categoria LIKE "Hidráulica";

DROP TABLE tb_produto;
DROP TABLE tb_personagem; 

