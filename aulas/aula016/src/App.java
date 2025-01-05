import aulas.aula016.model.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro("BMW", 125);
        Carro c2 = new Carro("Mercedes", 275);
        //Acessa o atributo static sem precisar instanciar a classe
        //Carro.velocidadeLimite = 180;
        //Atributo o valor ao atributo static por meio de um metodo static
        Carro.setVelocidadeLimite(180);
        c1.imprimir();
        c2.imprimir();
    }
}
