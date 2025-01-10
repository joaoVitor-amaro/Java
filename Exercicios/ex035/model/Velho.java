package Exercicios.ex035.model;

public class Velho extends Imovel{
    private double descontoPreco;

    public Velho(String estado, String cidade, String rua, double preco, double descontoPrecoPreco) {
        super(estado, cidade, rua, preco);
        this.descontoPreco = descontoPrecoPreco;
        newPreco();
    }

    public void setDescontoPreco(double descontoPreco) {
        this.descontoPreco = descontoPreco;
        newPreco();
    }
    
    public double getDescontoPreco() {
        return this.descontoPreco;
    }

    @Override
    public void newPreco() {
        double addAumentoPreco = (super.getPreco() *(100-this.descontoPreco)) / 100;
        super.setPreco(addAumentoPreco);
    }
}
