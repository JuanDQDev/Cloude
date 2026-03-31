package model;

import controllers.RegisterMenuController;

public class Persona {

    private String nombre;
    private String telefono;
    private String cedula;

    public Persona(String nombre, String telefono, String cedula) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return nombre + " " + telefono + " " + cedula + " | ";
    }
}
