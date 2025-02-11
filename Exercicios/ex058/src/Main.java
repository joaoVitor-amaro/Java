import java.util.Scanner;

public class Main {
    public static double divisao(int x, int y) throws ArithmeticException{
        if(y == 0) {
            throw new ArithmeticException("divisao impossivel");
        }
        double divisao = (double) x / y;
        return divisao;
    }
    public static void main(String[] args) throws Exception {
        int N;
        int x, y;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        while (N > 0) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            try{    
                double resultado = Main.divisao(x, y);
                System.out.printf("%.1f%n", resultado);
            } catch (ArithmeticException e) {
                System.out.printf("%s%n", e.getMessage());
            }
            N--;
        }
        scanner.close();
    }
}
