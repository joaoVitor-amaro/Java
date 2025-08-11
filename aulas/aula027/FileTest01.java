package aulas.aula027;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        //Caminho que vai armazenar o arquivo
        File file = new File("/home/joao/Documentos/programacao/Java/aulas/aula027/arquivo/BD.txt");
        try{
            Boolean is_file = file.createNewFile(); //Cria o arquivo
            System.out.println("Criado: " + is_file);
            if(file.exists()) { //Verifica se o arquivo existe
                file.delete();
                System.out.println("Arquivo deletado"); //Deleta arquivo
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
