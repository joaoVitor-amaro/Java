import java.util.Scanner;
public class App {

    public static double[] getIntervalo(double num) {
        double[][] intervalos = {
            {0, 25}, 
            {25, 50},
            {50, 75},
            {75, 100}
        };
        for(int i = 0; i < intervalos.length; i++) {
            double minimo = intervalos[i][0];
            double maximo = intervalos[i][1];
            if(num >= minimo && num <= maximo) {
                return intervalos[i];
            }
        }
        return null;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        double[] intervalo = App.getIntervalo(num);
        if(intervalo != null) {
            String simbolo = (intervalo[0] >= 25) ? "(" : "[";
            System.out.printf("Intervalo %s%.0f,%.0f]%n", simbolo, intervalo[0], intervalo[1]);
        } else {
            System.out.println("Fora de intervalo");
        }
        scanner.close();
    }
}
