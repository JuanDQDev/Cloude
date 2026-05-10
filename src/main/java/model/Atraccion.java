package model;

import model.enums.TipoEntrada;

import java.util.ArrayList;

public class Atraccion {

    private String id;
    private String nombre;
    private int capacidadCiclo;
    private double alturaMinima;
    private int edadMinima;
    private int tiempoEspera;
    private double costoAdicional;

    //relaciones
    private ArrayList<Operador> listOperadores;
    private ColaVirtual theColaVirtual;
    private TipoEntrada entrada;

    public Atraccion(String id, String nombre, int capacidadCiclo, double alturaMinima, int edadMinima, int tiempoEspera, double costoAdicional, ArrayList<Operador> listOperadores, ColaVirtual theColaVirtual, TipoEntrada entrada) {
        this.id = id;
        this.nombre = nombre;
        this.capacidadCiclo = capacidadCiclo;
        this.alturaMinima = alturaMinima;
        this.edadMinima = edadMinima;
        this.tiempoEspera = tiempoEspera;
        this.costoAdicional = costoAdicional;
        this.listOperadores = listOperadores;
        this.theColaVirtual = theColaVirtual;
        this.entrada = entrada;
    }

    public boolean validarEdadMinima(Visitante visitante){
        boolean bandera=true;

            if(visitante.getEdad()<edadMinima){
                bandera=false;
            }
            return bandera;
    }

    public boolean validarEstaturaMinima(Visitante visitante){
        boolean bandera=true;

        if(visitante.getEstatura()<alturaMinima){
            bandera=false;
        }
        return bandera;
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

    public ColaVirtual getTheColaVirtual() {
        return theColaVirtual;
    }

    public void setTheColaVirtual(ColaVirtual theColaVirtual) {
        this.theColaVirtual = theColaVirtual;
    }

    public TipoEntrada getEntrada() {
        return entrada;
    }

    public void setEntrada(TipoEntrada entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "Atraccion{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", capacidadCiclo=" + capacidadCiclo +
                ", alturaMinima=" + alturaMinima +
                ", tiempoEspera=" + tiempoEspera +
                '}';
    }
}
