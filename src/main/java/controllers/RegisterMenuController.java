package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;

import javafx.stage.Stage;
import model.ParqueAtracciones;
import utilities.Paths;

public class RegisterMenuController {

    SceneController sceneController = new SceneController();
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

        ParqueAtracciones parqueAtracciones = new ParqueAtracciones();
        parqueAtracciones.registrarVisitante(usuario, telefono, cedula, estatura, event);
        boolean registrado = parqueAtracciones.registrarVisitante(usuario, telefono, cedula, estatura, event);

        if (registrado == true) {//para cambiar a la pagina de pagos
            Parent root = FXMLLoader.load(getClass().getResource("/EscogerPlan.fxml"));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();



        } else {
            // si no se registra correctamente,sale una alerta
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Debes completar todos los campos");
            alert.showAndWait();
        }


    }


    @FXML
    void onActionVolverMenu(ActionEvent event) throws IOException {
        sceneController.switchBetwenPages(event, Paths.MAIN_PAGE);
    }
}



