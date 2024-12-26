public class Estudante {
    public String nome;
    public int idade;

    public void imprimir() {
        //this faz referencia ao objeto atual que a classe
        //esta trabalhando
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void newIdade(int idade) {
        //O this tambem e usado para evitar 
        //ambiguidade quando o atributo e parametro possuem 
        //o mesmo nome
        this.idade = idade;
    }
} 