public class App4 {
    public static void main(String[] args) {
        //Imprime o dia da semana
        byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Domigo");
                break; //Parar a execucao do break
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia invalido");
        }
    }
}
