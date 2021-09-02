/*4-Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas;
o número de mulheres nervosas;
o número de homens agressivos;
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos;
o número de pessoas calmas com menos de 18 anos.
*/

package br.com.generation.lacoWhile;

import java.util.Scanner;

public class Exercicio4While {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int pessoas = 0, idade, idade18Calmas = 0, idade40Nervosas = 0, sexo, sexoFemininoNervoso = 0, sexoMasculinoAgressivo = 0, sexoOutrosCalma = 0,
                comportamento, calma = 0;
        
        while(pessoas != 4){
            System.out.println("\nDigite a idade da " + (pessoas + 1) + "ª pessoa:");
            idade = leia.nextInt();

            System.out.println("Digite seu sexo, 1 para feminino, " +
                    "2 para masculino, 3 para outros: ");
            sexo = leia.nextInt();

            System.out.println("Digite 1 se você é uma pessoal calma, 2 se você é nervosa, 3 se você é agressiva: ");
            comportamento = leia.nextInt();

            if(idade < 18 && comportamento == 1){
                idade18Calmas++;
            }
            if(idade > 40 && comportamento == 2){
                idade40Nervosas++;
            }

            if(sexo == 1 && comportamento == 2){
                sexoFemininoNervoso++;
            } else if(sexo == 2 && comportamento == 3){
                sexoMasculinoAgressivo++;
            } else if(sexo == 3 && comportamento == 1){
                sexoOutrosCalma++;
            }

            if(comportamento == 1){
                calma++;
            }

            pessoas++;

        }
        System.out.println("\nO número de pessoas calmas é: " + calma);
        System.out.println("O número de mulheres nervosas é: " + (sexoFemininoNervoso));
        System.out.println("O número de homens agressivos é: " + (sexoMasculinoAgressivo));
        System.out.println("o número de outros calmos é: " + (sexoOutrosCalma));
        System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + (idade40Nervosas));
        System.out.println("O número de pessoas calmas com menos de 18 anos é: " + (idade18Calmas));

    }

}
