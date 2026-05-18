package model;

import java.util.ArrayList;

public class ZonaAtraccion implements IValidable {

    private String numZona;
    private String nombreZona;
    private int maximoVisitantes;
    private ArrayList<Atraccion> listAtracciones;
    private ArrayList<Visitante> listVisitantes;

    // Constructor vacío
    public ZonaAtraccion() {
        this.listAtracciones = new ArrayList<>();
        this.listVisitantes = new ArrayList<>();
    }

    // Constructor con parámetros
    public ZonaAtraccion(String numZona,
                         String nombreZona,
                         int maximoVisitantes,
                         ArrayList<Atraccion> listAtracciones,
                         ArrayList<Visitante> listVisitantes) {

        this.numZona = numZona;
        this.nombreZona = nombreZona;
        this.maximoVisitantes = maximoVisitantes;
        this.listAtracciones = listAtracciones;
        this.listVisitantes = listVisitantes;
    }

    // Getters y Setters
    public String getNumZona() {
        return numZona;
    }

    public void setNumZona(String numZona) {
        this.numZona = numZona;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public int getMaximoVisitantes() {
        return maximoVisitantes;
    }

    public void setMaximoVisitantes(int maximoVisitantes) {
        this.maximoVisitantes = maximoVisitantes;
    }

    public ArrayList<Atraccion> getListAtracciones() {
        return listAtracciones;
    }

    public void setListAtracciones(ArrayList<Atraccion> listAtracciones) {
        this.listAtracciones = listAtracciones;
    }

    public ArrayList<Visitante> getListVisitantes() {
        return listVisitantes;
    }

    public void setListVisitantes(ArrayList<Visitante> listVisitantes) {
        this.listVisitantes = listVisitantes;
    }

    // Validación de capacidad
    @Override
    public boolean validarCapacidadMaxima() {

        return listVisitantes.size() < maximoVisitantes;
    }

    // toString
    @Override
    public String toString() {
        return "ZonaAtraccion{" +
                "numZona=" + numZona +
                ", nombreZona='" + nombreZona + '\'' +
                ", maximoVisitantes=" + maximoVisitantes +
                ", totalAtracciones=" + listAtracciones.size() +
                ", totalVisitantes=" + listVisitantes.size() +
                '}';
    }
}
