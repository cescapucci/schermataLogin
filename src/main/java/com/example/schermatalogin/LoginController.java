package com.example.schermatalogin;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Objects;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Modality;

public class LoginController {

    Accessi accessi;

    @FXML
    private Button registrati;
    @FXML
    private Label textControllo;

    @FXML
    private TextField textUser, textPassword;

    public LoginController() {
        accessi = new Accessi();
        Utente u = new Utente("t","t");
    }

    /**
     * bottone accedi, controla se l'utente è nell'arraylist dei registrati
     * @throws IOException
     */
    @FXML
    protected void login () throws IOException {
        System.out.println("ciao");
        boolean nomeTrovato = false;
        System.out.println(Accessi.accessi.size());
        for  (int i = 0; i < Accessi.accessi.size(); i++){
            System.out.println("entrato nel ciclo");
            if(Objects.equals(Accessi.accessi.get(i).getNome(), textUser.getText()))
                    nomeTrovato = true; //se esiste lutente lo segna
                if (Objects.equals(Accessi.accessi.get(i).getPsw(), textPassword.getText())){   //se è giusta anceùhe la psw
                    textControllo.setText("utente trovato");    //lo trova ed esce dal for
                    break;
            }

            if (!nomeTrovato)   //se non ha trovato l'utente
                textControllo.setText("utente non trovato");
                else //se ha unutente con il nome ma psw diversa
                   textControllo.setText("password errata");
        }
        System.out.println("fine");
    }

    /**
     *cambia alla scehrmatadi registrazione
     */
    @FXML
    protected void registrati () throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Registrazione.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Registrati");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
