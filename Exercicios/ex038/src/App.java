import Exercicios.ex038.model.Conta;
import Exercicios.ex038.model.ContaEspecial;

public class App {
    public static void main(String[] args) throws Exception {
        //Conta
        Conta conta = new Conta("Joao Vitor", 1234l, 2000);
        //Sempre que definir o salario deve chamar o metodo para
        //reajustar o limite
        conta.definirLimite();
        conta.depositar(500);
        conta.sacar(100);
        System.out.println(conta.getNomeCliente() + ", cc: " + conta.getNumConta() + 
        " salario: R$ " + conta.getSalarioMensal());
        System.out.println("saldo total disponível: R$ " + conta.saldoTotalDisponivel());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Limite: R$ " + conta.getLimite());
        conta.sacar(600);
        conta.sacar(200);
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("");


        //Conta Especia
        ContaEspecial contaEspecial = new ContaEspecial("Javanauto", 1235, 5000);
        contaEspecial.depositar(650);
        contaEspecial.sacar(125);
        contaEspecial.definirLimite();
        System.out.println(contaEspecial.getNomeCliente() + ", cc: " + contaEspecial.getNumConta() + 
        " salario: R$ " + contaEspecial.saldoTotalDisponivel());
        System.out.println("Saldo: R$ " + contaEspecial.getSaldo());
        System.out.println("Limite: R$ " + contaEspecial.getLimite());
        contaEspecial.sacar(600);
        contaEspecial.sacar(400);
        System.out.println("Saldo: R$ " + contaEspecial.getSaldo());
    }
}
