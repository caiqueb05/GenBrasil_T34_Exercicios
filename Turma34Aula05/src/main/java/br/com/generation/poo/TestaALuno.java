package br.com.generation.poo;

public class TestaALuno {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setNome("Antonia");
        aluno1.setIdade(22);
        aluno1.setCurso("Bloco I - Java");

        aluno2.setNome("Jeff");
        aluno2.setCurso("SpringBoot BLoco II");
        aluno2.setIdade(20);

        //Imprimindo Atributos
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getIdade());
        System.out.println(aluno1.getCurso());

        System.out.println("******************");

        //Imprimindo Atributos Aluno2
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getIdade());
        System.out.println(aluno2.getCurso());

        aluno1.assistirAula();
        aluno1.fazerProva();

    }

}
