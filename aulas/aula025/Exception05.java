package aulas.aula025;

public class Exception05 {
    public static void main(String[] args) {
        int[] nums = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};
        for (int i = 0; i < nums.length; i++) {
            try {
                System.out.printf("%d / %d = %d\n", nums[i], denominadores[i], nums[i] / denominadores[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Está linha é sempre impressa a cada iteração");
            }
        }
    }
}