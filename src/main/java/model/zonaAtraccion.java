package model;

import java.util.ArrayList;

public class zonaAtraccion {
    private int numZona;
    private String nombreZona;
    private int maximoVisitantes;

    private ArrayList<Atraccion> listaAtracciones;

    public zonaAtraccion(int numZona, String nombreZona, ArrayList<Atraccion> listaAtracciones) {
        this.numZona = numZona;
        this.nombreZona = nombreZona;
        listaAtracciones = new ArrayList<>();
    }

    public int getNumZona() {
        return numZona;
    }

    public void setNumZona(int numZona) {
        this.numZona = numZona;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public ArrayList<Atraccion> getListaAtracciones() {
        return listaAtracciones;
    }

    public void setListaAtracciones(ArrayList<Atraccion> listaAtracciones) {
        this.listaAtracciones = listaAtracciones;
    }

    @Override
    public String toString() {
        return "zonaAtraccion{" +
                "numZona=" + numZona +
                ", nombreZona='" + nombreZona + '\'' +
                ", listaAtracciones=" + listaAtracciones +
                '}';
    }
}
