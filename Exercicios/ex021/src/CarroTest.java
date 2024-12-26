import java.util.Scanner;
import Exercicios.ex021.Model.Carro;

public class CarroTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String modelo, marca;
        int anoFabricacao;
        float preco;
        int N;
        N = scanner.nextInt();
        //Cria um array do Tipo Carro(class)
        Carro[] carro = new Carro[N];
        for(int i = 0; i < carro.length; i++) {
            scanner.nextLine();
            modelo = scanner.nextLine();
            marca = scanner.nextLine();
            anoFabricacao = scanner.nextInt();
            preco = scanner.nextFloat();
            carro[i] = new Carro(modelo, marca, anoFabricacao, preco);
        } 
        //Inicia os valores do primeiro indice
        int veiculo_antigo = carro[0].getAno();
        String modelo_antigo = carro[0].getModelo();
        String marca_antiga = carro[0].getMarca();
        float carroBarato = carro[0].getPreco();
        for(int i = 1; i < carro.length; i++) {
            //Verifica qual e o carro e mais antigo, caso sejam do mesmo ano
            //verifica o mais barato
            if(carro[i].getAno() < veiculo_antigo || (carro[i].getAno() == veiculo_antigo 
                && carro[i].getPreco() < carroBarato)) {
                modelo_antigo = carro[i].getModelo();
                marca_antiga = carro[i].getMarca();
            }
            
        }
        System.out.println(modelo_antigo + " " + marca_antiga);
        scanner.close();        
    }
}

