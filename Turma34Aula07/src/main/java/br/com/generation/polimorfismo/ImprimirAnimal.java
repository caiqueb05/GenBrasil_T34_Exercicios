package br.com.generation.polimorfismo;

public class ImprimirAnimal {

    public static void main(String[] args) {

        TestaAnimal objeto = new TestaAnimal();

        objeto.fazerAnimalComer(new Cachorro());

        objeto.fazerAnimalComer(new Tigre());

    }

}
