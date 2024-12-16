import java.util.Scanner;
public class App {

    public boolean isEsparsa(int[][] matriz) {
        int matrizLength = 0;
        int qtd_zero = 0;
        for(int[] arrBase : matriz) {
            for(int num : arrBase) {
                matrizLength++; 
                if(num == 0) {
                    qtd_zero++;
                }
            }
        }
        double percentoZeroMatriz = (qtd_zero * 100) / matrizLength;
        boolean resultMatrizEsparca = (percentoZeroMatriz > 70) ? true : false;
        return resultMatrizEsparca;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int linha, coluna;
        //Defini o tam da matriz
        linha = scanner.nextInt();
        coluna = scanner.nextInt();
        int[][] matriz = new int[linha][coluna];
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        App app = new App();
        String stringMatrizEsparca = (app.isEsparsa(matriz)) ? "Matriz esparca" : "Matriz nao esparca";
        System.out.println(stringMatrizEsparca);
        scanner.close();
    }
}
