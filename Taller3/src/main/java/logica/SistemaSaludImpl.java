/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.*;


/**
 *
 * @author felip
 */
public class SistemaSaludImpl implements SistemaSalud {
    List <Ciudad> listaCiudades = new ArrayList<Ciudad>();
    List <personas> listaPersonas = new LinkedList<personas>();
    ListaDobleNexo listaCentros = new ListaDobleNexo();
    
    public SistemaSaludImpl() {
        
    }

    @Override
    public void agregarCiudad(String ciudad) {
        listaCiudades.add(new Ciudad(ciudad));
    }


    @Override
    public void AgregarHospital(String nombre, String direccion, Double calificacion, Double area) {
        Centro centro = new Hospital(nombre,direccion,calificacion,area);
        listaCentros.insertarPrimer(centro);
    }

    @Override
    public void AgregarClinica(String nombre, String direccion, Double calificacion, Double CantClinicas) {
        Centro centro = new Clinica(nombre,direccion,calificacion,CantClinicas);
        listaCentros.insertarPrimer(centro);
    }

    @Override
    public void SetCity(String cadena,String ciudad) {
        listaCentros.SetCiudad(cadena,ciudad);
    }

    @Override
    public void AgregarCentro(String cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
