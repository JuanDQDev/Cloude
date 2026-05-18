package model;

import model.enums.EstadoAtraccion;

public class Operador extends Persona{

    private double sueldo;

    private EstadoAtraccion estado;

    public Operador(String nombre, String identificacion, double sueldo) {
        super(nombre, identificacion);
        this.sueldo = sueldo;
    }

    public Operador(String nombre, String identificacion, double sueldo, EstadoAtraccion estado) {
        super(nombre, identificacion);
        this.sueldo = sueldo;
        this.estado = estado;
    }

    public Operador(String nombre, String identificacion) {
        super(nombre, identificacion);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public EstadoAtraccion getEstado() {
        return estado;
    }

    public void setEstado(EstadoAtraccion estado) {
        this.estado = estado;
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
