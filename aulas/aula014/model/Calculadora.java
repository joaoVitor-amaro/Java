package aulas.aula014.model;

public class Calculadora {
    //Varargs
    //O parametro recebe varios numeros.
    //O parametro e tratado como array
    public int soma(int... numeros) {
        int sm = 0; 
        for(int numbers : numeros) {
            sm += numbers;
        }
        return sm;
    }
}
