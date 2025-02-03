import java.util.Scanner;

public class App {

    public static int[] ordernarArray(int[] array) {
        int aux;
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }

    public static int[] arrayDescrescente(int[] array) {
        int aux;
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }

    public static int buscarValor(int[] array, int num, int pos) {
        if(pos >= array.length) {
            return -1;
        }

        if(array[pos] == num) {
            return pos;
        }
        return buscarValor(array, num, pos+1);
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int[] arrayOrdenado = App.ordernarArray(array);
        System.out.println("Array ordenado");
        for(int num : arrayOrdenado) {
            System.out.println(num);
        }
        System.out.println(" ");
        int[] arrayDescrescente = App.arrayDescrescente(array);
        System.out.println("Array decrescente");
        for(int num : arrayDescrescente) {
            System.out.println(num);
        }
        System.out.println("");
        System.out.println("Buscar valor");
        int result = App.buscarValor(array, 3, 0);
        if(result != -1) {
            System.out.println("Numero encontrado");
        } else {
            System.out.println("Numero nao encontrado");
        }
        scanner.close();
    }
}
