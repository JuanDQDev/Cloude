package model;

import java.util.ArrayList;

public class Administrador extends Persona{

    private double sueldo;

    //relaciones
    private ArrayList<Operador> listOperadores;
    private ArrayList<Atraccion> listAtracciones;
    private ArrayList<ZonaAtraccion>  listZonas;
    private ReporteFinal theReporte;

    public Administrador(String nombre, String identificacion, double sueldo, ArrayList<Operador> listOperadores, ArrayList<Atraccion> listAtracciones, ArrayList<ZonaAtraccion> listZonas, ReporteFinal theReporte) {
        super(nombre, identificacion);
        this.sueldo = sueldo;
        this.listOperadores = listOperadores;
        this.listAtracciones = listAtracciones;
        this.listZonas = listZonas;
        this.theReporte = theReporte;
    }

    public boolean validarCapacidadMaximaZona(ZonaAtraccion zona){
        boolean bandera=true;
            if(zona.listVisitantes().size()>=zona.maximoVisitantes()){
                bandera=false;

        }
        return bandera;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public ArrayList<Operador> getListOperadores() {
        return listOperadores;
    }

    public void setListOperadores(ArrayList<Operador> listOperadores) {
        this.listOperadores = listOperadores;
    }

    public ArrayList<Atraccion> getListAtracciones() {
        return listAtracciones;
    }

    public void setListAtracciones(ArrayList<Atraccion> listAtracciones) {
        this.listAtracciones = listAtracciones;
    }

    public ArrayList<ZonaAtraccion> getListZonas() {
        return listZonas;
    }

    public void setListZonas(ArrayList<ZonaAtraccion> listZonas) {
        this.listZonas = listZonas;
    }

    public ReporteFinal getTheReporte() {
        return theReporte;
    }

    public void setTheReporte(ReporteFinal theReporte) {
        this.theReporte = theReporte;
    }
}
