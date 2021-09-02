/*2-Faça um programa que entre com três números e coloque em ordem crescente.*/

package br.com.generation.exercicios;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Exercício2 {

    public static <vetor1> void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int vetor[] = new int[3];
        int vetor1[] = new int[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Escreva o " + (i+1) + "º número: ");
            vetor[i] = leia.nextInt();
            vetor1[i] = vetor[i];

        for(int j = 0; j < 3; j++) {

                if(vetor[i] < vetor[j]){
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;

                }

        }
        }
            System.out.println("Os números em ordem crescente são: " + Arrays.toString(vetor));
            System.out.println("Os números digitados na ordem foram: " + Arrays.toString(vetor1));

    }

}
