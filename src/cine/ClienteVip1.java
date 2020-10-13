/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import cine.Entrada;
import cine.Cliente;
import java.util.LinkedList;

/**
 *
 * @author Asus
 */
public class ClienteVip1 extends Cliente{
    private double descuento=0.3;
    

    public ClienteVip1() {
    }
    
    public ClienteVip1(int descuento) {
        this.descuento = descuento;
    }

    public ClienteVip1( String nombre, String apellido, String Email, String nTarjeta, int CVC) {
        super(nombre, apellido, Email, nTarjeta, CVC);
        
        
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public void comprarBoleta(Entrada boleta){
        boleta.setMontoTotal((int)(boleta.getMontoTotal()-boleta.getMontoTotal()*descuento));
        this.boleta.add(boleta);
        
    }

    
    
}
