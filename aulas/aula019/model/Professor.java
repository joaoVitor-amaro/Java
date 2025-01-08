package aulas.aula019.model;

//Esta class nao pode ter filho
public final class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    public void receberAumento() {
        this.salario = this.salario * 1.1;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public double getSalario() {
        return this.salario;
    }

    public String toString() {
        return super.toString() + " " + this.especialidade + " " + this.salario; 
    }
}
