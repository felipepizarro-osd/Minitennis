 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.*;

/**
 *
 * @author felip
 */
public class app {
    public static void lectura(SistemaSalud sistema) throws FileNotFoundException, IOException{
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try{
            /**lectura cuidades
             * @param nombre de la cuidad
             * @param centros de salud categorizados en hospital o clinica
             * @return Lista de arreglos con las cuidades y sus centros 8diferenciados entre clinicas o hospitales 
             * /TO DO cladificar a los hospitales y a las clinicas
           **/
           archivo = new File("E:\\proyectos\\Minitennis\\Taller3\\src\\main\\java\\logica\\cities.txt");
           fr = new FileReader(archivo);
           br = new BufferedReader(new InputStreamReader(new FileInputStream(archivo),"utf-8"));
           String linea;
           int contadorCentros;
           while ((linea = br.readLine())!=null){
               System.out.println(linea);
               String[] partes = linea.split(",");
               String ciudad = new String(partes[0]);
               
               System.out.println(ciudad);
               sistema.agregarCiudad(ciudad);
               try{
                   for(contadorCentros = 1;contadorCentros <partes.length;contadorCentros++) {
                       
                       System.out.println(partes[contadorCentros]);
                       String cadena = partes[contadorCentros];
                       sistema.SetCity(cadena,ciudad);
                       
                       
                   }

               }catch(Exception ex){
                   ex.printStackTrace();
               }
               
               
           }
 
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(null !=fr ){
                    fr.close();
                }
                
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
        
        try{
            archivo = new File("E:\\proyectos\\Minitennis\\Taller3\\src\\main\\java\\logica\\persons.txt");
            fr = new FileReader(archivo);
            br =new BufferedReader(new InputStreamReader(new FileInputStream(archivo),"utf-8"));
            String linea ;
            while((linea = br.readLine())!=null){
                System.out.println(linea);
                
                
            }
            
        }catch(Exception e3){
            e3.printStackTrace();
        }finally{
            try{
                if(null != fr){
                    fr.close();
                }
            }catch(Exception e4){
                e4.printStackTrace();
            }
        }
        
        try{
            archivo = new File("E:\\proyectos\\Minitennis\\Taller3\\src\\main\\java\\logica\\centres.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(new InputStreamReader(new FileInputStream(archivo),"utf-8"));
            String linea;
            while ((linea = br.readLine())!= null){
                System.out.println(linea);
                String[ ] partes = linea.split(",");
                String palabraFiltro = "Hospital";
                String[] palabrasCadena = palabraFiltro.split("//s+");
                for (String palabra : palabrasCadena){
                    if(partes[0].contains(palabra)){
                        String nombre = partes[0];
                        String direccion = partes[1];
                        Double calificacion = Double.parseDouble(partes[2]);
                        Double area = Double.parseDouble(partes[3]);
                        sistema.AgregarHospital(nombre,direccion,calificacion,area);
                        System.out.println("Se ha encontrado un hospital -- Guardar en hospital como un centro de tipo hospital");
                        
                    }else{
                        String nombre = partes[0];
                        String direccion = partes[1];
                        Double calificacion = Double.parseDouble(partes[2]);
                        Double CantClinicas = Double.parseDouble(partes[3]);
                        sistema.AgregarClinica(nombre,direccion,calificacion,CantClinicas);
                        System.out.println("Se ha encontrado una clinica -- guardar como objeto clinica en el arreglo de centros ");
                    }
                }
                
                
            }
            
        }catch(Exception e5){
            e5.printStackTrace();
        }finally{
            try{
                if(null != fr){
                    fr.close();
                }
            }catch(Exception e6){
                e6.printStackTrace();
            }
        }
    }
    public static void main (String [] args) throws IOException{
        SistemaSalud sistema = new SistemaSaludImpl();
        lectura(sistema);
    }

}
