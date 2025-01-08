package aulas.aula019.model;

public class Aluno extends Pessoa{
    private String curso;
    private Long matricula;

    public final void pagarMensalidade() {
        System.out.println("Pgando mensalidade do " + this.nome);
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public Long getMatricula() {
        return this.matricula;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.matricula + " " + this.curso;
    }
}