import java.util.Scanner;
import Exercicios.ex025.model.Data;;
public class DataRun {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();
        int dia, mes, ano;
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        ano = scanner.nextInt();
        data.setDia(dia);
        data.setMes(mes);
        data.setAno(ano);
        data.printData();
        scanner.close();
    }
}
