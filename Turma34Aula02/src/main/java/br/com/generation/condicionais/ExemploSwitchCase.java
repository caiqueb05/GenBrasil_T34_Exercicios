package br.com.generation.condicionais;

import java.util.Scanner;

public class ExemploSwitchCase {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva uma letra entre a e d: ");
        char letra = leia.nextLine().charAt(0);

        switch (letra){
            case 'a':
                System.out.println("Ana");
            break;
            case 'b':
                System.out.println("Bruno");
                break;
        default:
                System.out.println("Opção Iválida");
                break;
        }



    }

}
