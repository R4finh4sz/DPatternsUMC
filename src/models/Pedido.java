package models;

import state.EstadoPedido;
import state.EstadoNovo;
import strategy.DescontoStrategy;

public class Pedido {
    private static int contadorId = 1;
    private int id;
    private Lanche lanche;
    private EstadoPedido estado;
    private DescontoStrategy descontoStrategy;
    private double precoFinal;

    public Pedido(Lanche lanche) {
        this.id = contadorId++;
        this.lanche = lanche;
        this.estado = new EstadoNovo();
        this.precoFinal = lanche.getPreco();
    }

    public int getId() {
        return id;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
        this.precoFinal = descontoStrategy.aplicarDesconto(lanche.getPreco());
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void proximoEstado() {
        estado.proximoEstado(this);
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void mostrarStatus() {
        System.out.println("Pedido #" + id + " - " + lanche.getNome());
        System.out.println("Estado: " + estado.getDescricao());
        System.out.println("Preço final: R$" + precoFinal);
    }
}