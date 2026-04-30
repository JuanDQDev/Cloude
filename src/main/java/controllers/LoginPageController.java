package controllers;

import com.sun.tools.javac.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.ParqueAtracciones;
import utilities.Paths;

import java.io.IOException;

public class LoginPageController {

    SceneController sceneController  = new SceneController();
    int posicionLogueo;

    @FXML
    private TextField cedulatxtfield;

    @FXML
    private TextField usertxtfield;

    @FXML
    void onActionIngresar(ActionEvent event) throws IOException {
        ParqueAtracciones parqueAtracciones = new ParqueAtracciones();
        MainMenuController mainMenuController = new MainMenuController();

        String cedula = cedulatxtfield.getText().trim();
        String usuario = usertxtfield.getText().trim();

        posicionLogueo = mainMenuController.buscarPosicionLogueada(cedula);
        parqueAtracciones.loginVisitante(usuario, cedula, event);
    }

    @FXML
    void onActionMenuPrincipal(ActionEvent event) throws IOException {
        sceneController.switchBetwenPages(event, Paths.MAIN_PAGE);
    }

}

