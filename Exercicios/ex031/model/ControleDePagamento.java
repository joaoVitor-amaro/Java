package Exercicios.ex031.model;
import java.util.ArrayList;

public class ControleDePagamento {
    private Pagamento[] pagamentos;

    public ControleDePagamento() {
       pagamentos = new Pagamento[100];
    }

    public void setPagamento(Pagamento p, int index) {
        pagamentos[index] = p;
    }

    public Pagamento getPagamento(int pos) {
        return this.pagamentos[pos];
    }

    public double calcularTotalDePagamento() {
        double totalPagamento = 0;
        for(int i = 0; i < this.pagamentos.length; i++) {
            if(this.pagamentos[i] != null) {
                totalPagamento += this.pagamentos[i].getValorPagamento();
            }
        }
        return totalPagamento;
    }

    public ArrayList<Integer> getIndexFuncionarios(String nomeFuncionario) {
        ArrayList<Integer> indexFuncionarios = new ArrayList<>();
        for (int i = 0; i < this.pagamentos.length; i++) {
            if (this.pagamentos[i] != null && this.pagamentos[i].getNomeFuncionario().toLowerCase().contains(nomeFuncionario.toLowerCase())) {
                indexFuncionarios.add(i);
            }
        }
        if (indexFuncionarios.isEmpty()) {
            indexFuncionarios.add(-1);
        }
        return indexFuncionarios;
    }
}