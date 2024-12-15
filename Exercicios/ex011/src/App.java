import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String fourletras;
        fourletras = teclado.nextLine();
        //Armazena letras na string que foram delimitadas pelo espaco
        String[] letras = fourletras.split(" ");
        //Ordena as letras de forma crescente
        //de acordo com a tabela ASCII
        Arrays.sort(letras);
        for(String letra : letras) {
            System.out.print(letra + " ");
        }      
        System.out.println(" ");
        teclado.close();
    }
}
