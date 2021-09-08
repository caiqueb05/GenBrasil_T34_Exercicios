/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente,
defina as instancias deste objeto e apresente as informações deste objeto no console.*/

package br.com.generation.ListaExercicios20210908;

import java.math.BigInteger;

public class Cliente {

    private String nome;
    private int idade;
    private long cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    void comprarProduto() {
        System.out.println("Cliente comprando produto");
    }

    void pagarProduto(){
        System.out.println("CLiente pagando produto");
    }
}
