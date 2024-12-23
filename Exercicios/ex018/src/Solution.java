import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int qtdLetraNome;
        nome = teclado.nextLine();
        System.out.println("Seu nome em maiusculas: " + nome.toUpperCase());
        System.out.println("Seu nome em minusculas: " + nome.toLowerCase());
        qtdLetraNome = nome.replace(" ", "").length(); //Troca os espacos em Branco e coloca uma string sem espaco
        System.out.printf("Ao todo o seu nome tem %d letras", qtdLetraNome);
        System.out.println(" ");
        String[] arrayNome = nome.split(" ");
        System.out.printf("Seu primeiro nome e %s e ele tem %d letras", arrayNome[0], arrayNome[0].length());
        System.out.println(" ");
        teclado.close();
    }
}
