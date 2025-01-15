package aulas.aula021.model;

public class Cachorro extends Mamifero{

    public Cachorro(String nome, double peso, int idade, int membro, String corDePele) {
        super(nome, peso, idade, membro, corDePele);
    }

    @Override
    public void locomover() {
        System.out.println("correndo");
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU AU");
    }

    
    @Override 
    public void lerAtributos() {
        System.out.println("Nome: " + this.nome);
        super.lerAtributos();
    }
}

