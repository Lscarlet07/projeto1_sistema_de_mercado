package model;

public class ProdutoBebida extends Produto {
    private String tipo_bebida;
    private String ml_produto;
    private double teor_alcool;

    public ProdutoBebida(String nome_produto, long codigo_produto, String data_validade, double valor_unitario,
            String tipo_bebida, String ml_produto, double teor_alcool) {
        super(nome_produto, codigo_produto, data_validade, valor_unitario);
        this.tipo_bebida = tipo_bebida;
        this.ml_produto = ml_produto;
        this.teor_alcool = teor_alcool;
    }

    public String getTipo_bebida() {
        return tipo_bebida;
    }

    public void setTipo_bebida(String tipo_bebida) {
        this.tipo_bebida = tipo_bebida;
    }

    public String getMl_produto() {
        return ml_produto;
    }

    public void setMl_produto(String ml_produto) {
        this.ml_produto = ml_produto;
    }

    public double getTeor_alcool() {
        return teor_alcool;
    }

    public void setTeor_alcool(double teor_alcool) {
        this.teor_alcool = teor_alcool;
    }   
}