import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();
        int[] numSixImpar = new int[6];
        int cont_impar = 0;
        while (cont_impar != 6) {
            if(x % 2 != 0) {
                numSixImpar[cont_impar] = x;
                cont_impar++;
            }
            x++;
        }
        for(int nums : numSixImpar) {
            System.out.printf("%d%n", nums);
        }
        scanner.close();
    }
}
