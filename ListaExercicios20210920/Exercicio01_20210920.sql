CREATE DATABASE RH;

USE RH;

CREATE TABLE Funcionaries(
	id bigint auto_increment primary key,
	nome varchar(30) not null,
	sobrenome varchar(30) not null,
	setor varchar(20) not null,
	salario decimal not null,
	ativo boolean not null	
);

SELECT * FROM Funcionaries;

INSERT INTO Funcionaries(nome, sobrenome, setor, salario, ativo)
VALUES ("Caique", "Bezerra", "Engenharia", 2500, true),

INSERT INTO Funcionaries(nome, sobrenome, setor, salario, ativo)
VALUES ("Silvio", "Santos", "Entretenimento", 1000000, true)

INSERT INTO Funcionaries(nome, sobrenome, setor, salario, ativo)
VALUES ("Fausto", "Silva", "Entretenimento", 100000, false)

INSERT INTO Funcionaries(nome, sobrenome, setor, salario, ativo)
VALUES ("Dev", "Avançado", "Engenharia de SW", 3000, true)

INSERT INTO Funcionaries(nome, sobrenome, setor, salario, ativo)
VALUES ("Dev", "Sênior", "Ind Aeroespacial", 15000, true)

SELECT * FROM Funcionaries WHERE salario > 2000;

SELECT * FROM Funcionaries WHERE salario < 2000;

UPDATE Funcionaries SET setor = "Software", salario = 1500, sobrenome = "Junior"
	where id = 4;