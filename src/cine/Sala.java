/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.LinkedList;

/**
 *
 * @author Asus
 */
public class Sala {
    private int nsala;
    private String proyector;
    private int nroSalidas;
    private LinkedList<Funcion> funciones=new LinkedList<>();
    private LinkedList<Butaca> butacasDisponibles=new LinkedList<>();

    public Sala() {
        for (int i = 0; i<20; i++) {
            if (i < 5) {
                butacasDisponibles.add(new Butaca(("A"+(i+1)), "Poliuretano"));
            }
            if (i >= 5 && i < 10) {
                butacasDisponibles.add(new Butaca(("B"+(i-4)), "Poliuretano"));
            }
            if (i >= 10 && i < 15) {
                butacasDisponibles.add(new Butaca(("C"+(i-9)), "Poliuretano"));
            }
            if (i >= 15) {
                butacasDisponibles.add(new Butaca(( "D"+(i-14)), "Poliuretano"));
            }
        } 
    
    }

    public Sala(int sala, String proyector, int nroAsistentes) {
        this.nsala=sala;
        this.proyector = proyector;
        this.nroSalidas = nroAsistentes;
        for (int i = 0; i<20; i++) {
            if (i < 5) {
                butacasDisponibles.add(new Butaca(("A"+(i+1)), "Poliuretano"));
            }
            if (i >= 5 && i < 10) {
                butacasDisponibles.add(new Butaca(("B"+(i-4)), "Poliuretano"));
            }
            if (i >= 10 && i < 15) {
                butacasDisponibles.add(new Butaca(("C"+(i-9)), "Poliuretano"));
            }
            if (i >= 15) {
                butacasDisponibles.add(new Butaca(( "D"+(i-14)), "Poliuretano"));
            }
        } 
    }

  

    public String getProyector() {
        return proyector;
    }

    public void setProyector(String proyector) {
        this.proyector = proyector;
    }

    public int getNroSalidas() {
        return nroSalidas;
    }

    public void setNroSalidas(int nroSalidas) {
        this.nroSalidas = nroSalidas;
    }

    public int getSala() {
        return nsala;
    }

    public void setSala(int Sala) {
        this.nsala = Sala;
    }

    public LinkedList<Butaca> getButacasDisponibles() {
        return butacasDisponibles;
    }

    public void setButacasDisponibles(LinkedList<Butaca> butacasDisponibles) {
        this.butacasDisponibles = butacasDisponibles;
    }

    public LinkedList<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(Funcion funcion) {
        funciones.add(funcion);
    }


 
    
    
}
