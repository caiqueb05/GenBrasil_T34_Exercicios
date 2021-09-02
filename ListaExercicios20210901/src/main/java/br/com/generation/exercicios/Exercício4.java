package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercício4 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double num, numPotencia, numRaiz;

        System.out.println("Digite um número aleatório");
        num = leia.nextDouble();

        numPotencia = Math.pow(num, 2);
        numRaiz = Math.sqrt(num);

        if(num % 2 == 0){
            System.out.println("O número " + num + " número é par");
            System.out.println("Sua raiz quadrada é: " + numRaiz);
        } else {
            System.out.println("O número " + num + " número é ímpar");
            System.out.println("Sua potência é: " + numPotencia);
        }

    }

}
