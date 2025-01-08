package aulas.aula018.model;

//Herda atributos e metodos da classe Pessoa
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void cancelarMatricula() {
        System.out.println("Matricula cancelada");
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    //Informar que esse metodo vai sobescrever 
    //o metodo da superClasse
    @Override
    public void print() {
        //O super acessa os membros da 
        //superClasse public
        super.print();
        System.out.println(this.matricula);
        System.out.println(this.curso);
    }
}
