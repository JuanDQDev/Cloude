package model;

import application.App;
import controllers.SceneController;
import javafx.geometry.Pos;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

import java.util.ArrayList;

public class RegistroPersona {

    SceneController sceneController  = new SceneController();

    public static boolean comprobarCedulayTelefono(String cedula, String telefono) {

        if(cedula.isEmpty() && telefono.isEmpty()) {
            return false;
        }
        try{ // Metodo usado para probar una accion y si esta da un error (Excepcion) la tomara y realizara una accion que le digamos
            Integer.parseInt(cedula);
            Integer.parseInt(telefono);
            return true;
        } catch (NumberFormatException e){ // El que toma el error
            return false;
        }
    }
    
    public static boolean chequeoPosicion(String cedula) {
        for( Persona p : App.personas) {
            if(p.getCedula().equals(cedula.trim())) {
                return true;
            }
        }
        return false;
    }


    public static void userAlrExitsNoti() {
        Notifications notifications = Notifications.create();
        notifications.title("Registro");
        notifications.text("Este usuario ya existe.");
        notifications.hideAfter(Duration.seconds(1.5));
        notifications.position(Pos.TOP_RIGHT);
        notifications.showError();
    }
}
