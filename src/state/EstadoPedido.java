package state;

import models.Pedido;

public interface EstadoPedido {
    void proximoEstado(Pedido pedido);
    String getDescricao();
}