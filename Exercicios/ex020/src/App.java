import java.util.Scanner;
public class App {
    public int qtdSearchLetra(String frase, char searchLetra) {
        int qtdLetra = 0;
        for(int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == searchLetra) {
                qtdLetra++;
            }
        }
        return qtdLetra;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String frase;
        char searchLetra = 'a';
        int posSearchLetra;
        int posLastSearchLetra;
        frase = scanner.nextLine().trim().toLowerCase();
        App app = new App();
        int result = app.qtdSearchLetra(frase, searchLetra);
        System.out.printf("A letra A aparece %d vezes\n", result);
        posSearchLetra = frase.indexOf(searchLetra) + 1;
        System.out.println("A primeira letra A aparece na posica " + posSearchLetra);
        posLastSearchLetra = frase.lastIndexOf(searchLetra) + 1;
        System.out.println("A ultima letra A apareceu na posicao " + posLastSearchLetra);
        scanner.close();
    }
}
