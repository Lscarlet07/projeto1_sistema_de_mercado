package view;

import java.util.Scanner;

public class AppView {
    public int menu_inicial(Scanner entrada) {
        int op;

        System.out.println("Bem vindo, selecione o setor que gostaria de acessar");

        System.out.print("1- Adega\n2- Bebidas \n3- Mercearia\n4- Padaria\n5- Acesso de Administrador\n");
        System.out.println("////////////////");
        
        op = entrada.nextInt();

        entrada.nextLine();
        return op;
    }
}