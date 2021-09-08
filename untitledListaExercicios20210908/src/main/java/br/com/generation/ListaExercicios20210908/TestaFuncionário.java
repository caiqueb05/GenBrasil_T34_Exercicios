package br.com.generation.ListaExercicios20210908;

public class TestaFuncionário {

    public static void main(String[] args) {

        Funcionário funcionario1 = new Funcionário();

        funcionario1.setNome("João");
        funcionario1.setEmpresa("Generation");
        funcionario1.setSetor("Tecnologia");

        System.out.println("\nNome do funcionário: " + funcionario1.getNome());
        System.out.println("Empresa onde o funcionário trabalha: " + funcionario1.getEmpresa());
        System.out.println("Setor em que o funcionário atua: " + funcionario1.getSetor());

        funcionario1.trabalhar();

    }

}
