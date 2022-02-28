/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_mod_acceso;

/**
 *
 * @author ricar
 */
public class EVA1_3_MOD_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona Persona1 = new Persona();
        Persona1.setId("21550383");
        Persona1.setNombre("Ricardo");
        Persona1.setEdad(22);
        System.out.println("Nombre: "+ Persona1.getNombre());
        Persona Persona2 = new Persona();
        Persona2.setId("0043214");
        Persona2.setNombre("Gwen");
        Persona2.setEdad(29);
        System.out.println("Nombre: "+Persona2.getNombre()+"  con numero de id: "+Persona2.getId()+" con la edad de: "+Persona2.getEdad()+"años");
        
        
    }
    
}
class Persona{
    //atributos (VARIABLES)- Propiedades
    private String id;
    private String nombre;
    private int edad;
    //Comportamiento(Metodos)
    //PARA LEER Y MODIFICAR LOS ATRIBUTOS, USAMOS METODOS DE LECTURA
    //ASIGNAR -- SET
    //LEER -- GET
    public String getId(){
    return id;
}
    public String getNombre(){
        return nombre;
        
    }
    public int getEdad(){
        return edad;
    }
    //ASIGNAR -- SET
    public void setId(String valor){
        id = valor;
    }
    public void setNombre(String valor){
        nombre = valor;
        
    }
    public void setEdad(int valor){
        edad = valor;
    }
}