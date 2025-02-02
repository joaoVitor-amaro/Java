package Exercicios.ex043.model;

public class Assalariado extends Funcionario{
    private double salario;

    public Assalariado(String nome, String matricula, double salario) {
        super(nome, matricula);
        this.salario = salario;
    }

    public double calcularSalario() {
        return this.salario;
    }
}
