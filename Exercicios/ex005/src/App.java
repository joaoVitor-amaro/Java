import java.util.Scanner;

public class App {
    public int maximo(int[] vetor) {
        int maior = 0;
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[3];
        int num = 0;
        for(int i = 0; i < vetor.length; i++) {
            num = teclado.nextInt();
            vetor[i] = num;
        } 
        App app = new App();
        int resul = app.maximo(vetor);
        System.out.println(resul);
        teclado.close();        
    }
}
