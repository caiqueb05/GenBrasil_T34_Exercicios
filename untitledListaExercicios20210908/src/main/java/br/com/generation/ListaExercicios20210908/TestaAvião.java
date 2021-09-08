package br.com.generation.ListaExercicios20210908;

public class TestaAvião {

    public static void main(String[] args) {

        Avião avião1 = new Avião();

        avião1.setFabricante("Embraer");
        avião1.setModelo("Tucano");
        avião1.setAutonomia(400.0);

        System.out.println("\nFabicante do avião: " + avião1.getFabricante());
        System.out.println("Modelo do avião: " + avião1.getModelo());
        System.out.println("Autonomia do avião: " + avião1.getAutonomia());

        avião1.decolar();
        avião1.aterrisar();

    }

}
