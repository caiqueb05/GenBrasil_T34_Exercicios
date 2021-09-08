/*4) Crie uma classe funcionário e apresente os atributos e métodos referentes
 esta classe, em seguida crie um objeto funcionário, defina as instancias deste 
 objeto e apresente as informações deste objeto no console.*/

package br.com.generation.ListaExercicios20210908;

public class Funcionário {

    private String nome;
    private String empresa;
    private String setor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    void trabalhar(){
        System.out.println("Funcionário trabalhando");
    }

}
