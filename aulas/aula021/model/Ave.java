package aulas.aula021.model;

public class Ave extends Animal{
    public String corPena;

    public Ave(String nome, double peso, int idade, int membro, String corPena) {
        super(nome, peso, idade, membro);
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comando frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }

    public void fazerNinho() {
        System.out.println("Fazendo ninho");
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public String getCorPena() {
        return this.corPena;
    }

}

