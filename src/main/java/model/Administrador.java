package model;

import java.util.ArrayList;

public class Administrador extends Persona{

    private double sueldo;

    //relaciones
    private ArrayList<Operador> listOperadores;
    private ArrayList<Atraccion> listAtracciones;
    private ReporteFinal theReporte;

    public Administrador(String nombre, String identificacion, double sueldo, ReporteFinal theReporte, ArrayList<Operador> listOperadores, ArrayList<Atraccion> listAtracciones) {
        super(nombre, identificacion);
        this.sueldo = sueldo;
        this.theReporte = theReporte;
        listOperadores = new ArrayList<>();
        listAtracciones = new ArrayList<>();
    }

    public Administrador(String nombre, String identificacion, double sueldo) {
        super(nombre, identificacion);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
