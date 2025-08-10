package state;

import models.Pedido;

class EstadoPreparando implements EstadoPedido {

    @Override
    public void proximoEstado(Pedido pedido) {
        System.out.println("=== Padrão State em ação ===");
        System.out.println("Pedido saindo do estado 'Preparando' para 'Pronto'");
        pedido.setEstado(new EstadoPronto());
    }

    @Override
    public String getDescricao() {
        return "Preparando...";
    }
}