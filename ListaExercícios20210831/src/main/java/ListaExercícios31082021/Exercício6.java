/*6.*/

package ListaExercícios31082021;

import java.util.Scanner;
//import java.math.BigInteger;

public class Exercício6 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double x1, x2, y1, y2, p1, p2, resultado;

        System.out.println("Entre com o valor de x1: ");
        x1 = leia.nextInt();
        System.out.println("Entre com o valor de y1: ");
        y1 = leia.nextInt();
        System.out.println("Entre com o valor de x2: ");
        x2 = leia.nextInt();
        System.out.println("Entre com o valor de y2: ");
        y2 = leia.nextInt();

        p1 = (x2 - x1) * (x2 - x1);
        p2 = (y2 - y1) * (y2 - y1);

        resultado = Math.sqrt(p1 + p2);//(p1 + p2) / (p1 + p2);
        System.out.println("\nO resultado da distancia é: " + resultado);

    }

}
