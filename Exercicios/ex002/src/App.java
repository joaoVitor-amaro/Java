import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int N;
        int maior = 0;
        int num = 0;
        N = teclado.nextInt();

        for(int i = 0; i < N; i++) {
            num = teclado.nextInt();
            if(num > maior) {
                maior = num;
            }
        }
        System.out.println(maior);
        teclado.close();        
    }
}
