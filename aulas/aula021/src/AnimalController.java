import aulas.aula021.model.*;

public class AnimalController {
    public static void main(String[] args) {
        //cao do tipo Animal que recebeu uma instancia da classe cachorro
        Animal cao = new Cachorro("Marley", 14, 8, 4, "Marrom");
        cao.lerAtributos();
        cao.alimentar();
        cao.emitirSom();
        cao.locomover();
        System.out.println(" ");

        Animal cobra = new Cobra("Nagini", 2, 8, 0, "verde");
        cobra.lerAtributos();
        cobra.locomover();
        cobra.alimentar();
        cobra.emitirSom();
    }
}
