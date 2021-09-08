package br.com.generation.ListaExercicios20210908;

public class TestaContaBancária {

    public static void main(String[] args) {

        ContaBancária conta1 = new ContaBancária();

        conta1.setAgencia(2383);
        conta1.setConta(32182);
        conta1.setTipo("Poupança");

        System.out.println("\nNúmero da agência: " + conta1.getAgencia());
        System.out.println("Número da conta: " + conta1.getConta());
        System.out.println("Tipo de conta: " + conta1.getTipo());

        conta1.conferirExtrato();
        conta1.sacarDinheiro();

    }

}
