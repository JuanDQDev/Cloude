package application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utilities.Paths;
import controllers.FirstPageController;

import java.nio.file.Path;


public class App extends Application {

    public static void main(String[] args) {
    launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane root = FXMLLoader.load(getClass().getResource(Paths.FIRST_PAGE));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
