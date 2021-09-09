package br.com.generation.Exercicio01;

public class TestaTodosAnimais {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        Cavalo cavalo1 = new Cavalo();
        Preguiça preguiça1 = new Preguiça();

        cachorro1.setNome("K9");
        cachorro1.setIdade(7);

        cavalo1.setNome("Cavalo de Guerra");
        cavalo1.setIdade(12);

        preguiça1.setNome("Preguicinha Boa");
        preguiça1.setIdade(40);

        System.out.println("Nome do cachorro: " + cachorro1.getNome());
        System.out.println("Idade do cachorro: " + cachorro1.getIdade() + " anos");
        cachorro1.emitirSom();
        cachorro1.correr();

        System.out.println("\nNome do cavalo: " + cavalo1.getNome());
        System.out.println("Idade do cachorro: " + cavalo1.getIdade() + " anos");
        cavalo1.emitirSom();
        cavalo1.correr();

        System.out.println("\nNome da preguiça: " + preguiça1.getNome());
        System.out.println("Idade da preguiça: " + preguiça1.getIdade() + " anos");
        preguiça1.emitirSom();
        preguiça1.subirArvore();


    }

}
