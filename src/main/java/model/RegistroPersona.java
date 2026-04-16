package model;

import application.App;
import controllers.SceneController;
import javafx.geometry.Pos;
import javafx.util.Duration;
import model.enums.TipoNotificaciones;
import org.controlsfx.control.Notifications;

import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.ArrayList;

public class RegistroPersona {

     SceneController sceneController  = new SceneController();
     ArrayList<Persona> personas = App.personas;


    public void registrarPersona(String usuario, String telefono, String cedula, String estatura, ActionEvent event) throws IOException {
        Persona persona = new Persona(usuario, telefono, cedula, estatura);

        if (cedula.isEmpty() || telefono.isEmpty() || usuario.isEmpty() || estatura.isEmpty()) {
            createNotification(TipoNotificaciones.WARNING, "Registro", "Todos los campos deben de estar llenos");
        } else if(!comprobarNombre(usuario)) {
            createNotification(TipoNotificaciones.WARNING, "Registro", "Debes usar solo texto en el nombre.");
        }else if (!comprobarCedulayTelefono(cedula, telefono)) {
            createNotification(TipoNotificaciones.WARNING, "Registro", "Debes usar numeros enteros en la cedula y telefono.");
        } else if (!comprobarEstatura(estatura)) {
            createNotification(TipoNotificaciones.WARNING, "Registro", "Debes usar decimales o entero en la estatura (cm).");
        } else if (chequeoPosicion(cedula)) {
            createNotification(TipoNotificaciones.ERROR, "Registro", "Ya hay un usuario con esa cedula registrada.");
        } else {
            personas.add(persona);
            sceneController.switchPrincipalPage(event);
            createNotification(TipoNotificaciones.SUCCESS, "Registro", "Registrado exitosamente.");
            System.out.println(personas);
        }

    }

    public static boolean comprobarNombre (String nombre) {
        if (nombre.isEmpty() || nombre.isBlank()) {
            if(nombre.length()<3) {
                return false;
            }
        }
        return nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]*");
    }

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
