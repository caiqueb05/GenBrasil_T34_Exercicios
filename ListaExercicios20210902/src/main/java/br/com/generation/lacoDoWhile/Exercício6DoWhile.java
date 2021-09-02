package br.com.generation.lacoDoWhile;

import java.util.Scanner;

public class Exercício6DoWhile {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double numero, numTotal = 0, contador = 0, media = 0;

        do{
            System.out.println("Digite um número: ");
            numero = leia.nextInt();

            if(numero != 0 && numero % 3 == 0) {
                numTotal += numero;
                contador++;
                media = numTotal / contador;
            }
        } while(numero != 0);
        System.out.println("\nA média dos números múltiplos de 3 digitados é: " + media);
    }

}
