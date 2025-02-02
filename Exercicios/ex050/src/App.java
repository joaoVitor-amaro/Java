import java.util.Scanner;
public class App {

    public static int[][] rotacionarMatriz(int[][] matriz) {
        int[][] matrizRotacionada = new int[matriz.length][matriz[0].length];
        int linha = 0;
        int coluna = 0;
        for(int i = matriz.length-1; i >= 0; i--) {
            for(int j = matriz[0].length-1; j >= 0; j--) {
                matrizRotacionada[linha][coluna] = matriz[i][j];
                coluna++;
            }
            coluna = 0;
            linha++;
        }
        return matrizRotacionada;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int tam_matriz;
        tam_matriz = scanner.nextInt();
        int[][] matriz = new int[tam_matriz][tam_matriz];
        
        for(int i = 0; i < tam_matriz; i++) {
            for(int j = 0; j < tam_matriz; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[][] resultMatriz = App.rotacionarMatriz(matriz);
        for(int i = 0; i < tam_matriz; i++) {
            for(int j = 0; j < tam_matriz; j++) {
                System.out.print(resultMatriz[i][j] + " ");
            }
            System.out.println("");
        }
        scanner.close();
    }
}
