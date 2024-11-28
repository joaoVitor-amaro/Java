import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double salarioAnual;
        double primeiraFaixaImposto = 9.78/100;
        double segundaFaixaImposto = 37.35/100;
        double terceiraFaixaImposto = 49.58/100;
        double valorImposto;
        System.out.println("Valor de imposto anula pago na Holanda");
        System.out.print("Salario: ");  
        salarioAnual = teclado.nextDouble();
        if(salarioAnual < 34713) {
            valorImposto = salarioAnual * primeiraFaixaImposto;
        } else if(salarioAnual >= 34713 && salarioAnual < 68588) {
            valorImposto = salarioAnual * segundaFaixaImposto;
        } else {
            valorImposto = salarioAnual * terceiraFaixaImposto;
        }
        System.out.println("valor do imposto: " + valorImposto);
        teclado.close();
    }
}
