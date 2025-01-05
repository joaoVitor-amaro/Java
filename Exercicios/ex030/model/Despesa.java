package Exercicios.ex030.model;

public class Despesa {
    private static final float VALOR_PADRAO = 0;

    private String nome;
    private float valor;
    private String tipoGasto;

    public Despesa() {
        this.valor = VALOR_PADRAO;
    }

    public Despesa(String nome, float valor, String tipoGasto) {
        this.nome = nome;
        setValor(valor);
        this.tipoGasto = tipoGasto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(float valor) {
        if(valor < 0) {
            this.valor = VALOR_PADRAO;
            return;
        }
        this.valor = valor;
    }

    public void setTipoGasto(String tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public String getNome() {
        return this.nome;
    }

    public float getValor() {
        return this.valor;
    }

    public String getTipoGasto() {
        return this.tipoGasto;
    }
}
