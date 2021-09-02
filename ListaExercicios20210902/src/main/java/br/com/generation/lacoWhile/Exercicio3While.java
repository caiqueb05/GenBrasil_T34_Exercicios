/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com
 menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina
  quando idade for =-99. (WHILE)*/

package br.com.generation.lacoWhile;

import java.util.Scanner;

public class Exercicio3While {

    public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    int idade = 0, menor21 = 0, maior50 = 0;
    while(idade != -99){
        System.out.println("Digite uma idade");
        idade = leia.nextInt();

        if(idade >= 0 && idade < 21 && idade != -99){
            menor21++;
        } else if(idade > 50){
            maior50++;
        }
    }
        System.out.println("O número de pessoas com menos de 21 anos é: " + menor21);
        System.out.println("O número de pessoas com mais de 50 anos é: " + maior50);

    }

}
