/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_memoria_1;

/**
 *
 * @author ricar
 */
public class EVA1_7_MEMORIA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 5;
        String cade="Hola";
        Prueba pru = new Prueba();
        System.out.println(pru);
        System.out.println("");
        Prueba pru2 = new Prueba();
        System.out.println(pru2);
        System.out.println(pru2.valor);

        
               
    }
    
}
class Prueba{
    public void saludar(){
        int valor;
        System.out.println("Hola mundoo!!");
        
    }
}