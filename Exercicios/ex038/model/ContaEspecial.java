package Exercicios.ex038.model;

public class ContaEspecial extends Conta{
    
    public ContaEspecial(String nomeCliente, long numConta, double salarioMensal) {
        super(nomeCliente, numConta, salarioMensal);
    }

    @Override
    public void definirLimite() {
        super.limite = 3 * super.salarioMensal;
    }
}
