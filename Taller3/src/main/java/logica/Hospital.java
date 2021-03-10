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
public class Hospital extends Centro {
    private Double area;
    
    public Hospital(String nombre,String direccion,Double calificacion,Double area) {
        super(nombre,direccion,calificacion);
        this.area = area;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
    
    
}
