import java.util.Scanner;
import Exercicios.ex023.model.Data;

public class DataRun {

    public int pessoaMaisVelha(Data[] data) {
        Data primeira = data[0];
        Data segunda = data[1];

        if (primeira.getAno() < segunda.getAno() || 
            (primeira.getAno() == segunda.getAno() && primeira.getMes() < segunda.getMes()) || 
            (primeira.getAno() == segunda.getAno() && primeira.getMes() == segunda.getMes() && primeira.getDia() < segunda.getDia())) {
            return 1; // Primeira pessoa mais velha
        } else if (segunda.getAno() < primeira.getAno() || 
                (segunda.getAno() == primeira.getAno() && segunda.getMes() < primeira.getMes()) || 
                (segunda.getAno() == primeira.getAno() && segunda.getMes() == primeira.getMes() && segunda.getDia() < primeira.getDia())) {
            return -1; // Segunda pessoa mais velha
        } else {
            return 0; // Idades iguais
        }
    } 
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int dia, mes, ano;
        Data[] data = new Data[2];
        for(int i = 0; i < data.length; i++) {
            dia = scanner.nextInt();
            mes = scanner.nextInt();
            ano = scanner.nextInt();
            data[i] = new Data(dia, mes, ano);
        }
        DataRun dataRun = new DataRun();
        int result = dataRun.pessoaMaisVelha(data);
        if(result == 1) {
            System.out.println("Pessoa 1 mais velha");
        } else if(result == -1) {
            System.out.println("Pessoa 2 mais velha");
        } else {
            System.out.println("Pessoas são da mesma idade");
        }

        scanner.close();        
    }
}
