public class App {
    public static void main(String[] args) throws Exception {
        //Cria um objeto de um vetor com tamanho 5
        int[] vetor = new int[5]; 
        //Atribuicao de valores por indice
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;
        //Acessando valor pelo indice
        System.out.println(vetor[2]);
        //Percorrendo o vetor
        for(int numeros : vetor) {
            System.out.println(numeros);
        }
    }
}
