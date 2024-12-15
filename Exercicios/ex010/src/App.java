import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String threeNumbers;
        threeNumbers = teclado.nextLine();
        //Separa a string em um array, tirando os espacos brancos
        String[] numbers = threeNumbers.split(" ");
        int[] numbersOrdenado = new int[3];
        
        for(int i = 0; i < numbersOrdenado.length; i++) {
            //Converte os numbers String e armazena no vetor int
             numbersOrdenado[i] = Integer.parseInt(numbers[i]);
        }
        //Ordena o vetor int
        Arrays.sort(numbersOrdenado);
        for(int number : numbersOrdenado) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
        teclado.close();
    }
}
