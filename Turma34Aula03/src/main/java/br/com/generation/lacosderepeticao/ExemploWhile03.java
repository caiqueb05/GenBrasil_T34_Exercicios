package br.com.generation.lacosderepeticao;

import java.util.Scanner;

public class ExemploWhile03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numero = -1;

        while (numero != 10) {
            System.out.println("Digite um número: ");
            numero = in.nextInt();
            if(numero == 10) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Você errou!");
            }
        }

    }

}
