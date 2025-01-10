package Exercicios.ex034.model;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void addAumento(double valor) {
        this.salario = (this.salario*(100+valor))/100;
    }

    public double ganhoAnual() {
        return this.salario*12;
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

    public void exibirDados() {
        System.out.print(this.nome + ", R$ " + this.salario);
    }
}
