CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE estudantes(
	id bigint auto_increment primary key,
	nome varchar(30) not null,
	sobrenome varchar(30) not null,
	turma varchar(30) not null,
	período int not null,
	nota decimal(10, 2) not null
);

SELECT * FROM estudantes e ;

INSERT INTO estudantes (nome, sobrenome, turma, período, nota) VALUES ("Caique", "Bezerra", "Java", 2, 8.55)
INSERT INTO estudantes (nome, sobrenome, turma, período, nota) VALUES ("Joãozinho", "Oliveira", "Python", 4, 6.55)
INSERT INTO estudantes (nome, sobrenome, turma, período, nota) VALUES ("Darth", "Vader", "C++", 3, 9.55)
INSERT INTO estudantes (nome, sobrenome, turma, período, nota) VALUES ("Rob", "Stark", "Ruby", 1, 2.55)
INSERT INTO estudantes (nome, sobrenome, turma, período, nota) VALUES ("Jesse", "Pinkman", "Go", 10, 4.55)
INSERT INTO estudantes (nome, sobrenome, turma, período, nota) VALUES ("Dr", "Rick", "Assembly", 10, 10)
INSERT INTO estudantes (nome, sobrenome, turma, período, nota) VALUES ("Ragnar", "Lothbrook", "Python", 5, 3.95)
INSERT INTO estudantes (nome, sobrenome, turma, período, nota) VALUES ("John", "Wick", "Javascript", 8, 11.55)

SELECT * FROM estudantes e where nota > 7;
SELECT * FROM estudantes e where nota < 7;

UPDATE estudantes SET nome = "Morty", sobrenome = "Smith", nota = 0.5 WHERE id = 6;