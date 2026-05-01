package mapaParque.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class MapaParqueController {

    @FXML private AnchorPane panelInfo;
    @FXML private Label titulo;
    @FXML private Label descripcion;

    private Button seleccionado = null;

    @FXML
    public void initialize() {
        panelInfo.setTranslateX(350); // oculto fuera de pantalla
    }

    @FXML
    private void seleccionarAtraccion(ActionEvent event) {

        Button btn = (Button) event.getSource();

        // quitar selección anterior
        if (seleccionado != null) {
            seleccionado.getStyleClass().remove("activo");
        }

        // marcar actual
        btn.getStyleClass().add("activo");
        seleccionado = btn;

        // cambiar info según botón
        switch (btn.getText()) {
            case "1":
                titulo.setText("Tormenta Cafetera");
                descripcion.setText("Montaña rusa extrema con alta velocidad.");
                break;
            case "2":
                titulo.setText("Río Salvaje del Quindío");
                descripcion.setText("Atracción acuática con rápidos.");
                break;
            case "3":
                titulo.setText("Vuelo del Cóndor");
                descripcion.setText("Sillas voladoras familiares.");
                break;
            case "4":
                titulo.setText("Mina Perdida");
                descripcion.setText("Dark ride interactivo.");
                break;
            case "5":
                titulo.setText("Volcán del Quindío");
                descripcion.setText("Caída libre extrema.");
                break;
        }

        mostrarPanel();
    }

    private void mostrarPanel() {
        TranslateTransition tt = new TranslateTransition(Duration.millis(300), panelInfo);
        tt.setToX(0);
        tt.play();
    }

    @FXML
    private void cerrarPanel() {
        TranslateTransition tt = new TranslateTransition(Duration.millis(300), panelInfo);
        tt.setToX(350);
        tt.play();

        if (seleccionado != null) {
            seleccionado.getStyleClass().remove("activo");
        }
    }
}