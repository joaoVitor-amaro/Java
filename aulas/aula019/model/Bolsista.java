package aulas.aula019.model;

public final class Bolsista extends Aluno{
    private double bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando a bolsa de " + this.nome);
    }

    public void pagarMensalidadeBolsita() {
        System.out.println(this.nome + " e bolsista, pagamento efetuado");
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return this.bolsa;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.bolsa; 
    }
}
