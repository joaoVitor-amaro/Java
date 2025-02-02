package Exercicios.ex044.model;

public class Eleitor {
    private String nome;
    private int idade; 
    private String titulo;
    
    public Eleitor(String nome, int idade, String titulo) {
        this.nome = nome;
        this.idade = idade;
        this.titulo = titulo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }  
}
