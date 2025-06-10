package Exercicios.ex075;
import java.util.Scanner;

public class Solution {
    public int divide(int dividend, int divisor) {
        double div = dividend / divisor;
        div = Math.floor(div);
        return (int)div;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend, divisor;
        dividend = scanner.nextInt();
        divisor = scanner.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.divide(dividend, divisor));
        scanner.close();
    }
}
