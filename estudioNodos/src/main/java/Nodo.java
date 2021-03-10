/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Nodo {
    private int dato;
    private Nodo next;
    
    public Nodo(int ndata){
        dato = ndata;
        next = null;
        
    }
    public int getDato(){
        return dato;
    }
    public Nodo getNext(){
        return next;
    }
    public void setNext(Nodo nodo){
        next = nodo;
    }
    
}
