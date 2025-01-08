package Exercicios.ex033.model;

import java.util.Scanner;

public final class Quadrado extends FiguraGeometrica{
    private float lado;

    public Quadrado(int tipo) {
        super(tipo);
    }

    @Override
    public float calcularArea() {
        return this.lado*this.lado;
    }

    @Override
    public void lerAtributos() {
        Scanner scanner = new Scanner(System.in);
        this.lado = scanner.nextFloat();
        
    }
}
