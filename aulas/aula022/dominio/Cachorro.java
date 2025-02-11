package aulas.aula022.dominio;

public class Cachorro extends Lobo{
    public Cachorro(String nome, double peso, int idade, int membro, String corDePele) {
        super(nome, peso, idade, membro, corDePele);
    }

    public void reagir(String frase) {

    }

    public void reagir(int hora, int minutos) {

    }

    public void reagir(int idade, double peso) {

    }

    public void reagir(boolean dono) {
        
    }
    
    @Override 
    public void emitirSom() {
        System.out.println("AU! AU! AU!");
    }
}
