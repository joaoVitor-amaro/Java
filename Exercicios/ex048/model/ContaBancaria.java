package Exercicios.ex048.model;

public class ContaBancaria {
    private double saldo;   
    private double limite;

    public ContaBancaria(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getLimite() {
        return this.limite;
    }

    public double getLimiteSaldo() {
        return this.limite + this.saldo;
    }

    public boolean sacar(double valor) throws ContaException{
        if(valor <= 0 || valor >= 500) {
            throw new ContaException("Saque invalido");
        } else if(this.saldo < valor) {
            throw new ContaException("Saldo insuficiente");
        }
        this.saldo -= valor;
        return true;
    }

    public void depositar(double valor) throws ContaException{
        if(valor <= 0 || valor >= 1000) {
            throw new ContaException("deposito invalido");
        }
        this.saldo += valor;
    }
}
