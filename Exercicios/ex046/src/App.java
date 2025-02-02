import Exercicios.ex046.model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Array array = new Array(2);
        try {
            array.setArray(15);
            array.setArray(14);
            array.setArray(15);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
