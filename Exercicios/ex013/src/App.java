import java.util.Scanner;

public class App {
    public int[][] somaMatriz(int[][] matrizA, int[][] matrizB, int m, int n) {
        int[][] smMatriz = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                smMatriz[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return smMatriz;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        int[][] matrizA = new int[m][n];
        int[][] matrizB = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }
        App app = new App();
        int[][] matrizC = app.somaMatriz(matrizA, matrizB, m, n);
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println("");
        }
        scanner.close();
    }
}
