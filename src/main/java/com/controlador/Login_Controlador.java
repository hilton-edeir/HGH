package com.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Login_Controlador {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}