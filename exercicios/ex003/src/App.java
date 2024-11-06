import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teScanner = new Scanner(System.in);
        Random random = new Random();
        int numPc = random.nextInt(11);
        int opcaoUser;
        int opcaoPc;
        int numPlayer;
        int resulGame = 0;
        System.out.println("PAR OU IMPAR");
        while(true) {
            System.out.println("[1] - Impar");
            System.out.println("[2] - Par");
            System.out.print("Sua opcao: ");
            opcaoUser = teScanner.nextInt();
            
            if(opcaoUser == 1 || opcaoUser == 2) {
                if(opcaoUser == 1) {
                    //PC e par
                    opcaoPc = 2;
                } else {
                    //PC e impar
                    opcaoPc = 1;
                }
                break;
            }else {
                System.out.println("Opcao invalida");
            }
        } 
        while(true) {
            //User informa o number que vai jogar
            System.out.print("Infome um number entre 0-10: ");
            numPlayer = teScanner.nextInt();
            if(numPlayer <= 10) {
                break;
            } else {
                System.out.println("number invalido");
            }
        }
        
        resulGame = (numPc + numPlayer) % 2;
        System.out.println("Soma dos dedos: " + (numPc+numPlayer));
        if ((resulGame == 0 && opcaoPc == 2) || (resulGame != 0 && opcaoPc == 1)) {
            System.out.println("O computador venceu o jogo");
        } else if ((resulGame == 0 && opcaoUser == 2) || (resulGame != 0 && opcaoUser == 1)) {
            System.out.println("O jogador venceu o jogo");
        }
        
        teScanner.close();    
    }
}
