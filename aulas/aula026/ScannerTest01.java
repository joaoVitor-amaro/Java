package aulas.aula026;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "João, Vitor, Amaro, Melo";
        String[] textos = texto.split(",");
        for(String str : textos) {
            System.out.println(str.trim());
        }
    }
}
