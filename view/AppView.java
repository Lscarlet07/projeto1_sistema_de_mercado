package view;

import java.util.Scanner;

public class AppView {
    public int menu_inicial(Scanner entrada) {
        int op;

        System.out.println("Bem vindo ao sistema de cadastro, selecione o tipo de produto que gostaria de cadastrar");

        System.out.print("1- Produto da Mercearia\n2- Produto da Padaria\n3- Bebidas\n4- Produto da Adega\n");
        System.out.println("////////////////");

        op = entrada.nextInt();

        entrada.nextLine();
        return op;
    }
}