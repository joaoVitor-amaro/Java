package Exercicios.ex073;
import java.util.Scanner;

public class Solution {
    public int reverse(int x) {
        String num = String.valueOf(x);
        StringBuilder sb = new StringBuilder(num);
        int numReverso;
        if(x < 0) {
            sb.deleteCharAt(0);
            sb.reverse();
            sb.insert(0, "-");
        } else {
            sb.reverse();
        }
        numReverso = Integer.parseInt(sb.toString());
        return numReverso;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        int x;
        x = scanner.nextInt();
        System.out.println(solution.reverse(x));
        scanner.close();
    }
}
