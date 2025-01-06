import aulas.aula017.model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Data data = new Data(6, 1, 2024);
        Hora hora = new Hora(9, 32, 20);
        DataHora dataHora = new DataHora(data, hora);
        dataHora.imprimirDataHora();
    }
}
