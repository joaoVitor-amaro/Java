import java.util.ArrayList;
import java.util.Scanner;

import Exercicios.ex031.model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ControleDePagamento controleDePagamento = new ControleDePagamento();
        Pagamento pagamento = new Pagamento();
        String nomeFuncionario;
        double valorPagamento;
        int N;
        N = scanner.nextInt();
        for(int i = 0; i < N; i++) {
            valorPagamento = scanner.nextDouble();
            scanner.nextLine();
            nomeFuncionario = scanner.nextLine();
            pagamento = new Pagamento();
            pagamento.setValorPagamento(valorPagamento);
            pagamento.setNomeFuncionario(nomeFuncionario);
            controleDePagamento.setPagamento(pagamento, i);
        } 
        String nomeFuncSearch;
        nomeFuncSearch = scanner.nextLine();
        ArrayList<Integer> indexFunc = controleDePagamento.getIndexFuncionarios(nomeFuncSearch);
        for(int i : indexFunc) {
            Pagamento pagamentoFunc = controleDePagamento.getPagamento(i);
            System.out.println(pagamentoFunc.getNomeFuncionario() + ": R$ " + pagamento.getValorPagamento());
        }
        System.out.println("Total: R$ " + controleDePagamento.calcularTotalDePagamento());
        scanner.close();
    }
}
