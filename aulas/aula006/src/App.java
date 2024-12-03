public class App {
    public static void main(String[] args) throws Exception {
        //Estrutura de repeticao
        int cont = 0;
        //While - Primeiro verifica a condicao
        while(cont <= 4) {//COndicao que retorna boolean
            //Bloco
            System.out.println(cont);
            cont++; //Incrementa a variavel para evitar o loop
        }

        //Do while - Executa pelo menos uma vez a instrucao do bloco
        cont = 0; 
        do {
            System.out.println("Dentro do do-while");
            cont++; //Incrementa a variavel para evitar o loop
        } while(cont < 4);

        //For
        //Inicializador(i = 0); Condicao(i < 5); incremento(i++)      
        for(int i = 0; i < 5; i++) {
            System.out.println("For - " + i);
        }
    }
}
