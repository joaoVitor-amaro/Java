package test;

import model.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.soma(); //Chama o metodo
        //O valor retornando no metodo e armazenado na variavel "result"
        int result = calculadora.subtracao(10, 5);
        System.out.println(result);
    }
}
