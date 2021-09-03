package br.com.generation.matriz;

public class ExemploMatriz01 {

    public static void main(String[] args) {

        double[][] notasAlunos = new double[2][4];

        notasAlunos[0][0] = 10.0;
        notasAlunos[0][1] = 8.5;
        notasAlunos[0][2] = 10.0;
        notasAlunos[0][3] = 8.5;

        notasAlunos[1][0] = 10.0;
        notasAlunos[1][1] = 8.5;
        notasAlunos[1][2] = 10.0;
        notasAlunos[1][3] = 8.5;

        System.out.println("Calculando a média dos Alunos");

        double soma = 0;
        for(int l = 0; l < notasAlunos.length; l++){
            soma = 0.0;
            for(int c = 0; c < notasAlunos[l].length; c++){
                soma += notasAlunos[l][c];
            } System.out.println("A média " + l + " das motas: " + (soma/4));
        }
        //System.out.println(notasAlunos.length);

    }

}
