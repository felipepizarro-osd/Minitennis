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
public class Medicos {
    private String nombre;
    private String rut;
    
    public Medicos(String nombre,String rut){
        this.nombre = nombre;
        this.rut = rut;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        nombre = nombre;
    }
    public String getRut(){
        return rut;
    }
    public void setRut(String rut){
        rut = rut;
    }
    public String toString(){
        String salida = "El nombre del medico es : " + nombre + "Su numero de carnet es :"+ rut;
        return salida;
        
    }
}
