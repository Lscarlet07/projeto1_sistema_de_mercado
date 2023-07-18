package view;

import java.util.List;
import java.util.Scanner;
import model.ProdutoAdega;

public class AdegaView {
    public ProdutoAdega cadastro_adega(Scanner entrada) {
        String nome, data_validade, tipo_bebida, ml_produto, origem;
        long codigo;
        double valor_unitario, teor;
        int ano;

        System.out.println("Você entrou na área da Adega");

        System.out.println("Nome do produto:");
        nome = entrada.nextLine();

        System.out.println("Volume:");
        ml_produto = entrada.nextLine();

        System.out.println("Tipo de bebida:");
        tipo_bebida = entrada.nextLine();

        System.out.println("Teor alcoólico:");
        teor = entrada.nextDouble();

        entrada.nextLine();

        System.out.println("Data de validade:");
        data_validade = entrada.nextLine();

        System.out.println("País de origem:");
        origem = entrada.nextLine();

        System.out.println("Valor unitário:");
        valor_unitario = entrada.nextDouble();
        System.out.println("Safra:");
        ano = entrada.nextInt();

        System.out.println("Código do produto:");
        codigo = entrada.nextLong();

        ProdutoAdega dados_pa = new ProdutoAdega(nome, codigo, data_validade, valor_unitario, tipo_bebida, origem, ano,
                teor, ml_produto);

        System.out.println("Cadastro concluído\n");
        System.out.println(dados_pa);
        return dados_pa;
    }

    public void listagem_adega(List<ProdutoAdega> cadastros) {
        String nome, data, tipo, origem, ml;
        double valor, teor;
        long codigo;
        int safra;

        for (ProdutoAdega item : cadastros) {
            nome = item.getNome_produto();
            data = item.getData_validade();
            tipo = item.getTipo_bebida();
            origem = item.getPais_origem();
            ml = item.getMl_produto();
            valor = item.getValor_unitario();
            teor = item.getTeor_alcool();
            codigo = item.getCodigo_produto();
            safra = item.getAno_safra();

            System.out.printf(
                    "Item %d\nNome: %s\nTipo de bebida: %s\nOrigem: %s\nSafra: %d\nVolume: %s\nTeor de álcool: %.2f\nValidade: %s\nValor unitário: %.2f\n",
                    codigo, nome, tipo, origem, safra, ml, teor, data, valor);
            System.out.println("\n");
        }
    }

    public int adega_adm(Scanner entrada) {
        int op;

        System.out.println("Setor da Adega, escolha a opção desejada");
        System.out.println("1- Ver cadastros / 2 - Adicionar produto / 3 - Remover produto");
        op = entrada.nextInt();

        entrada.nextLine();

        return op;
    }

    public ProdutoAdega remover_cadastro_adega(Scanner entrada, List<ProdutoAdega> cadastros) {
        long codigo;
        System.out.println("Insira o código do produto que gostaria de remover");
        codigo = entrada.nextLong();

        ProdutoAdega ps = new ProdutoAdega(null, codigo, null, codigo, null, null, 0, codigo, null);

        for (ProdutoAdega item : cadastros) {
            if (codigo == item.getCodigo_produto()) {
                ps = item;
                System.out.println("Produto removido\n");
                break;
            }
        }
        return ps;    
    }
}