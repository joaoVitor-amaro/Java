import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, divisao;
        try {
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
            divisao = n1 / n2;
            System.out.println(divisao);
        } catch (InputMismatchException e) {
            System.out.println("Numero invalido");
        } catch(ArithmeticException e) {
            System.out.println("Divisao por zero");
        }
        scanner.close();
    }
}
