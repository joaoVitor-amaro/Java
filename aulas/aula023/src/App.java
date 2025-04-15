public class App {
    public static void main(String[] args) throws Exception {
        //recusividade();

        //Erro ArrayIndexOutOfBoundsException(Unchecked)
        //Ocorre por acessar um indice invalido
        int[] numbers = {1,2,3};
        System.out.println(numbers[5]);
        
    }

    //Ocorre o erro StackOverflowError
    //Estoura a memoria 
    public static void recusividade() {
        recusividade();
    }
}
