/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicos;

/**
 *
 * @author felip
 */
public class ListaMedicos {
    private nodoMedico first;
    public ListaMedicos(){
        first = null;
    }
    public void insertarPrimer(Medicos m){
        nodoMedico nodo = new nodoMedico(m);
        nodo.setNext(first);
        first = nodo;
    }
    public nodoMedico getFirst(){
        return first;
        
    }
    public String toString(){
        nodoMedico actual = first;
        String salida = "";
        while(actual != null){
            Medicos med = actual.getMedico();
            salida = salida + "nombre: "+med.getNombre()+ "rut: "+med.getRut();
            actual = actual.getNext();
            
        }
        return salida;
    }
}
