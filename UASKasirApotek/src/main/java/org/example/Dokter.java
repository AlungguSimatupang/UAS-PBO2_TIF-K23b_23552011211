package org.example;

public class Dokter extends TenagaMedis {
    public Dokter(int id, String nama) {
        super(id, nama);
    }

    @Override
    public void verifikasiResep() {
        System.out.println("Dokter " + nama + " memverifikasi resep.");
    }
}

