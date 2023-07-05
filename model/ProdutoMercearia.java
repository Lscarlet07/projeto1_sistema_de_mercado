package model;

public class ProdutoMercearia extends Produto {
    public String gramagem;
    public String setor_alimento;
    public int corredor_exposto;

    public ProdutoMercearia(String nome_produto, long codigo_produto, String data_validade, double valor_unitario,
            String gramagem, String setor_alimento, int corredor_exposto) {
        super(nome_produto, codigo_produto, data_validade, valor_unitario);
        this.gramagem = gramagem;
        this.setor_alimento = setor_alimento;
        this.corredor_exposto = corredor_exposto;
    }

    public String getGramagem() {
        return gramagem;
    }

    public void setGramagem(String gramagem) {
        this.gramagem = gramagem;
    }

    public String getSetor_alimento() {
        return setor_alimento;
    }

    public void setSetor_alimento(String setor_alimento) {
        this.setor_alimento = setor_alimento;
    }

    public int getCorredor_exposto() {
        return corredor_exposto;
    }

    public void setCorredor_exposto(int corredor_exposto) {
        this.corredor_exposto = corredor_exposto;
    }
}