package model;

public class Encarregado {
    private final long id_adega;
    private final long id_mercearia;
    private final long id_padaria;
    private final long id_bebidas;

    public Encarregado() {
        id_adega = 15002023;
        id_bebidas = 16002023;
        id_mercearia = 12002023;
        id_padaria = 14002023;
    }

    public long getId_adega() {
        return id_adega;
    }

    public long getId_mercearia() {
        return id_mercearia;
    }

    public long getId_padaria() {
        return id_padaria;
    }

    public long getId_bebidas() {
        return id_bebidas;
    }
}