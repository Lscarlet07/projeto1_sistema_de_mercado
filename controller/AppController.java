package controller;

import java.util.Scanner;

import view.AppView;
import view.MerceariaView;

public class AppController {
    private final Scanner leitor;
    private AppView appview;
    private MerceariaView merceariaview;

    public AppController() {
        leitor = new Scanner(System.in);
        appview = new AppView();
        merceariaview = new MerceariaView();
    }

    public void inicializar() {
        int op;

        op = appview.menu_inicial(leitor);

        switch (op) {
            case 1:
                merceariaview.cadastro_mercearia(leitor);
                break;
            default:
                inicializar();
                break;
        }
    }
}