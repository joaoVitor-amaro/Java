public class App2 {
    public static void main(String[] args) {
        //if Composto
        //Estrutura que possui mais de 1 condicao
        //Ex
        //Idade < 15 - Categoria Infantil
        //Idade >= 15 && idade < 18 - Categoria Juvenil
        //idade >= 18 - Categoria Adulto
        int idade = 17;
        String categoria;
        if(idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) { //Oposto do if, mas a condicao sendo verdadeira
            categoria = "Categorial Juvenil";
        } else { // Oposto do if e do else if
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    } 
}
