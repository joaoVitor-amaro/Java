package Exercicios.ex033.model;

import java.util.Scanner;

public final class Triangulo extends FiguraGeometrica{
    private float altura;
    private float lado;

    public Triangulo(int tipo) {
        super(tipo);
    }

    @Override
    public float calcularArea() {
        return (this.lado*this.altura)/2;
    }

    @Override
    public void lerAtributos() {
        Scanner scanner = new Scanner(System.in);
        this.lado = scanner.nextFloat();
        this.altura = scanner.nextFloat();
    }
}
