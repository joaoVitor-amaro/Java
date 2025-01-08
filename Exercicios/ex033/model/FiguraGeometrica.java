package Exercicios.ex033.model;

public abstract class FiguraGeometrica {
    protected int tipo;
    public FiguraGeometrica(int tipo) {
        this.tipo = tipo;
    }

    public abstract float calcularArea();

    public abstract void  lerAtributos();

    public String getNome() {
        String typeFigure;
        switch (this.tipo) {
            case 1:
                typeFigure = "Quadrado";
                break;
            case 2:
                typeFigure = "Retangulo";
                break;
            case 3:
                typeFigure = "Triangulo";
                break;
            case 4:
                typeFigure = "Circulo";
                break;
            default:
                typeFigure = "Indefinido"; 
                break;
        }
        return typeFigure;
    }

}
