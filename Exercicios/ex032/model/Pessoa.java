package Exercicios.ex032.model;

public class Pessoa {
    private String nome;
    private Endereco endereco;
    private String telefone;

    public Pessoa(String nome, Endereco endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String toString() {
        String dadosPessoal = this.nome + ", " + this.telefone + "\n" + this.endereco.toString();
        return dadosPessoal;
    }
}
