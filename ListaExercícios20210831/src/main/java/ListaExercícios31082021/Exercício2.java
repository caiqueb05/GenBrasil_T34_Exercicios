/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

package ListaExercícios31082021;

import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int anos, meses, dias, idadeDias;

        System.out.println("Entre com a sua idade expressa em dias: ");
        idadeDias = leia.nextInt();

        anos = idadeDias/365;
        meses = (idadeDias % 365) / 30;
        dias = (idadeDias % 365) % 30;


        System.out.println("Você tem aproximadamente " + anos + " anos e "
                + meses + " meses e " + dias + " dias");

    }
}
