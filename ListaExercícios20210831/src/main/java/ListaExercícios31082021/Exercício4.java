/*4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:*/

package ListaExercícios31082021;

import java.util.Scanner;

public class Exercício4 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float A, B, C, D, R, S;

        System.out.println("Entre com o valor de A: ");
        A = leia.nextInt();
        System.out.println("Entre com o valor de B: ");
        B = leia.nextInt();
        System.out.println("Entre com o valor de C: ");
        C = leia.nextInt();

        R = (A + B) * (A + B);
        S = (B + C) * (B + C);

        D = (R + S) / 2;

        System.out.println("O resultado é: " + D);


    }


}
