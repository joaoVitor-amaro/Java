package Exercicios.ex033.model;

import java.util.Scanner;

public final class Retangulo extends FiguraGeometrica{
    public float lado;
    public float altura;

    public Retangulo(int tipo) {
        super(tipo);
    }

    @Override
    public float calcularArea() {
        return this.lado*this.altura;
    }

    @Override
    public void lerAtributos() {
        Scanner scanner = new Scanner(System.in);
        this.lado = scanner.nextFloat();
        this.altura = scanner.nextFloat();
    }
}
