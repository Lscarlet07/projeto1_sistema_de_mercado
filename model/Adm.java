package model;

public class Adm {
    private final String credencial;
    private long senha;

    public Adm() {
        credencial = "ab2530";
        senha = 457892;
    }

    public String getCredencial() {
        return credencial;
    }

    public long getSenha() {
        return senha;
    }

    public void setSenha(long senha) {
        this.senha = senha;
    }
}