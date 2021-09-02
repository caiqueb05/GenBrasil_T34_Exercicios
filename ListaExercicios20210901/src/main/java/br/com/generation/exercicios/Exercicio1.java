/* 1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/

package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0;

        for(int i = 1; i < 4; i++){
            System.out.println("Escreva o " + i + "º número: ");
            if(i == 1) {
                num1 = leia.nextInt();
            } else if(i == 2) {
                num2 = leia.nextInt();
            } else {
                num3 = leia.nextInt();
            }

        }   System.out.println("Os números que você digitou foram: " + num1 + "; " + num2 + "; " + num3);

            if(num1 > num2 && num1 > num3){
                System.out.println("O maior número é: " + num1);
            } else if(num2 > num1 && num2 > num3){
                System.out.println("O maior número é: " + num2);
            } else if(num3 > num1 && num3 > num2){
                System.out.println("O maior número é: " + num3);
            }

    }

}
