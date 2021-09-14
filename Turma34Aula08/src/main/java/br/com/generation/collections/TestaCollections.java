package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollections {

    public static void main(String[] args) {

        /*Collections --> Objeto para agrupar muitos elementos*/
        String aula1 = "Bloco I - Java";
        String aula2 = "ABloco II - SpringBoot";
        String aula3 = "DBloco III - Angular";
        String aula4 = "CProgramador Formado";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);

        System.out.println(aulas);

        aulas.remove(2);
        System.out.println(aulas);

        // --> Loop - Laço de repetição --> for each
        for(String i: aulas){
            System.out.println("Aula: " + i);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);
        System.out.println("A segunda aula é: " + aulas.get(1));

        for(int i = 0; i < aulas.size(); i++){
            System.out.println("Aula " + (i+1) + "º: " + aulas.get(i));
        }

        System.out.println("Tamanho do ArrayList: " + aulas.size());

        Collections.sort(aulas);
        System.out.println("Sort --> Colocar o conteúdo de forma crescente: " + aulas);

        Collections.shuffle(aulas);
        System.out.println("Shuffle --> Para sortear o conteúdo do array: " + aulas);

    }

}
