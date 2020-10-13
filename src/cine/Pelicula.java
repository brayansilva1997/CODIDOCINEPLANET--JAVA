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
public class Pelicula {
    private String nombre;
    private String tipo;
    private String genero;
    private String censura;
    private String duracion;
    private LinkedList<Funcion> funciones=new LinkedList<>();
    public Pelicula() {
    }

    public Pelicula(String nombre, String tipo, String genero, String censura, String duracion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
        this.censura = censura;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCensura() {
        return censura;
    }

    public void setCensura(String censura) {
        this.censura = censura;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public LinkedList<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(Funcion funcion) {
        this.funciones.add(funcion);
    }


    
    
    
}
