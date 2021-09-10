package br.com.generation.interfaceteste;

public class TestaReinoAnimal {

    public static void main(String[] args) {

        Cachorro meuCachorro = new Cachorro();

        meuCachorro.setNome("Toby");
        meuCachorro.setIdade(5);
        meuCachorro.dormir();
        meuCachorro.somAnimal();

        System.out.println(meuCachorro.getNome());
        System.out.println(meuCachorro.getIdade());

    }

}
