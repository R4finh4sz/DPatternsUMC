package models;

public class LancheLegado {
    private String tipoLanche;
    private double valorLanche;

    public LancheLegado() {
        this.tipoLanche = "Lanche Antigo";
        this.valorLanche = 15.0;
    }

    public String getTipoLanche() {
        return tipoLanche;
    }

    public double getValorLanche() {
        return valorLanche;
    }

    public void fazerLanche() {
        System.out.println("Fazendo lanche antigo...");
        System.out.println("- Usando receita tradicional");
        System.out.println("- Preparação manual");
        System.out.println("- Lanche tradicional pronto");
    }
}