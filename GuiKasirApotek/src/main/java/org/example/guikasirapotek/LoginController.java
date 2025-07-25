package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import org.example.model.UserDAO;

public class LoginController {
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label statusLabel;

    @FXML
    private void login() throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();
        UserDAO dao = new UserDAO();
        if (dao.login(username, password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/dashboard.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));
            stage.setTitle("Dashboard");
            stage.show();
            usernameField.getScene().getWindow().hide();
        } else {
            statusLabel.setText("Login gagal");
        }
    }

    @FXML
    private void goToRegister() throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/register.fxml"))));
        stage.setTitle("Register");
        stage.show();
        usernameField.getScene().getWindow().hide();
    }
}
