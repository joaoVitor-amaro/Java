public class App {
    public static void main(String[] args) throws Exception {
        //Array do tipo char
        char[] texto_c = {'c', 'u', 'r', 's', 'o'};   
        //Classe string que armazena varios caracteres
        String texto_s = "curso";
        int tam = texto_s.length(); //Retorna o tamanho da String
        System.out.println(texto_s);
        char posCaractere = texto_s.charAt(2); //Retorna o caractere a partir do indice
        System.out.println(posCaractere);
        System.out.println(tam);
    }
}
