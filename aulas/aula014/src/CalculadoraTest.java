import aulas.aula014.model.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.soma(1, 4, 5, 7));
        int[] array = {1, 5, 6, 6};
        System.out.println(calculadora.soma(array));
    }
}
