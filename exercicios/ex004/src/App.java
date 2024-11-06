import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int lado1, lado2, lado3;
        System.out.print("Lado 1: ");
        lado1 = teclado.nextInt();
        System.out.print("Lado 2: ");
        lado2 = teclado.nextInt();
        System.out.print("Lado 3: ");
        lado3 = teclado.nextInt();
        if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
            System.out.println("Triangulo EQUILÁTERO");
        } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triangulo ISÓSCELES");
        } else {
            System.out.println("Triangulo ESCALENO");
        }
        teclado.close();
    }
}
