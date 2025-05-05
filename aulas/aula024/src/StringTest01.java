public class StringTest01 {
    public static void main(String[] args) throws Exception {
        String nome = "Joao";
        System.out.println(nome.charAt(0)); //Retorna o caractere a partir do indice
        System.out.println(nome.length()); //Retorna o tamanho da string
        System.out.println(nome.replace("o", "a")); //Substitui caractere
        System.out.println(nome.substring(0, 2)); //Percorre os caracteres ate um determinado indice
        String nome2 = "  Santos";
        System.out.println(nome2);
        System.out.println(nome2.trim()); //Limpa os espacos em branco
    }
}
