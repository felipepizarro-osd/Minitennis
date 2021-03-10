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
public class ListaDobleNexo {
    private Nodo primero;
    private Nodo ultimo;
    
    public ListaDobleNexo() {
        primero = null;
        ultimo = null;
    }
    public boolean isEmpty(){
        return primero == null;
    }
    public boolean SetCiudad(String key,String ciudad){
        Nodo current = primero;
        while(current != null && current.getDato().getNombre() != key){
           current = current.getNext();
        }if(current != null){
            current.getDato().setCiudad(ciudad);
            return true;
        }else{
            return false;
        }
    }
    public void insertarPrimer(Centro centro){
        Nodo nodoNuevo = new Nodo(centro);
        if(isEmpty()){
            ultimo = nodoNuevo;
        }else{
            primero.setPrevio(nodoNuevo);
            
        }
        nodoNuevo.setNext(primero);
        primero = nodoNuevo;
               
    }
    public void insetarUltimo(Centro centro){
        Nodo nodo = new Nodo(centro);
        if(isEmpty()){
            primero = nodo;
        }else{
            ultimo.setNext(nodo);
            nodo.setPrevio(ultimo);
        }
        ultimo = nodo;
    }
    public boolean eliminarPrimer(){
        if(!this.isEmpty()){
            if(primero.getNext() == null){
                ultimo = null;
            }else{
                primero.getNext().setPrevio(null);
            }
            primero = primero.getNext();
            return true;
        }else{
            return false;
        }
    }
    public boolean eliminarUltimo(){
        if (!this.isEmpty()){
            if(primero.getNext() == null){
                primero = null;
            }else{
                ultimo.getPrevio().setNext(null);
            }
            ultimo = ultimo.getPrevio();
            return true;
        }else{
            return false;
        }
    }
    public boolean insertarDespues(Centro centro,Centro nuevoCentro){
        Nodo current = primero;
        while(current != null && current.getDato() != centro){
            current = current.getNext();
        }if(current != null){
            Nodo nodoNuevo = new Nodo(nuevoCentro);
            if(current == ultimo){
                nodoNuevo.setNext(null);
            }else{
                nodoNuevo.setNext(current.getNext());
                current.getNext().setPrevio(nodoNuevo);
            }
            nodoNuevo.setPrevio(current);
            current.setNext(nodoNuevo);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean eliminarClave(Centro centroClave){
        Nodo current = primero;
        while(current != null && current.getDato() != centroClave){
            current = current.getNext();
        }if(current != null){
            if (current == primero){
                primero = current.getNext();
            }else{
                current.getPrevio().setNext(current.getNext());
            }if(current == ultimo){
                ultimo = current.getPrevio();
            }else{
                current.getNext().setPrevio(current.getPrevio());
            }
            return true;
        }else{
            return false;
        }
    }
    
}
