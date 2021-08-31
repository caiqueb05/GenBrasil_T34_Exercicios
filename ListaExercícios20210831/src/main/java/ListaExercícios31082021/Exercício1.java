/* 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

package ListaExercícios31082021;

import java.util.Scanner;

public class Exercício1 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int anos, meses, dias, diasTotais;

        System.out.println("Entre com a sua idade expressa em anos: ");
        anos = leia.nextInt();

        System.out.println("Entre com a sua idade expressa em meses: ");
        meses = leia.nextInt();

        System.out.println("Entre com a sua idade expressa em dias: ");
        dias = leia.nextInt();

        diasTotais = (anos*365) + (meses*30) + dias;
        System.out.println("Você tem aproximadamente "+ diasTotais + " dias");

    }

}
