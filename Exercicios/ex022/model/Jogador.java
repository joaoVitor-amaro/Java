package Exercicios.ex022.model;

public class Jogador {
    private String nome;
    private int idade;
    private int chuteGol;
    private int gols;

    public Jogador(String nome, int idade, int chuteGol, int gols) {
        this.nome = nome;
        this.idade = idade;
        this.chuteGol = chuteGol;
        this.gols = gols;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getChuteGol() {
        return this.chuteGol;
    }

    public int getGols() {
        return this.gols;
    }

}
