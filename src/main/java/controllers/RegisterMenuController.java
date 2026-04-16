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
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import model.RegistroPersona;
import model.enums.TipoNotificaciones;
import org.controlsfx.control.Notifications;
import application.App;
import utilities.Paths;

public class RegisterMenuController {

    SceneController sceneController  = new SceneController();
    @FXML
    private TextField cedulatxtfield;

    @FXML
    private TextField telefonotxtfield;

    @FXML
    private TextField usertxtfield;

    @FXML
    private TextField estaturatxtfield;

    @FXML
    void onActionRegistrarse(ActionEvent event) throws IOException {
        String cedula = cedulatxtfield.getText().trim(); // Usado para remover espacios al inicio y fin
        String telefono = telefonotxtfield.getText().trim();
        String usuario = usertxtfield.getText().trim();
        String estatura = estaturatxtfield.getText().trim();

        RegistroPersona registroPersona = new RegistroPersona();
        registroPersona.registrarPersona(usuario,telefono,cedula,estatura,event);
    }

    @FXML
    void onActionVolverMenu(ActionEvent event) throws IOException {
        sceneController.switchBetwenPages(event, Paths.MAIN_PAGE);
    }


    }


