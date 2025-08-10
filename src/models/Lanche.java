package models;

public abstract class Lanche {
    protected String nome;
    protected double preco;

    public Lanche(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void preparar();

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}