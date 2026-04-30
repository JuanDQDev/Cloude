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

    ArrayList<Visitante> visitantes = App.visitantes;
    public int posicionLogueada;

    @FXML
    private Button btnMainMenu;

    @FXML
    private Label labelusr;

    @FXML
    private FontAwesomeIconView userIcon = new FontAwesomeIconView(FontAwesomeIcon.HOME);



    @FXML
    private Text profiletext;

    @FXML
    public void initialize() {
        LoginPageController loginPageController = new LoginPageController();

        System.out.println(setProfileText(loginPageController.posicionLogueo));
        System.out.println(visitantes.get(posicionLogueada).getNombre());
        profiletext.setText(setProfileText(loginPageController.posicionLogueo));
        cambiarColorBoton(userIcon, btnMainMenu);

    }

    public String setProfileText(int posicionLogueada) {
            String name = visitantes.get(posicionLogueada).getNombre();
            char charFirst = name.charAt(0);
            char charSecond = ' ';

            if (name.contains(" ")) {
                String[] partes = name.split(" ");
                charSecond = partes[1].charAt(0);
            }

            String newCharFirst = String.valueOf(charFirst).toUpperCase();
            String newCharSecond = String.valueOf(charSecond).toUpperCase();
            return newCharFirst + newCharSecond;
    }

    public void cambiarColorBoton(FontAwesomeIconView icon, Button boton) {
        icon.getStyleClass().add("glyphicon");
        boton.setGraphic(icon);
        boton.getStyleClass().add("button-color");
    }

    public int buscarPosicionLogueada(String cedula) {
        for(Visitante visitante : visitantes) {
            if(visitante.getCedula().equals(cedula)) {
                System.out.println(visitantes.indexOf(visitante));
                return posicionLogueada = visitantes.indexOf(visitante);
            }
        }
        return posicionLogueada = -1;
    }

}
