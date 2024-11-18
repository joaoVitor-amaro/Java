
public class App {
    public static void main(String[] args) throws Exception {
        //Metodo para calcular a raiz quadrada
        //converte em float, pois o calculo retorna em double
        float num = (float)Math.sqrt(25);
        System.out.println(num);     
        //Metodo potencia
        int potencia = (int)Math.pow(2, 3);
        System.out.println(potencia);   
        //Metodo valor absoluto, retornando ele positivo
        int value_abs = (int)Math.abs(-10);
        System.out.println(value_abs);
        //Metodo arredonda para baixo
        int num_baixo = (int)Math.floor(3.9f);
        System.out.println(num_baixo);
        //Arredonda para cima
        int num_cima = (int) Math.ceil(3.2f);
        System.out.println(num_cima);
    }
}
