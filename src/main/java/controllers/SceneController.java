package controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utilities.Paths;

import javafx.event.ActionEvent;
import java.io.IOException;

public class SceneController {

    private Stage stage;
    private Scene scene;

    public void switchLoginPage(ActionEvent event) throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource(Paths.LOGIN_PAGE));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

  /*  public void switchPrincipalPage(ActionEvent event) throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource(Paths.MAIN_PAGE));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }*/
}
