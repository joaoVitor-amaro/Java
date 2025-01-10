package Exercicios.ex037.model;

public class TrabalhadorPorHora extends Trabalhador{
    private double valorDaHora;
    private int horasSemanais;

    public TrabalhadorPorHora(String nome, double valorDaHora, int horasSemanais) {
        super(nome, valorDaHora*horasSemanais);
        this.valorDaHora = valorDaHora;
        this.horasSemanais = horasSemanais;
    }

    public void setValorDaHora(double valorDaHora) { 
        this.valorDaHora = valorDaHora;
    }

    public double getValorDaHora() {
        return this.valorDaHora;
    }

    public double calcularPagamentoSemanal() {
        double salarioMensal = this.valorDaHora*horasSemanais;
        //Ganha um hora extra
        if (horasSemanais > 40) {
            int horasExtras = horasSemanais - 40;
            double valorHoraExtra = (this.valorDaHora *30) / 60;
            salarioMensal = (this.valorDaHora * 40) + (valorHoraExtra+this.valorDaHora) * horasExtras;   
        }
        super.salario = salarioMensal*4;
        return salarioMensal;
    }

    @Override
    public void exibirDados() {
        System.out.println(super.nome + " - " + "Semanal:R$ " +  calcularPagamentoSemanal()+ 
        " Mensal:R$ " + super.salario);
    }
}
