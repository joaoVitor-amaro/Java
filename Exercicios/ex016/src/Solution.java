import java.util.Scanner;
public class Solution {
    public int lengthOfLastWord(String s) {
        String[] arrText = s.trim().split(" ");
        return arrText[arrText.length-1].length();
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        Solution solution = new Solution();
        int resul = solution.lengthOfLastWord(s);
        System.out.println(resul);
        scanner.close();
    }
}
