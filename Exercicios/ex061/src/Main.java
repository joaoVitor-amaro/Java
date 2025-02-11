import java.util.Scanner;
public class Main {

    public static int idadeDoMeio(int[] idade) {
        int maiorIdade = 0, segundaMaiorIdade = 0;
        for(int i = 0; i < idade.length; i++) {
            if(i == 0) {
                maiorIdade = idade[i];
            } else {
                if(idade[i] > maiorIdade) {
                    segundaMaiorIdade = maiorIdade;
                    maiorIdade = idade[i];
                } else if(idade[i] > segundaMaiorIdade && idade[i] != maiorIdade) {
                    segundaMaiorIdade = idade[i];
                }
            }
        }
        return segundaMaiorIdade;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] idade = new int[3];
        String[] sobrinhos = {"huginho", "zezinho", "luisinho"};
        for(int i = 0; i < idade.length; i++) {
            idade[i] = scanner.nextInt();
        }
        int idadeMeio = Main.idadeDoMeio(idade);
        
        int pos = 0;
        for(int i = 0; i < idade.length; i++) {
            if(idade[i] == idadeMeio) {
                pos = i;
                break;
            }
        }
        System.out.printf("%s%n", sobrinhos[pos]);
        scanner.close();
    }
}
