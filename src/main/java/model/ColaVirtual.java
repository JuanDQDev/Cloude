package model;

import model.enums.TipoEntrada;

import java.util.ArrayList;

public class ColaVirtual {
    private int id;

    private ArrayList<Visitante> listaVisitantes;
    private ArrayList<Visitante> ListaVisitantesFastPass;
    private Atraccion theAtraccion;



    public boolean validarEdadMinima(Visitante visitante){
        boolean bandera=true;

        if(visitante.getEdad()< theAtraccion.getEdadMinima()){
            bandera=false;
        }
        return bandera;
    }

    public boolean validarEstaturaMinima(Visitante visitante){
        boolean bandera=true;

        if(visitante.getEstatura()<theAtraccion.getAlturaMinima()){
            bandera=false;
        }
        return bandera;
    }
    public boolean agregarVisitantesFastPass(Visitante visitante){
        boolean bandera=false;
        if(visitante.getEntrada()== TipoEntrada.FAST_PASS){
            bandera=true;
            ListaVisitantesFastPass.add(visitante);
        }
        return bandera;
    }

    public void agregarVisitantesCorriente(Visitante visitante){
        if(validarEdadMinima(visitante)&&validarEstaturaMinima(visitante)){
            listaVisitantes.add(visitante);
        }
    }

    public ColaVirtual(int id, ArrayList<Visitante> listaVisitantes, Atraccion theAtraccion, ArrayList<Visitante> listaVisitantesFastPass) {
        this.id = id;
        this.listaVisitantes = listaVisitantes;
        this.theAtraccion = theAtraccion;
        ListaVisitantesFastPass = listaVisitantesFastPass;
    }

    public ColaVirtual(ArrayList<Visitante> listaVisitantes) {
        this.listaVisitantes = listaVisitantes;
    }

    public ArrayList<Visitante> getListaVisitantres() {
        return listaVisitantes;
    }

    public void setListaVisitantres(ArrayList<Visitante> listaVisitantres) {
        this.listaVisitantes = listaVisitantres;
    }

    public ArrayList<Visitante> getListaVisitantesFastPass() {
        return ListaVisitantesFastPass;
    }

    public void setListaVisitantesFastPass(ArrayList<Visitante> listaVisitantesFastPass) {
        ListaVisitantesFastPass = listaVisitantesFastPass;
    }
}
