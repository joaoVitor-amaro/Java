public class StringBuilderTest {
    public static void main(String[] args) {
        //StringBuilder e imutavel
        StringBuilder nome = new StringBuilder("Joao");
        nome.append(" Vitor"); //Concatena no stringBuilder
        String nome2 = nome.substring(0, 1);
        System.out.println(nome);
        nome.delete(5, 7); //Deleta uma sequencia de caractere
        System.out.println(nome);
        nome.reverse();//Reverte a string
        System.out.println(nome);
        System.out.println(nome2);
    }    
}
