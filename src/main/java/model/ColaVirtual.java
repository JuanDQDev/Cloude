package model;

import model.enums.EstadoAtraccion;
import model.enums.TipoEntrada;

import java.util.ArrayList;

import static model.enums.TipoEntrada.GENERAL;

public class ColaVirtual {
    private int id;

    private ArrayList<Visitante> listaVisitantes;
    private ArrayList<Visitante> ListaVisitantesFastPass;
    private Atraccion theAtraccion;


    public boolean validarEdadMinima(Visitante visitante){
        boolean bandera=true;

        if(visitante.getEdad()>0&&visitante.getEdad()< theAtraccion.getEdadMinima()){
            bandera=false;
        }
        return bandera;
    }

    public boolean validarEstaturaMinima(Visitante visitante){
        boolean bandera=true;

        if(visitante.getEstatura()>0&&visitante.getEstatura()>theAtraccion.getAlturaMinima()){
            bandera=false;
        }
        return bandera;
    }

    //validar entrada saldoVirtual
    public boolean validarSaldoVirtual(Visitante visitante){
        if(theAtraccion.getCostoAdicional()>0){
            if(visitante.getEntrada()==GENERAL&&visitante.getSaldoVirtual()>theAtraccion.getCostoAdicional()){
                visitante.setSaldoVirtual(visitante.getSaldoVirtual()-theAtraccion.getCostoAdicional());
                return true;
            }
        }
        return false;
    }

    public void agregarVisitantes(Visitante visitante){
        if(validarEdadMinima(visitante)&&validarEstaturaMinima(visitante)&&theAtraccion.getEstadoAtraccion()== EstadoAtraccion.ACTIVA){
                if(visitante.getEntrada()== TipoEntrada.FAST_PASS){
                    ListaVisitantesFastPass.add(visitante);
                }else if(validarSaldoVirtual(visitante)) {
                    listaVisitantes.add(visitante);
                }else{
                    listaVisitantes.add(visitante);
                }
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

    public ArrayList<Visitante> getListaVisitantes() {
        return listaVisitantes;
    }

    public void setListaVisitantes(ArrayList<Visitante> listaVisitantes) {
        this.listaVisitantes = listaVisitantes;
    }

    public ArrayList<Visitante> getListaVisitantesFastPass() {
        return ListaVisitantesFastPass;
    }

    public void setListaVisitantesFastPass(ArrayList<Visitante> listaVisitantesFastPass) {
        ListaVisitantesFastPass = listaVisitantesFastPass;
    }
}
