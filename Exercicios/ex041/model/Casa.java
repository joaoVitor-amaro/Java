package Exercicios.ex041.model;

import java.util.Scanner;

public class Casa extends Imovel{
    private int numPav;
    private int numQuartos;
    private double areaTerreno;
    private double areaConstruida;

    public Casa() {
        super(1);
    }

    @Override
    public void lerAtributos() {
        super.lerAtributos();
        Scanner scanner = new Scanner(System.in);
        this.numPav = scanner.nextInt();
        this.numQuartos = scanner.nextInt();
        this.areaTerreno = scanner.nextDouble();
        this.areaConstruida = scanner.nextDouble();
    }

    @Override
    public void exibirAtributos() {
        super.exibirAtributos();
        System.out.println("Quantidade de pavimentos: " + this.numPav);
        System.out.println("Quantidade de quartos: " + this.numQuartos);
        System.out.println("Area do Terreno: " + this.areaTerreno + "m2");
        System.out.println("Area construida: " + this.areaConstruida + "m2");
    }
}
