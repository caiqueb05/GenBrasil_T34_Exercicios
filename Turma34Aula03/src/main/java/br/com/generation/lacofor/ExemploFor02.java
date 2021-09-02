package br.com.generation.lacofor;

public class ExemploFor02 {

    public static void main(String[] args) {

        int n = 20;
        int i, soma;

        for(i = 0, soma = 0; i <= n; i++){
            System.out.print("Soma: " + soma + " + " + i);
            soma += i;
            System.out.println(" = " + soma);
        }

    }

}
