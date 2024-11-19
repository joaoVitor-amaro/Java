public class App {
    //Metodo que retorna vazio
    //a e b sao paramentros
    static void soma(int a, int b) {
        int soma = a + b;
        System.out.println(soma);
    }

    //Funcao que retorna um tipo
    static int soma2(int a, int b) {
        int soma = a + b;
        //Retorna um valor int
        return soma;
    }
    //Um metodo que retorna vazio, pois e o metodo de executar o codigo princial
    public static void main(String[] args) throws Exception {
        System.out.println("Comecou ");
        soma(5, 2);
        int result = soma2(3, 13);
        System.out.println(result);
    }
}
