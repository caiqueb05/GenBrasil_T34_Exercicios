/*2-Um dado é lançado 10 vezes && o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
A seguir determine && imprima a média aritmética dos lançamentos, contabilize && apresente também quantas foram as ocorrências da maior pontuação.*/

package br.com.generation.vetorematrizes;

import java.util.Scanner;

public class Exercicio02Vetor {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int  numVezesDado = 9, contador = 0,  maiorPontuacao = 0, vezesMaiorPontuacao = 0, dado1 = 0, dado2 = 0, dado3 = 0, dado4 = 0, dado5 = 0, dado6 = 0;
        double[] dados = new double[10];
        double media, totalDados = 0.0;

        for(int i = 0; i <= numVezesDado; i++){
            contador++;
            System.out.println("Informe o número do " + (i+1) + "° dado: ");
            dados[i] = leia.nextDouble();
            if(dados[i] < 1 && dados[i] > 6){
                System.out.print("Número inválido\n");
            }
            totalDados += dados[i];

            //escreva(dados[i])

        }	media = (totalDados / contador);


        System.out.print("\nA média dos números foi de: " + media + "\n");

        for(int i = 0; i <= numVezesDado; i++){

            if(dados[i] > 0 && dados[i] == 1){
                dado1++;
            } else if(dados[i] > 0 && dados[i] == 2){
                dado2++;
            } else if(dados[i] > 0 && dados[i] == 3){
                dado3++;
            } else if(dados[i] > 0 && dados[i] == 4){
                dado4++;
            } else if(dados[i] > 0 && dados[i] == 5){
                dado5++;
            } else if(dados[i] > 0 && dados[i] == 6){
                dado6++;
            }

            if(dado1 >= dado2 && dado1 >= dado3 && dado1 >= dado4 && dado1 >= dado5 && dado1 >= dado6){
                maiorPontuacao = 1;
                vezesMaiorPontuacao = dado1;
            } else if(dado2 >= dado1 && dado2 >= dado3 && dado2 >= dado4 && dado2 >= dado5 && dado2 >= dado6){
                maiorPontuacao = 2;
                vezesMaiorPontuacao = dado2;
            } else if(dado3 >= dado1 && dado3 >= dado2 && dado3 >= dado4 && dado3 >= dado5 && dado3 >= dado6){
                maiorPontuacao = 3;
                vezesMaiorPontuacao = dado3;
            } else if(dado4 > dado1 && dado4 > dado2 && dado4 > dado3 && dado4 > dado5 && dado4 > dado6){
                maiorPontuacao = 4;
                vezesMaiorPontuacao = dado4;
            } else if(dado5 > dado1 && dado5 > dado2 && dado5 > dado3 && dado5 > dado4 && dado5 > dado6){
                maiorPontuacao = 5;
                vezesMaiorPontuacao = dado5;
            } else if(dado6 > dado1 && dado6 > dado2 && dado6 > dado3 && dado6 > dado4 && dado6 > dado5){
                maiorPontuacao = 6;
                vezesMaiorPontuacao = dado6;
            }
        }
        System.out.println(	"O número que foi mais vezes digitado foi: " + maiorPontuacao +
                "\nA ocorrência da maior pontuação foi de: " + vezesMaiorPontuacao);

    }

}
