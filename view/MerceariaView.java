package view;

import java.util.List;
import java.util.Scanner;

import model.ProdutoBebida;
import model.ProdutoMercearia;

public class MerceariaView {
    public ProdutoMercearia cadastro_mercearia(Scanner entrada) {
        String nome, data_validade, gramagem, s_alimento;
        long codigo;
        double valor_unitario;
        int corredor;
        System.out.println("Você entrou na área da Mercearia");

        System.out.println("Nome do produto:");
        nome = entrada.nextLine();

        System.out.println("De qual setor da Mercearia esse produto faz parte?");
        s_alimento = entrada.nextLine();

        System.out.println("Peso do produto:");
        gramagem = entrada.nextLine();

        System.out.println("Data de validade:");
        data_validade = entrada.nextLine();

        System.out.println("Valor unitário:");
        valor_unitario = entrada.nextDouble();

        System.out.println("Em qual corredor esse produto está exposto?");
        corredor = entrada.nextInt();

        System.out.println("Código do produto");
        codigo = entrada.nextLong();

        ProdutoMercearia dados_pm = new ProdutoMercearia(nome, codigo, data_validade, valor_unitario, gramagem,
                s_alimento, corredor);

        return dados_pm;
    }

    public void listagem_mercearia(List<ProdutoMercearia> cadastros) {
        String nome, data, gramagem, setor;
        double valor;
        long codigo;
        int corredor;

        System.out.println("Produtos cadastrados:");

        for (ProdutoMercearia item : cadastros) {
            nome = item.getNome_produto();
            data = item.getData_validade();
            gramagem = item.getGramagem();
            setor = item.getSetor_alimento();
            corredor = item.getCorredor_exposto();
            valor = item.getValor_unitario();
            codigo = item.getCodigo_produto();

            System.out.printf(
                    "Item %d\nNome: %s\nPeso: %s\nSetor: %s\nCorredor: %d\nValidade: %s\nValor unitário: %.2f\n",
                    codigo, nome, gramagem, setor, corredor, data, valor);
            System.out.println("\n");
        }
    }

    public int mercearia_adm(Scanner entrada) {
        int op;

        System.out.println("Setor da Mercearia, escolha a opção desejada");
        System.out.println("1- Ver cadastros / 2 - Adicionar produto / 3 - Remover produto");
        op = entrada.nextInt();

        entrada.nextLine();

        return op;
    }

    public ProdutoMercearia remover_cadastro_mercearia(Scanner entrada, List<ProdutoMercearia> cadastros) {
        long codigo;
        System.out.println("Insira o código do produto que gostaria de remover");
        codigo = entrada.nextLong();

        ProdutoMercearia pm = new ProdutoMercearia(null, 0, null, 0, null, null, 0);

        for (ProdutoMercearia item : cadastros) {
            if (codigo == item.getCodigo_produto()) {
                pm = item;
                System.out.println("Produto removido\n");
                break;
            }
        }
        return pm;
    }
}