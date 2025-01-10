package Exercicios.ex035.model;

public abstract class Imovel {
    private String estado;
    private String cidade;
    private String rua;
    private double preco;

    public Imovel(String estado, String cidade, String rua, double preco) {
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.preco = preco;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getRua() {
        return this.rua;
    }

    public double getPreco() {
        return this.preco;
    }

    public void exibirDados() {
        System.out.println(this.estado + " " + this.cidade + " " + this.rua + " " + this.preco);
    }

    public abstract void newPreco();
}
