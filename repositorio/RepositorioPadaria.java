package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.ProdutoPadaria;

public class RepositorioPadaria {
    private final List<ProdutoPadaria> lista_padaria;

    public RepositorioPadaria() {
        lista_padaria = new ArrayList<ProdutoPadaria>();

        
    }

    public List<ProdutoPadaria> getLista_padaria() {
        return lista_padaria;
    }
}
