/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */

package br.com.generation.vetorematrizes;

import java.util.Scanner;

public class Exercicio01Vetor {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[] pontuacoes = new int[5];
        double soma = 0.0, maiorPontuacao = 0.0;

        for(int i = 0; i < pontuacoes.length; i++){
            System.out.println("Digite a pontuacao do " + (i+1) + "° aluno: ");
            pontuacoes[i] = leia.nextInt();
            if(pontuacoes[i] > maiorPontuacao) {
                maiorPontuacao = pontuacoes[i];
            }
        }

        System.out.println();
        for(int i = 0; i < pontuacoes.length; i++){
            System.out.print("Pontuação do " + (i+1) + "° aluno: " + pontuacoes[i] + "\n");
        }
        System.out.println("A maior pontuação foi: " + maiorPontuacao);

    }

}
