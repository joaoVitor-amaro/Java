package Exercicios.ex052.model;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double media;
    private String situcao;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        calcularMedia();
    } 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNota1(double nota1) {
        if(nota1 < 0 || nota1 > 10) {
            System.out.println("Nota Invalida");
        }
        this.nota1 = nota1;
    }

    public double getNota1() {
        return this.nota1;
    }

    public void setNota2(double nota2) {
        if(nota2 < 0 || nota2 > 10) {
            System.out.println("Nota Invalida");
        }
        this.nota2 = nota2;
    }

    public double getNota2() {
        return this.nota2;
    }

    public double getMedia() {
        return this.media;
    }

    public String getSituacao() {
        return this.situcao;
    }

    public void calcularMedia() {
        this.media = (this.nota1+this.nota2)/2;
        situcaoAluno();
    }

    private void situcaoAluno() {
        this.situcao = (this.media >= 7) ? "Aprovado" : "Reprovado";
    }

    public String toString() {
        return this.nome + " " + this.nota1 + " " + this.nota2 + " " + this.media + " " 
        + " "  + this.situcao;
    }

}
