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
public class Butaca {
    private String asiento;
    private LinkedList <Disponibilidad> disponible=new LinkedList<Disponibilidad>();
    private String Material;
    public Butaca() {
    }

    public Butaca(String asiento, String Material) {
        this.asiento = asiento;
        this.Material = Material;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setnAsiento(String nAsiento) {
        this.asiento = asiento;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public LinkedList<Disponibilidad> getDisponible() {
        return disponible;
    }

    public void setDisponible(Disponibilidad disponible) {
        this.disponible.add(disponible);
    }

    

   

  
    
}
