package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.ProdutoBebida;

public class RepositorioBebida {
    private final List<ProdutoBebida> lista_bebidas;

    public RepositorioBebida() {
        lista_bebidas = new ArrayList<ProdutoBebida>();
    }

    public List<ProdutoBebida> getLista_bebidas() {
        return lista_bebidas;
    }
}