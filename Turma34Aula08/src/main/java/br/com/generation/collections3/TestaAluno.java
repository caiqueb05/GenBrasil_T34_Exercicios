package br.com.generation.collections3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>();

        System.out.println("Quantos alunos você quer adicionar?");
        int numeroAlunos = sc.nextInt();


        for(int i = 0; i < numeroAlunos; i++){
            System.out.println("Digite a idade do aluno: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.println("Nome de aluno:");
            String nome = sc.nextLine();

            alunos.add(new Aluno(idade, nome));
        }
            for(Aluno i: alunos) {
                System.out.println(i);
            }


    }

}
