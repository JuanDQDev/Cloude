package model;

import java.util.ArrayList;

public class ParqueAtracciones {

    private String nit;
    private String nombre;
    private String direccion;
    private int capacidadMaxima;

    //relaciones
    private ArrayList<Atraccion> listAtracciones;
    private ArrayList<Persona> listPersonas;
    private ArrayList<Visitante> listVisitante;

    public ParqueAtracciones(String nit, String nombre, String direccion, int capacidadMaxima, ArrayList<Atraccion> listAtracciones, ArrayList<Visitante> listVisitante) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidadMaxima = capacidadMaxima;
        this.listAtracciones = listAtracciones;
        this.listVisitante = listVisitante;
    }

    public ParqueAtracciones(String nit, String nombre, String direccion, ArrayList<Atraccion> listAtracciones, ArrayList<Persona> listPersonas) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        listAtracciones = new ArrayList<>();
        listPersonas = new ArrayList<>();
    }

    public boolean validarAforoMaximoParque(){
        boolean bandera=true;
            if(listVisitante.size()>=capacidadMaxima){
                bandera= false;
            }
            return bandera;
    }


    public boolean validarAforoMaximoZonaParque(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "ParqueAtracciones{" +
                "nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public ArrayList<Atraccion> getListAtracciones() {
        return listAtracciones;
    }

    public void setListAtracciones(ArrayList<Atraccion> listAtracciones) {
        this.listAtracciones = listAtracciones;
    }

    public ArrayList<Persona> getListPersonas() {
        return listPersonas;
    }

    public void setListPersonas(ArrayList<Persona> listPersonas) {
        this.listPersonas = listPersonas;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public ArrayList<Visitante> getListVisitante() {
        return listVisitante;
    }

    public void setListVisitante(ArrayList<Visitante> listVisitante) {
        this.listVisitante = listVisitante;
    }
}
