package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utilities.Paths;
import controllers.LoginPageController;


public class App extends Application {

    public static void main(String[] args) {
    launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        LoginPageController firstPageController = new LoginPageController();

        AnchorPane root = FXMLLoader.load(getClass().getResource(Paths.FIRST_PAGE));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
