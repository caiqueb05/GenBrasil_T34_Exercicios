package br.com.generation.sobrecargaMetodos;

public class TestaCalculadora {

    public static void main(String[] args) {

        MinhaCalculadora calc = new MinhaCalculadora();

        System.out.println(calc.soma(2, 10));
        System.out.println(calc.soma(2.6, 3.5));
        System.out.println(calc.soma(10, 50, 30));

    }

}
