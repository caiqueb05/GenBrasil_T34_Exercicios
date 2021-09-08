/*6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no console.*/

package br.com.generation.ListaExercicios20210908;

public class ContaBancária {

    private int agencia;
    private int conta;
    private String tipo;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    void sacarDinheiro(){
        System.out.println("Sacando dinheiro");
    }

    void conferirExtrato(){
        System.out.println("Conferindo extrato");
    }

}
