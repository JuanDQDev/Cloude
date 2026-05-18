package controllers;

import application.App;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Visitante;
import utilities.Paths;

import java.io.IOException;
import java.util.ArrayList;

public class MainMenuController {

    @FXML
    private BorderPane bg;

    @FXML
    private Button btnMainMenu;

    @FXML
    public Text welcometxt;

    @FXML
    private FontAwesomeIconView icon1 = new FontAwesomeIconView(FontAwesomeIcon.HOME);

    @FXML
    private FontAwesomeIconView icon2 = new FontAwesomeIconView();

    @FXML
    private FontAwesomeIconView icon3 = new FontAwesomeIconView();

    @FXML
    private FontAwesomeIconView icon4 = new FontAwesomeIconView();

    @FXML
    private FontAwesomeIconView icon5  = new FontAwesomeIconView();

    @FXML
    public Text profiletext;

    @FXML
    public void initialize() {
        cambiarColorBoton(icon1, btnMainMenu);
        cambiarColorBoton(icon2, btnMainMenu);
        cambiarColorBoton(icon3, btnMainMenu);
        cambiarColorBoton(icon4, btnMainMenu);
        cambiarColorBoton(icon5, btnMainMenu);
        welcometxt.setText(welcometxt.getText() + "\n" + LoginPageController.loginName);
        profiletext.setText(getProfileText(LoginPageController.loginName));

    }

    public static String getProfileText(String loginName) {
            char charFirst = loginName.charAt(0);
            char charSecond = ' ';

            if (loginName.contains(" ")) {
                String[] partes = loginName.split(" ");
                charSecond = partes[1].charAt(0);
            }

            String newCharFirst = String.valueOf(charFirst).toUpperCase();
            String newCharSecond = String.valueOf(charSecond).toUpperCase();
            return newCharFirst + newCharSecond;
    }

    public void cambiarColorBoton(FontAwesomeIconView icon, Button boton) {
        icon.getStyleClass().add("glyphicon"); // le añade esta clase al icono
        boton.setGraphic(icon); // Pone el icono dentro del boton
        boton.getStyleClass().add("button-color"); // Finalmente le pone este estilo al boton y como el boton
                                                    // esta con el icono los 2 quedan con el estilo
    }

    @FXML
    void onActionBtnComprarBole(ActionEvent event) throws IOException {
        dashBoardPages(event, Paths.BUY_TICKETS);
    }

    @FXML
    void onActionBtnMap(ActionEvent event) throws IOException {
        dashBoardPages(event, Paths.MAP_PAGE);
    }

    @FXML
    void onActionBtnProfile(ActionEvent event) {

    }

    @FXML
    void onActionBtnZones(ActionEvent event) {

    }

    public void dashBoardPages(ActionEvent event, String paths) throws IOException {
        AnchorPane root = FXMLLoader.load(getClass().getResource(paths));
        bg.setCenter(root);
    }
}
