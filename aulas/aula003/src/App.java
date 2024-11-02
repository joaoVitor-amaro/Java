import java.util.Scanner;
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        float media;
        int idade;
        int opcao;
        System.out.print("Media: ");
        media = teclado.nextFloat();
        //IF simples
        if(media >= 7) {
            //Entra nesse bloco se a condiciao for verdadeira
            System.out.println("Aprovado");
        } else {
            //Entra nesse bloco se a condiciao anterior for falsa
            System.out.println("Reprovado");
        }
        //Operador ternario
        String resultado = (media >= 7) ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
        System.out.print("Idade: ");
        idade = teclado.nextInt();
        //Condicao composta, possui mais de 2 condicoes
        if(idade >= 18) {
            System.out.println("Voto obrigatorio");
        } else if(idade >= 16 && idade < 18) {
            System.out.println("Voto opcional");
        } else {
            System.out.println("Nao pode votar");
        }

        System.out.println("[1] - login");
        System.out.println("[2] - Cadastrar");
        System.out.print("Opcao: ");
        opcao = teclado.nextInt();
        //Estrutura usado quando tem varias opcoes 
        //para o user
        switch (opcao) {
            case 1:
                System.out.println("Logado");
                break; //Encerra a execucao do case
            case 2:
                System.out.println("Cadastrado");
                break;
        }
        teclado.close();
    }
}
