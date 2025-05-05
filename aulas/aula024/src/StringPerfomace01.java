public class StringPerfomace01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concat(1000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao " + (fim - inicio) + " ms");
    }
    public static void concat(int tamanho) {
        String texto = "";
        for(int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }
}
