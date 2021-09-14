package br.com.generation.teste;

import java.util.Scanner;

public class TestaUnidade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Digite o primeiro e segundo numero: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int resultadoEsperado = 4;

        int resultado = calc.somar(num1, num2);

        if(resultado == resultadoEsperado){
            System.out.println("Teste OK");
        } else {
            System.out.println("Falhou");
        }

    }

}
