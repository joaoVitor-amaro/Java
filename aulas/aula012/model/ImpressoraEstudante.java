package aulas.aula012.model;

public class ImpressoraEstudante {
    //Recebe a referência(Endereco de memoria) do objeto Estudante como parâmetro
    public void imprimir(Estudante estudante) {
        //Atualiza o atributo nome, porque eu passei a 
        //referencia do Objeto Estudante
        estudante.nome = "Gohan"; 
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("-----------------");
    }
}
