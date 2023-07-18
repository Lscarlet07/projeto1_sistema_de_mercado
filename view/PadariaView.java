package view;

import java.util.List;
import java.util.Scanner;
import model.ProdutoPadaria;

public class PadariaView {
    public ProdutoPadaria cadastro_padaria(Scanner entrada) {
        String nome, data_validade, data_embalado, categoria;
        long codigo;
        double valor_unitario, valor_kg;
        int codigo_tabela, peso;

        System.out.println("Você entrou na área da Padaria");

        System.out.println("Nome do produto:");
        nome = entrada.nextLine();

        System.out.println("Setor da Padaria:");
        categoria = entrada.nextLine();

        System.out.println("Código de pesagem:");
        codigo_tabela = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Embalado em:");
        data_embalado = entrada.nextLine();

        System.out.println("Data de validade:");
        data_validade = entrada.nextLine();

        System.out.println("Peso do produto (gramas):");
        peso = entrada.nextInt();

        System.out.println("Valor por KG:");
        valor_kg = entrada.nextDouble();

        System.out.println("Código do produto");
        codigo = entrada.nextLong();

        valor_unitario = (float) (valor_kg / 1000) * peso;

        ProdutoPadaria dados_pd = new ProdutoPadaria(nome, codigo, data_validade, valor_unitario, peso, valor_kg,
                data_embalado, categoria, codigo_tabela);

        System.out.println("Cadastro concluído\n");

        System.out.println(dados_pd);

        return dados_pd;
    }

    public void listagem_padaria(List<ProdutoPadaria> cadastros) {
        String nome, data, data_embalado, categoria;
        double valor, valor_kg;
        long codigo;
        int peso, codigo_pesagem;

        System.out.println("Bebidas cadastradas:");

        for (ProdutoPadaria item : cadastros) {
            nome = item.getNome_produto();
            categoria = item.getCategoria();
            data = item.getData_validade();
            data_embalado = item.getData_embalado();
            peso = item.getPeso_gramas();
            valor_kg = item.getValor_kg();
            valor = item.getValor_unitario();
            codigo_pesagem = item.getCodigo_pesagem();
            codigo = item.getCodigo_produto();

            System.out.printf(
                    "Item %d\nNome: %s\nPeso em gramas: %s\nCategoria: %s\nEmbalado em: %s\nValidade: %s\nValor por kg: %.2f\nValor unitário: %.2f\nCódigo de pesagem: %d\n",
                    codigo, nome, peso, categoria, data_embalado, data, valor_kg, valor, codigo_pesagem);
            System.out.println("\n");
        }
    }
}