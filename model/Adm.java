package model;

public class Adm {
    private final String credencial;
    private long senha;

    public Adm() {
        credencial = "xs4520";
        senha = 3475023;
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