package br.com.generation.vetor;

import java.util.Scanner;

public class ExemploVetor02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0.0, media = 0.0;

        System.out.println("Digite as quatro notas do aluno");
        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a " + (i+1) + "ª nota");
            notas[i] = entrada.nextDouble();
            soma += notas[i];
            media = soma / 4;
        }
        System.out.println("A soma das notas: " + soma);
        System.out.println("A média é: " + media);

    }

}
