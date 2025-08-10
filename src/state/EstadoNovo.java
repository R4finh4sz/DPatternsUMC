package state;

import models.Pedido;

public class EstadoNovo implements EstadoPedido {

    @Override
    public void proximoEstado(Pedido pedido) {
        System.out.println("=== Padrão State em ação ===");
        System.out.println("Pedido saindo do estado 'Novo' para 'Preparando'");
        pedido.setEstado(new EstadoPreparando());
    }

    @Override
    public String getDescricao() {
        return "Novo";
    }
}