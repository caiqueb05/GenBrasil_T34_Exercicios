/*7. Um sistema de equações lineares do tipo:*/

package ListaExercícios31082021;

import java.util.Scanner;

public class Exercício7 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int a, b, c, d, E, f, x, y;

        System.out.println("Entre com o valor de a: ");
        a = leia.nextInt();
        System.out.println("Entre com o valor de b: ");
        b = leia.nextInt();
        System.out.println("Entre com o valor de c: ");
        c = leia.nextInt();
        System.out.println("Entre com o valor de d: ");
        d = leia.nextInt();
        System.out.println("Entre com o valor de e: ");
        E = leia.nextInt();
        System.out.println("Entre com o valor de f: ");
        f = leia.nextInt();

        x = ((c * E) - (b * f)) / ((a * E) - (b * d));
        y = ((a * f) - (c * d)) / ((a * E) - (b * d));

        System.out.println("\nO resultado de x é: " + x + "O resultado de y é: " + y);

    }

}
