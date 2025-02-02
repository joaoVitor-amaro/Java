package Exercicios.ex043.model;

public class Comissario extends Funcionario{
   private double vendasMensal;
   private double percentualComissao;
   
   public Comissario(String nome, String matricula, double vendasMensal, double percentualComissao) {
        super(nome, matricula);
        this.vendasMensal = vendasMensal;
        this.percentualComissao = percentualComissao;
   }

   public double calcularSalario() {
        return this.percentualComissao * this.vendasMensal;
   }
}
