package com.controlador;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.w3c.dom.events.MouseEvent;

public class Entrar {

    @FXML
    ImageView fechar;


    public void btn_fechar(){
        Stage stage = (Stage) fechar.getScene().getWindow();
        stage.close();
    }


}