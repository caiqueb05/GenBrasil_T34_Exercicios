/*2-Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

package br.com.generation.lacofor;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Exercicio2For {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int par = 0, impar = 0;
        int vetor[] = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o " + (i+1) + "º numero");
            vetor[i] = leia.nextInt();

            if(vetor[i] % 2 == 0){
                par++;
            } else if(vetor[i] % 2 == 1){
                impar++;
            }
        }
        System.out.println("\nA quantidade de númeres pares digitados é: " + par);
        System.out.println("A quantidade de números ímpares digitados é: " + impar);
        System.out.println("Os números digitados foram: " + Arrays.toString(vetor));

    }

}
