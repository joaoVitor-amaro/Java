package Exercicios.ex026.model;

public class Data {
    //Variaveis padrao que nao muda o valor
    private static int DIA_PADRAO = 1;
    private static int MES_PADRAO = 1;
    private static int ANO_PADRAO = 1;

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        setMes(mes);
        setDia(dia);
        setAno(ano);
    }

    public void setDia(int dia) {
        if(dia < 1 || dia > getDaysMonth(this.mes)) {
            System.out.println("Atributo Dia invalido");
            this.dia = DIA_PADRAO;
            return;
        }
        this.dia = dia;
    }

    public void setMes(int mes) {
        if(mes < 1 || mes > 12) {
            System.out.println("Atributo MES invalido");
            this.mes = MES_PADRAO;
        }
        this.mes = mes;
    }

    public void setAno(int ano) {
        if(ano < 1) {
            System.out.println("Atributo ANO invalido");
            this.ano = ANO_PADRAO;
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

    public int getDaysMonth(int mes) {
        int[] daysMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysMonth[mes-1];
    }

    public void avancarDia() {
        if(this.dia == getDaysMonth(this.mes)) {
            this.dia = DIA_PADRAO; //Primeiro dia do mes
            if(this.mes == 12) {
                this.mes = MES_PADRAO; //Primeiro mes do ano
                this.ano++;
            } else {
                this.mes++;
            }
        } else {
            this.dia++;
        }
    }

    public void avancarDias(Long qtdDia) {
        if(qtdDia < 0) {
            System.out.println("Avanco de dia invalido");
            return;
        } 
        while(qtdDia > 0) {
            int diaRestanteMes = getDaysMonth(this.mes) - this.dia;
            if(qtdDia > diaRestanteMes) {
                qtdDia -= (diaRestanteMes + 1);
                this.dia = DIA_PADRAO; //Avanca para o proximo mes
                if(this.mes == 12) {
                    this.mes = MES_PADRAO; //Avanca para o proximo ano
                    this.ano++;
                } else {
                    this.mes++;
                }
            } else {
                this.dia += qtdDia;
                qtdDia = 0l;
            }
        }
    }
}
 
