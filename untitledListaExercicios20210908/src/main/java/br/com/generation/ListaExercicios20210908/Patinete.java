/*5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste objeto
e apresente as informações deste objeto no console.*/

package br.com.generation.ListaExercicios20210908;

public class Patinete {

    private String marca;
    private String tipo;
    private String cor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    void andarPatinete(){
        System.out.println("Patinete andando");
    }

}
