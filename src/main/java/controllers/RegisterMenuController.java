package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class RegisterMenuController {

    SceneController sceneController  = new SceneController();

    @FXML
    void onActionVolverMenu(ActionEvent event) throws IOException {
        sceneController.switchPrincipalPage(event);
    }

}
