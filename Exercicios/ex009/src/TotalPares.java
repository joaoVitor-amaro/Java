import java.util.Scanner;
public class TotalPares {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int x, y; //Intervalor de number
        int totalPares = 0;
        x = teclado.nextInt();
        y = teclado.nextInt();
        if(x > y) {
            //Encerrar o programa
            teclado.close();
            return;
        } else {
            for(int i = x; i <= y; i++) {
                if(i % 2 == 0) {
                    totalPares += 1;
                }
            }
        }
        System.out.printf("Total de numeros pares entre %d e %d: %d\n", x, y, totalPares);
        teclado.close();
    }
}
