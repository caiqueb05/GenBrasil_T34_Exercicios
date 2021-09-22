CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe ( 
	id_classe INT AUTO_INCREMENT PRIMARY KEY,
	tipo VARCHAR(20) NOT NULL,
	arma_duas_maos BOOLEAN NOT NULL,
	armadura BOOLEAN NOT NULL	
);

CREATE TABLE tb_personagem (
	id_personagem INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(30) NOT NULL,
	idade INT NOT NULL,
	força INT NOT NULL,
	defesa INT NOT NULL,
	nivel INT NOT NULL,
	ataque INT NOT NULL,
	id_classe INT NOT NULL,
	FOREIGN KEY (id_classe) REFERENCES tb_classe(id_classe)
);

SELECT * FROM tb_classe;
SELECT * FROM tb_personagem tp;

INSERT INTO tb_classe (tipo, arma_duas_maos, armadura)
VALUES 
("Mago", false, false),
("Arqueiro", false, true),
("Guerreiro", true, true);

INSERT INTO tb_personagem (nome, idade, força, defesa, nivel, ataque, id_classe)
VALUES 
("Caique Bezerra", 27, 8000, 200, 30, 500, 3),
("Pablo", 25, -50, 20, 15, 50, 1),
("Gustavo", 24, 50, 30, 25, 50, 2),
("Ronan", 20, 15, 15, 18, 32, 3),
("Kratos", 1500, 15000, 7500, 10000, 30000, 3),
("Gandalf", 80, 200, 500, 5000, 300, 1),
("Legolas", 35, 250, 250, 2000, 300, 2);

UPDATE tb_personagem SET defesa = 1500 WHERE id_personagem = 1;

SELECT * FROM tb_personagem WHERE ataque >= 2000;
SELECT * FROM tb_personagem WHERE defesa >= 1000 && defesa <= 2000;
SELECT * FROM tb_personagem WHERE nome LIKE "%C%";

SELECT * FROM tb_personagem INNER JOIN tb_classe ON tb_personagem.id_classe = tb_classe.id_classe;

SELECT * FROM tb_personagem INNER JOIN tb_classe ON tb_personagem.id_classe = tb_classe.id_classe WHERE tb_classe.tipo = "Arqueiro";

DROP TABLE tb_classe;
DROP TABLE tb_personagem; 

