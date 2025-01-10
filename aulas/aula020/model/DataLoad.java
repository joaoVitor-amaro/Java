package aulas.aula020.model;

//Interface
//Defini os metodos que serao implementados na class
public interface DataLoad {
    public static final int MAX_DATA_SIZE = 10;

    //Metodo public e abastract
    void load();

    //Esse comando permite criar metodos na interface, sem a 
    //necessidade de sobrescrever, a sobrescrita e opcional
    default void checkPermission() {
        System.out.println("Checando a permissao");
    }

    static void retriew() {
        System.out.println("OKAYY Inteface");
    }
    
} 
