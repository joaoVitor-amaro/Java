package Exercicios.ex034.model;

public class Assistente extends Funcionario{
    private long matricula;

    public Assistente(String nome, double salario, long matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public long getMatricula() {
        return this.matricula;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.print(" " + this.matricula);
    }
}
