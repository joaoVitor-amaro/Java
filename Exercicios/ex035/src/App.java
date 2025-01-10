import Exercicios.ex035.model.*;
public class App {
    public static void main(String[] args) throws Exception {
        Novo novo = new Novo("Paraiba", "Joao Pessoa", "Rua das Baraunas", 3000, 10);
        novo.exibirDados();
        System.out.println("");
        Velho velho = new Velho("Paraiba", "Santa Rita", "Padre Ferreira", 50000, 30);
        velho.exibirDados();
    }
}
