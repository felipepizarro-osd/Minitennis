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
public class app {
    public static void desplegarAdelante(ListaDoble lista){
        Nodo current = lista.getFirst();
        while (current != null){
            System.out.println(current.getDato());
            current = current.getNext();
            
        }System.out.println("");
    }
    public static void desplegarAtras(ListaDoble lista){
        Nodo current = lista.getLast();
        while (current != null){
            System.out.println(current.getDato());
            current = current.getPre();
        }
        System.out.println("");
    
    }
    
    public static void main (String[] args){
        ListaDoble lista = new ListaDoble();
        lista.insertarPrimer(10);
        lista.insertarPrimer(22);
        lista.insertarPrimer(40);
        
        desplegarAdelante(lista);
        boolean delete =    lista.eliminarUltimo();
        desplegarAdelante(lista);

    }
}
