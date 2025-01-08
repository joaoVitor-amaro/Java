import aulas.aula018.model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        //Aluno
        p2.setNome("joao");
        p2.setIdade(19);
        p2.setSexo('M');
        p2.setMatricula(2023);
        p2.setCurso("Computacao");
        p2.print();

        //Funcionario
        Funcoionario p3 = new Funcoionario("JV", 19, 'M', "Back-End", true);
        p3.print();
    }
}
