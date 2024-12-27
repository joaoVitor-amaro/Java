package Exercicios.ex023.model;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public void setDia(int dia) {
        if(dia <= 0 || dia > 31) {
            this.dia = 1;
            return;
        }
        this.dia = dia;
    }

    public void setMes(int mes) {
        if(mes <= 0 || mes > 12) {
            this.mes = 1;
            return;
        }
        this.mes = mes;
    }

    public void setAno(int ano) {
        if(ano <= 0) {
            this.ano = 1;
            return;
        }
        this.ano = ano;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

}
