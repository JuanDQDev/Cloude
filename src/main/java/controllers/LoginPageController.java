package controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginPageController {

    SceneController sceneController  = new SceneController();

    @FXML
    private TextField passwtxtfield;

    @FXML
    private TextField usertxtfield;

    @FXML
    void onActionMenuPrincipal(ActionEvent event) throws IOException {
        sceneController.switchPrincipalPage(event);
    }


}
