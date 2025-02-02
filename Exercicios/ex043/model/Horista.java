package Exercicios.ex043.model;

public class Horista extends Funcionario{
    private double salarioPorHora;
    private double horasTrabalhadas;
    private static final double valorHoraExtra = 1.5;

    public Horista(String nome, String matricula, double salarioPorHora, double horasTrabalhadas) {
        super(nome, matricula);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalario() {
        double salario;
        if(this.horasTrabalhadas > 40) {
            salario = this.salarioPorHora * valorHoraExtra * (horasTrabalhadas - 40);
            salario += this.salarioPorHora * 40;
        } else {
            salario = this.salarioPorHora * this.horasTrabalhadas;
        }
        return salario * 4;
    }
}
