import java.util.Scanner;

public class Main {
    public static double calcularMedia(double[] notas) {
        double soma_notas = 0;
        for(int i = 0; i < notas.length; i++) {
            soma_notas += notas[i];
        }
        return soma_notas / notas.length;
    }

    public static double calcularMediaFinal(double media, double nota_exame) {
        return (media + nota_exame) / 2;
    }

    public static String situacao(double mediaFinal) {
        return (mediaFinal < 5) ? "Aluno reprovado" : "Aluno aprovado";
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        for(int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextDouble();
        }
        double media = Main.calcularMedia(notas);
        if(media >= 7) {
            System.out.printf("Media: %.1f%n", media);
            System.out.printf("Aluno aprovado.%n");
        } else if(media > 5 && media < 6.9) {
            System.out.printf("Media: %.1f%n", media);
            System.out.printf("Aluno em exame.%n");
            double nota_exame = scanner.nextDouble();
            double mediaFinal = Main.calcularMediaFinal(media, nota_exame);
            System.out.printf("%s.%n", Main.situacao(mediaFinal));
            System.out.printf("Media: %.1f%n", mediaFinal);
        } else {
            System.out.printf("Media: %.1f%n", media);
            System.out.printf("Aluno reprovado.%n");
        }
        scanner.close();
    }
}
