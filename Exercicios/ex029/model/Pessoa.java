package Exercicios.ex029.model;

public class Pessoa {
    private static int IDADE_PADRAO = 0;

    private String nome;
    private int idade;
    private String telefone;
    
    public Pessoa() {
        this.idade = IDADE_PADRAO;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade, String telefone) {
        this(nome);
        setIdade(idade);
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade < 0) {
            this.idade = IDADE_PADRAO;
            return;
        }
        this.idade = idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getTelefone() {
        return this.telefone;
    }
}
