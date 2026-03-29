package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;


public class PrincipalMenuController {
    SceneController sceneController  = new SceneController();
    @FXML
    void btnIngresarOnAction(ActionEvent event) throws IOException {
    sceneController.switchLoginPage(event);
    }

}
