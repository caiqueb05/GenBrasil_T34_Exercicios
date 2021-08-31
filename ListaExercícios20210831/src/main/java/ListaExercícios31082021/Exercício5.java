/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

package ListaExercícios31082021;

import java.util.Scanner;

public class Exercício5 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double nota1, nota2, nota3, peso1, peso2, peso3, mediaPonderada;

        peso1 = 2.0;
        peso2 = 3.0;
        peso3 = 5.0;

        System.out.println("Entre com o valor da nota 1: ");
        nota1 = leia.nextInt();
        System.out.println("Entre com o valor da nota 2: ");
        nota2 = leia.nextInt();
        System.out.println("Entre com o valor da nota 3: ");
        nota3 = leia.nextInt();

        mediaPonderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        System.out.println("\nO resultado é: " + mediaPonderada);

    }

}
