package Exercicios.ex043.model;

public abstract class Funcionario {
    private String nome;
    private String matricula;

    public Funcionario() {}

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public abstract double calcularSalario();

}
