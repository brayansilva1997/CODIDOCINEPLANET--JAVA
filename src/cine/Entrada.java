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
public class Entrada {
    private Funcion funcion;
    private Cliente cliente;
    private ClienteVip1 clientevip1=new ClienteVip1();
    private LinkedList <String> asientos=new LinkedList<>();
    private int montoTotal;

    public Entrada() {
    }

    public Entrada(Funcion funcion,Cliente cliente,int montoTotal) {
        this.funcion=funcion;
        this.cliente=cliente;
       
        this.montoTotal=montoTotal;
    }
    public Entrada(Funcion funcion,ClienteVip1 cliente,int montoTotal) {
        this.funcion=funcion;
        this.clientevip1=cliente;
        this.montoTotal=montoTotal;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



    public LinkedList<String> getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos.add(asientos);
    }


    public ClienteVip1 getClientevip1() {
        return clientevip1;
    }

    public void setClientevip1(ClienteVip1 clientevip1) {
        this.clientevip1 = clientevip1;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    
}
