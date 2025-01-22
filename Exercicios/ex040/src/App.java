import Exercicios.ex040.model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Pedro Melo", "(83) 97777-8888", "000.000.002-00");
        pessoa.exibir();
        System.out.println(" ");

        Aluno aluno = new Aluno("Joao Vitor", "(83) 95555-8888", "000.000.003-00", 7.7, 3);
        aluno.exibir();

        Professor professor = new Professor("Larissa de Melo", "(83) 98888-8888", "000.000.001-00", 1, "Matematica");
        professor.exibir();
    }
}
