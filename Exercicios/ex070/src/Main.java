import java.util.Scanner;

public class Main {
    public static String quadrante(double x, double y) {
        String quadrante_cartesiano;
        if(x == 0 && y == 0) {
            quadrante_cartesiano = "Origem";
        } else if( x > 0 && y > 0) {
            quadrante_cartesiano = "Q1";
        } else if(x < 0 && y > 0) {
            quadrante_cartesiano = "Q2";
        } else if(x < 0 && y < 0) {
            quadrante_cartesiano = "Q3";
        } else if ((x > 0 || x < 0) && y == 0){
            quadrante_cartesiano = "Eixo X";
        } else if(x == 0 && (y > 0 || y < 0)) {
            quadrante_cartesiano = "Eixo Y";
        } else {
            quadrante_cartesiano = "Q4";
        }
        return quadrante_cartesiano;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double x, y;
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        String resul = Main.quadrante(x, y);
        System.out.printf("%s%n", resul);
        scanner.close();
    }
}
