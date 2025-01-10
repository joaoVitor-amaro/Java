package Exercicios.ex035.model;

public class Novo extends Imovel{
    private double adicionalPreco;

    public Novo(String estado, String cidade, String rua, double preco, double adicionalPreco) {
        super(estado, cidade, rua, preco);
        this.adicionalPreco = adicionalPreco;
        newPreco();
    }

    public void setAdicionalPreco(double adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
        newPreco();
    }
    
    public double getAdicionalPreco() {
        return this.adicionalPreco;
    }

    @Override
    public void newPreco() {
        double addAumentoPreco = (super.getPreco() * (this.adicionalPreco + 100)) / 100;
        super.setPreco(addAumentoPreco);
    }
}
