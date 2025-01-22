package Exercicios.ex038.model;

public interface Iconta {
    double saldoTotalDisponivel();
    void sacar(double valor);
    void depositar(double valor);
}
