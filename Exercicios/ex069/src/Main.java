import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha_valida = "2002";
        String senha;
        while(true) {
            senha = scanner.nextLine();
            if(senha.equals(senha_valida)) {
                System.out.printf("Acesso Permitido%n");
                break;
            } 
            System.out.printf("Senha Invalida%n");
        }
        scanner.close();
    }
}
