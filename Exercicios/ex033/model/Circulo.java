package Exercicios.ex033.model;

import java.util.Scanner;

public final class Circulo extends FiguraGeometrica{
    private static float pi = 3.14f;
    private float raio;

    public Circulo(int tipo) {
        super(tipo);
    }
    
    @Override
    public float calcularArea() {
        return this.raio * this.raio * pi;
    }

    @Override
    public void lerAtributos() {
        Scanner scanner = new Scanner(System.in);
        this.raio = scanner.nextFloat();
    }
}
