package model;

import java.util.ArrayList;

public class ParqueAtracciones implements IValidable, IGestionanbleEmpleados {
        //atributos
    private String nit;
    private String nombre;
    private String direccion;
    private int capacidadMaxima;

    //relaciones
    private ArrayList<Atraccion> listAtracciones;
    private ArrayList<Administrador> listAdministradores;
    private ArrayList<Visitante> listVisitantes;
        //constructor
    public ParqueAtracciones(String nit, String nombre, String direccion, int capacidadMaxima, ArrayList<Atraccion> listAtracciones, ArrayList<Administrador> listAdministradores, ArrayList<Visitante> listVisitantes) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidadMaxima = capacidadMaxima;
        listAtracciones = new ArrayList<>();
        listAdministradores = new ArrayList<>();
        listVisitantes = new ArrayList<>();
    }

    @Override
    public boolean validarCapacidadMaxima(){
        boolean bandera=true;
        if(listVisitantes.size()>=capacidadMaxima){
            bandera= false;
        }
        return bandera;
    }

    public int buscarAdminByIdentificacion(String indentificacion) {
        for(int i=0;i< listAdministradores.size();i++){
            if(listAdministradores.get(i).getIdentificacion().equals(indentificacion)){
                return i;
            }
        }
        return -1;
    }

    public int buscarVisitanteByIdentificacion(String indentificacion) {
        for(int i=0;i< listVisitantes.size();i++){
            if(listVisitantes.get(i).getIdentificacion().equals(indentificacion)){
                return i;
            }
        }
        return -1;
    }
    //--CRUD ADMINISTRADOR/VISITANTE--

    //creacion de agregar Admin
    @Override
    public boolean agregarPersona(Persona persona) {
        if(persona instanceof Administrador){
            if (buscarAdminByIdentificacion(persona.getIdentificacion()) == -1) {
                listAdministradores.add((Administrador)persona);
                return true;
            }
        }else if(persona instanceof Visitante){
            if (buscarVisitanteByIdentificacion(persona.getIdentificacion()) == -1) {
                listVisitantes.add((Visitante) persona);
                return true;
            }
        }
        return false;
    }
    //creacion de actualizar
    @Override
    public boolean actualizarPersona(Persona persona) {
        if(persona instanceof Administrador){
            for(int i=0;i<listAdministradores.size();i++){
                if (buscarAdminByIdentificacion(persona.getIdentificacion())==i) {
                listAdministradores.get(i).setIdentificacion(persona.getIdentificacion());
                listAdministradores.get(i).setNombre(persona.getNombre());
                    listAdministradores.get(i).setSueldo(((Administrador) persona).getSueldo());
                return true;
                }
            }
        }else if(persona instanceof Visitante){
            for(int i=0;i<listVisitantes.size();i++){
                if (buscarVisitanteByIdentificacion(persona.getIdentificacion())==i) {
                    listVisitantes.get(i).setIdentificacion(persona.getIdentificacion());
                    listVisitantes.get(i).setNombre(persona.getNombre());
                    listVisitantes.get(i).setEdad(((Visitante)persona).getEdad());
                    listVisitantes.get(i).setEstatura(((Visitante)persona).getEstatura());
                    listVisitantes.get(i).setSaldoVirtual(((Visitante)persona).getSaldoVirtual());
                    listVisitantes.get(i).setFoto(((Visitante)persona).getFoto());
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean eliminarPersona(Persona persona) {
        if(persona instanceof Administrador){
            if (buscarAdminByIdentificacion(persona.getIdentificacion()) != -1) {
                listAdministradores.remove(buscarAdminByIdentificacion(persona.getIdentificacion()));
                return true;
            }
        } else if(persona instanceof Visitante){
            if (buscarVisitanteByIdentificacion(persona.getIdentificacion()) != -1) {
                listVisitantes.remove(buscarVisitanteByIdentificacion(persona.getIdentificacion()));
                return true;
            }
        }
        return false;
    }

    @Override
    public String mostrarPersona(Persona persona) {
        String mensaje ="";
        if(persona instanceof Administrador){
            for(int i=0;i<listAdministradores.size();i++){
                if (buscarAdminByIdentificacion(persona.getIdentificacion())==i) {
                    mensaje=listAdministradores.get(i).toString();
                }
            }
        }else if(persona instanceof Visitante){
            for(int i=0;i<listAdministradores.size();i++){
                if (buscarVisitanteByIdentificacion(persona.getIdentificacion())==i) {
                    mensaje=listVisitantes.get(i).toString();
                }
            }
        }
        return mensaje;
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

    public ArrayList<Atraccion> getListAtracciones() {
        return listAtracciones;
    }

    public void setListAtracciones(ArrayList<Atraccion> listAtracciones) {
        this.listAtracciones = listAtracciones;
    }


    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public ArrayList<Visitante> getListVisitantes() {
        return listVisitantes;
    }

    public void setListVisitantes(ArrayList<Visitante> listVisitantes) {
        this.listVisitantes = listVisitantes;
    }

    @Override
    public String toString() {
        return "ParqueAtracciones{" +
                "nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
