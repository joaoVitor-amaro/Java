package test;

import model.Estudante;; //Importa a classe Estudante

public class EstudanteTest {
    public static void main(String[] args) {
        //Criado um objeto da classe Estudante
        //A variavel "estudante" e um referencia da classe Estudante
        Estudante estudante = new Estudante();

        //Atribuindo os valores aos atributos
        estudante.nome = "Joao";
        estudante.idade = 19;
        estudante.sexo = 'M';
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
        
    }
}
