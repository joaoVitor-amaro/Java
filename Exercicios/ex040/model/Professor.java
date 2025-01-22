package Exercicios.ex040.model;

public class Professor extends Pessoa{
    private int qtdDisciplina;
    private String departamento;

    public Professor(String nome, String telefone, String cpf, int qtdDisciplina, String departamento) {
        super(nome, telefone, cpf);
        this.qtdDisciplina  = qtdDisciplina;
        this.departamento = departamento;
    }

    public void setQtdDisciplina(int qtdDisciplina) {
        this.qtdDisciplina = qtdDisciplina;
    }

    public void setDepartamneto(String departamento) {
        this.departamento = departamento;
    }

    public int getQtdDisciplina() {
        return this.qtdDisciplina;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Quantidade de Disciplina: " + this.qtdDisciplina);
        System.out.println("Departamento: " + this.departamento);
    }
}
