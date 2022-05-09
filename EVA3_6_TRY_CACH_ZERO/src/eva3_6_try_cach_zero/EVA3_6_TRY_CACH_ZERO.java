/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_6_try_cach_zero;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_6_TRY_CACH_ZERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero entero 1:");
        int entero = input.nextInt();
        System.out.println("introduce un numero entero 2:");
        int entero2 = input.nextInt();
        // 
        try{
            System.out.println("division " + (entero/entero2));
        }catch(ArithmeticException e){
                    e.printStackTrace(); //imprime la expepcion sin que el programa
                    System.out.println("se produjo un error");
            
        }
        System.out.println("fin del programa");

    }
    
}
