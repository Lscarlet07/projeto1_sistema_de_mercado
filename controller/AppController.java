package controller;

import java.util.Scanner;
import model.ProdutoMercearia;
import repositorio.RepositorioMercearia;
import view.AppView;
import view.MerceariaView;

public class AppController {
    private final Scanner leitor;
    private AppView appview;
    private MerceariaView merceariaview;
    private RepositorioMercearia repositoriomercearia;

    public AppController() {
        leitor = new Scanner(System.in);
        appview = new AppView();
        repositoriomercearia = new RepositorioMercearia();
        merceariaview = new MerceariaView();
    }

    public void inicializar() {
        int op;

        op = appview.menu_inicial(leitor);

        switch (op) {
            case 1:
                ProdutoMercearia pm = merceariaview.cadastro_mercearia(leitor);
                repositoriomercearia.getLista_mercearia().add(pm);
                break;
            default:
                inicializar();
                break;
        }
    }
}