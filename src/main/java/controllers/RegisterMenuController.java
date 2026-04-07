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

import model.RegistroPersona;
import model.enums.TipoNotificaciones;
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
    private TextField estaturatxtfield;

    @FXML
    void onActionRegistrarse(ActionEvent event) throws IOException {
        String cedula = cedulatxtfield.getText().trim(); // Usado para remover espacios al inicio y fin
        String edad = telefonotxtfield.getText().trim();
        String usuario = usertxtfield.getText().trim();
        String estatura = estaturatxtfield.getText().trim();
        Persona persona = new Persona(usuario, edad, cedula, estatura);

            if (cedula.isEmpty() || edad.isEmpty() || usuario.isEmpty() || estatura.isEmpty()) {
                RegistroPersona.createNotification(TipoNotificaciones.WARNING, "Registro", "Debes de llenar todos los campos para registrarse.");
            } else if (!RegistroPersona.comprobarCedulayTelefono(cedula, edad, estatura)) {
                boolean doubleEstatura = RegistroPersona.comprobarEstatura(estatura);
            } else if (RegistroPersona.chequeoPosicion(cedula)) { // Importamos los metodos de la clase RegistroPersona
                RegistroPersona.createNotification(TipoNotificaciones.ERROR, "Registro", "Ya hay un usuario con esa cedula registrada.");
            } else {
                personas.add(persona);
                sceneController.switchPrincipalPage(event);
                RegistroPersona.createNotification(TipoNotificaciones.SUCCESS, "Registro", "Registrado exitosamente.");
                System.out.println(personas);
            }

    }

    @FXML
    void onActionVolverMenu(ActionEvent event) throws IOException {
        sceneController.switchPrincipalPage(event);
    }


    }


