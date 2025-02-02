import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N;
        int soma = 0;
        N = scanner.nextInt();
        for(int i = N; i > 1; i--) {
            if(N % i == 0) {
                soma += (N / i);
            }
        }
        if(soma > N) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
        scanner.close();
    }
}
