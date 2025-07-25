package org.example;

public class Apoteker extends TenagaMedis {
    public Apoteker(int id, String nama) {
        super(id, nama);
    }

    @Override
    public void verifikasiResep() {
        System.out.println("Apoteker " + nama + " memverifikasi dan menyiapkan obat.");
    }
}

