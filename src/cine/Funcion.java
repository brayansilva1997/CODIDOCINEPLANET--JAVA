/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Asus
 */
public class Funcion {
   private LinkedList <Entrada> boletas=new LinkedList<>();
    private LinkedList <Disponibilidad> butacasDisponibles=new LinkedList<>();
   
    private Pelicula pelicula;
    private Sala sala;
    private int dia;
    private int mes;
    private int anio;
    private String hora;
    private int precio;
    public Funcion() {
  
    }

    public Funcion(int dia, int mes, int anio, String hora) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.hora = hora;

    }

    public Funcion(Pelicula pelicula, Sala sala, int dia, int mes, int anio, String hora,int precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.hora = hora;
        this.precio=precio;
  
    }

    public LinkedList<Entrada> getBoletas() {
        return boletas;
    }

    public void setBoletas(LinkedList<Entrada> boletas) {
        this.boletas = boletas;
    }

  

    public void setBoletas(Entrada boletas) {
        this.boletas.add(boletas);
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public LinkedList<Disponibilidad> getButacasDisponibles() {
        return butacasDisponibles;
    }

    public void setButacasDisponibles(Disponibilidad butacasDisponibles) {
        this.butacasDisponibles.add(butacasDisponibles);
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

   
    
 
    
    
    
    
}
