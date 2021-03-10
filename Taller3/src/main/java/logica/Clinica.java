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
public class Clinica extends Centro{
    private double capacidadPersonas ;
   
    public Clinica(String nombre,String direccion,Double calificacion,double Capacidad){
        super(nombre,direccion,calificacion);
        capacidadPersonas = Capacidad;
        
    }

    public double getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }
    
}
