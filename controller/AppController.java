package controller;

import java.util.Scanner;
import model.ProdutoMercearia;
import repositorio.RepositorioMercearia;
import view.AppView;
import view.BebidaView;
import view.MerceariaView;

public class AppController {
    private final Scanner leitor;
    private AppView appview;
    private MerceariaView merceariaview;
    private BebidaView bebidaview;
    private RepositorioMercearia repositoriomercearia;

    public AppController() {
        leitor = new Scanner(System.in);
        appview = new AppView();
        merceariaview = new MerceariaView();
        bebidaview = new BebidaView();
        repositoriomercearia = new RepositorioMercearia();
    }

    public void inicializar() {
        int op;

        op = appview.menu_inicial(leitor);

        switch (op) {
            case 1:
                ProdutoMercearia pm = merceariaview.cadastro_mercearia(leitor);
                repositoriomercearia.getLista_mercearia().add(pm);
                break;
            case 2:
                bebidaview.cadastro_bebida(leitor);
                break;
            
        }
    }
}