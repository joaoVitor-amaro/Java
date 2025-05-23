package aulas.aula022.dominio;

public class Mamifero extends Animal{
    private String corDePele;

    public Mamifero(String nome, double peso, int idade, int membro, String corDePele) {
        super(nome, peso, idade, membro);
        this.corDePele = corDePele;
    }

    //Metodos sobrescrito da superclasse
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }

    public void setCorDePele(String corDePele) {
        this.corDePele = corDePele;
    }

    public String getCorDePele() {
        return this.corDePele;
    }

    @Override
    public void lerAtributos() {
        super.lerAtributos();
        System.out.println("Cor da Pele: " + this.corDePele);
    }
}
    

