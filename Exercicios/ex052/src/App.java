import Exercicios.ex052.model.Aluno;
import Exercicios.ex052.service.AlunoController;

public class App {
    public static void main(String[] args) throws Exception {
        AlunoController alunoController = new AlunoController();
        Aluno aluno1 = new Aluno("Joao", 7, 8);
        Aluno aluno2 = new Aluno("Pedro", 5, 4);
        alunoController.addAluno(aluno1);
        alunoController.addAluno(aluno2);
        alunoController.exibirAlunos();
        System.out.println(alunoController.mediaTurma());
        System.out.println(alunoController.qtdAprovados() + "%");
        System.out.println(alunoController.qtdReprovados() + "%");
    }
}
