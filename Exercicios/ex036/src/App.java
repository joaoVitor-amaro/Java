import java.util.Scanner;
import Exercicios.ex036.model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        long matricula;
        String nome;
        double salario;
        //Funcionario
        matricula = scanner.nextLong();
        scanner.nextLine();
        nome = scanner.nextLine();
        salario = scanner.nextDouble();
        Funcionario funcionario = new Funcionario(matricula, nome, salario);
        System.out.println(funcionario.getMatricula() + " - " + funcionario.getNome() + " - " + 
        funcionario.getSalario());

        //Consultor
        matricula = scanner.nextLong();
        scanner.nextLine();
        nome = scanner.nextLine();
        salario = scanner.nextDouble();
        Consultor consultor = new Consultor(matricula, nome, salario);
        System.out.println(consultor.getMatricula() + " - " + consultor.getNome() + " - " + 
        consultor.getSalario());
        scanner.close();        
    }
}
