import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        float velocidade_carro = 0;
        System.out.print("Velocidade do carro(km): ");
        velocidade_carro = teclado.nextInt();
        if(velocidade_carro > 80) {
            //Ultrapassou o limite
            float multa = (velocidade_carro - 80)*5;
            System.out.println("Multado!! Exerceu o limite de 80km/h!!");
            System.out.println("Voce deve pagar R$"+multa);
        }
        System.out.println("Tenha um bom dia! Dirija com seguranca");
        teclado.close();        
    }
}
