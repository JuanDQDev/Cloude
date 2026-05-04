package model;

import javafx.event.ActionEvent;

import java.util.ArrayList;

public class Atraccion extends ActionEvent {

    private String id;
    private String nombre;
    private int capacidadCiclo;
    private double alturaMinima;
    private int edadMinima;
    private int tiempoEspera;
    private double costoAdicional;
    private String imagen;

    //relaciones
    private ArrayList<Operador> listOperadores;
    private ArrayList<Visitante> listVisitantes;

    public Atraccion(String id, String nombre, int capacidadCiclo, double alturaMinima, int edadMinima, int tiempoEspera, double costoAdicional,String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.capacidadCiclo = capacidadCiclo;
        this.alturaMinima = alturaMinima;
        this.edadMinima = edadMinima;
        this.tiempoEspera = tiempoEspera;
        this.costoAdicional = costoAdicional;
        this.imagen=imagen;
        listOperadores = new ArrayList<>();
        listVisitantes = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadCiclo() {
        return capacidadCiclo;
    }

    public void setCapacidadCiclo(int capacidadCiclo) {
        this.capacidadCiclo = capacidadCiclo;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public ArrayList<Operador> getListOperadores() {
        return listOperadores;
    }

    public void setListOperadores(ArrayList<Operador> listOperadores) {
        this.listOperadores = listOperadores;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public double getCostoAdicional() {
        return costoAdicional;
    }

    public void setCostoAdicional(double costoAdicional) {
        this.costoAdicional = costoAdicional;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public ArrayList<Visitante> getListVisitantes() {
        return listVisitantes;
    }

    public void setListVisitantes(ArrayList<Visitante> listVisitantes) {
        this.listVisitantes = listVisitantes;
    }

    @Override
    public String toString() {
        return "Atraccion{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", capacidadCiclo=" + capacidadCiclo +
                ", alturaMinima=" + alturaMinima +
                ", tiempoEspera=" + tiempoEspera +
                ", costoAdicional=" +costoAdicional+
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
