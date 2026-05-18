package model;

import java.util.ArrayList;

public class Administrador extends Persona implements IGestionanbleEmpleados {

    private double sueldo;

    //relaciones
    private ArrayList<Operador> listOperadores;
    private ArrayList<Atraccion> listAtracciones;
    private ArrayList<ZonaAtraccion> listZonas;
    private ReporteFinal theReporte;

    public Administrador(String nombre, String identificacion, double sueldo, ArrayList<Operador> listOperadores, ArrayList<Atraccion> listAtracciones, ArrayList<ZonaAtraccion> listZonas, ReporteFinal theReporte) {
        super(nombre, identificacion);
        this.sueldo = sueldo;
        this.listOperadores = listOperadores;
        this.listAtracciones = listAtracciones;
        this.listZonas = listZonas;
        this.theReporte = theReporte;
    }

    @Override
    public int buscarByIdentificacion(String indentificacion) {
        for (int i = 0; i < listOperadores.size(); i++) {
            if (listOperadores.get(i).getIdentificacion().equals(indentificacion)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean agregarPersona(Persona operador) {
        if (operador instanceof Operador) {
            if (buscarByIdentificacion(operador.getIdentificacion()) == -1) {
                listOperadores.add((Operador) operador);
                return true;
            }
        }
        return false;
    }

        @Override
        public boolean actualizarPersona (Persona operador){
            if (operador instanceof Operador) {
                for (int i = 0; i < listOperadores.size(); i++) {
                    if (buscarByIdentificacion(operador.getIdentificacion()) == i) {
                        listOperadores.get(i).setIdentificacion(operador.getIdentificacion());
                        listOperadores.get(i).setNombre(operador.getNombre());
                        listOperadores.get(i).setSueldo(((Operador) operador).getSueldo());
                        return true;
                    }
                }
            }
            return false;
        }

        @Override
        public boolean eliminarPersona (Persona operador){
            if (operador instanceof Administrador) {
                if (buscarByIdentificacion(operador.getIdentificacion()) != -1) {
                    listOperadores.remove(buscarByIdentificacion(operador.getIdentificacion()));
                    return true;
                }
            }
            return false;
        }

        @Override
        public String mostrarPersona (Persona operador){
            String mensaje = "";
            if (operador instanceof Operador) {
                for (int i = 0; i < listOperadores.size(); i++) {
                    if (buscarByIdentificacion(operador.getIdentificacion()) == i) {
                        mensaje = listOperadores.get(i).toString();
                    }
                }
            }
            return mensaje;
        }

        public boolean crearZonaAtraccion(ZonaAtraccion zona){

        for(ZonaAtraccion zonaAsignar:listZonas){
                if(zonaAsignar.getNumZona().equals(zona.getNumZona())){
                    return false;
                }
            }
            listZonas.add(zona);
            return true;
        }

        public boolean actualizarZona(ZonaAtraccion zona, String numZona, String nombreZona, int maximoVisitantes){
            for(ZonaAtraccion zonaAsignar:listZonas){
                if(zonaAsignar.getNumZona().equals(zona.getNumZona())){
                    zonaAsignar.setNumZona(numZona);
                    zonaAsignar.setNombreZona(nombreZona);
                    zonaAsignar.setMaximoVisitantes(maximoVisitantes);
                    return true;
                }
            }
            return false;
        }

        public boolean eliminarZona(ZonaAtraccion zona){
            for(int i=0;i<listZonas.size();i++){
                if(listZonas.get(i).getNumZona().equals(zona.getNumZona())){
                    listZonas.remove(i);
                    return true;
                }
            }
            return false;
        }
        public ZonaAtraccion mostrarZona(ZonaAtraccion zona) {
            for (ZonaAtraccion zonaAsignar : listZonas) {
                if (zonaAsignar.getNumZona().equals(zona.getNumZona())) {
                    return zona;
                }
            }
            return null;
        }


        public double getSueldo () {
            return sueldo;
        }

        public void setSueldo ( double sueldo){
            this.sueldo = sueldo;
        }

        public ArrayList<Operador> getListOperadores () {
            return listOperadores;
        }

        public void setListOperadores (ArrayList < Operador > listOperadores) {
            this.listOperadores = listOperadores;
        }

        public ArrayList<Atraccion> getListAtracciones () {
            return listAtracciones;
        }

        public void setListAtracciones (ArrayList < Atraccion > listAtracciones) {
            this.listAtracciones = listAtracciones;
        }

        public ArrayList<ZonaAtraccion> getListZonas () {
            return listZonas;
        }

        public void setListZonas (ArrayList < ZonaAtraccion > listZonas) {
            this.listZonas = listZonas;
        }

        public ReporteFinal getTheReporte () {
            return theReporte;
        }

        public void setTheReporte (ReporteFinal theReporte){
            this.theReporte = theReporte;
        }

        @Override
        public String toString () {
            return "Administrador{" +
                    "sueldo=" + sueldo +
                    ", listOperadores=" + listOperadores +
                    ", listAtracciones=" + listAtracciones +
                    ", listZonas=" + listZonas +
                    ", theReporte=" + theReporte +
                    '}';
        }
    }

