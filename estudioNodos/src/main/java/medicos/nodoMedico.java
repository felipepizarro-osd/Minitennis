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
public class nodoMedico {
    private Medicos medico;
    private nodoMedico next;
    
    public nodoMedico(Medicos m){
        next = null;
        medico = m;
    }
    public Medicos getMedico(){
        return medico;
    }
    public void setNext(nodoMedico nodo){
        next = nodo;
    }
    public nodoMedico getNext(){
        return next;
    }
}
