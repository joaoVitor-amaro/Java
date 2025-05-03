public class Wrapper01 {
    public static void main(String[] args) throws Exception {
       //Tipo primitivo 
        /*byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1l;
        float floatP = 1;
        double doubleP = 1;
        char charP = 'S';
        boolean booleanP = true;*/

        //Classes wrappers
        /*Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 1l;
        Float floatW = 1F;
        Double doubleW = 1D;
        Character charW = 'S';
        Boolean booleanW = true;

        //Unboxing
        //Converte wrapper para o tipo primitivo
        int i = intW;*/

        //Conversao de string para int
        int num = Integer.parseInt("123");
        num = num+1;
        System.out.println(num);
        //Verifica se o caractere e mum numero
        System.out.println(Character.isDigit('1'));
        //Verifica se o caractere e minutscula
        System.out.println(Character.isLowerCase('a'));
    }
}
