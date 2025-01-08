package Exercicios.ex031.model;

public class Pagamento {
    private double valorPagamento;
    private String nomeFuncionario;

    public Pagamento() {
        this.valorPagamento = 0;
    }
    //Setters
    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    //getters
    public double getValorPagamento() {
        return this.valorPagamento;
    }

    public String getNomeFuncionario() {
        return this.nomeFuncionario;
    }
}
