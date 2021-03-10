/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author felip
 */
class Nodo {
    private Centro Data;
    private Nodo siguiente;
    private Nodo previo;
    public Nodo (Centro centro){
        Data = centro;
        siguiente = null;
        previo = null;
    }
    public Centro getDato(){
        return Data; 
    }
    public Nodo getNext(){
        return siguiente;
    }
    public Nodo getPrevio(){
        return previo;
    }
    public void setNext(Nodo nodo){
        siguiente = nodo;
    }
    public void setPrevio(Nodo nodo){
        previo = nodo;
    }
}
