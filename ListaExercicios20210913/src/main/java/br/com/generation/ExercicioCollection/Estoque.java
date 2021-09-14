package br.com.generation.ExercicioCollection;

public class Estoque {

    private String tipo;
    private String categoria;
    private String marca;
    private int quantidade;
    private double preco;
    private int indice;

    public Estoque(String tipo, String categoria, String marca, int quantidade, double preco, int indice) {
        this.tipo = tipo;
        this.categoria = categoria;
        this.marca = marca;
        this.quantidade = quantidade;
        this.preco = preco;
        this.indice = indice;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "tipo='" + tipo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", marca='" + marca + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                ", indice=" + indice +
                "}\n";
    }
}
