import java.util.Scanner;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] twoSome = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i +1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    twoSome[0] = i;
                    twoSome[1] = j;
                }
            }
        }
        return twoSome;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        int[] nums = new int[N];
        int target;
        for(int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }
        target = scanner.nextInt();
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        for(int num : result) {
            System.out.println(num);
        }
        scanner.close();
    }
}
