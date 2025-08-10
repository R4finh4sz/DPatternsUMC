package state;

import models.Pedido;

class EstadoPronto implements EstadoPedido {

    @Override
    public void proximoEstado(Pedido pedido) {
        System.out.println("=== Padrão State em ação ===");
        System.out.println("Pedido já está pronto! Não há próximo estado.");
    }

    @Override
    public String getDescricao() {
        return "Pronto!";
    }
}