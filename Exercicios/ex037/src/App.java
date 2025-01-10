import Exercicios.ex037.model.*;
public class App {
    public static void main(String[] args) throws Exception {
        TrabalhadorAssalariado trabalhadorAssalariado = new TrabalhadorAssalariado("Joao", 3000);
        trabalhadorAssalariado.exibirDados();

        TrabalhadorPorHora trabalhadorPorHora = new TrabalhadorPorHora("Joao", 20, 50);
        trabalhadorPorHora.exibirDados();
    }
}
