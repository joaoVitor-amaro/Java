import java.util.Scanner;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return nums.length;

    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N;
        int target; 
        N = scanner.nextInt();
        int[] nums = new int[N];
        for(int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }
        target = scanner.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(nums, target));
        scanner.close();
    }
}
