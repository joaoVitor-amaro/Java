package Exercicios.ex044.model;

public class EleitorMenorIdadeException extends Exception{
    public EleitorMenorIdadeException(String nome) {
        super("Eleitor " + nome + " não pode ser cadastrado");
    }
}
