package Exercicios.ex021.Model;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private float preco;

    public Carro(String modelo, String marca, int ano, float preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    public Carro() {}

    public String getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getAno() {
        return this.ano;
    }

    public float getPreco() {
        return this.preco;
    }
}
