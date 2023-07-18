package view;

import java.util.Scanner;

import model.Adm;

public class AdmView {
    public boolean autenticar(Adm adminstrador, Scanner entrada) {
        boolean autorizado = false;

        System.out.println("Solicitando acesso de administrador, digite sua credenial");
        String user = entrada.nextLine();

        if (user.equals(adminstrador.getCredencial())) {
            System.out.println("Credencial encontrada, digite sua senha");
            long key = entrada.nextLong();
            if (key == adminstrador.getSenha()) {
                System.out.println("Acesso autorizado\n");
                autorizado = true;
            } else {
                System.out.println("Acesso negado, senha incorreta\n");
            }
        } else {
            System.out.println("Acesso negado, credencial inválida\n");
        }

        return autorizado;
    }

    public int menu_adm(Scanner entrada) {
        System.out.println("Selecione a opção desejada");
        System.out.print(
                "1- Setor da Adega\n2- Setor de Bebidas\n3- Setor da Mercearia\n4- Setor da Padaria\n5- Alterar senha\n");

        int op = entrada.nextInt();

        return op;
    }

    public void alterar_senha(Adm administrador, Scanner entrada) {
        System.out.println("Digite a sua nova senha");
        long key1 = entrada.nextLong();

        System.out.println("Confirme sua nova senha");
        long key2 = entrada.nextLong();

        if (key1 == key2) {
            administrador.setSenha(key1);
            System.out.println("Senha alterada");
        } else {
            System.out.println("Senhas divergentes, tente novamente");
            alterar_senha(administrador, entrada);
        }
    }
}