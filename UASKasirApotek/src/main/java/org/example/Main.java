package org.example;

public class Main {
    public static void main(String[] args) {
        // Tambah pasien
        Pasien pasien = new Pasien(0, "Ali", 45);
        PasienDAO dao = new PasienDAO();
        dao.tambahPasien(pasien);

        // Simulasi tenaga medis
        TenagaMedis dokter = new Dokter(1, "Dr. Aisyah");
        dokter.verifikasiResep();

        TenagaMedis apoteker = new Apoteker(2, "Apoteker Budi");
        apoteker.verifikasiResep();
    }
}


