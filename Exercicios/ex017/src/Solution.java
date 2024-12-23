import java.util.Scanner;
public class Solution {
    public int countSubarrays(int[] nums) {
        int oneTermo = 0;
        int threeTermo = 0;
        int meioTermo = 0;
        int cont = 0;
        for(int i = 0; i < nums.length - 2; i++) {
            //Atribui os valores do primeiro ate o terceiro termo
            oneTermo = nums[i];
            meioTermo = nums[i+1];
            threeTermo = nums[i+2];
            //cont +1 quando a soma do primeiro e terceiro termo e a metade do segundo termo
            if(oneTermo + threeTermo == meioTermo / 2.0) {
                cont += 1;
            }

        }
        return cont;
    }
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int N;
        N = teclado.nextInt();
        int[] nums = new int[N];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = teclado.nextInt();
        }
        Solution solution = new Solution();
        int result = solution.countSubarrays(nums);
        System.out.println(result);
        teclado.close();
    }
}
