package Exercicios.ex036.model;

public class Consultor extends Funcionario{
    

    public Consultor(long matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }

    @Override
    public double getSalario() {
        return (super.salario * 110) / 100;
    }

    public double getSalario(double percentual) {
        return (super.salario * (percentual + 100)) / 100;
    }
}
