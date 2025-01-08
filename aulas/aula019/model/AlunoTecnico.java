package aulas.aula019.model;

public final class AlunoTecnico extends Aluno{
    private String registroProfissional;

    public void pratica() {
        System.out.println(super.nome + " praticando");
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public String getRegistroProfissional() {
        return this.registroProfissional;
    }

    public String toString() {
        return super.toString() + " " + this.registroProfissional;
    }
}
