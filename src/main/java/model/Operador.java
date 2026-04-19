package model;

public class Operador extends Persona{

    private double sueldo;

    public Operador(String nombre, String identificacion, double sueldo) {
        super(nombre, identificacion);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Operador{" +
                "sueldo=" + sueldo +
                ", nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                '}';
    }
}
