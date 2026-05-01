package model;

public class Visitante extends Persona {

    private double saldoVirtual;

    public Visitante(String nombre, String edad, String cedula, String estatura) {
        super(nombre, edad, cedula, estatura);
    }

    public double getSaldoVirtual() {
        return saldoVirtual;
    }

    public void setSaldoVirtual(double saldoVirtual) {
        this.saldoVirtual = saldoVirtual;
    }
}
