import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static String getMes(int numberMes) throws IndexOutOfBoundsException {
        if(numberMes <= 0) {
            throw new IndexOutOfBoundsException("Indice invalido");
        }
        String[] meses = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return meses[numberMes-1];
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int NumberMes;
        try {
            NumberMes = scanner.nextInt();
            String mes = Main.getMes(NumberMes);
            System.out.printf("%s%n", mes);
        } catch (InputMismatchException e) {
            System.out.printf("Valor invalido%n");
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("%s%n", e.getMessage());
        }
        scanner.close();
    }
}
