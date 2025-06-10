package Exercicios;
import java.util.Scanner;

public class Main {
    public static int RomanoParaInteiro(String num) {
        String[] romano = {"I", "V", "X", "L", "C", "D", "M"};
        int[] nums = {1, 5, 10, 50, 100, 500, 1000};
        int resultado = 0, anterior = 0, atual = 0;
        for(int i = num.length() - 1; i >= 0; i--) {
            char letra = num.charAt(i);
            for(int j = 0; j < romano.length; j++) {
                if(letra == romano[j].charAt(0)) {
                    atual = nums[j];
                    break;
                }
            }
            if(atual < anterior) {
                resultado -= atual;
            } else {
                resultado += atual;
            }
            anterior = atual;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numRomano;
        numRomano = scanner.nextLine();
        System.out.println(Main.RomanoParaInteiro(numRomano));
        scanner.close();
    }
}
