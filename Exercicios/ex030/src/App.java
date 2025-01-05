import java.util.Scanner;

import Exercicios.ex030.model.ControleGastos;
import Exercicios.ex030.model.Despesa;

public class App {

    public Despesa[] getDespesaPorTipo(ControleGastos controleGastos, int N, String tipo) { 
        Despesa[] despesasList = new Despesa[N]; 
        Despesa despesas;
        int cont = 0;
        for(int i = 0; i < N; i++) {
            despesas = controleGastos.getDespesa(i);
            if(tipo.toLowerCase().equals(despesas.getTipoGasto().toLowerCase())) {
                despesasList[cont++] = despesas;
            }
        }
        return despesasList;
        
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ControleGastos controleGastos = new ControleGastos();
        App app = new App();
        String nome, tipoGastos;
        float valor;
        int N;
        N = scanner.nextInt();
        scanner.nextLine(); // Consumir o caractere de nova linha

        for (int i = 0; i < N; i++) {
            nome = scanner.nextLine();
            valor = scanner.nextFloat();
            scanner.nextLine(); // Consumir o caractere de nova linha
            tipoGastos = scanner.nextLine();

            Despesa despesa = new Despesa(nome, valor, tipoGastos);
            controleGastos.setDespesa(despesa, i);
        }
        String tipoDespesaSearch;
        tipoDespesaSearch = scanner.nextLine();
        if(controleGastos.existeDespesaDoTipo(tipoDespesaSearch)) {
            //Existe o tipo de despesa
            Despesa[] depesas = app.getDespesaPorTipo(controleGastos, N, tipoDespesaSearch);
            for(Despesa despesa : depesas) {
                if(despesa != null) {
                    System.out.println(despesa.getNome() + ", R$ " + despesa.getValor());
                }
            }
            System.out.println("Total: " + controleGastos.calculatTotalDeDespesa(tipoDespesaSearch)
            + "/" + controleGastos.calculaTotalDeDespesa());
        }else {
            System.out.println("Nenhuma despesa do tipo especifico");
        }
        scanner.close();
    }
}
