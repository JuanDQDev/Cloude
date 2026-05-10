package model;

import java.util.ArrayList;

public record ZonaAtraccion(int numZona, String nombreZona, int maximoVisitantes, ArrayList<Atraccion> listAtracciones, ArrayList<Visitante> listVisitantes) implements IValidable{

    @Override
    public boolean validarCapacidadMaxima(){
        boolean bandera=true;
        if(listAtracciones.size()>=maximoVisitantes){
            bandera= false;
        }
        return bandera;
    }



}
