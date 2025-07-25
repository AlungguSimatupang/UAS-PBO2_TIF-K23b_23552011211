package org.example;

public abstract class TenagaMedis {
    protected int id;
    protected String nama;

    public TenagaMedis(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public abstract void verifikasiResep();
}

