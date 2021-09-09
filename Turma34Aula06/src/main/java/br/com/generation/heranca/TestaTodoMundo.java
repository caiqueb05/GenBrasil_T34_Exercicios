package br.com.generation.heranca;

import java.util.Scanner;

public class TestaTodoMundo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Professor prof1 = new Professor();
        Aluno aluno1 = new Aluno();

        String nome;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        aluno1.setNome(nome);

        System.out.println("Digite o nome do Professor: ");
        prof1.setNome(sc.nextLine());

        prof1.setSalario(1000);

        System.out.println("\nNome do aluno: " + aluno1.getNome());
        System.out.println("Nome do professor: " + prof1.getNome());
        System.out.println("Salário: " + prof1.getSalario());

    }

}
