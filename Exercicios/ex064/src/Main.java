import java.util.Scanner;
public class Main {

    public static String arvoreIdeal(int altura, int diametro, int qtd_galhos) {
        if((altura >= 200 && altura <= 300) && diametro >= 50 && qtd_galhos >= 150) {
            return "Sim";
        } else {
            return "Nao";
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N; 
        N = scanner.nextInt();
        if(N < 0 || N > 100) {
            scanner.close();
            return;
        }
        int altura, diamentro, qtd_galhos;
        for(int i = 0; i < N; i++) {
            altura = scanner.nextInt();
            diamentro = scanner.nextInt();
            qtd_galhos = scanner.nextInt();
            String arvore = Main.arvoreIdeal(altura, diamentro, qtd_galhos);
            System.out.printf("%s%n", arvore);
        }
        scanner.close();
    }
}
