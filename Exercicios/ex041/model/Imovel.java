package Exercicios.ex041.model;

import java.util.Scanner;

public abstract class Imovel {
    protected int tipo;
    protected double valor;
    protected String Disponibilidade;

    public Imovel(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        String tipoImovel = "";
        switch (this.tipo) {
            case 1:
                tipoImovel = "Casa";
                break;
            case 2:
                tipoImovel = "Apartamento";
                break;
            case 3:
                tipoImovel = "Terreno";
                break;
        }
        return tipoImovel;
    }

    public void lerAtributos() {
        Scanner scanner = new Scanner(System.in);
        this.valor = scanner.nextDouble();
        scanner.nextLine();
        this.Disponibilidade = scanner.nextLine();
    }

    public void exibirAtributos() {
        System.out.println("Imovel: " + getNome());
        System.out.println("Valor: R$" + this.valor);
        System.out.println("Disponibilidade: " + this.Disponibilidade);   
    }
}
