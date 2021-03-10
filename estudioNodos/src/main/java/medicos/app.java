/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicos;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class app {
    public static void leerMedicos(SistemaMedico sistema){
        System.out.println("ingrese el rut . Fin de ingresos 111");
        Scanner s = new Scanner (System.in);
        String rut = s.nextLine();
        while (!rut.equals("111")){
            System.out.println("ingrese el nombre del medico");
            String nombre = s.nextLine();
            sistema.ingresarMedicos(nombre, rut);
            System.out.println("ingrese el rut . Fin de ingresos 111");
            rut = s.nextLine();
        }    
        
    }
    public static void main(String[] args ){
        SistemaMedico sistema = new SistemasMedicosImpl();
        leerMedicos(sistema);
        System.out.println(sistema.desplegarInformacion());
        
    }
}
