package view;

import java.util.Scanner;

import model.ProdutoBebida;

public class BebidaView {
    public ProdutoBebida cadastro_bebida(Scanner entrada) {
        String nome, data_validade, tipo_bebida, ml_produto;
        long codigo;
        double valor_unitario;
        double teor = 0.0;
        int op_bebida;
        boolean alcool = false;

        System.out.println("Você entrou na área das Bebidas");

        System.out.println("Nome do produto:");
        nome = entrada.nextLine();

        System.out.println("Volume:");
        ml_produto = entrada.nextLine();

        System.out.println("Essa bebida é alcoólica? (1- Sim/2- Não)");
        op_bebida = entrada.nextInt();

        if (op_bebida == 1) {
            alcool = true;
            System.out.println("Teor de álcool:");
            teor = entrada.nextDouble();

            entrada.nextLine();
        }

        System.out.println("Tipo de bebida:");
        tipo_bebida = entrada.nextLine();

        System.out.println("Data de validade:");
        data_validade = entrada.nextLine();

        System.out.println("Valor unitário:");
        valor_unitario = entrada.nextDouble();

        System.out.println("Código do produto:");
        codigo = entrada.nextLong();

        ProdutoBebida dados_pb = new ProdutoBebida(nome, codigo, data_validade, valor_unitario, tipo_bebida,
                ml_produto, alcool, teor);

        System.out.println("Cadastro concluído\n");
        System.out.println(dados_pb);
        return dados_pb;
    }
}