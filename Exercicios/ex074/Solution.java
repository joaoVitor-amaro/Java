package Exercicios.ex074;
import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public String multiply(String num1, String num2) {
        BigInteger str1 =  new BigInteger(num1);
        BigInteger str2 = new BigInteger(num2);
        BigInteger str_multiply = str1.multiply(str2);
        return str_multiply.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1, num2;
        num1 = scanner.nextLine();
        num2 = scanner.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.multiply(num1, num2));
        scanner.close();
    }
}
