import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int[] notas = new int[10];
        int soma_notas = 0;
        float media;
        for(int i = 0; i < notas.length; i++) {
            notas[i] = teclado.nextInt();
            soma_notas += notas[i];
        }
        media = soma_notas/notas.length;
        System.out.println("Media: " + media);
        System.out.print("Maiores que a media: ");
        for(int i = 0; i < notas.length; i++) {
            if(notas[i] > media) {
                System.out.print(notas[i] + " ");
            }
        }
        teclado.close();
    }
}
