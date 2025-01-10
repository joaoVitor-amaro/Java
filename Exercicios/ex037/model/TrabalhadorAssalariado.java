package Exercicios.ex037.model;

public class TrabalhadorAssalariado extends Trabalhador{
    private double salarioMensal;

    public TrabalhadorAssalariado(String nome, double salario) {
        super(nome, salario);
        this.salarioMensal = calcularPagamentoSemanal();
    }
    public double calcularPagamentoSemanal() {
        return super.getSalario() / 4; 
    }

    public double getSalarioMensal() {
        return this.salarioMensal;
    }

    @Override
    public void exibirDados() {
        System.out.println(super.nome + " - " + "Semanal:R$ " + this.salarioMensal + 
        " Mensal:R$ " + super.salario);
    }    
}
