package models;

public class Hamburguer extends Lanche {

    public Hamburguer() {
        super("Hambúrguer", 20.0);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando hambúrguer...");
        System.out.println("- Grelhando o pão");
        System.out.println("- Preparando a carne");
        System.out.println("- Adicionando vegetais");
        System.out.println("- Montando o hambúrguer");
    }
}