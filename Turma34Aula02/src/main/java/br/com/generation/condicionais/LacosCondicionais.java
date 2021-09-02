package br.com.generation.condicionais;

import java.util.Scanner;

public class LacosCondicionais {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Escreva a primeria nota: ");
        nota1 = leia.nextDouble();

        System.out.println("Escreva a segunda nota: ");
        nota2 = leia.nextDouble();

        media = (nota1 + nota2) / 2;

        if(media < 0 || media > 10.0) {
            System.out.println("Nota inválida!");
        } else if(media >= 9.0 && media <= 10.0) {
            System.out.println("Aprovado Honras." + "\nMédia: " + media);
        } else if(media >= 3.0 && media <= 8.0) {
            System.out.println("Aprovado." + "\nMédia: " + media);
        }

    }

}
