import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
     Scanner teclado = new Scanner(System.in);
     Random random = new Random();
     int numPc = random.nextInt(11-1) + 1;
     int numUser;
     int vida = 4;
     System.out.println("O teclado pensou em um numero entre 1 - 10");
     while(true) {
        System.out.print("Qual foi numero que PC pensou? ");
        numUser = teclado.nextInt();
        if(numPc == numUser) {
            System.out.println("Parabens, voce ganhou");
            System.out.println("O computador pensou no numero " + numPc);
            break;
        } else {
            //Perda 1 vida a cada erro
            vida--;
            if(vida == 0) {
                System.out.println("Voce perdeu");
                System.out.println("O computador pensou no numero " + numPc);
                break;
            }
        }
        if(numPc > numUser) {
            System.out.println("Dica: Numero maior");
        } else {
            System.out.println("Dica: Numero menor");
        }
     }
     teclado.close();   
    }
}
