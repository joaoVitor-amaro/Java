import java.util.Scanner;
public class Main {
    public static int[] qtdCores(int[][] tabuleiro) {
        int linha = tabuleiro.length;
        int coluna = tabuleiro[0].length;
        int[] qtd_cores = new int[2];
        int qtd_preto = 0, qtd_branco = 0;
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                if(tabuleiro[i][j] % 2 == 0) {
                    qtd_preto++;
                } else {
                    qtd_branco++;
                }
            }
        }
        qtd_cores[0] = qtd_branco;
        qtd_cores[1] = qtd_preto;
        return qtd_cores;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        int cont = 1;
        int[][] tabuleiro = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < tabuleiro[0].length; j++) {
                tabuleiro[i][j] = cont++;
            }
        }
        int[] cores = Main.qtdCores(tabuleiro);
        System.out.printf("%d casas brancas e %d casas pretas%n", cores[0], cores[1]);
        scanner.close();
    }
}
