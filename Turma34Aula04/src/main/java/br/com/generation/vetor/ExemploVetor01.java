package br.com.generation.vetor;

public class ExemploVetor01 {

    public static void main(String[] args) {

        int[] arrayVetor = new int[10];
        arrayVetor[2] = 200;

        for(int i = 0; i <= 9; i++){
            System.out.println("Posição: " + i + " - " + arrayVetor[i]);
        }

    }

}
