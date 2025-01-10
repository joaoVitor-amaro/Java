package Exercicios.ex034.model;

public final class Administrativo extends Assistente{
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, long matricula, String turno, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public double ganhoAnual() {
        return (super.getSalario() + this.adicionalNoturno) *12;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println(" " + this.turno + " " + this.adicionalNoturno);
    }
}
