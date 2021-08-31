/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package ListaExercícios31082021;

import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int segundos, minutos, horas;

        System.out.println("Entre com a duração do evento expresso em segundos: ");
        segundos = leia.nextInt();

        minutos = segundos/60;
        horas = minutos/60;

        System.out.println("Seu evento vai durar " + (segundos/3600) + " Horas, " +
                ((segundos%3600)/60) + " Minutos, e " + ((segundos%3600)%60) +
                " Segundos");

    }

}
