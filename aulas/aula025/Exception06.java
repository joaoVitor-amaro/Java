package aulas.aula025;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception06 {
    public static void main(String[] args) {
       try {
           double num = lerNumber();
       } catch (InputMismatchException e) {
           System.out.println("Erro");
           e.printStackTrace();
       }
    }

    public static double lerNumber() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        double num;
        num = scan.nextDouble();
        return num;

    }
}
