import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int numRandom = random.nextInt(6 - 1) + 1;
        int numPlayer;
        System.out.println("O computador pensou em um numero entre 1 e 5");
        System.out.print("Qual foi o numero? ");
        numPlayer = teclado.nextInt();
        if(numPlayer == numRandom) {
            System.out.println("Jogador Venceu!!");
        } else {
            System.out.println("Computador Venceu");
        }
        System.out.println("O computador pensou no numero " + numRandom);
        teclado.close();
    }
}
