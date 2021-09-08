package br.com.generation.ListaExercicios20210908;

public class TestaProduto {

    public static void main(String[] args) {

        ProdutoEletrônico produto1 = new ProdutoEletrônico();

        produto1.setFabricante("Samsung");
        produto1.setTipo("Televisão");
        produto1.setPreco(2599.00);

        System.out.println("\nMarca do produto: " + produto1.getFabricante());
        System.out.println("Tipo de produto eletrônico: " + produto1.getTipo());
        System.out.println("Preço do produto: " + produto1.getPreco());

        produto1.ligarProduto();
        produto1.desligarProduto();

    }


}
