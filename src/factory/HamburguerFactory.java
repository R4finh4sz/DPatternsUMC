package factory;

import models.Lanche;
import models.Hamburguer;

public class HamburguerFactory extends LancheFactory {

    @Override
    public Lanche criarLanche() {
        System.out.println("Factory criando hambúrguer...");
        return new Hamburguer();
    }
}