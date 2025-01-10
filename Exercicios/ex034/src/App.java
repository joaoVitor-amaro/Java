import Exercicios.ex034.model.*;
public class App {
    public static void main(String[] args) throws Exception {
        //Tecnico
        Tecnico tecnico = new Tecnico("Joao", 1500, 20230047337l, 10);
        tecnico.exibirDados();
        System.out.println("Ganho anual: " + tecnico.ganhoAnual());
        tecnico.addAumento(10);
        System.out.println("novo Ganho anual: " + tecnico.ganhoAnual());
        System.out.println("Novo salario: " + tecnico.getSalario());
        tecnico.exibirDados();
        System.out.println("");

        //Administrativo
        Administrativo administrativo = new Administrativo("Vitor", 2800, 201425255l, "Noite", 200);
        administrativo.exibirDados();
        System.out.println("Ganho Anual: " + administrativo.ganhoAnual());
        administrativo.addAumento(15);
        System.out.println("novo Ganho anual: " + administrativo.ganhoAnual());
        System.out.println("Novo salario: " + administrativo.getSalario());
        administrativo.exibirDados();
    }
}
