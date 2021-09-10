package br.com.generation.interfaceteste;

public class Cachorro extends SuperAnimal implements Animal{
    @Override
    public void somAnimal() {
        System.out.println("O som do cachorro: au au");
    }

    @Override
    public void dormir() {
        System.out.println("O cachorro quando dorme: zzz");
    }
}
