package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

import model.ParqueAtracciones;
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

        ParqueAtracciones metodoRegistro = new ParqueAtracciones();
        metodoRegistro.registrarVisitante(usuario,telefono,cedula,estatura,event);
    }

    @FXML
    void onActionVolverMenu(ActionEvent event) throws IOException {
        sceneController.switchBetwenPages(event, Paths.MAIN_PAGE);
    }


    }


