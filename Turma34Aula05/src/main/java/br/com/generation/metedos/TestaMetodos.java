package br.com.generation.metedos;

import java.util.Scanner;

public class TestaMetodos {

    static int num1 = 500;
    static int num2 = 1000;
    static int soma2;

    public static void main(String[] args) {
        System.out.println("Olá eu sou o método principal");

        Scanner entrada = new Scanner(System.in);
        double var1, var2;

        System.out.println("Digite os valores das variaveis: ");
        var1 = entrada.nextDouble();
        var2 = entrada.nextDouble();

        metodo1();
        metodo2();
        metodo3();
        metodo4();
        metodo5(var1, var2);
        metodo7();

    }

    public static void metodo1() {
        System.out.println("Olá eu sou o método 1");
    }

    public static void metodo2() {
        int soma, numero1 = 20, numero2 = 30;
        soma = numero1 + numero2;
        System.out.println("Soma dentro do método 2: " + soma);
    }

    public static void metodo3() {
        soma2 = num1  + num2;
    }

    public static void metodo4() {
        System.out.println("Chamando a soma do método 3: " + soma2);
    }

    public static void metodo5(double valor1, double valor2) {
        double multiplicacao = valor1 * valor2;
        double divisao = valor1 / valor2;
        System.out.println("Método 5 utilizando parametros: " + multiplicacao);
        System.out.println("Método 5 fazendo divisao: " + divisao);
    }

    public static void metodo7() {
        String chamada = MetodoFora.metodo6(0, 10);
        System.out.println("Método 7 utilizando o método 6 que está na Classe Metodo Fora: " + chamada);
    }

}
