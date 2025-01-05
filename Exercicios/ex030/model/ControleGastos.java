package Exercicios.ex030.model;

public class ControleGastos {
    private Despesa[] despesas;

    public ControleGastos() {
        despesas = new Despesa[100];
    }

    public void setDespesa(Despesa d, int pos) {
        this.despesas[pos] = d;
    }

    public Despesa getDespesa(int pos) {
        return this.despesas[pos];
    }

    public float calculaTotalDeDespesa() {
        float valorTotalDespesa = 0;
        for(int i = 0; i < this.despesas.length; i++) {
            if(this.despesas[i] != null) {
                valorTotalDespesa += this.despesas[i].getValor();
            }
        }
        return valorTotalDespesa;
    }

    public float calculatTotalDeDespesa(String tipo) {
        float valorTotalTipoDespesa = 0; // Valor padrao se nao encontrar o tipo de despesa
        for(int i = 0; i < this.despesas.length; i++) {
            if(this.despesas[i] != null && tipo.equals(this.despesas[i].getTipoGasto())) {
                valorTotalTipoDespesa += this.despesas[i].getValor();
            }
        }
         return valorTotalTipoDespesa;
    }

    public boolean existeDespesaDoTipo(String tipo) {
        for(int i = 0; i < this.despesas.length; i++) {
            if(this.despesas[i] != null && tipo.toLowerCase().equals(this.despesas[i].getTipoGasto().toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}