package Exercicios.ex046.model;

public class Array {
    private int[] array;
    private static int CONTADOR_INDICE = 0;
    public Array(int tam) {
        this.array = new int[tam];
    }

    public void setArray(int valor) {
        if(CONTADOR_INDICE == this.array.length) {
            throw new ArrayIndexOutOfBoundsException("Extrapolou o tamanho do array");
        } 
        array[CONTADOR_INDICE] = valor;
        CONTADOR_INDICE++;
    } 
}
