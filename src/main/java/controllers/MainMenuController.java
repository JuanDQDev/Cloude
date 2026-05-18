package controllers;

import application.App;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import model.Visitante;

import java.util.ArrayList;

public class MainMenuController {

    @FXML
    private Button btnMainMenu;

    @FXML
    public Text welcometxt;

    @FXML
    private FontAwesomeIconView icon1 = new FontAwesomeIconView();

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
}
