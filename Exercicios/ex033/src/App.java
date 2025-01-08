import java.util.Scanner;
import Exercicios.ex033.model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int tipo;
        while(true) {
            tipo = scanner.nextInt();
            if(tipo == 0) {
                break;
            }

            switch (tipo) {
                case 1:
                    Quadrado quadrado = new Quadrado(tipo);
                    quadrado.lerAtributos();
                    System.out.println(quadrado.getNome() + " de area " + quadrado.calcularArea());
                    break;
                case 2: 
                    Retangulo retangulo = new Retangulo(tipo);
                    retangulo.lerAtributos();
                    System.out.println(retangulo.getNome() + " de area " + retangulo.calcularArea());
                    break;
                case 3:
                    Triangulo triangulo = new Triangulo(tipo);
                    triangulo.lerAtributos();
                    System.out.println(triangulo.getNome() + " de area " +triangulo.calcularArea());
                    break;
                case 4:
                    Circulo circulo = new Circulo(tipo);
                    circulo.lerAtributos();
                    System.out.println(circulo.getNome() + " de area " +circulo.calcularArea());
                    break;
            }
        }
        scanner.close();       
    }
}
