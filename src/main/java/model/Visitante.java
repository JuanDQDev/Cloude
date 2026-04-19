package model;

public class Visitante extends Persona{

    private int edad;
    private double estatura;
    private double saldoVirtual;
    private String foto;

    public Visitante(String nombre, String identificacion, int edad, double estatura, double saldoVirtual, String foto) {
        super(nombre, identificacion);
        this.edad = edad;
        this.estatura = estatura;
        this.saldoVirtual = saldoVirtual;
        this.foto = foto;
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
