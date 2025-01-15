package aulas.aula021.model;

public class Cobra extends Reptil{

    public Cobra(String nome, double peso, int idade, int membro, String corDeEscama) {
        super(nome, peso, idade, membro, corDeEscama);
    }

    public void emitirSom() {
        System.out.println("Shiii shii");
    }

}
