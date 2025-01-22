import Exercicios.ex041.model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Casa casa = new Casa();
        casa.lerAtributos();
        casa.exibirAtributos();

        Terreno terreno = new Terreno();
        terreno.lerAtributos();
        terreno.exibirAtributos();
    }
}
