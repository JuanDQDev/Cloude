package controllers;

import javafx.animation.Animation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import model.Persona;

import javax.management.Notification;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.controlsfx.control.Notifications;
import application.App;

public class RegisterMenuController {

    SceneController sceneController  = new SceneController();
    ArrayList<Persona> personas = App.personas;

    @FXML
    private TextField cedulatxtfield;

    @FXML
    private TextField telefonotxtfield;

    @FXML
    private TextField usertxtfield;

    @FXML
    void onActionRegistrarse(ActionEvent event) throws IOException {
        String cedula = cedulatxtfield.getText().trim(); // Usado para remover espacios al inicio y fin
        String telefono = telefonotxtfield.getText().trim();
        String usuario = usertxtfield.getText().trim();
        Persona persona = new Persona(usuario, telefono, cedula);

        if (chequeoPosicion(cedula)) {
            userAlrExitsNoti();
        } else {
            personas.add(persona);
            sceneController.switchPrincipalPage(event);
        }
        if (cedulatxtfield.getText().equals("Posicion")) {
            personas.get(0);
           // userAlrExitsNoti(event);
        }
        System.out.println(personas);
    }

    void userAlrExitsNoti() {
        Notifications notifications = Notifications.create();
        notifications.title("Registro");
        notifications.text("Este usuario ya existe.");
        notifications.hideAfter(Duration.seconds(1.5));
        notifications.position(Pos.TOP_RIGHT);
        notifications.showError();
    }

    boolean chequeoPosicion(String cedula) {
        for( Persona p : personas) {
            if(p.getCedula().equals(cedula.trim())) {
                return true;
            }
        }
        return false;
    }

    @FXML
    void onActionVolverMenu(ActionEvent event) throws IOException {
        sceneController.switchPrincipalPage(event);
    }


    }


