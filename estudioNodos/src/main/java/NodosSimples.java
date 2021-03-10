/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class NodosSimples {
    public static void desplegarLista(LinkList lista){
        Nodo  current = lista.getFirst();
        while (current != null){
            System.out.println(current.getDato());
            current = current.getNext();
        }
        System.out.println("");
    }
    public static void main(String [] args){
        LinkList lista = new LinkList();
        lista.insertarPrimero(45);
        lista.insertarPrimero(30);
        lista.insertarPrimero(2);
        lista.insertarPrimero(5);
        lista.insertarPrimero(87);
        
        desplegarLista(lista);
        
        boolean encontrado = lista.Encontrar(17);
        if (encontrado){
            System.out.println("Nodo encontrado");
        }else{
            System.out.println("Nodo no Encontrado");
        }
        boolean eliminado = lista.eliminar(45);
        if (eliminado){
            System.out.println("Nodo eliminado");
            
        }else{
            System.out.println("No deleteable");
        }
        desplegarLista(lista);
    }
}
