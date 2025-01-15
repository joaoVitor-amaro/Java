package aulas.aula021.model;

public abstract class Animal {
    protected String nome;
    protected double peso;
    protected int idade;
    protected int membro;

    public Animal(String nome, double peso, int idade, int membro) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.membro = membro;
    }

    //Metodos abstrato que vai se comportar
    //de maneiras diferentes nas subclasses
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    public void lerAtributos() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade:" + this.idade);
        System.out.println("Peso: " + this.peso+ "kg");
        System.out.println("Membro: " + this.membro);
    }
}
