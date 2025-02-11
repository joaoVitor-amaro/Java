import java.util.Scanner;

public class Main {
    public static String numberMultiplos(int n1, int n2) throws ArithmeticException{
        if(n1 == 0) {
            throw new ArithmeticException("Divisao impossivel");
        }
        String multiplos = (n1 % n2 == 0 || n2 % n1 == 0) ? "Sao Multiplos" : "Nao sao Multiplos";
        return multiplos;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        try {
            String multiplos =  Main.numberMultiplos(n1, n2);
            System.out.printf("%s%n", multiplos);
        } catch (ArithmeticException e) {
            System.out.printf("%s%n", e.getMessage());
        }
        scanner.close();
    }
}
