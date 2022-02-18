/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_clase_persona;

/**
 *
 * @author ricar
 */
public class Eva1_2_CLASE_PERSONA {//DECLARACION
// lo que esta dendtro de las llaves es la implementacion 

    public static void main(String[] args) {//DECLARACION
        // lo que esta dendtro de las llaves es la implementacion 
            //COMO CREAR UN OBJETO EN JAVA
    //INSTANCIACION: CREAR UN OBJETO
    //DAR MEMORIA (INSTANCIACION)
    //DECLARAR                 //CONSTRUIR
        Persona estudiante = new Persona();//declaro un identificador(objeto) tipo persona. (new) es darle memoria
        Eva1_2_CLASE_PERSONA objCLASE_PER=new Eva1_2_CLASE_PERSONA();
        System.out.println("Hola Mundo!!");
        estudiante.id = "21550383";
        estudiante.nombre = "Manuel Ricardo Delgado Alvidrez";
        estudiante.edad = 27;
        estudiante.imprimirDatos();
        System.out.println("año de nacimiento: "+ estudiante.calcularAñoNacimiento());
        
        Persona estudiante2 = new Persona();
        estudiante2.id = "12354242";
        estudiante2.nombre = "Juan Perez";
        estudiante2.edad = 20;
        estudiante2.imprimirDatos();
        System.out.println("El año de nacimiento es "+ estudiante2.calcularAñoNacimiento());
        
        Persona estudiante3 = new Persona();
        estudiante3.id="4234234";
        estudiante3.nombre="Pera";
        estudiante3.edad= 27;
        estudiante3.imprimirDatos();
        estudiante3.calcularAñoNacimiento();
        System.out.println("El año de nacimiento es: "+ estudiante3.calcularAñoNacimiento());
    }

    
}
//UNA CLASE ES UN TIPO DE DATO ABSTACTO
class Persona{//DECLARACION
    // lo que esta dendtro de las llaves es la implementacion 
    //ATRIBUTOS DE LA CLASE
    String id;
    String nombre;
    int edad;
    //Comportamiento
    //metodo imprimir datos
    void imprimirDatos(){//no regresa valor, el nombre es imprimir datos, (no recibe valores)
        System.out.println("");
        System.out.println("El nombre es: "+ nombre);
        System.out.println("Su id es: "+ id);
        System.out.println("Su edad es: "+ edad);
    }
    //Calcular el año de nacimiento 
    int calcularAñoNacimiento(){
        int añoNac= 2022-edad;
        return añoNac;

    }
    
}
/*
Persona:
//DATOS -- ATRIBUTOS DE LA CLASE
ID: cadena
Nombre: Cadena
Edad: entero
Sexo: char
direccion: cadena
telefono: cadena
Estatura: real
curp: cadena
//COMPORTAMIENTO
Capturar datos
Consultar datos
*/