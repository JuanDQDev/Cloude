package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Persona;
import org.w3c.dom.Node;
import utilities.Paths;
import controllers.PrincipalMenuController;

import java.io.IOException;
import java.util.ArrayList;
import controllers.RegisterMenuController;


public class App extends Application {

    public static ArrayList<Persona> personas = new ArrayList<>();

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane root = FXMLLoader.load(getClass().getResource(Paths.MAIN_PAGE));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}
