import java.util.Scanner;

public class Main {
    public static int tempoDeJogo(int horaInicio, int horaFinal) {
        if(horaInicio == horaFinal) {
            return 24;
        } else if(horaInicio > horaFinal) {
            int qtd_horas = 0;
            for(int i = horaInicio; i < 24; i++) {
                qtd_horas++;
            }
            return qtd_horas + horaFinal;
        } else {
            return horaFinal - horaInicio;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int horaInicio = scanner.nextInt();
        int horaFInal = scanner.nextInt();
        int tempo = Main.tempoDeJogo(horaInicio, horaFInal);
        System.out.printf("O JOGO DUROU %d HORA(S)%n", tempo);
        scanner.close();
    }
}
