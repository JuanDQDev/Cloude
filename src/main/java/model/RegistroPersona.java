package model;

import application.App;
import controllers.SceneController;
import javafx.geometry.Pos;
import javafx.util.Duration;
import model.enums.TipoNotificaciones;
import org.controlsfx.control.Notifications;

import java.util.ArrayList;

public class RegistroPersona {

    SceneController sceneController  = new SceneController();

    public static boolean comprobarCedulayTelefono(String cedula, String edad, String estatura) {

        if(cedula.isEmpty() && edad.isEmpty() && estatura.isEmpty()) {
            return false;
        }
        try{ // Metodo usado para probar una accion y si esta da un error (Excepcion) la tomara y realizara una accion que le digamos
            Integer.parseInt(cedula);
            Integer.parseInt(edad);
            Integer.parseInt(estatura);
            return true;
        } catch (NumberFormatException e){ // El que toma el error
            return false;
        }
    }

    public static boolean comprobarEstatura(String estatura){
        try{
            Double.parseDouble(estatura);
            return true;
        } catch(NumberFormatException e){
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


    public static void createNotification(TipoNotificaciones tipoNotificacion, String title, String message) {
        Notifications notifications = Notifications.create();
        notifications.title(title);
        notifications.text(message);
        notifications.hideAfter(Duration.seconds(3));
        notifications.position(Pos.TOP_RIGHT);
        if (tipoNotificacion == tipoNotificacion.SUCCESS){
            notifications.showConfirm();
        } else if (tipoNotificacion == tipoNotificacion.ERROR){
            notifications.showError();
        } else if (tipoNotificacion == tipoNotificacion.WARNING){
            notifications.showWarning();
        }
    }
}
