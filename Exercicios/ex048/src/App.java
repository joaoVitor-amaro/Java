import Exercicios.ex048.model.ContaBancaria;
import Exercicios.ex048.model.ContaException;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta = new ContaBancaria(300, 400);
        boolean testSaque = false;
        try {
            testSaque = conta.sacar(400);
            System.out.println(testSaque);
        } catch (ContaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(conta.getSaldo());

        try {
            conta.depositar(500); 
        } catch(ContaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(conta.getSaldo());
    }
}
