package br.com.generation.ListaExercicios20210908;

public class TestaCliente {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.setNome("Caique");
        cliente1.setIdade(27);
        cliente1.setCpf(999999999);

        System.out.println("\nNome do cliente: " + cliente1.getNome());
        System.out.println("Idade do cliente: " + cliente1.getIdade());
        System.out.println("Cpf do cliente: " + cliente1.getCpf());

        cliente1.comprarProduto();
        cliente1.pagarProduto();

    }

}
