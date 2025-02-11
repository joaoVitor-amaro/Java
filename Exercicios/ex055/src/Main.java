import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static double valorLanche(int item, int qtd_item) {
        HashMap<Integer, Double> laches = new HashMap<>();
        laches.put(1, 4.00);
        laches.put(2, 4.50);
        laches.put(3, 5.00);
        laches.put(4, 2.00);
        laches.put(5, 1.50);
        return laches.get(item) * qtd_item;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int item = scanner.nextInt();
        int qtd = scanner.nextInt();
        double valorLanche = Main.valorLanche(item, qtd);
        System.out.printf("Total: R$ %.2f%n", valorLanche);
        scanner.close();
    }
}
