package br.com.generation.ListaExercicios20210908;

public class TestaPaciente {

    public static void main(String[] args) {

        Paciente paciente1 = new Paciente();

        paciente1.setNome("José");
        paciente1.setPlanoSaude("Sulamérica");
        paciente1.setEspecialidade("Cardiologista");

        System.out.println("\nNome do paciente: " + paciente1.getNome());
        System.out.println("Plano de Saúde do paciente: " + paciente1.getPlanoSaude());
        System.out.println("Especialidade desejada na consulta: " + paciente1.getEspecialidade());

        paciente1.marcarConsulta();

    }

}
