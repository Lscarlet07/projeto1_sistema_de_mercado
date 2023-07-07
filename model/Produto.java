package model;

public class Produto {
    private String nome_produto;
    private long codigo_produto;
    private String data_validade;
    private double valor_unitario;

    public Produto() {

    }

    public Produto(String nome_produto, long codigo_produto, String data_validade, double valor_unitario) {
        this.nome_produto = nome_produto;
        this.codigo_produto = codigo_produto;
        this.data_validade = data_validade;
        this.valor_unitario = valor_unitario;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public long getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(long codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public String getData_validade() {
        return data_validade;
    }

    public void setData_validade(String data_validade) {
        this.data_validade = data_validade;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    @Override
    public String toString() {
        return "Item " + codigo_produto + "\nNome: " + nome_produto + "\nPreço: " + valor_unitario + "\nValidade: "
                + data_validade + "\n";
    }
}