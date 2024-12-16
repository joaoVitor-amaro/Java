public class App {
    public static void main(String[] args) throws Exception {
        // 1 2 3 4 5 - Meses
        // 31 29 31 30 31 - Dias
        int[][] dias = new int[2][2];
        //atribui valores por posicao
        dias[0][0] = 26;
        dias[0][1] = 25;
        dias[1][0] = 24;
        dias[1][1] = 23;
        //Pega o endereco de memoria
        System.out.println(dias[0]);
        //pega o valor por posicao
        System.out.println(dias[0][0]);
        //percorrendo a matriz com linha e columa no mesmo tamanho
        for(int i = 0; i < dias.length; i++) {
            for(int j = 0; j < dias.length; j++) {
                System.out.println(dias[i][j]);
            }
        }
    }
}
