import java.text.DecimalFormat;
import java.util.Scanner;
public class VolumePiramide {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float altura, lado;
        int tipoBasePiramide;
        tipoBasePiramide = teclado.nextInt();
        double areaHexagono, volume;
        lado = teclado.nextFloat();
        altura = teclado.nextFloat();
        if(tipoBasePiramide == 1) {
            //Volume de base quadrada
            volume = (lado * lado * altura)/ 3;
        } else if(tipoBasePiramide == 2) {
            //Volume de base hexagonal
            areaHexagono = (3 * Math.sqrt(3) / 2) * Math.pow(lado, 2);
            volume = (areaHexagono * altura) / 3;
        } else {
            System.out.println("Opcao Invalida");
            //Encerra o programa e mata a execucao do Scanner
            teclado.close();
            return;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        String numeroFormatado = df.format(volume);
        System.out.println("O volume da piramide eh: " + numeroFormatado);
        teclado.close();
    }
}
