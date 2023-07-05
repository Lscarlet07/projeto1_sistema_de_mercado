package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.ProdutoMercearia;

public class RepositorioMercearia {
    private final List<ProdutoMercearia> lista_mercearia;

    public RepositorioMercearia() {
        lista_mercearia = new ArrayList<ProdutoMercearia>();

        
    }

    public List<ProdutoMercearia> getLista_mercearia() {
        return lista_mercearia;
    }
}
