package br.com.generation.lacosderepeticao;

public class ExemploWhile02 {

    public static void main(String[] args) throws InterruptedException {

        int numero = 10;

        while(numero >= 0) {
            System.out.println("Repetição: " + numero);
            numero--;
            Thread.sleep(500);
        }

    }

}
