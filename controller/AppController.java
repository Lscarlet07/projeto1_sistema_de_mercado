package controller;

import java.util.Scanner;

import model.Adm;
import model.ProdutoAdega;
import model.ProdutoBebida;
import model.ProdutoMercearia;
import model.ProdutoPadaria;
import repositorio.RepositorioAdega;
import repositorio.RepositorioBebida;
import repositorio.RepositorioMercearia;
import repositorio.RepositorioPadaria;
import view.AdegaView;
import view.AdmView;
import view.AppView;
import view.BebidaView;
import view.MerceariaView;
import view.PadariaView;

public class AppController {
    private final Scanner leitor;
    private AppView appview;
    private MerceariaView merceariaview;
    private BebidaView bebidaview;
    private AdegaView adegaview;
    private PadariaView padariaview;
    private AdmView admview;
    private RepositorioMercearia repositoriomercearia;
    private RepositorioBebida repositoriobebida;
    private RepositorioAdega repositorioadega;
    private RepositorioPadaria repositoriopadaria;

    public AppController() {
        leitor = new Scanner(System.in);
        appview = new AppView();
        merceariaview = new MerceariaView();
        bebidaview = new BebidaView();
        adegaview = new AdegaView();
        padariaview = new PadariaView();
        admview = new AdmView();
        repositoriomercearia = new RepositorioMercearia();
        repositoriobebida = new RepositorioBebida();
        repositorioadega = new RepositorioAdega();
        repositoriopadaria = new RepositorioPadaria();
    }

    public void inicializar() {
        int op;

        Adm a1 = new Adm();

        op = appview.menu_inicial(leitor);

        switch (op) {
            case 1:
                ProdutoMercearia pm = merceariaview.cadastro_mercearia(leitor);
                repositoriomercearia.getLista_mercearia().add(pm);
                break;
            case 2:
                ProdutoBebida pb = bebidaview.cadastro_bebida(leitor);
                repositoriobebida.getLista_bebidas().add(pb);
                break;
            case 3:
                ProdutoAdega pa = adegaview.cadastro_adega(leitor);
                repositorioadega.getLista_adega().add(pa);
                break;
            case 4:
                ProdutoPadaria pd = padariaview.cadastro_padaria(leitor);
                repositoriopadaria.getLista_padaria().add(pd);
                break;
            case 5:
                if (admview.autenticar(a1, leitor)) {
                    admview.menu_adm(leitor);
                } else {
                    inicializar();
                }
                break;
            default:
                inicializar();
                break;
        }
    }
}