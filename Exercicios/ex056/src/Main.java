public class Main {
    public static void main(String[] args) throws Exception {
        int J = 60;
        int I = 1;
        while(J >= 0) {
            System.out.printf("I=%d J=%d%n", I, J);
            I += 3;
            J -= 5;
        }
    }
}
