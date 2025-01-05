import java.util.Scanner;

import Exercicios.ex028.model.Funcionario;


public class FuncionarioRun {

    public void printDados(Funcionario[] funcionarios) {
        for(int i = 0; i < funcionarios.length; i++) {
            System.out.println(funcionarios[i].getNome() + " " + funcionarios[i].getSobreNome()
            + " - " + funcionarios[i].getSalarioMensal() + " - " + funcionarios[i].getSalarioAnual() 
            + " - " + funcionarios[i].aumentoSalarial(10f));
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nome, sobrenome;
        float salarioMensal;
        int N; 
        N = scanner.nextInt();
        Funcionario[] funcionarios = new Funcionario[N];
        scanner.nextLine();
        for(int i = 0; i < funcionarios.length; i++) {
            nome = scanner.nextLine();
            sobrenome = scanner.nextLine();
            salarioMensal = scanner.nextFloat();
            scanner.nextLine();
            funcionarios[i] = new Funcionario(nome, sobrenome, salarioMensal);
        }
        FuncionarioRun funcionarioRun = new FuncionarioRun();
        funcionarioRun.printDados(funcionarios);
        scanner.close();
    }
}
