package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.ProdutoAdega;

public class RepositorioAdega {
    private final List<ProdutoAdega> lista_adega;

    public RepositorioAdega() {
        lista_adega = new ArrayList<ProdutoAdega>();
    }

    public List<ProdutoAdega> getLista_adega() {
        return lista_adega;
    }
}
