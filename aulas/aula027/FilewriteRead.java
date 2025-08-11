package aulas.aula027;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilewriteRead {
    public static void main(String[] args) {
        String caminho = "/home/joao/Documentos/programacao/Java/aulas/aula027/arquivo/BD.txt";
        Pessoa p1 = new Pessoa("Joao");
        Pessoa p2 = new Pessoa("Vitor");
        Scanner scanner = new Scanner(System.in);
        try(FileWriter fw = new FileWriter(caminho, true)) {
            fw.write(p1.toString()+"\n"); //Escreve dados no arquivo
            fw.write(p2.toString()+"\n");
            fw.write("Amaro");
            System.out.println("Dados escritos");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileReader fr = new FileReader(caminho);) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
