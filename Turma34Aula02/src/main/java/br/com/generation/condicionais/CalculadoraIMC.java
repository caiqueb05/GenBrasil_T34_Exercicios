package br.com.generation.condicionais;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double imc;
        double pesoEmQuilogramas = 0.0;
        double alturaEmMetros = 0.0;

        System.out.println("Digite o peso atual: ");
        pesoEmQuilogramas = entrada.nextDouble();

        System.out.println("Digite a sua altura");
        alturaEmMetros = entrada.nextDouble();

        imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);

        System.out.println("#####-> Valores do IMC <-####");

        System.out.println("Abaixo do Peso: Menos de 18.5");
        System.out.println("Normal: entre 18.5 e 24.9");
        System.out.println("SObrepeso: entre 25.0 e 29.9");
        System.out.println("Obeso: acima de 30.0");

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso!");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Você está com peso normal!");
        }



    }

}
