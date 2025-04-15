import java.io.File;
import java.io.IOException;

public class ExceptionTeste{
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("aulas/aula023/arquivo/arquivo.txt");
        //O java forca voce tratar a criacao do arquvo
        try{
            //Bloco que pode ocasionar uma excecao
           boolean is_criado = file.createNewFile();
           System.out.println("Arquivo criado " + is_criado);
        }catch (IOException e){//Captura a excecao
            e.printStackTrace();
        }
    }
}
