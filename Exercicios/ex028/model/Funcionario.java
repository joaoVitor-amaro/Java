package Exercicios.ex028.model;

public class Funcionario {
    //Inicia o salario como zero se o valor foi negativo
    private static float salarioPadrao = 0;

    private String nome;
    private String sobreNome;
    private float salaroMensal;

    public Funcionario(String nome, String sobrenome, float salarioMensal) {
        this.nome = nome;
        this.sobreNome = sobrenome;
        setSalarioMensal(salarioMensal);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public void setSalarioMensal(float salarioMensal) {
        if(salarioMensal < 0) {
            this.salaroMensal = salarioPadrao;
            return;
        }
        this.salaroMensal = salarioMensal;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobreNome() {
        return this.sobreNome;
    }

    public float getSalarioMensal() {
        return this.salaroMensal;
    }

    public float getSalarioAnual() {
        return this.salaroMensal*12;
    }

    public float aumentoSalarial(float percent) {
        return (getSalarioAnual()*(100+percent)) / 100;
    }
}
