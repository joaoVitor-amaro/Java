package Exercicios.ex032.model;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String rua, int numero, String bairro, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String toString() {
        String endereco = this.rua + ", " + this.numero + ", " + this.bairro + ", " + this.cidade +
        ", " + this.estado + ", " + this.cep + "\n";
        return endereco; 
    }
}
