import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();
        int milhar, centena, dezena, unidade;
        if(number < 0 || number > 9999) {
            scanner.close();
            return;
        }
        milhar = number / 1000;
        centena = (number / 100) % 10;
        dezena = (number / 10) % 10;
        unidade = number % 10;
        System.out.println("Analisando o numero " + number);
        System.out.println("Unidade: " + unidade);
        System.out.println("Dezena: " + dezena);
        System.out.println("Centena: " + centena);
        System.out.println("Milhar: " + milhar);
        scanner.close();
    }
}
