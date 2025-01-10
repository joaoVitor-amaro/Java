package Exercicios.ex034.model;

public final class Tecnico extends Assistente{
    private double bonusSalarial;
    
    public Tecnico(String nome, double salario, long matricula, double bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual() {
        return (super.getSalario() + bonusSalarial)*12;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println(" " + this.bonusSalarial);
    }

}
