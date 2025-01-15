package aulas.aula021.model;

public class Reptil extends Animal{
    private String corDeEscama;

    public Reptil(String nome, double peso, int idade, int membro, String corDeEscama) {
        super(nome, peso, idade, membro);
        this.corDeEscama = corDeEscama;
    }
    //Metodos sobrescrito da superclasse
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil");
    }

    @Override 
    public void lerAtributos() {
        super.lerAtributos();
        System.out.println("Cor da escama: " + this.corDeEscama);
    }

    public void setCorDeEscama(String corDeEscama) {
        this.corDeEscama = corDeEscama;
    }

    public String getCorDeEscama() {
        return this.corDeEscama;
    }
}

