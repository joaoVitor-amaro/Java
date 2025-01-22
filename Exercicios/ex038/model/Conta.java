package Exercicios.ex038.model;

public class Conta implements Iconta {
    protected String nomeCliente;
    protected long numConta;
    protected double salarioMensal;
    protected double saldo;
    protected double limite;

    public Conta(){}
    
    public Conta(String nomeCliente, long numConta, double salarioMensal) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.salarioMensal = salarioMensal;
        this.saldo = 0;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNumConta(long numConta) {
        this.numConta = numConta;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public void definirLimite() {
        this.limite = 2 * this.salarioMensal;
        if(limite == 0) {
            System.out.println("Sem limite na conta, pois nao possui saldo");
        }
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public long getNumConta() {
        return this.numConta;
    }

    public double getSalarioMensal() {
        return this.salarioMensal;
    }

    public double getLimite() {
        return this.limite;
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public double saldoTotalDisponivel() {
        return this.saldo + this.limite;
    }

    @Override
    public void sacar(double valor) {
        if(valor > this.saldo) {
            System.out.println("Saldo insuficiente para sacar");
            return;
        }
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
}
