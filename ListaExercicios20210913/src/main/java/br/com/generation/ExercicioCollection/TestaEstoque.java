package br.com.generation.ExercicioCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Estoque> estoque = new ArrayList<>();

        //Adicionar produtos
        System.out.println("Quantos produtos você deseja adicionar?");
        int qtdProdutos = sc.nextInt();

        for(int i = 0; i < qtdProdutos; i++){
            System.out.println("\nInsira o tipo do " + (i+1) + "º produto:");
            String tipo = sc.next();
            sc.nextLine();

            System.out.println("Insira a categoria do " + (i+1) + "º produto:");
            String categoria = sc.nextLine();

            System.out.println("Insira a marca do " + (i+1) + "º produto:");
            String marca = sc.nextLine();

            System.out.println("Insira a quantidade do " + (i+1) + "º produto:");
            int quantidade = sc.nextInt();

            System.out.println("Insira o preço do " + (i+1) + "º produto:");
            double preco = sc.nextDouble();

            int indice = i;

            estoque.add(new Estoque(tipo, categoria, marca, quantidade, preco, indice));

        }
        System.out.println();
        System.out.println("A lista completa dos produtos é: ");

        for(Estoque i: estoque){
            System.out.print(i);
        }

        System.out.println("\nA quantidade de produtos cadastrados é: " + estoque.size());

        //Atualizar dados do ArrayList
        System.out.println("\nDigite o número do indice do produto que você deseja alterar: ");
        int getIndiceAlterar = sc.nextInt();

        System.out.println("\nTem certeza que deseja alterar esse produto? 0-Não/1-Sim\n" + estoque.get(getIndiceAlterar));
        int getIndiceAlterar1 = sc.nextInt();

        if(getIndiceAlterar1 == 1){
            estoque.remove(getIndiceAlterar);
            System.out.println("\nInsira o novo tipo do produto:");
            String tipo = sc.next();
            sc.nextLine();

            System.out.println("Insira a nova categoria do produto:");
            String categoria = sc.nextLine();

            System.out.println("Insira a nova marca do produto:");
            String marca = sc.nextLine();

            System.out.println("Insira a nova quantidade do produto:");
            int quantidade = sc.nextInt();

            System.out.println("Insira o novo preço do produto:");
            double preco = sc.nextDouble();

            int indice = getIndiceAlterar;

            estoque.add(getIndiceAlterar, new Estoque(tipo, categoria, marca, quantidade, preco, indice));

            System.out.println("\nO produto com índice " + getIndiceAlterar + " foi alterado!");
            System.out.println("\nA nova lista alterada ficou assim: \n" + estoque);

        } else {
            System.out.println("Remoção cancelada, deseja remover outra posição?");
        }

        //Remover dados do ArrayList
        System.out.println("\nDigite o número do indice do produto que você deseja deletar: ");
        int getIndice = sc.nextInt();

        System.out.println("\nTem certeza que deseja exluir esse produto? 0-Não/1-Sim \n" + estoque.get(getIndice));
        int getIndice1 = sc.nextInt();

        if(getIndice1 == 1){
            estoque.remove(getIndice);
            System.out.println("\nO produto com índice " + getIndice + " foi removido com sucesso!");
        } else {
            System.out.println("Remoção cancelada, deseja remover outra posição?");
        }

        System.out.println("\nOs produtos restantes são: \n" + estoque);

    }

}


