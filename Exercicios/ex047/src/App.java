import Exercicios.ex047.model.Login;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login("Joao", "123");
        boolean resul = false;
        while (!resul) {
            try {
                String nome = scanner.nextLine();
                String senha = scanner.nextLine();
                resul = login.fazerLogin(nome, senha);
                System.out.println("Login com sucesso");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }   
        }
        System.out.println("Saiuu");
        scanner.close();
    }
}
