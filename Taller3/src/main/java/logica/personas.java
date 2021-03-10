/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author felip
 */
public class personas {
    private String nombre;
    private String Apellido;
    private String afiliacion;
    private Date fechaIn;
    private Date fechaOut;
    private String Ciudad;
    
    public personas(String nombre,String Apellido,String Ciudad,String afiliacion,Date fechaIn,Date fechaOut){
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.afiliacion= afiliacion;
        this.Ciudad = Ciudad;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public Date getFechaIn() {
        return fechaIn;
    }

    public Date getFechaOut() {
        return fechaOut;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    public void setFechaIn(Date fechaIn) {
        this.fechaIn = fechaIn;
    }

    public void setFechaOut(Date fechaOut) {
        this.fechaOut = fechaOut;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
    
}
