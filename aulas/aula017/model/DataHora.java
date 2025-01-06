package aulas.aula017.model;

public class DataHora {
    //Composicao de objeto
    //Classes possui objeto de outras classes
    private Data estadata;
    private Hora estaHora;

    public DataHora(Data d, Hora h) {
        this.estadata = d;
        this.estaHora = h;
    }

    public void imprimirDataHora() {
        //POde acessar o metodo de outras classes existentes
        estadata.imprimirData();
        estaHora.imprimirHora();
    }
}
