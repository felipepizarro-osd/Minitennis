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
public interface SistemaSalud {

    public void agregarCiudad(String cuidad);

    public void AgregarCentro(String cadena);

    public void AgregarHospital(String nombre, String direccion, Double calificacion, Double area);

    public void AgregarClinica(String nombre, String direccion, Double calificacion, Double CantClinicas);

    public void SetCity(String cadena,String ciudad);
    
}
