package aulas.aula020.model;

//A class implementa os metodos da Interface
public class DataBaseLoad implements DataLoad, DataRemove{
    // O metodo da interface e sobrescrito
    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de dados");
    }

    @Override
    public void remove(){
        System.out.println("Removendo dados do Banco de dados");
    }

    @Override 
    public void checkPermission() {
        System.out.println("Permissao aceita pelo banco de dados");
    }

    public static void retriew() {
        System.out.println("OK BD");
    }
}
