public class App2 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Vitor";
        nomes[1] = "Joao";
        nomes[2] = "Pedro";
        //Percorre os valores do array por meio dos indices
        for(int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
