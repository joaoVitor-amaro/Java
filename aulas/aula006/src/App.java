import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
         // Cria um ArrayList de Strings para armazenar nomes
         ArrayList<String> nomes = new ArrayList<>();

         // Adiciona elementos ao ArrayList
         nomes.add("Ana");
         nomes.add("Carlos");
         nomes.add("Beatriz");
         nomes.add("Fernando");
 
         // Exibindo os elementos da lista
         System.out.println("Lista de nomes: " + nomes);
 
         // Removendo um elemento da lista pelo valor
         nomes.remove("Carlos");
         System.out.println("Lista de nomes após remoção de 'Carlos': " + nomes);
 
         // Removendo um elemento pelo índice
         nomes.remove(0); 
         System.out.println("Lista de nomes após remover o primeiro elemento: " + nomes);
 
         // Acessando um elemento pelo índice
         String nome = nomes.get(1);
         System.out.println("Nome na posição 1: " + nome);
        
         //tamanho da lista
         int tamanho = nomes.size();
         System.out.println("Tamanho atual da lista: " + tamanho);
 
         // Iterando sobre o ArrayList com um loop for-each
         System.out.println("Iterando sobre a lista:");
         for (String n : nomes) {
             System.out.println(n);
         }
         // Adiciona na posição 1
        nomes.add(1, "Fernando");

        System.out.println("Lista de nomes após adicionar 'Fernando' na posição 1: " + nomes); 

        // Adiciona na posição 0
        //E nome ana para para o indice 1
        nomes.add(0, "Julia");

        System.out.println("Lista de nomes após adicionar 'Julia' na posição 0: " + nomes);
    }
}
