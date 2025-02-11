import java.util.Scanner;
public class Main {
    public static int segundNota(int notaOne, int media) {
        return 2*media - notaOne;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int notaOne, media;
        notaOne = scanner.nextInt();
        media = scanner.nextInt();
        if((media < 0 || media > 100) || (notaOne < 0 || notaOne > 100)) {
            scanner.close();
            return;
        }
        int segundaNota = Main.segundNota(notaOne, media);
        System.out.printf("%d%n", segundaNota);
        scanner.close();
    }
}
