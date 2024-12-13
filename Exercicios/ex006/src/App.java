import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int maiorNumber = 0;
        int segundoMaiorNumber = 0;
        int number;
        int cont = 0;
        while(true) {
            number = teclado.nextInt();
            if(number == 0) {
                break;
            }
            if(cont == 0) {
                maiorNumber = number;
                segundoMaiorNumber = number;
                cont++;
            } else {
                if(number > maiorNumber) {
                    segundoMaiorNumber = maiorNumber;
                    maiorNumber = number;
                } else if(number > segundoMaiorNumber && number < maiorNumber) {
                    segundoMaiorNumber = number;
                }
            }
        }
        System.out.println("Maior number: " + maiorNumber);
        System.out.println("Segundo maior Number: " + segundoMaiorNumber);
        teclado.close();
    }
}
