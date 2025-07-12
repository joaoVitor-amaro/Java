package aulas.aula025;

public class Exception07 {
    public static void main(String[] args) {
        int[] nums = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0, 2, 4};
        for (int i = 0; i < nums.length; i++) {
            try {
                int resultado = divisao(nums[i], denominadores[i]);
                System.out.println("Divisão: " + resultado);
            } catch (ArrayIndexOutOfBoundsException | ClassException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int divisao(int numerador, int denominador) throws ClassException {
        if(denominador == 0) {
            throw new ClassException("Erro divisão por zero");
        }
        return numerador/denominador;
    }
}
