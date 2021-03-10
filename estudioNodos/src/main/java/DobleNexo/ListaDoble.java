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
public class ListaDoble {
    private Nodo first;
    private Nodo last;
    public ListaDoble(){
        first = null;
        last = null;
        
    }
    public Nodo getFirst(){
        return first;
    }
    public Nodo getLast(){
        return last;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public void insertarPrimer(int dato){
        Nodo nodo = new Nodo(dato);
        if (isEmpty()){
            last = nodo;
        }else{
            first.setPre(nodo);
        }
        nodo.setNext(first);
        first = nodo;
    }
    public void insertarUltimo(int dato){
        Nodo nodo = new Nodo(dato);
        if (isEmpty()){
            first = nodo;
        }else{
            last.setNext(nodo);
            nodo.setPre(last);
        }
        last = nodo;
       
    }
    public boolean eliminarPrimero(){
        if(!this.isEmpty()){
            if (first.getNext()== null){
                last = null;
                
            }else{
                first.getNext().setPre(null);
            }first = first.getNext();
            return true;
        }else{
            return false;
        }
    }
    public boolean eliminarUltimo(){
        if(!this.isEmpty()){
            if (first.getNext() == null){
                first = null;
            }else{
                last.getPre().setNext(null);
            }
            last = last.getPre();
            return true;
        }else{
            return false;
        }
    }
    public boolean insertarDespues(int dato,int ref){
        Nodo current = first;
        while (current!= null && current.getDato() != ref){
            current = current.getNext();
        }if (current != null){
            Nodo nodo = new Nodo(dato);
            if (current == last){
                nodo.setNext(null);
                last = nodo;
            }else{
                nodo.setNext(current.getNext());
                current.getNext().setPre(nodo);
            }
            nodo.setPre(current);
            current.setNext(nodo);
            return true;
        }else{
            return false;
        }
        
    }
    public boolean eliminarClave(int clave){
        Nodo current = first;
        while(current != null && current.getDato() != clave){
            current= current.getNext();
        }if (current != null){
            if (current == first){
                first = current.getNext();
            }else{
                current.getPre().setNext(current.getNext());
            }if(current == last){
                last = current.getPre();
            }else{
                current.getNext().setPre(current.getPre());
            }
            return true;
        }else{return false;}
    }
}
