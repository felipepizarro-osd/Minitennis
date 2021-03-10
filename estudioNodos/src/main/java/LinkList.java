/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class LinkList {
    private Nodo first;
    public LinkList(){
        first = null;
    }

    public Nodo getFirst() {
        return first;
    }
    
    public boolean Encontrar(int key){
        //recorrer
        Nodo current = first;
        while(current != null && current.getDato() != key){
            current = current.getNext();
        }
        if(current != null){
            //lo encontro
            return true;
        }else{
            return false;
        }
                
        
    }
    public void insertarPrimero(int dato){
        Nodo nodoN = new Nodo(dato);
        nodoN.setNext(first);
        first = nodoN;
    }
    public boolean eliminar(int key){
        Nodo current = first;
        Nodo previo = first;
        while (current != null && current.getDato() != key){
            previo = current;
            current = current.getNext();
        }if (current != null){
            if(current == first){
                first = first.getNext();
            }else{
                previo.setNext(current.getNext());
            }
            return true;
        }else{
            return false;
        }
    }
}
