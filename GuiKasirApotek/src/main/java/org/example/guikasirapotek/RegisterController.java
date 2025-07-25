package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import org.example.model.UserDAO;

public class RegisterController {
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label statusLabel;

    @FXML
    private void register() throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();
        UserDAO dao = new UserDAO();
        if (dao.register(username, password)) {
            statusLabel.setText("Berhasil daftar!");
        } else {
            statusLabel.setText("Gagal mendaftar.");
        }
    }

    @FXML
    private void goToLogin() throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/login.fxml"))));
        stage.setTitle("Login");
        stage.show();
        usernameField.getScene().getWindow().hide();
    }
}
