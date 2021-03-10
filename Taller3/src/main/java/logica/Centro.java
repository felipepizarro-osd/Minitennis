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
class Centro {
    private String nombre;
    private String ciudad;
    private String direccion;
    private Double calificacion;
    
    
    public Centro(String nombre,String direccion,Double calificacion){
        this.nombre = nombre;
        this.direccion= direccion;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }
    

    
}
