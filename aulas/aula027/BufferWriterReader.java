package aulas.aula027;

import java.io.*;

public class BufferWriterReader {
    public static void main(String[] args) {
        String caminho = "/home/joao/Documentos/programacao/Java/aulas/aula027/arquivo/BD.txt";
        Pessoa p1 = new Pessoa("Joao", 20);
        Pessoa p2 = new Pessoa("Vitor", 20);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
            //Escreve dados no arquivo
            bw.write(p1.toString());
            bw.newLine(); //Pula linha
            bw.write(p2.toString());
        }catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            //Ler dados do arquivo
            String linha;
            //readLine serve para ler as linhas do arquivo
            while((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
