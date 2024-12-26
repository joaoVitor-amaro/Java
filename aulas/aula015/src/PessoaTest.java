import aulas.aula015.model.Pessoa;

public class PessoaTest {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("jv");
        pessoa.setIdade(-1);
        pessoa.imprimir();

        System.out.println();
        System.out.println("Ola " + pessoa.getNome() + " sua idade e " + pessoa.getIdade());
        System.out.println();
        //Chamada do construtor 
        Pessoa pessoa2 = new Pessoa("Jiraya", 18); //inicializa o objeto com valores
        pessoa2.imprimir();

        System.out.println();
        Pessoa pessoa3 = new Pessoa("Harry Potter", 19, 'M');
        pessoa3.imprimir();

        for(int medias : pessoa3.getMedia()) {
            System.out.print(medias + " ");
        }
        System.out.println();
    }

}
