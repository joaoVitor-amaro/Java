import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int num;
        int cont = 0;
        int maiorQuinzeImpar = 0;
        while(true) {
            num = teclado.nextInt();
            if(num == 0) {
                break; 
            }
            cont++;
            if(num > 15 && num % 2 != 0) {
                maiorQuinzeImpar++;
            }
        }

        float percentoMaiorQuinzeImpar = (maiorQuinzeImpar*100)/cont;
        System.out.println(percentoMaiorQuinzeImpar+"%");
        
        teclado.close();        
    }
}
