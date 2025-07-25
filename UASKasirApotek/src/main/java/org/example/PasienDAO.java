package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PasienDAO {
    public void tambahPasien(Pasien pasien) {
        String sql = "INSERT INTO pasien (nama, umur) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, pasien.getNama());
            stmt.setInt(2, pasien.getUmur());
            stmt.executeUpdate();
            System.out.println("✅ Pasien berhasil ditambahkan.");
        } catch (SQLException e) {
            System.err.println("❌ Gagal menambahkan pasien.");
            e.printStackTrace();
        }
    }
}

