package factory;

import models.Lanche;

public abstract class LancheFactory {

    public abstract Lanche criarLanche();

    public Lanche processarPedido() {
        System.out.println("=== Padrão Factory Method em ação ===");
        Lanche lanche = criarLanche();
        System.out.println("Lanche criado: " + lanche.getNome());
        return lanche;
    }
}