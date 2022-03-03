/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_10_copia_objetos;

/**
 *
 * @author ricar
 */
public class EVA_10_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba obj1= new Prueba();
        System.out.println("Valor de x en obj1= "+ obj1);
        obj1.x=100;
        System.out.println("Valor de xen respaldo = "+obj1.x);
        Prueba respaldo=obj1;
        System.out.println("Valor de x en respaldo= "+respaldo.x);
        //modifico el respaldo
        respaldo.x=0;
                 System.out.println("Valor de x en obj1 "+ obj1.x);
                         System.out.println("Valor de x en respaldo= "+respaldo.x);

                 
    }
    
}
class Prueba{
    public int x;
}