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

    public void inicializar_menu() {
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
                    open_adm();
                } else {
                    inicializar_menu();
                }
                break;
            default:
                inicializar_menu();
                break;
        }
    }

    public void open_adm() {
        int op = admview.menu_adm(leitor);

        switch (op) {
            case 1:
                adegaview.listagem_adega(repositorioadega.getLista_adega());
                open_adm();
                break;
            case 2:
                bebidaview.listagem_bebida(repositoriobebida.getLista_bebidas());
                open_adm();
                break;
            case 3:
                merceariaview.listagem_mercearia(repositoriomercearia.getLista_mercearia());
                open_adm();
                break;
            case 4:
                padariaview.listagem_padaria(repositoriopadaria.getLista_padaria());
                open_adm();
                break;
            case 5:
                Adm gestor1 = new Adm();
                admview.alterar_senha(gestor1, leitor);
                inicializar_menu();
                break;
        }
    }

    public void inicializar_repositorio() {
        ProdutoMercearia m1 = new ProdutoMercearia("Doritos Original", 7894512, "20/05/2025", 9.49, "90g",
                "Salgadinhos", 10);
        ProdutoMercearia m2 = new ProdutoMercearia("Cebola em conserva Carrefour", 7893256, "07/2026", 12.50, "180g",
                "Enlatados/Conservas", 7);
        ProdutoMercearia m3 = new ProdutoMercearia("Leite Condensado Nestlé", 7896521, "04/2024", 9.20, "200g",
                "Misturas para bolo/Derivados", 5);

        repositoriomercearia.getLista_mercearia().add(m1);
        repositoriomercearia.getLista_mercearia().add(m2);
        repositoriomercearia.getLista_mercearia().add(m3);

        ProdutoPadaria p1 = new ProdutoPadaria("Pão Francês", 205789, "02/05/2023", 7.25, 500, 14.50, "01/05/2023",
                "Padaria", 2105);
        ProdutoPadaria p2 = new ProdutoPadaria("Sonho de creme", 205752, "03/05/2023", 5.25, 120, 16.50, "01/05/2023",
                "Confeitaria", 2107);
        ProdutoPadaria p3 = new ProdutoPadaria("Peito de frango", 205719, "05/05/2023", 5.25, 50, 40.00, "01/05/2023",
                "Fiamberia", 2125);

        repositoriopadaria.getLista_padaria().add(p1);
        repositoriopadaria.getLista_padaria().add(p2);
        repositoriopadaria.getLista_padaria().add(p3);

        ProdutoBebida b1 = new ProdutoBebida("Pepsi Black", 7894170, "09/2025", 9.50, "Refrigerante", "1000ml", false,
                0);
        ProdutoBebida b2 = new ProdutoBebida("Coca-Cola", 78941200, "05/2025", 11.50, "Refrigerante", "1000ml", false,
                0);
        ProdutoBebida b3 = new ProdutoBebida("Heineken", 7894150, "07/2025", 6.50, "Cerveja", "480ml", true,
                5.0);

        repositoriobebida.getLista_bebidas().add(b1);
        repositoriobebida.getLista_bebidas().add(b2);
        repositoriobebida.getLista_bebidas().add(b3);

        ProdutoAdega a1 = new ProdutoAdega("Vinho Montes Claros", 7896032, "07/2027", 35.50, "Vinho tinto", "Brasil",
                2017, 5.0, "980ml");
        ProdutoAdega a2 = new ProdutoAdega("Salton Moscatel", 7896040, "07/2025", 29.00, "Espumante", "Brasil",
                2020, 4.0, "750ml");
        ProdutoAdega a3 = new ProdutoAdega("Portada", 7896022, "04/2027", 40.50, "Vinho rosé", "Portugal",
                2021, 3.0, "980ml");

        repositorioadega.getLista_adega().add(a1);
        repositorioadega.getLista_adega().add(a2);
        repositorioadega.getLista_adega().add(a3);
    }
}