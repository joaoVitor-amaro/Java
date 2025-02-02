package Exercicios.ex043.model;

public class FuncionarioNaoExisteException extends RuntimeException{
    public FuncionarioNaoExisteException(String nome) {
        super("FuncionarioNaoExisteException " + nome);
    }
}
