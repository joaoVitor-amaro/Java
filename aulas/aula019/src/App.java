import aulas.aula019.model.*;
public class App {
    public static void main(String[] args) throws Exception {
        Visitante visitante = new Visitante();
        visitante.setNome("jOAO");
        visitante.setIdade(19);
        visitante.setSexo('M');
        visitante.fazerAniversario();
        System.out.println(visitante.toString());

        //Aluno 
        Aluno aluno = new Aluno();
        aluno.setNome("Vitor");
        aluno.setIdade(20);
        aluno.setSexo('M');
        aluno.setMatricula(20230047337l);
        aluno.setCurso("Engenharia da Computacao");
        System.out.println(aluno.toString());
        aluno.pagarMensalidade();

        //Bolsista
        Bolsista bolsista = new Bolsista();
        bolsista.setNome("JV");
        bolsista.setIdade(21);
        bolsista.setSexo('M');
        bolsista.setCurso("Computacao");
        bolsista.setMatricula(2021445l);
        bolsista.setBolsa(1500);
        System.out.println(bolsista.toString());
        bolsista.pagarMensalidadeBolsita();

        //Professor
        Professor professor = new Professor();
        professor.setNome("Larissa");
        professor.setIdade(30);
        professor.setSexo('F');
        professor.setEspecialidade("Matematica");
        professor.setSalario(2500);
        System.out.println(professor.toString());

        //Aluno Tecnico
        AlunoTecnico alunoTecnico = new AlunoTecnico();
        alunoTecnico.setNome("Pedro");
        alunoTecnico.setIdade(7);
        alunoTecnico.setSexo('M');
        alunoTecnico.setMatricula(20214525l);
        alunoTecnico.setRegistroProfissional("Informatica");
        System.out.println(alunoTecnico.toString());
        alunoTecnico.pratica();
    }
}
