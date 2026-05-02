package model;

import model.enums.TipoEntrada;

import java.util.ArrayList;

public class Visitante extends Persona{

    private int edad;
    private double estatura;
    private double saldoVirtual;
    private String foto;

    private ArrayList<Atraccion> atraccionesFavoritas;
    private TipoEntrada entrada;

    public Visitante(String nombre, String identificacion, int edad, double estatura, double saldoVirtual, String foto) {
        super(nombre, identificacion);
        this.edad = edad;
        this.estatura = estatura;
        this.saldoVirtual = saldoVirtual;
        this.foto = foto;
    }

    public Visitante(String nombre, String identificacion, int edad, double estatura, String foto, double saldoVirtual, ArrayList<Atraccion> atraccionesFavoritas, TipoEntrada entrada) {
        super(nombre, identificacion);
        this.edad = edad;
        this.estatura = estatura;
        this.foto = foto;
        this.saldoVirtual = saldoVirtual;
        this.atraccionesFavoritas = atraccionesFavoritas;
        this.entrada = entrada;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldoVirtual() {
        return saldoVirtual;
    }

    public void setSaldoVirtual(double saldoVirtual) {
        this.saldoVirtual = saldoVirtual;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public TipoEntrada getEntrada() {
        return entrada;
    }

    public void setEntrada(TipoEntrada entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "edad=" + edad +
                ", estatura=" + estatura +
                ", saldoVirtual=" + saldoVirtual +
                ", foto='" + foto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                '}';
    }
}
