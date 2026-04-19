package model;

public class Operador extends Persona {

    private double sueldo;

    public Operador(String nombre, String identificacion, String cedula, String estatura) {
        super(nombre, identificacion, cedula, estatura);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
