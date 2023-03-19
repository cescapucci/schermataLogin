package com.example.schermatalogin;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Objects;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
public class RegistrazioneController {

    @FXML
    private Label control;

    @FXML
    private TextField user,psw,email;


    @FXML
    protected void effettuaRegistrazione(){
        Utente u = new Utente(user.getText(), psw.getText());

    }
}
