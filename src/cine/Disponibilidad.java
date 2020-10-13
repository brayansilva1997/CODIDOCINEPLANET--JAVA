/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import cine.Butaca;
import cine.Funcion;

/**
 *
 * @author Asus
 */
public class Disponibilidad {
    private Funcion funcion;
    private Butaca butaca;
    private int disponible=1;
    public Disponibilidad() {
    }

    public Disponibilidad(Funcion funcion, Butaca butaca) {
        this.funcion = funcion;
        this.butaca = butaca;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public Butaca getButaca() {
        return butaca;
    }

    public void setButaca(Butaca butaca) {
        this.butaca = butaca;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }


    
}
