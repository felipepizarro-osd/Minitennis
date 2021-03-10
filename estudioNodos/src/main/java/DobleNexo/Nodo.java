/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DobleNexo;

/**
 *
 * @author felip
 */
public class Nodo {
    private int dato;
    private Nodo next;
    private Nodo pre;
    
    public Nodo(int data){
        dato = data;
        next = null;
        pre = null;
        
    }
    public int getDato(){
        return dato;
    }
    public Nodo getNext(){
        return next;
        
    }
    public Nodo getPre(){
        return pre;
        
    }
    public void setNext(Nodo nodo){
        next = nodo;
        
    }  
    public void setPre(Nodo nodo){
        pre = nodo;
    }
    
    
    
}
