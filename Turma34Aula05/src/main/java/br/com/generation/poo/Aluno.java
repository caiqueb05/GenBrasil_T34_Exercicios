package br.com.generation.poo;

public class Aluno {

    //Atributos --> variaveis
    private String nome;
    private String curso;
    private int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Métodos --> ações/verbos
    void assistirAula(){
        System.out.println("Aluno assistindo aula de POO...");
    }

    void fazerProva(){
        System.out.println("Aluno fazendo prova");
    }

}
