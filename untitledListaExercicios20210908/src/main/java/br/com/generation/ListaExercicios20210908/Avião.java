/*2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe
, em seguida crie um objeto avião, defina as instancias deste objeto e apresente as
informações deste objeto no console.*/

package br.com.generation.ListaExercicios20210908;

public class Avião {

    private String fabricante;
    private String modelo;
    private double autonomia;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    void decolar(){
        System.out.println("Avião decolando");
    }

    void aterrisar(){
        System.out.println("Avião aterrisando");
    }
}
