import java.util.Scanner; //Biblioteca para ler dados pelo teclado
public class Main {
    public static void main(String[] args) {
        int idade = 3; // Declara de uma variavel do tipo inteiro
        //O tipo float preciso utilizar o sufixo "f  "
        float nota = 8.5f; //Declaracao de uma variavel do tipo real
        String nome = "Joao";
        System.out.println("Nome: " + nome);
        //Saida de dados com mascara de dados
        //%f mascara real
        System.out.printf("nota: %.2f\n", nota);
        //Cria o objeto para ler dados do teclado
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome: ");
        nome = teclado.nextLine();//Ler dados String
        System.out.print("Nota: ");
        nota = teclado.nextFloat(); //Ler dados Float
        System.out.println("Nome: " + nome);
        System.out.printf("nota: %.2f\n", nota);
        teclado.close();

        //Conversao de Int/float para String
        String valor1 = Integer.toString(idade); // int para string
        String valor2 = Float.toString(nota); // float para string
        System.out.println(valor1);
        System.out.println(valor2);

        //Conversao de string para int/float
        int idade1 = Integer.parseInt(valor1); // String para int
        float nota1 = Float.parseFloat(valor2); // String para float
        System.out.println(idade1);
        System.out.println(nota1);
    }
}