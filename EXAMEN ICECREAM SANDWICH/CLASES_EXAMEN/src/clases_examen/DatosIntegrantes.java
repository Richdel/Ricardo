/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;

/**
 *
 * @author RICARDO
 */

public class DatosIntegrantes {
    
    private static String nombres;
    private static String  apellidos;
    private static int numerocontrol;
    private static String carrera;
    private  static String equipo;
    
    void  imprimirDatosEquipo(){
            System.out.println("El nombre del integrante 1 es : " + nombres);
            System.out.println("Los apellidos son :" + apellidos);
            System.out.println("El numero de control es : " + numerocontrol);
            System.out.println("La carrera es: " + carrera);
            System.out.println("El nombre del equipo es: " + equipo);
    } 
            
    public static void main(String[] args) {
        DatosIntegrantes integrante1 =  new DatosIntegrantes ();
        
         DatosIntegrantes.nombres= "Dajahira Narahi";
         DatosIntegrantes.apellidos = "Gonzalez Zavala";
         DatosIntegrantes.carrera = "ingenieria en sistemas computacionales";
         DatosIntegrantes.numerocontrol = 21550340;
         DatosIntegrantes.equipo = " Ice cream Sandwich";
         integrante1.imprimirDatosEquipo();
    
         DatosIntegrantes integrante2 =  new DatosIntegrantes ();
        DatosIntegrantes.nombres= "Manuel Ricardo";
         DatosIntegrantes.apellidos = "Delgado Alvidrez";
         DatosIntegrantes.carrera = "ingenieria en sistemas computacionales";
         DatosIntegrantes.numerocontrol = 21550383;
         DatosIntegrantes.equipo = " Ice cream Sandwich";
         integrante2.imprimirDatosEquipo();
         
          DatosIntegrantes integrante3 =  new DatosIntegrantes ();
        DatosIntegrantes.nombres= "Sarahi";
         DatosIntegrantes.apellidos = "Rivera Castillo";
         DatosIntegrantes.carrera = "ingenieria en sistemas computacionales";
         DatosIntegrantes.numerocontrol = 21550867;
         DatosIntegrantes.equipo = " Ice cream Sandwich";
         integrante3.imprimirDatosEquipo();
         
         
         
         
    }
}
