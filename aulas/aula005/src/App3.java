public class App3 {
    public static void main(String[] args) {
        //Doa salario > 5000
        double salario = 3000;
        String mensagemDoar = "Vou doar 500 ao DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condicao, mas vou ter";
        String resultado;
        //Operador ternario
                    //Condicao         true           false
        resultado = (salario > 50) ? mensagemDoar: mensagemNaoDoar;
        System.out.println(resultado);
    }
}
