package aulas.aula018.model;

//Herda atributos e metodos da classe Pessoa
public class Funcoionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcoionario(String nome, int idade, char sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
    public void mudarTrabalho() {
        this.trabalhando = ! this.trabalhando;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    } 

    public String getSetor() {
        return this.setor;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(this.setor);
        System.out.println(this.trabalhando);
    }
}
