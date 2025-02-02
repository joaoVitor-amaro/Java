import Exercicios.ex043.controller.SistemaGerenciamentoFolha;
import Exercicios.ex043.model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario1 = new Horista("Joao", "2023047337", 30, 50);
        Funcionario funcionario2 = new Comissario("Vitor", "1236", 15000, 0.01);
        Funcionario funcionario3 = new Assalariado("JV", "1234", 2000);
        SistemaGerenciamentoFolha sistemaGerenciamentoFolha = new SistemaGerenciamentoFolha(8000);
        sistemaGerenciamentoFolha.setFuncionario(funcionario1);
        sistemaGerenciamentoFolha.setFuncionario(funcionario2);
        sistemaGerenciamentoFolha.setFuncionario(funcionario3);
        try {
            double salarioFunc = sistemaGerenciamentoFolha.consultarSalarioFuncionario("20230047337");
            System.out.println(salarioFunc);
        } catch(FuncionarioNaoExisteException e) {
            System.out.println(e.getMessage());
        }
        try {
            double salarioFunc = sistemaGerenciamentoFolha.consultarSalarioFuncionario("1236");
            System.out.println(salarioFunc);
        } catch(FuncionarioNaoExisteException e) {
            System.out.println(e.getMessage());
        }

        try {
            double salarioFunc = sistemaGerenciamentoFolha.consultarSalarioFuncionario("1234");
            System.out.println(salarioFunc);
        } catch(FuncionarioNaoExisteException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(sistemaGerenciamentoFolha.calcularValorTotalFolha());
        } catch (OrcamentoEstouradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
