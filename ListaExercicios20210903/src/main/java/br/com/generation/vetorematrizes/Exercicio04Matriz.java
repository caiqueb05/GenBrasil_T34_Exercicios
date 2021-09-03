/*4-Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja,
diagonal principal.*/

package br.com.generation.vetorematrizes;

import java.util.Scanner;

public class Exercicio04Matriz {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0, somaDiagonal = 0;
        int num = 0;

        for(int l = 0; l < 3; l++){
            for(int c = 0; c < 3; c++){
                System.out.println("Digite o " + (num+1) + "° número: ");
                matriz[l][c] = leia.nextInt();
                soma += matriz[l][c];
                somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
                num++;
            }
        }
        System.out.println("\nA soma de todos os valores é: " + soma);
        System.out.println("A soma de todos os valores da diagonal principal é: " + somaDiagonal);

    }

}
