public class App2 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Rayssa";
        nomes[1] = "Joao Vitor";
        nomes[2] = "Pedro";
        //Percorre os valores do array por meio dos indices
        for(int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
