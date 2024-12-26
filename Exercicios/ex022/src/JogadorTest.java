import java.util.Scanner;

import Exercicios.ex022.model.Jogador;

public class JogadorTest {
    //Retorna o indice do jogador com a maior media de gols
    public int IndiceMaiorMediaGols(Jogador[] jogador) {
        int pos = 0;
        double mediaJogador = (jogador[0].getGols()*100)/jogador[0].getChuteGol();
        double mediaProxJogador;
        for(int i = 1; i < jogador.length; i++) {
            mediaProxJogador = (jogador[i].getGols()*100)/jogador[i].getChuteGol();
            if(mediaProxJogador > mediaJogador) {
                pos = i;
            }
        }
        return pos;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade, chuteGol, gols;
        int N;
        N = scanner.nextInt();
        Jogador[] jogador = new Jogador[N];
        for(int i = 0; i < jogador.length; i++) {
            scanner.nextLine();
            nome = scanner.nextLine();
            idade = scanner.nextInt();
            chuteGol = scanner.nextInt();
            gols = scanner.nextInt();
            jogador[i] = new Jogador(nome, idade, chuteGol, gols);
        }
        JogadorTest jogadorTest = new JogadorTest();
        int pos = jogadorTest.IndiceMaiorMediaGols(jogador);
        System.out.println(jogador[pos].getNome() + " (" + jogador[pos].getIdade()+")");
        scanner.close();
    }
}
