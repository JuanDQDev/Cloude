package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import utilities.Paths;

import java.io.IOException;


public class PrincipalMenuController {
    SceneController sceneController  = new SceneController();

    @FXML
    void btnIngresarOnAction(ActionEvent event) throws IOException {
        sceneController.switchBetwenPages(event, Paths.LOGIN_PAGE);
    }

    @FXML
    void onActionRegistrarse(ActionEvent event) throws IOException {
        sceneController.switchBetwenPages(event, Paths.REGISTER_PAGE);
    }
}
