package aulas.aula018.model;

public class Pessoa {
    private String nome;
    private int idade;
    //A superClass e subClass tem acesso
    //por ser protected
    protected char sexo;

    public Pessoa(){}

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public void fazerAniversario() {
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
    
    public void print() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
