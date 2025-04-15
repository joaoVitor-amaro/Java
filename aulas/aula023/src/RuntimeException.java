public class RuntimeException {
    public static void main(String[] args) {
        //E necessario tratar a excecao que o metodo vai lancar
        try{
            divisao(1, 1);
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado");
    }

    //Nao e obrigatorio informar o time de tratamento em metodos que vai lancar
    //uma excecao RunTimeException(uncheked)
    /**
     * @param a
     * @param b - Nao pode ser zero
     * @return
     * @throws IllegalArgumentException - caso b seja zero
     */
    public static double divisao(int a, int b) throws IllegalArgumentException{ 
        if(b == 0) {
            //Lanca uma excecao
            throw new IllegalArgumentException("Argumento invalido, divisao por zero");
        }
        return a/b;
    }
}
