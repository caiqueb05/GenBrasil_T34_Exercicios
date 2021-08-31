/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

package ListaExercícios31082021;

import java.util.Scanner;

public class Exercício8 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double custoFab, porcDist, impostos, custoCons;

        porcDist = 0.28;
        impostos = 0.45;

        System.out.println("Entre com o custo de fábrica: ");
        custoFab = leia.nextInt();

        custoCons = custoFab + (custoFab * porcDist) + (custoFab * impostos);

        System.out.println("\nO custo ao consumidor é: " + custoCons);

    }

}
