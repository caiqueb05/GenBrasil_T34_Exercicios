/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes
 esta classe, em seguida crie um objeto produto eletrônico, defina as instancias deste
 objeto e apresente as informações deste objeto no console.*/

package br.com.generation.ListaExercicios20210908;

public class ProdutoEletrônico {

    private String fabricante;
    private String tipo;
    private double preco;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    void ligarProduto(){
        System.out.println("Produto ligando");
    }

    void desligarProduto(){
        System.out.println("Produto desligando");
    }

}
