import java.util.Scanner;

public class Main {

    public static String vencedor(int pontPlay1, int pontPlay2){
        return (pontPlay1 > pontPlay2) ? "JOAO" : "MARIA";
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x, d;
        int N = scanner.nextInt();
        int pontPlay1 = 0, pontPlay2 = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < 6; j++) {
                if(j < 3) {
                    x = scanner.nextInt();
                    d = scanner.nextInt();
                    pontPlay1 += x * d;
                } else {
                    x = scanner.nextInt();
                    d = scanner.nextInt();
                    pontPlay2 += x * d;
                }
            }
            String vencedor = Main.vencedor(pontPlay1, pontPlay2);
            System.out.printf("%s%n", vencedor);
            pontPlay1 = 0; 
            pontPlay2 = 0;
        }
        scanner.close();
    }
}
