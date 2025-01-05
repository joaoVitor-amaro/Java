import java.util.Scanner;
import Exercicios.ex026.model.Data;

public class DataRun {
    public String imprimirData(int dia, int mes, int ano) {
        String diaFormatacao = (dia < 10 ? "0" : "") + dia;
        String mesFormatacao = (mes < 10 ? "0" : "") + mes;
        return diaFormatacao+"/"+mesFormatacao+"/"+ano;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DataRun dataRun = new DataRun();
        int dia, mes, ano;
        Long qtdAvancarDia;
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        ano = scanner.nextInt();
        Data data = new Data(dia, mes, ano);
        qtdAvancarDia = scanner.nextLong();
        data.avancarDias(qtdAvancarDia);
        System.out.println(dataRun.imprimirData(data.getDia(), data.getMes(), data.getAno()));
        scanner.close();
    }
}
