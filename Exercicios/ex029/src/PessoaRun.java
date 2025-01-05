import java.util.Scanner;

import Exercicios.ex029.model.Pessoa;

public class PessoaRun {
    
    public Pessoa[] procurarPessoa(Pessoa[] pessoas, String nome, int N) {
        Pessoa[] listaPessoas = new Pessoa[N];
        String namePeople;
        int cont = 0;
        nome = nome.toLowerCase();
        for(int i = 0; i < pessoas.length; i++) {
            namePeople = pessoas[i].getNome().toLowerCase();
            if(namePeople.contains(nome)) {
                listaPessoas[cont] = pessoas[i];
                cont++;
            }
        }
        return listaPessoas;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nome, telefone;
        int idade;
        int N;
        Boolean pessoaEncontrada = false;
        N = scanner.nextInt();
        Pessoa[] pessoas = new Pessoa[N];
        scanner.nextLine(); 
        for(int i = 0; i < pessoas.length; i++) {
            nome = scanner.nextLine();
            idade = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha após nextInt()
            telefone = scanner.nextLine();
            pessoas[i] = new Pessoa(nome, idade, telefone);
        }
        String nomeSearch;
        nomeSearch = scanner.nextLine();
        PessoaRun pessoaRun = new PessoaRun();
        Pessoa[] pessoasList = pessoaRun.procurarPessoa(pessoas, nomeSearch, N);
        for (Pessoa pessoa : pessoasList) {
            if(pessoa != null ) {
                System.out.println(pessoa.getNome() + ", " + pessoa.getIdade()
                + ", " + pessoa.getTelefone());
                pessoaEncontrada = true;
            }
        }
        if(!pessoaEncontrada) {
            System.out.println("Pessoa nao encontrada");
        }
        scanner.close();
    }
}
