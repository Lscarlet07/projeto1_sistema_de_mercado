package model;

public class ProdutoPadaria extends Produto {
    private double valor_kg;
    private int peso_gramas;
    private String data_embalado;
    private String categoria;
    private int codigo_pesagem;

    public ProdutoPadaria(String nome_produto, long codigo_produto, String data_validade, double valor_unitario,
            int peso_kg, double valor_kg, String data_embalado, String categoria, int codigo_pesagem) {
        super(nome_produto, codigo_produto, data_validade, valor_unitario);
        this.peso_gramas = peso_kg;
        this.valor_kg = valor_kg;
        this.data_embalado = data_embalado;
        this.categoria = categoria;
        this.codigo_pesagem = codigo_pesagem;
    }

    public int getPeso_gramas() {
        return peso_gramas;
    }

    public void setPeso_gramas(int peso_kg) {
        this.peso_gramas = peso_kg;
    }

    public double getValor_kg() {
        return valor_kg;
    }

    public void setValor_kg(double valor_kg) {
        this.valor_kg = valor_kg;
    }

    public String getData_embalado() {
        return data_embalado;
    }

    public void setData_embalado(String data_embalado) {
        this.data_embalado = data_embalado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo_pesagem() {
        return codigo_pesagem;
    }

    public void setCodigo_pesagem(int codigo_pesagem) {
        this.codigo_pesagem = codigo_pesagem;
    }

    @Override
    public String toString() {
        return super.toString() + "Embalado em: " + data_embalado + "\nSetor: " + categoria + "\nPeso: " + peso_gramas
                + "\nValor por kg: " + valor_kg + "\nCódigo de pesagem: " + codigo_pesagem + "\n";
    }
}