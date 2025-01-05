import Exercicios.ex027.model.Invoice;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Invoice[] invoice = new Invoice[2];
        Long id;
        String descricao;
        int qtdCompra;
        float preco;
        for(int i = 0; i < invoice.length; i++) {
            id = scanner.nextLong();
            scanner.nextLine();
            descricao = scanner.nextLine();
            
            qtdCompra = scanner.nextInt();
            preco = scanner.nextFloat();
            scanner.nextLine();
            invoice[i] = new Invoice(id, descricao, qtdCompra, preco);
        }

        for (Invoice inv : invoice) {
            inv.print();
        }
        scanner.close();
    }
}
