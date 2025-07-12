package aulas.aula025;

public class Exception03{
    public static void main(String[] args) {
        int[] nums = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};
        for(int i = 0; i < nums.length; i++) {
            try {
                System.out.printf("%d / %d = %d\n", nums[i], denominadores[i], nums[i]/denominadores[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { //Trata várias exceção em um único catch
                //Trata uma exception
                System.out.println("Erro");

                //System.exit(0); //Interrompe a execução do programa e o finally não
                // é executado
            } finally {
                System.out.println("Está linha é sempre impressa a cada iteração");
            }
        }
    }
}
