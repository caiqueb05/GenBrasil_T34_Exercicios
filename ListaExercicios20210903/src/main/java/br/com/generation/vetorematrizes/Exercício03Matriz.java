/*3-Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
*/

package br.com.generation.vetorematrizes;

public class Exercício03Matriz {

    public static void main(String[] args) {

        int[][] matrizN1 =
            {{10, 20, 30, 40, 11, 12},
            {50, 60, 70, 80, 13, 14},
            {90, 100, 110, 120, 15, 16},
            {130, 140, 150, 160, 17, 18}};

        int[][] matrizN2 =
            {{0, 10, 15, 90, 31, 32},
            {50, 60, 70, 80, 13, 14},
            {90, 100, 110, 120, 15, 16},
            {130, 140, 150, 160, 17, 18}};

        int[][] matrizM1 = new int[4][6];

        int[][] matrizM2 = new int[4][6];

        System.out.print("Matriz M1\n");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 6; j++){
                matrizM1[i][j] = matrizN1[i][j] + matrizN2[i][j];
                System.out.print(matrizM1[i][j] + ",");
            }
            System.out.print("\n");
        }

                System.out.print("\n");
                System.out.print("Matriz M2\n");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 6; j++){
                matrizM2[i][j] = matrizN1[i][j] - matrizN2[i][j];
                System.out.print(matrizM2[i][j] + ",");
            }
            System.out.print("\n");
        }

    }

}
