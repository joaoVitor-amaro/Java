package aulas.aula012.test;

import aulas.aula012.model.Estudante;
import aulas.aula012.model.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Joao";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Vitor";
        estudante02.idade = 15;
        estudante02.sexo = 'M';

        //Passagem por referencia para um metodo
        //Passa a referencia(endereco de memoria)
        impressora.imprimir(estudante01);
        impressora.imprimir(estudante02);
    }
}
