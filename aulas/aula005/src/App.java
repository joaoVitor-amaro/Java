public class App {
    public static void main(String[] args) throws Exception {
        int idade = 17;
        boolean isAutorizarCompraBebida = idade >= 18;
        //IF simples
        if(isAutorizarCompraBebida)/* <- Condicao */ {
            System.out.println("A bebida pode ser comprada");
        } else { //Condicao oposta do if
            System.out.println("Nao pode comprar a bebida");
        }
        //Exercuta esse bloco quando o valor da variavel for false, 
        //no qual o valor ser invertido para true por causa do "!"
        if(!isAutorizarCompraBebida) {
            System.out.println("Nao pode comprar a bebida");
        }

        
        
    }
}
