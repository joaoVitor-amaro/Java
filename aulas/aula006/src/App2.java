public class App2 {
    public static void main(String[] args) {
        int count = 0;
        while(count < 10) {
            System.out.println(count);
            if(count == 5) {
                System.out.println("Interrompeu o while no 5 com o break");
                break; //Interrrompe o while e sai da estrutura
            } 
            count++;
        }
    }
}
