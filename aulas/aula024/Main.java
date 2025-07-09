package aulas.aula024;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João Vitor", 20);
        Aluno aluno2 = new Aluno("João Vitor", 18);
        //Métodos da class(Object) pai de todas as classes
        System.out.println(aluno.equals(aluno2)); // Compara os objetos
        System.out.println(aluno.getClass());
    }
}
