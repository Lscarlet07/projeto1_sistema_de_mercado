package view;

import java.util.List;
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

        }

        entrada.nextLine();

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

    public void listagem_bebida(List<ProdutoBebida> cadastros) {
        String nome, data, tipo, ml;
        double valor, teor;
        long codigo;
        boolean alcool;

        System.out.println("Bebidas cadastradas:");

        for (ProdutoBebida item : cadastros) {
            nome = item.getNome_produto();
            data = item.getData_validade();
            tipo = item.getTipo_bebida();
            ml = item.getMl_produto();
            valor = item.getValor_unitario();
            alcool = item.isAlcoolico();
            teor = item.getTeor_alcool();
            codigo = item.getCodigo_produto();

            System.out.printf(
                    "Item %d\nNome: %s\nTipo de bebida: %s\nVolume: %s\nRestrito: %s\nTeor de álcool: %.2f\nValidade: %s\nValor unitário: %.2f\n",
                    codigo, nome, tipo, ml, alcool, teor, data, valor);
            System.out.println("\n");
        }
    }

    public int bebida_adm(Scanner entrada) {
        int op;

        System.out.println("Setor de Bebidas, escolha a opção desejada");
        System.out.println("1- Ver cadastros / 2 - Adicionar produto / 3 - Remover produto");
        op = entrada.nextInt();

        entrada.nextLine();

        return op;
    }

    public ProdutoBebida remover_cadastro_bebida(Scanner entrada, List<ProdutoBebida> cadastros) {
        long codigo;
        System.out.println("Insira o código do produto que gostaria de remover");
        codigo = entrada.nextLong();

        ProdutoBebida ps = new ProdutoBebida(null, 0, null, 0, null, null, false, 0);

        for (ProdutoBebida item : cadastros) {
            if (codigo == item.getCodigo_produto()) {
                ps = item;
                System.out.println("Produto removido\n");
                break;
            }
        }
        return ps;
    }
}