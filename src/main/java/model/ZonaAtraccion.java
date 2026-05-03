package model;

import java.util.ArrayList;

public record ZonaAtraccion(int numZona, String nombreZona, int maximoVisitantes, ArrayList<Atraccion> listAtracciones, ArrayList<Visitante> listVisitantes) {

}
