import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num_acoes, saldo;
        String operacao;
        int type_acoes;
        num_acoes = scanner.nextInt();
        saldo = scanner.nextInt();
        if((num_acoes < 1 || num_acoes > 1000) || (saldo < 0 || saldo > 1000)) {
            scanner.close();
            return;
        }

        int qtd_compra = 0;
        int total_compras = 0;
        for(int i = 0; i < num_acoes; i++) {
            scanner.nextLine();
            operacao = scanner.nextLine();
            type_acoes = scanner.nextInt();
            if(type_acoes < 1 || type_acoes > 100) {
                scanner.close();
                return;
            }

            if(operacao.equals("+")) {
                saldo += type_acoes;
            } else {
                if(saldo >= type_acoes) {
                    saldo -= type_acoes;
                    qtd_compra++;
                    total_compras += type_acoes;
                }
            }
            
        }
        System.out.println(qtd_compra);
        System.out.println(total_compras);
        System.out.println(saldo);
        scanner.close();
    }
}
