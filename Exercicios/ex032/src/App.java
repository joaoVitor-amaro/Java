import java.util.Scanner;
import Exercicios.ex032.model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nome, telefone, rua, bairro, cidade, estado, cep;
        int numero;
        int N;
        N = scanner.nextInt();
        Pessoa[] pessoas = new Pessoa[N];
        scanner.nextLine();
        for(int i = 0; i < pessoas.length; i++) {
            nome = scanner.nextLine();
            telefone = scanner.nextLine();
            rua = scanner.nextLine();
            numero = scanner.nextInt();
            scanner.nextLine();
            bairro = scanner.nextLine();
            cidade = scanner.nextLine();
            estado = scanner.nextLine();
            cep = scanner.nextLine();
            Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, cep);
            pessoas[i] = new Pessoa(nome, endereco, telefone);
        }
        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }
        scanner.close();        
    }
}
