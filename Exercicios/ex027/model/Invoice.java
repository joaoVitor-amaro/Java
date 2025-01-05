package Exercicios.ex027.model;

public class Invoice {
    private Long id;
    private String descricao;
    private int qtdCompra;
    private float preco;

    public Invoice(Long id, String descricao, int qtdCompra, float preco) {
        this.id = id;
        this.descricao = descricao;
        setQtdCompra(qtdCompra);
        setPreco(preco);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setQtdCompra(int qtdCompra) {
        if(qtdCompra < 0) {
            this.qtdCompra = 0;
            return;
        }
        this.qtdCompra = qtdCompra;
    }

    public void setPreco(float preco) {
        if(preco < 0) {
            this.preco = 0;
            return;
        }
        this.preco = preco;
    }

    public Long getId() {
        return this.id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getQtdCompra() {
        return this.qtdCompra;
    }

    public float getPreco() {
        return this.preco;
    }

    public float getTotal() {
        return this.preco*this.qtdCompra;
    }


    public void print() {
        System.out.printf("%d - %s - %d - %.2f - %.2f%n", id, descricao, qtdCompra, preco, getTotal());
    }

}
