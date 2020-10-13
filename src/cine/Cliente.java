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
public class Cliente {
    protected String nombre;
    protected String apellido;
    protected String Email;
    protected String nTarjeta;
    protected int CVC;
    protected LinkedList<Entrada> boleta=new LinkedList<>();
    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String Email, String nTarjeta, int CVC) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Email = Email;
        this.nTarjeta = nTarjeta;
        this.CVC = CVC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getnTarjeta() {
        return nTarjeta;
    }

    public void setnTarjeta(String nTarjeta) {
        this.nTarjeta = nTarjeta;
    }

    public int getCVC() {
        return CVC;
    }

    public void setCVC(int CVC) {
        this.CVC = CVC;
    }

    public LinkedList<Entrada> getBoleta() {
        return boleta;
    }

    public void setBoleta(LinkedList<Entrada> boleta) {
        this.boleta = boleta;
    }
    
    public void comprarBoleta(Entrada boleta) {
        this.boleta.add(boleta);
      
    }
   
    
}
