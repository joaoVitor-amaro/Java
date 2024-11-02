public class App {
    public static void main(String[] args) throws Exception {
        int cont = 0;
        //While
        //So entra nesse bloco se a condicao for verdadeira
        //So sai dessa estrutura se a condicao for falsa
        while(cont <= 3) {
            System.out.println(cont);
            cont++;
        } 
        cont = 0;
        //Do while
        //Esse bloco e executado pelo uma vez
        do {
            cont++;
            System.out.println(cont);
        } while(cont <= 3); //Sai se a condicao for verdadeira
    
        //FOR
        //Possui o iniciador do incrimento, a condicao e o incremento
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
