package br.com.generation.tryCatch;

public class Exception {

    public static void main(String[] args) {

        int[] vetor = new int[4];
        System.out.println("Antes do problema!");

        try {
            vetor[4] = 1;
            System.out.println("Após o problema!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Você está tentando adicionar um valor numa posição que não existe no vetor.");
            System.out.println(e);
        }
    }

}
