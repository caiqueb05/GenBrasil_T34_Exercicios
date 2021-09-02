package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();

        if(idade >= 10 && idade <= 14){
            System.out.println("Sua categoria é Infantil");
        } else if(idade >= 15 && idade <= 17){
            System.out.println("Sua categoria é Juvenil");
        } else if(idade >= 18 && idade <= 25){
            System.out.println("Sua categoria é Adulto");
        }

    }

}
