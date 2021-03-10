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
public class SistemasMedicosImpl implements SistemaMedico {
    private ListaMedicos lista ;
    
    public SistemasMedicosImpl() {
        lista = new ListaMedicos();
    }
    public void ingresarMedicos(String nombre,String rut){
        Medicos medico = new Medicos (nombre,rut);
        lista.insertarPrimer(medico);
    }
    public String desplegarInformacion(){
        return lista.toString();
    }
    
}
