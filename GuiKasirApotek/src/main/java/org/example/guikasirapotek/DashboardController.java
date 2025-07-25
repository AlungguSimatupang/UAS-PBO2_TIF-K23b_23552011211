package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DashboardController {
    @FXML private Label welcomeLabel;

    @FXML
    public void initialize() {
        welcomeLabel.setText("Selamat datang di Kasir Apotek!");
    }
}
