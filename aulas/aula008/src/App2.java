public class App2 {
    public static void main(String[] args) {
        int[][] dias = new int[3][2];
        //atribui valores por posicao
        dias[0][0] = 0; 
        dias[0][1] = 1;
        dias[1][0] = 2;
        dias[1][1] = 3;
        dias[2][0] = 4;
        dias[2][1] = 5;

        //percorrendo matriZ com linha e colunas de tamanho diferentes
        for(int[] arrBase : dias) {
            for(int dia : arrBase) {
                System.out.println(dia);
            }
        }
    }
}
