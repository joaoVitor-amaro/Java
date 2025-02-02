package Exercicios.ex043.model;

public class OrcamentoEstouradoException extends RuntimeException {
    
    public OrcamentoEstouradoException(Double orcamento) {
        super("OrcamentoEstouradoException " + orcamento);
    }

}
