package view;

import java.util.Scanner;

import model.Encarregado;

public class EncarregadoView {
    public boolean autenticar_acesso(Encarregado e1, Scanner entrada, int op) {
        boolean autorizado = false;
        long acesso;

        System.out.println("Insira seu id de encarregado");
        acesso = entrada.nextLong();
        entrada.nextLine();

        if (op == 1 && acesso == e1.getId_adega()) {
            autorizado = true;
        } else if (op == 2 && acesso == e1.getId_bebidas()) {
            autorizado = true;
        } else if (op == 3 && acesso == e1.getId_mercearia()) {
            autorizado = true;
        } else if (op == 4 && acesso == e1.getId_padaria()) {
            autorizado = true;
        } else {
            System.out.println("Não autorizado");
        }

        return autorizado;
    }
}