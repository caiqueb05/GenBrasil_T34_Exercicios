package br.com.generation.vetorematrizes;

import java.util.Scanner;

public class TesteAmanda {

    public static void main(String[] args) {

        int x, senha;
        String user;

        Scanner scan = new Scanner(System.in);

        System.out.print("Você é:"
                + "\n1- Paciente"
                + "\n2- Psicólogo"
                + "\nResposta: ");
        x = scan.nextInt();

        if(x < 0 || x > 2) {
            System.out.print("\nInsira um número válido");
        }

        // PACIENTE
        else if(x == 1) {

            System.out.print("\nO que você deseja?"
                    + "\n1- Login"
                    + "\n2- Registre-se"
                    + "\nResposta: ");
            x = scan.nextInt();

            if(x < 0 || x > 2) {
                System.out.print("\nInsira um número válido");
            }

            // LOGIN
            if(x == 1) {

                do {
                    System.out.print("\nInsira seu usuário:\n");
                    user = scan.next();

                    System.out.println("Insira sua senha:");
                    senha = scan.nextInt();

                    System.out.print("\nusuário: " + user);
                    System.out.print("\nsenha: " + senha);
                }

                while(user != "amanda" && senha != 1234);

                System.out.println("\nO que deseja fazer?"
                        + "\n1- Consultas"
                        + "\n2- Agendamentos"
                        + "\n ");
            }
        }
    }

}
