package Exercicios.ex072;
import java.util.Scanner;
public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println(solution.strStr("leetcode", "leeto"));
        scanner.close();
    }
}
