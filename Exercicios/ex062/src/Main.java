import java.util.Scanner;
public class Main {
    public static String palavrao(String palavra) {
        return (palavra.length() >= 10) ? "palavrao" : "palavrinha";
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String palavra;
        palavra = scanner.nextLine();
        if(palavra.length() > 20) {
            scanner.close();
            return;
        }
        String tipoPalavra = Main.palavrao(palavra);
        System.out.printf("%s%n", tipoPalavra);
        scanner.close();
    }
}
