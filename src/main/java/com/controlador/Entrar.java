package com.controlador;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Entrar {

    @FXML
    ImageView img_Minimizar;
    @FXML
    ImageView img_Fechar;
    @FXML
    Label lbl_Erro;
    @FXML
    TextField cmp_NIF;
    @FXML
    PasswordField cmp_PPasse;
    @FXML
    Label lbl_Esqueci_PPasse;


    public void btn_minimizar(){
        Stage stage = (Stage) img_Minimizar.getScene().getWindow();
        stage.setIconified(true);
    }

    public void btn_fechar(){
        Stage stage = (Stage) img_Fechar.getScene().getWindow();
        stage.close();
    }

    public void btn_entrar() throws IOException {
        if(cmp_NIF.getText().isEmpty() || cmp_PPasse.getText().isEmpty()) {
            lbl_Erro.setText("Preencha todos os campos!");
        }
        else {
            lbl_Erro.setText("");
            Stage stage = (Stage) cmp_NIF.getScene().getWindow();
            stage.close();
            Stage new_stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu_principal.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            new_stage.setScene(scene);
            new_stage.initStyle(StageStyle.UNDECORATED);
            new_stage.show();
        }
    }


}