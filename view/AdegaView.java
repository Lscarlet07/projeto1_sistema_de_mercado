package view;

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
}