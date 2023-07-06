package model;

public class ProdutoAdega extends Produto {
    private String tipo_bebida;
    private String pais_origem;
    private int ano_safra;
    private double teor_alcool;
    private String ml_produto;

    public ProdutoAdega(String nome_produto, long codigo_produto, String data_validade, double valor_unitario,
            String tipo_bebida, String pais_origem, int ano_safra, double teor_alcool, String ml_produto) {
        super(nome_produto, codigo_produto, data_validade, valor_unitario);
        this.tipo_bebida = tipo_bebida;
        this.pais_origem = pais_origem;
        this.ano_safra = ano_safra;
        this.teor_alcool = teor_alcool;
        this.ml_produto = ml_produto;
    }

    public String getTipo_bebida() {
        return tipo_bebida;
    }

    public void setTipo_bebida(String tipo_bebida) {
        this.tipo_bebida = tipo_bebida;
    }

    public String getPais_origem() {
        return pais_origem;
    }

    public void setPais_origem(String pais_origem) {
        this.pais_origem = pais_origem;
    }

    public int getAno_safra() {
        return ano_safra;
    }

    public void setAno_safra(int ano_safra) {
        this.ano_safra = ano_safra;
    }

    public double getTeor_alcool() {
        return teor_alcool;
    }

    public void setTeor_alcool(double teor_alcool) {
        this.teor_alcool = teor_alcool;
    }

    public String getMl_produto() {
        return ml_produto;
    }

    public void setMl_produto(String ml_produto) {
        this.ml_produto = ml_produto;
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo de bebida: " + tipo_bebida + "\nOrigem: " + pais_origem + "\nAno da safra: "
                + ano_safra + "\nTeor alcoólico: " + teor_alcool + "\nVolume: " + ml_produto + "\n";
    }
}