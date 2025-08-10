package singleton;

import models.Pedido;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorPedidos {
    private static GerenciadorPedidos instancia;
    private List<Pedido> pedidos;

    private GerenciadorPedidos() {
        this.pedidos = new ArrayList<>();
        System.out.println("=== Padrão Singleton em ação ===");
        System.out.println("Gerenciador de pedidos inicializado");
    }

    public static GerenciadorPedidos getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorPedidos();
        }
        return instancia;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido #" + pedido.getId() + " adicionado ao sistema");
    }

    public void finalizarPedido(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getId() + " finalizado no sistema");
        System.out.println("Total de pedidos gerenciados: " + pedidos.size());
    }

    public void listarPedidos() {
        System.out.println("\n=== Pedidos no Sistema ===");
        for (Pedido pedido : pedidos) {
            pedido.mostrarStatus();
            System.out.println("---");
        }
    }

    public int getTotalPedidos() {
        return pedidos.size();
    }
}