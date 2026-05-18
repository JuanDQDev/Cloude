package controllers;

import com.sun.tools.javac.Main;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.ParqueAtracciones;
import utilities.Paths;

import java.io.IOException;

public class LoginPageController {

    SceneController sceneController  = new SceneController();
    ParqueAtracciones parqueAtracciones = new ParqueAtracciones();
    static String loginName;

    @FXML
    private FontAwesomeIconView onActionMenuPrincipal;

    @FXML
    private TextField cedulatxtfield;

    @FXML
    private TextField usertxtfield;

    @FXML
    void onActionIngresar(ActionEvent event) throws IOException {

        String cedula = cedulatxtfield.getText().trim();
        String usuario = usertxtfield.getText().trim();
        loginName = usuario;

        parqueAtracciones.loginVisitante(usuario, cedula, event);
    }

    @FXML
    void onActionRegistrarse(ActionEvent event) throws IOException {
        sceneController.switchBetwenPages(event, Paths.REGISTER_PAGE);
    }

    @FXML
    void onActionMenuPrincipal(ActionEvent event) throws IOException {
        sceneController.switchBetwenPages(event, Paths.MAIN_PAGE);
    }

}

