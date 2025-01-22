package Exercicios.ex041.model;

import java.util.Scanner;

public class Terreno extends Imovel{
    private double area;

    public Terreno() {
        super(3);
    }

    @Override
    public void lerAtributos() {
        Scanner scanner = new Scanner(System.in);
        super.lerAtributos();
        this.area = scanner.nextDouble();
    }

    @Override
    public void exibirAtributos() {
        super.exibirAtributos();
        System.out.println("Area: " + this.area + "m2");
    }
}
