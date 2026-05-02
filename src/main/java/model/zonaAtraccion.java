package model;

import java.util.ArrayList;

public class zonaAtraccion {
    private int numZona;
    private String nombreZona;
    private int maximoVisitantes;

    private ArrayList<Atraccion> listaAtracciones;
    private ArrayList<Operador> listaOperadores;

    public zonaAtraccion(int numZona, String nombreZona, ArrayList<Atraccion> listaAtracciones, ArrayList<Operador> listaOperadores) {
        this.numZona = numZona;
        this.nombreZona = nombreZona;
        listaAtracciones = new ArrayList<>();
        listaOperadores = new ArrayList<>();
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

    public int getMaximoVisitantes() {
        return maximoVisitantes;
    }

    public void setMaximoVisitantes(int maximoVisitantes) {
        this.maximoVisitantes = maximoVisitantes;
    }

    public ArrayList<Operador> getListaOperadores() {
        return listaOperadores;
    }

    public void setListaOperadores(ArrayList<Operador> listaOperadores) {
        this.listaOperadores = listaOperadores;
    }


    @Override
    public String toString() {
        return "zonaAtraccion{" +
                "numZona=" + numZona +
                ", nombreZona='" + nombreZona + '\'' +
                ", maximoVisitantes=" + maximoVisitantes +
                ", listaAtracciones=" + listaAtracciones +
                ", listaOperadores=" + listaOperadores +
                '}';
    }
}
