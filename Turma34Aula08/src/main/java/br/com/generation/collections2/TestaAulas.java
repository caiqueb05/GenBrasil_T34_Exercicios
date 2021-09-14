package br.com.generation.collections2;

import java.util.ArrayList;

public class TestaAulas {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revisando - Java", 60);
        Aula a2 = new Aula("Lista de Objetos", 80);
        Aula a3 = new Aula("Relacionamento na Lista", 90);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

    }

}
