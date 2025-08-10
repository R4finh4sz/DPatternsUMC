package strategy;

public class SemDesconto implements DescontoStrategy {

    @Override
    public double aplicarDesconto(double preco) {
        System.out.println("=== Padrão Strategy em ação ===");
        System.out.println("Nenhum desconto aplicado");
        return preco;
    }

    @Override
    public String getDescricao() {
        return "Sem desconto";
    }
}