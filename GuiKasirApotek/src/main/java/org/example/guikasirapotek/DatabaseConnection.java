package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static Connection connect() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kasir_apotek", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
