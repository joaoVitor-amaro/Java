package Exercicios.ex040.model;

public final class Aluno extends Pessoa{
    private double cra;
    private int semestre;

    public Aluno(String nome, String telefone, String cpf, double cra, int semestre) {
        super(nome, telefone, cpf);
        this.cra = cra;
        this.semestre = semestre;
    }

    public void setCra(double cra){
        this.cra = cra;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getCra() {
        return this.cra;
    }

    public int getSemestre() {
        return this.semestre;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("CRA: " + this.cra);
        System.out.println("Semestre: " + this.semestre);
        System.out.println(" ");
    }
}
