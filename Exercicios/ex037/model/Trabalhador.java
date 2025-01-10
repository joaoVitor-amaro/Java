package Exercicios.ex037.model;

public class Trabalhador {
    protected String nome;
    protected double salario;

    public Trabalhador(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    } 

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void exibirDados() {}
}
