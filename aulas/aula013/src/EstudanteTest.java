public class EstudanteTest {
    public static void main(String[] args) throws Exception {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        
        estudante1.idade = 18;
        estudante1.nome = "Joao"; 

        estudante2.idade = 19;
        estudante2.nome = "Vitor";
        
        estudante1.imprimir();
        estudante2.imprimir();
        
        estudante1.newIdade(22);
        estudante2.newIdade(24);
        
        estudante1.imprimir();
        estudante2.imprimir();
    }
}
