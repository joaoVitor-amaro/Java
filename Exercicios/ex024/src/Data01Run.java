import java.util.Scanner;
import Exercicios.ex024.model.Data01;

public class Data01Run {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Data01 data = new Data01();
        data.dia = scanner.nextInt();
        data.mes = scanner.nextInt();
        data.ano = scanner.nextInt();
        System.out.printf("%d/%d/%d", data.dia, data.mes, data.ano);
        System.out.println();
        scanner.close();        
    }
}
