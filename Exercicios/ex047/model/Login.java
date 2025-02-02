package Exercicios.ex047.model;

public class Login {
    private String nome;
    private String senha;

    public Login(String nome, String senha) {
        this.nome = nome;        
        this.senha = senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean fazerLogin(String nome, String senha) throws Exception {
        if(nome.equals(this.nome) && senha.equals(this.senha)) {
            return true;
        } 
        throw new Exception("Usuario incorreto");
    } 
}
