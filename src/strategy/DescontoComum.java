package strategy;

public class DescontoComum implements DescontoStrategy {

    @Override
    public double aplicarDesconto(double preco) {
        System.out.println("=== Padrão Strategy em ação ===");
        System.out.println("Aplicando desconto de 10%...");
        double desconto = preco * 0.10;
        double precoFinal = preco - desconto;
        System.out.println("Desconto aplicado: R$" + desconto);
        return precoFinal;
    }

    @Override
    public String getDescricao() {
        return "Desconto de 10%";
    }
}