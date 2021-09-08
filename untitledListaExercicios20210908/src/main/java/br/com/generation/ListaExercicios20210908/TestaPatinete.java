package br.com.generation.ListaExercicios20210908;

public class TestaPatinete {

    public static void main(String[] args) {

        Patinete patinete1 = new Patinete();

        patinete1.setMarca("Xuxinha");
        patinete1.setTipo("Elétrico");
        patinete1.setCor("Vermelho");

        System.out.println("\nMarca do patinete: " + patinete1.getMarca());
        System.out.println("Tipo de patinete: " + patinete1.getTipo());
        System.out.println("Cor do patinete: " + patinete1.getCor());

        patinete1.andarPatinete();

    }

}
