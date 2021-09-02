package br.com.generation.lacoDoWhile;

import java.util.Scanner;

public class Exercicio5DoWhile {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero = 0, soma = 0;

        do{
            System.out.println("Digite um número: ");
            numero = leia.nextInt();
            soma += numero;

        } while(numero != 0);
        System.out.println("A soma de todos os números digitados foi: " + soma);
    }

}
