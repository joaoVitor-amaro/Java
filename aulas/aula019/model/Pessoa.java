package aulas.aula019.model;

//Class abstract - Nao pode ser instanciada
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;

    public Pessoa() {}
    //Esse metodo nao pode ser sobrescrito
    public final void fazerAniversario() {
        this.idade++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public char getSexo() {
        return this.sexo;
    }

    public String toString() {
        return this.nome + " " + this.idade + " " + this.sexo;
    }
}
