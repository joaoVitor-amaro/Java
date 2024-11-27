public class App {
    public static void main(String[] args) throws Exception {
        //Operadores logicos
        //Retornam valores boolean
        int idade = 19;
        float salario = 1500f;
        //&&(and) operador logico que so retorna verdadeiro se
        //todas as condicoes forem verdadeiras
                                /*True*/ /*&&*/   /*True*/ /*= True */
        boolean isDentroDaLei = (idade >= 18) && (salario < 2000);
                               /*False*/ /*&&*/   /*True*/ /*= false */  
        boolean isForaDalei = (idade < 18) && (salario < 2000); 
        System.out.println(isDentroDaLei);
        System.out.println(isForaDalei);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10888;
        float valorPS5 = 5000f;
        // || - OPerador logico OU que retorna true se pelo menos uma condicao for verdadeira
        boolean isCompraPS5 = (valorTotalContaCorrente > valorPS5) || (valorTotalContaPoupanca > valorPS5);
        System.out.println(isCompraPS5);

        // ! - Operador logico NAo que inverte o valor booleano
        System.out.println(!isForaDalei); //Inverte de true para False
        boolean isMaiorIdade = !(19 > 18); //Inverte de false para true
        System.out.println(isMaiorIdade);
    }
}