package br.com.generation.Exercicio02;

public class ImprimirAnimal {

    public static void main(String[] args) {

        TestaAnimal objeto = new TestaAnimal();

        objeto.fazerAnimalEmitirSom(new Cachorro());
        objeto.fazerAnimalEmitirSom(new Cavalo());
        objeto.fazerAnimalEmitirSom(new Preguiça());

    }

}
