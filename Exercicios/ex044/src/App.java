import Exercicios.ex044.controller.ControllerEleitor;
import Exercicios.ex044.model.Eleitor;

public class App {
    public static void main(String[] args) throws Exception {
        ControllerEleitor controllerEleitor = new ControllerEleitor();
        Eleitor eleitor1 = new Eleitor("ADRIANO FERREIRA", 21, "12346");
        Eleitor eleitor2 = new Eleitor("ARTHUR HENRIQUE", 15, "12349");
        controllerEleitor.setEleitor(eleitor1);
        controllerEleitor.setEleitor(eleitor2);
        controllerEleitor.verificarEleitores();
    }
}
