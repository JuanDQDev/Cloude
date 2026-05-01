package model;

import controllers.RegisterMenuController;

public class Persona {

    private String nombre;
    private String edad;
    private String cedula;
    private String estatura;

    public Persona(String nombre, String edad, String cedula, String estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String telefono) {
        this.edad = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }


    @Override
    public String toString() {
        return nombre + " " + edad + " " + cedula + " " + estatura + " | ";
    }
}
