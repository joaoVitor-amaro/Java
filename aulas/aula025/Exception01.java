package aulas.aula025;

public class Exception01 {
    public static void main(String[] args) {
        int[] vetor = new int[4];
        System.out.println("Antes do exception");

        try {
            //Bloco que pode acontecer o erro
            System.out.println(vetor[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //Bloco de tratamento de erro
            System.out.println("Acessou o indice invalido");
        }
        System.out.println("Depois do exceptions");
    }
}
