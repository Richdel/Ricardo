/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_10_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_10_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("introduce un dato entero");
        int valor = input.nextInt();
        System.out.println("el valor es "+valor);
        }catch(InputMismatchException e){
            e.printStackTrace();
        }finally{//esta seccion siempre se ejecuta
            System.out.println("esta linea siempre se ejecuta");
        }
        System.out.println("Fin del programa");
        
    }
    
}
