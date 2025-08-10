package adapter;

import models.Lanche;
import models.LancheLegado;

public class LancheAdapter extends Lanche {
    private LancheLegado lancheLegado;

    public LancheAdapter(LancheLegado lancheLegado) {
        super(lancheLegado.getTipoLanche(), lancheLegado.getValorLanche());
        this.lancheLegado = lancheLegado;
        System.out.println("=== Padrão Adapter em ação ===");
        System.out.println("Adaptando lanche legado para interface atual");
    }
    @Override
    public void preparar() {
        System.out.println("Adapter preparando lanche legado...");
        lancheLegado.fazerLanche();
    }
}