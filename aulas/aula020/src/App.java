import aulas.aula020.model.*;
public class App {
    public static void main(String[] args) throws Exception {
        DataBaseLoad dataBaseLoad = new DataBaseLoad();
        FilesLoad filesLoad = new FilesLoad();
        dataBaseLoad.load();
        dataBaseLoad.remove();
        dataBaseLoad.checkPermission();
        filesLoad.load();
        filesLoad.remove();
        filesLoad.checkPermission();

        DataBaseLoad.retriew();
        //Acessando metodo static da interface
        DataLoad.retriew();
    }
}
