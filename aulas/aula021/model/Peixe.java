package aulas.aula021.model;

public class Peixe extends Animal{
    private String corEscama;

    public Peixe(String nome, double peso, int idade, int membro, String corEscama) {
        super(nome, peso, idade, membro);
        this.corEscama = corEscama;
    }
    //Metodos sobrescrito da superclasse
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancia");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }

    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return this.corEscama;
    }
}

