package aulas.aula015.model;

public class Pessoa { 
    //Modificador privado dos atributos
    private String nome;
    private int idade;   
    private char sexo;
    private int[] media;
    {   
        System.out.println("Bloco de inicializacao");
        media = new int[10];
        for(int i = 0; i < 10; i++) {
            media[i] = i+1;
        }
    }
    //Construtor que inicia o objeto com argumentos
    //Construtor principal
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    //Construtor padrao que inicia o objeto sem argumentos
    //Construtor secundario
    public Pessoa() {}

    public Pessoa(String nome, int idade, char sexo) {
        this(nome, idade); //Chama o construtor principal
        this.sexo = sexo;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    //Setters - Metodo que atribui valores aos
    //atributos private
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade < 0) {
            System.out.println("Idade invalida");
            return;
        }
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    //Getters - Metodos que retornam os valores 
    //dos atributos private
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public char getSexo() {
        return this.sexo;
    }

    public int[] getMedia() {
        return this.media;
    }
}
