package aulas.aula022.dominio;

public class Lobo extends Mamifero{
    public Lobo(String nome, double peso, int idade, int membro, String corDePele) {
        super(nome, peso, idade, membro, corDePele);
    }

    @Override
    public void emitirSom() {
        System.out.println("AUUUUUUUUUUUU");
    }
}
