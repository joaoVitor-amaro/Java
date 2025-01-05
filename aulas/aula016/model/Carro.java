package aulas.aula016.model;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    //Modificador estaticos
    //Atributo pertence a classe
    //O valor do atributo pertence a todos os objetos
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade MAX: " + this.velocidadeMaxima);
        System.out.println("Vel limite: " + Carro.velocidadeLimite);
        System.out.println("-------------------------------");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setvelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return this.nome;
    }

    public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }
}
