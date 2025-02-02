package Exercicios.ex044.model;

public class EleitorPendente extends Exception{
    public EleitorPendente(String nome) {
        super("Eleitor " + nome + " com pendência");
    }
}