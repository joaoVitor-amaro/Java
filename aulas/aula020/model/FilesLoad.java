package aulas.aula020.model;

public class FilesLoad implements DataLoad, DataRemove{
    @Override 
    public void load() {
        System.out.println("Carregando dados do banco de dados no arquivo");
    }

    @Override 
    public void remove() {
        System.out.println("Deletando dados do arquivo");
    }
}   
